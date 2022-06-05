# Endpoint For Messages
Intended to be used as an endpoint for Google Cloud Pub/Sub message demo

- Incoming message must be set as POST request
- Example message format
```
{
  "answer": [2, 3, 5, 7],
  "time_taken": 600
}
```

### Build Using
- Spring Boot back end.
- Thymeleaf, JQuery and Bootstrap CSS frontend.

## How to run locally
1. Ensure docker is installed and running on system
2. Run command from root folder
    
    ```
    docker build -t endpoint .
    ```
    
3. Then Run command

    ```
    docker run -p 8080:8080 --rm -it endpoint
    ```
