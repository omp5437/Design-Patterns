# Design Patterns in Java

A collection of commonly used **Design Patterns implemented in Java**.

The purpose of this repository is to understand the **intent, structure, and practical usage** of design patterns and how they help in building flexible, maintainable, and loosely coupled object-oriented systems.

---

## What are Design Patterns?

Design patterns are **reusable solutions to commonly occurring software design problems**.

A design pattern is not a piece of code that can be copied directly into every situation. Instead, it provides a general approach for structuring classes and objects to solve a particular type of problem.

Design patterns help with:

- Reducing coupling between components
- Improving code reusability
- Making code easier to maintain and extend
- Encapsulating changing behavior
- Following object-oriented design principles
- Improving flexibility in system design

---

# Patterns Covered

## Creational Patterns

Creational patterns deal with **object creation**. They help reduce tight coupling between the code that uses an object and the code that creates it.

### 1. Factory Pattern

**Intent:** Encapsulate object creation and allow the appropriate object to be created without exposing the creation logic to the client.

Instead of the client directly creating different concrete implementations, the Factory is responsible for deciding which object should be created.

### Example

```text
Client
  |
  v
Factory
  |
  +----> ConcreteProductA
  |
  +----> ConcreteProductB
```

### When to use

Use the Factory pattern when:

- Multiple implementations of an interface exist.
- The object to create depends on some input or condition.
- You want to keep object creation logic in one place.
- The client should not depend directly on concrete implementations.

---

### 2. Builder Pattern

**Intent:** Construct complex objects step-by-step while keeping the construction process separate from the final object.

The Builder pattern is particularly useful when an object has **many optional parameters** or when construction involves multiple steps.

### Example

```text
Builder
   |
   +-- setName()
   +-- setAge()
   +-- setAddress()
   +-- build()
          |
          v
       Product
```

### When to use

Use Builder when:

- An object has many fields.
- Many fields are optional.
- Constructors would otherwise have many parameters.
- You want readable object construction.
- You want to create immutable objects.

---

# Structural Patterns

Structural patterns deal with **how classes and objects are composed** to form larger structures.

They help make relationships between components more flexible without unnecessarily modifying existing classes.

---

### 3. Adapter Pattern

**Intent:** Allow two incompatible interfaces to work together.

The Adapter acts as a bridge between an existing class and the interface expected by the client.

### Example

```text
Client
  |
  v
Target Interface
  |
  v
Adapter
  |
  v
Adaptee
```

### When to use

Use Adapter when:

- An existing class has an incompatible interface.
- You cannot or do not want to modify the existing class.
- You need to integrate legacy code or third-party libraries.
- Two components need to communicate but expose different interfaces.

---

### 4. Decorator Pattern

**Intent:** Dynamically add additional behavior or responsibilities to an object without modifying its original class.

Instead of creating many subclasses for different combinations of behavior, decorators can be composed at runtime.

### Example

```text
Client
  |
  v
Component
  |
  v
Decorator
  |
  +----> Additional Behavior
```

Multiple decorators can also be chained:

```text
Object
  |
  v
Decorator A
  |
  v
Decorator B
  |
  v
Decorator C
```

### When to use

Use Decorator when:

- Behavior needs to be added dynamically.
- You want to avoid creating many subclasses.
- Multiple behaviors can be combined.
- You want to follow the Open/Closed Principle.

---

### 5. Proxy Pattern

**Intent:** Provide a substitute or representative object that controls access to another object.

The Proxy exposes the same interface as the real object and can perform additional operations before or after delegating the request.

### Example

```text
Client
  |
  v
Proxy
  |
  +----> Authentication
  +----> Logging
  +----> Caching
  |
  v
Real Object
```

### When to use

Common use cases include:

- Access control
- Authentication/authorization
- Lazy initialization
- Caching
- Logging
- Remote object access

---

# Behavioral Patterns

Behavioral patterns focus on **communication and responsibility between objects**.

They help define how objects interact while keeping the individual components loosely coupled.

---

### 6. Chain of Responsibility Pattern

**Intent:** Pass a request through a chain of handlers until one of the handlers processes it.

Each handler decides whether it can handle the request or should pass it to the next handler.

### Example

```text
Request
   |
   v
Handler A
   |
   v
Handler B
   |
   v
Handler C
   |
   v
Response
```

### When to use

Use Chain of Responsibility when:

- Multiple objects can potentially handle a request.
- The handler should be determined dynamically.
- You want to decouple the sender from the receiver.
- Processing naturally happens as a sequence of steps.

Examples include:

- Request validation
- Authentication and authorization
- Logging pipelines
- Exception handling
- Processing workflows

---

### 7. Command Pattern

**Intent:** Encapsulate a request or operation as an object.

This separates the object that **invokes an operation** from the object that actually **performs the operation**.

### Example

```text
Invoker
   |
   v
Command
   |
   v
Receiver
```

The command can represent an operation such as:

```text
execute()
undo()
```

### When to use

Use Command when:

- You want to decouple an operation from its caller.
- You need undo/redo functionality.
- Commands need to be queued or logged.
- Operations need to be treated as objects.

Common examples include:

- Remote controls
- Undo/redo
- Job queues
- Transactional operations
- Menu actions

---

### 8. Observer Pattern

**Intent:** Define a one-to-many relationship where multiple objects are notified when the state of another object changes.

The object being observed maintains a collection of observers and notifies them when an event occurs.

### Example

```text
             +----> Observer A
             |
Subject ---->+----> Observer B
             |
             +----> Observer C
```

### When to use

Use Observer when:

- Multiple objects depend on another object's state.
- Changes in one object should trigger actions in other objects.
- You want loose coupling between the publisher and subscribers.

Common examples include:

- Event notification systems
- UI event handling
- Publish/subscribe mechanisms
- Stock price notifications

---

### 9. State Pattern

**Intent:** Allow an object to change its behavior when its internal state changes.

Instead of having a large `if-else` or `switch` statement based on the current state, each state is represented by a separate class.

### Example

```text
Context
   |
   +----> State A
   |
   +----> State B
   |
   +----> State C
```

For example, an order may have states such as:

```text
Created
   |
   v
Paid
   |
   v
Shipped
   |
   v
Delivered
```

Each state can define what operations are allowed in that particular state.

### When to use

Use State when:

- Object behavior changes based on its current state.
- There are many state-dependent conditions.
- A large `if-else` or `switch` is becoming difficult to maintain.
- State transitions are an important part of the business logic.

Common examples include:

- Order processing
- Vending machines
- Payment processing
- Workflow engines
- Document processing

---

### 10. Strategy Pattern

**Intent:** Define a family of algorithms, encapsulate each algorithm separately, and make them interchangeable.

The client can select the appropriate strategy at runtime without changing the client code.

### Example

```text
              +----> Strategy A
              |
Context ------+----> Strategy B
              |
              +----> Strategy C
```

For example, different payment methods can have different implementations:

```text
PaymentStrategy
      |
      +----> CreditCardPayment
      |
      +----> UPIPayment
      |
      +----> WalletPayment
```

### When to use

Use Strategy when:

- Multiple algorithms solve the same problem.
- The algorithm can change at runtime.
- You want to eliminate large conditional statements.
- You want to follow the Open/Closed Principle.
- Different behaviors need to be independently tested and maintained.

---

# Quick Reference

| Category | Pattern | Primary Purpose |
|---|---|---|
| **Creational** | Factory | Encapsulate object creation |
| **Creational** | Builder | Construct complex objects step-by-step |
| **Structural** | Adapter | Make incompatible interfaces work together |
| **Structural** | Decorator | Add behavior dynamically |
| **Structural** | Proxy | Control access to an object |
| **Behavioral** | Chain of Responsibility | Pass requests through a chain of handlers |
| **Behavioral** | Command | Encapsulate requests as objects |
| **Behavioral** | Observer | Notify dependent objects about changes |
| **Behavioral** | State | Change behavior based on object state |
| **Behavioral** | Strategy | Make algorithms interchangeable |

---

# Design Patterns at a Glance

```text
                         DESIGN PATTERNS
                              |
              +---------------+---------------+
              |               |               |
         Creational       Structural      Behavioral
              |               |               |
          +---+---+       +---+---+       +---+---+---+---+
          |       |       |   |   |       |   |   |   |   |
       Factory Builder Adapter Decorator Proxy Chain Command Observer State Strategy
```

The key to using design patterns effectively is not memorizing their class diagrams, but understanding **the problem each pattern solves, the trade-offs it introduces, and when it is appropriate to use it**.