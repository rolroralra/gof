## SOLID Principles
<details>
  <summary>Details</summary>
  <p>
    
1. Single Responsibility Principle (SRP)
> [https://ko.wikipedia.org/wiki/%EB%8B%A8%EC%9D%BC_%EC%B1%85%EC%9E%84_%EC%9B%90%EC%B9%99](https://ko.wikipedia.org/wiki/%EB%8B%A8%EC%9D%BC_%EC%B1%85%EC%9E%84_%EC%9B%90%EC%B9%99)
2. Open Closed Principle (OCP)
> [https://ko.wikipedia.org/wiki/%EA%B0%9C%EB%B0%A9-%ED%8F%90%EC%87%84_%EC%9B%90%EC%B9%99](https://ko.wikipedia.org/wiki/%EA%B0%9C%EB%B0%A9-%ED%8F%90%EC%87%84_%EC%9B%90%EC%B9%99)
3. Liskov Substitution Principle (LSP)
> [https://ko.wikipedia.org/wiki/%EB%A6%AC%EC%8A%A4%EC%BD%94%ED%94%84_%EC%B9%98%ED%99%98_%EC%9B%90%EC%B9%99](https://ko.wikipedia.org/wiki/%EB%A6%AC%EC%8A%A4%EC%BD%94%ED%94%84_%EC%B9%98%ED%99%98_%EC%9B%90%EC%B9%99)
4. Interface Segregation Principle (ISP)
> [https://ko.wikipedia.org/wiki/%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4_%EB%B6%84%EB%A6%AC_%EC%9B%90%EC%B9%99](https://ko.wikipedia.org/wiki/%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4_%EB%B6%84%EB%A6%AC_%EC%9B%90%EC%B9%99)
5. Dependency Inversion Principle (DIP)
> [https://ko.wikipedia.org/wiki/%EC%9D%98%EC%A1%B4%EA%B4%80%EA%B3%84_%EC%97%AD%EC%A0%84_%EC%9B%90%EC%B9%99](https://ko.wikipedia.org/wiki/%EC%9D%98%EC%A1%B4%EA%B4%80%EA%B3%84_%EC%97%AD%EC%A0%84_%EC%9B%90%EC%B9%99)
  </p>
</details>

---
## GRASP Principles

> General Responsibility Assignment Software Patterns

<details>
  <summary>Details</summary>
  <p>
    
1. Information Expert
2. Creator
3. Controller
4. Low Coupling (Loose Coupling)
5. High Cohesion
6. Polymorphism
7. Pure Fabrication
8. Indirection
9. Protected Variations
  </p>
</details>

---
## gof
Gang of Four(Java Design Pattern)

- Creational
  - [x] [Factory (Delegation or Inheritance for object creation)](./src/creational/factory)
  - [x] [AbstractFactory (Delegation for object creation with FactoryGenerator, FactoryProducer)](./src/creational/abstractFactory)
  - [x] [Singleton & LazyHolder](./src/creational/singleton)
  - [x] [Builder (Creating Pattern using Strategy Pattern)](./src/creational/builder)
  - [x] [Prototype (Javascript Prototype)](./src/creational/prototype)
- Structural
  - [x] [Adapter (Adapter makes things work after they're designed.)](./src/structural/adapter)
  - [x] [Bridge (Bridge makes them work before they are.)](./src/structural/bridge)
  - [x] [Decorator (Wrapper)](./src/structural/decorator)
  - [ ] Filter
  - [ ] Composite
  - [X] [Facade](./src/structural/facade)
  - [X] [Proxy](./src/structural/proxy)
  - [x] [Flyweight (Cache)](./src/structural/flyweight)
- Behavioral
  - [ ] ChainOfResponsibility (Logger)
  - [X] [Command (Command, Invoker, Receiver) - 행위의 객체화](./src/behavioral/command)
  - [ ] Interpreter
  - [X] [Iterator](./src/behavioral/iterator)
  - [X] [Mediator (Many Publisher, Many Subscriber, But Only One Mediator)](./src/behavioral/mediator)
  - [ ] Memento
  - [X] [Observer (Publisher & Subscriber, Observable & Observer, Subject & Observer)](./src/behavioral/observer)
  - [X] [State](./src/behavioral/state)
  - [ ] Null Object
  - [X] [Strategy](./src/behavioral/strategy)
  - [ ] Template
  - [X] [Visitor (Many Object with Many Algorithm, cf. Strategy Pattern)](./src/behavioral/visitor)
- J2EE
  - [ ] MVC
  - [ ] Business Delegate
  - [ ] Composite Entity
  - [ ] Data Access Object (DAO)
  - [ ] Front Controller
  - [ ] Intercepting Filter
  - [ ] Service Locator
  - [ ] Transfer Object
