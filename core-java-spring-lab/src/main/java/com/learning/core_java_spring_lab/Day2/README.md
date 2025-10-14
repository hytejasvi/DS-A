# Day-03  Object Creation Playbook

## 1. Record – concise, immutable data carrier
- `public record PaymentCommand(String id, BigDecimal amount, String currency) {}`
- Auto-generates constructor, getters, equals, hashCode, toString
- Validation: compact constructor runs **during object creation**
  ```java
  public PaymentCommand {
      if (amount.signum() <= 0) throw new IllegalArgumentException("amount > 0")
      if (!currency.matches("[A-Z]{3}")) throw new IllegalArgumentException("Incorrect Currency");
  }

Use when: ≤ 4-5 mandatory fields, no inheritance, immutability wanted
## 2. POJO + Builder – flexible assembly
- Manual static inner Builder (interview-friendly) or Lombok @Builder (production)
- Validation inside build() → single failure point, optional fields supported
Example usage:
UserDto dto = UserDto.builder()
                     .email("a@b.com")
                     .firstName("Alice")   // optional
                     .build();             // validation fires here

- Use when: many optional fields, complex defaults, or you need mutability later

## 3. JSON ↔ Object
- Spring Boot: declare record/POJO as @RequestBody – Jackson + @Valid handle mapping & annotation-based validation automatically
- Manual parsing: ObjectMapper.readValue(json, Record.class) – compact ctor still runs

## Rule of Thumb
- Record for thin, immutable DTOs; Builder for rich or optional-heavy objects; never expose JPA entities to controllers – always map through these patterns.