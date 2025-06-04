## Architecture Diagrams

### System Context Diagram
This diagram shows the high-level context of the search system, including external actors and the system boundaries.

```mermaid
graph TD
    A[Client] -- HTTP GET /search --> B{Search System}
    B -- responds with --> A
    style A fill:#lightgrey,stroke:#333,stroke-width:2px
    style B fill:#lightgreen,stroke:#333,stroke-width:2px
```

**Explanation:** The system represents the backend search endpoint. The client is an external actor making requests. This is a simplified context diagram to establish the system's boundaries.

### Containers Diagram
This diagram depicts the high-level components and their relationships within the search system.

```mermaid
graph TD
    B[Search Endpoint] -- part of --> D[Main Backend Application]
    D -- built on --> C[Spring Boot Framework]
    style B fill:#orange,stroke:#333,stroke-width:2px
    style C fill:#lightblue,stroke:#333,stroke-width:2px
    style D fill:#lightyellow,stroke:#333,stroke-width:2px
```

**Explanation:** The search endpoint is a component within the main backend application, which is built using the Spring Boot framework. This diagram emphasizes the modular nature of the system for future extensibility.