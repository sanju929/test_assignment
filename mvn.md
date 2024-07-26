
## Running the Application

1. **Build the project:**

    ```sh
    mvn clean install
    ```

2. **Run the application:**

    ```sh
    mvn spring-boot:run
    ```

## Running Tests

1. **Run the tests:**

    ```sh
    mvn test
    ```

2. **Generate a JaCoCo report:**

    ```sh
    mvn jacoco:report
    ```

3. **View the coverage report:**

   Open `target/site/jacoco/index.html` in your browser to see the test coverage report.

## Quality Checks

This project uses Checkstyle for static code analysis. You can run Checkstyle with the following command:

```sh
mvn checkstyle:check
