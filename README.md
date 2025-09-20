# Design Patterns - Simple Examples

## Quick Reference

### 1. Singleton
**Purpose**: Only one instance exists
**When to use**: Database connections, loggers, caches
**Key**: Private constructor + static getInstance()

### 2. Factory
**Purpose**: Create objects without specifying exact class
**When to use**: When you don't know which specific class to create at compile time
**Key**: Static method returns interface/abstract class

### 3. Adapter
**Purpose**: Make incompatible interfaces work together
**When to use**: Integrating old code with new code
**Key**: Wrapper that translates calls

### 4. Bridge
**Purpose**: Separate abstraction from implementation
**When to use**: When both classes and implementations can vary
**Key**: Composition instead of inheritance

### 5. Flyweight
**Purpose**: Share objects to save memory
**When to use**: When creating many similar objects
**Key**: Factory with object pool

### 6. Proxy
**Purpose**: Control access to another object
**When to use**: Lazy loading, access control, caching
**Key**: Same interface as real object but adds behavior

## How to Run
```bash
cd [pattern-folder]
javac *.java
java [DemoClass]
```

## Remember
- **Singleton**: One instance only
- **Factory**: Hide object creation
- **Adapter**: Connect incompatible things
- **Bridge**: Separate what from how
- **Flyweight**: Share to save memory
- **Proxy**: Control access