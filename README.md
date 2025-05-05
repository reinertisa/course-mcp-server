# Courses MCP Server

MCP Server for the Courses API for search functionality.

## Setting Up Your Environment
Build the application
```
./mvnw clean package -DskipTests
```

## Tools

1. `get_courses`
   - Get courses

#### NPX

```json
{
  "mcpServers": {
    "courses_mcp": {
      "command": "java",
      "args": [
        "-jar",
        "/Users/username/Downloads/courses/target/courses-0.0.1=SNAPSHOT.jar"
      ]
    }
  }
}
```