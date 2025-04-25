# Cicero Project WebDriver Testing Suite

This project provides an automated testing framework for the Cicero project (Enonic project) using Selenium WebDriver with Java. It includes a comprehensive suite of tests for various web elements and interactions in the Chrome browser.

## Project Overview

The test suite is designed to validate different aspects of web applications, including:
- Login functionality
- Navigation
- Dropdown interactions
- Alert handling
- Frame interactions
- Hover effects
- JavaScript execution
- Keyboard interactions
- Wait strategies
- Slider components

## Technical Stack

- Java 17
- Selenium WebDriver 4.12.1
- TestNG 7.7.0
- JUnit Jupiter (Latest Release)
- Maven for dependency management
- Chrome WebDriver

## Project Structure

```
src/
├── test/
│   └── java/
│       ├── Alerts/       # Alert handling tests
│       ├── Navigation/   # Navigation tests
│       ├── base/         # Base test configurations
│       ├── dropdown/     # Dropdown interaction tests
│       ├── exercises/    # Practice test exercises
│       ├── frames/       # Frame handling tests
│       ├── hover/        # Hover interaction tests
│       ├── javascript/   # JavaScript execution tests
│       ├── keys/         # Keyboard interaction tests
│       ├── login/        # Login functionality tests
│       ├── slider/       # Slider component tests
│       └── wait/         # Wait strategy tests
```

## Setup and Installation

1. Ensure you have Java 17 installed
2. Install Maven
3. Clone this repository
4. Run `mvn clean install` to install dependencies

## Running Tests

To run the tests, use one of the following commands:

```bash
mvn test                  # Run all tests
mvn test -Dtest=TestClassName  # Run specific test class
```

## Visual Regression Testing

The project includes BackstopJS configuration for visual regression testing. The configuration can be found in:
- `backstop.json`
- `backstop_data/` directory

## Contributing

Feel free to contribute to this project by:
1. Forking the repository
2. Creating a feature branch
3. Submitting a pull request

## License

This project is part of the Cicero project testing suite. Please refer to the Enonic project license terms.
