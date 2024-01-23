<p align="center">
  <img src="https://cdn-icons-png.flaticon.com/512/6295/6295417.png" width="100" />
</p>
<p align="center">
    <h1 align="center">SPRING-BOOT-SAGA-TRANSACTION-PATTERN</h1>
</p>
<p align="center">
    <em>The "spring-boot-saga-transaction-pattern" project is an implementation of the Saga pattern for managing distributed transactions in a Spring Boot environment. This pattern is particularly useful in microservices architectures where transactions may span multiple services, ensuring consistency and reliability across the entire system.</em>
</p>
<p align="center">
	<img src="https://img.shields.io/github/license/sawankarn/spring-boot-saga-transaction-pattern?style=flat&color=0080ff" alt="license">
	<img src="https://img.shields.io/github/last-commit/sawankarn/spring-boot-saga-transaction-pattern?style=flat&color=0080ff" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/sawankarn/spring-boot-saga-transaction-pattern?style=flat&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/sawankarn/spring-boot-saga-transaction-pattern?style=flat&color=0080ff" alt="repo-language-count">
<p>
<p align="center">
		<em>Developed with the software and tools below.</em>
</p>
<p align="center">
	<img src="https://img.shields.io/badge/Docker-2496ED.svg?style=flat&logo=Docker&logoColor=white" alt="Docker">
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white" alt="java">
	<img src="https://img.shields.io/badge/Spring-000000.svg?style=flat&logo=Spring&logoColor=white" alt="Spring">
</p>
<hr>

## 🔗 Quick Links

> - [📍 Overview](#-overview)
> - [📺 YouTube](#-features)
> - [📂 Repository Structure](#-repository-structure)
> - [🧩 Modules](#-modules)
> - [🚀 Getting Started](#-getting-started)
>   - [⚙️ Installation](#️-installation)
>   - [🤖 Running spring-boot-saga-transaction-pattern](#-running-spring-boot-saga-transaction-pattern)
>   - [🧪 Tests](#-tests)
> - [🤝 Contributing](#-contributing)
> - [📄 License](#-license)
> - [👏 Acknowledgments](#-acknowledgments)

---

## 📍 Overview

Unlock the secrets of Saga Pattern implementation in your microservices architecture using the powerful combination of Spring Boot and Kafka! In this comprehensive tutorial, we delve into the intricacies of transaction management, providing step-by-step guidance on designing and implementing sagas for seamless distributed systems. From understanding the fundamentals to practical hands-on examples, this video covers it all.

---

## 📺 YouTube

![enter image description here](https://img.youtube.com/vi/3gSkhhic4sM/maxresdefault.jpg)
[Watch video](https://youtu.be/3gSkhhic4sM)
---

## 📂 Repository Structure

```sh
└── spring-boot-saga-transaction-pattern/
    ├── Dockerfile
    ├── cab-service
    │   ├── src
    │   │   └── main
    │   └── target
    │       └── classes
    ├── common-dtos
    │   ├── src
    │   │   └── main
    │   └── target
    │       └── classes
    └── driver-service
        ├── src
        │   └── main
        └── target
            └── classes
```

---


## 🚀 Getting Started

***Requirements***

Ensure you have the following dependencies installed on your system:

* **Java**: `8+`

### ⚙️ Installation

1. Clone the spring-boot-saga-transaction-pattern repository:

```sh
git clone https://github.com/sawankarn/spring-boot-saga-transaction-pattern
```

2. Change to the project directory:

```sh
cd spring-boot-saga-transaction-pattern
```

3. Install the dependencies:

```sh
mvn clean install
```

### 🤖 Running spring-boot-saga-transaction-pattern

Use the following command to run spring-boot-saga-transaction-pattern:

```sh
java -jar target/myapp.jar
```

### 🧪 Tests

To execute tests, run:

```sh
mvn test
```

---

## 🤝 Contributing

Contributions are welcome! Here are several ways you can contribute:

- **[Submit Pull Requests](https://github/sawankarn/spring-boot-saga-transaction-pattern/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.
- **[Join the Discussions](https://github/sawankarn/spring-boot-saga-transaction-pattern/discussions)**: Share your insights, provide feedback, or ask questions.
- **[Report Issues](https://github/sawankarn/spring-boot-saga-transaction-pattern/issues)**: Submit bugs found or log feature requests for Spring-boot-saga-transaction-pattern.

<details closed>
    <summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your GitHub account.
2. **Clone Locally**: Clone the forked repository to your local machine using a Git client.
   ```sh
   git clone https://github.com/sawankarn/spring-boot-saga-transaction-pattern
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to GitHub**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.

Once your PR is reviewed and approved, it will be merged into the main branch.

</details>


## 👏 Acknowledgments

- List any resources, contributors, inspiration, etc. here.


---
