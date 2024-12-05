# 🎄 Advent of Code 2024 - Day 4 Solution 🎅

This repository contains the Java ☕ implementation of the solutions for Day 4 of Advent of Code 2024. Advent of Code is an annual set of Christmas-themed 🎅🎄 programming challenges that are a great way to sharpen your problem-solving 🧩 and coding skills 💻.

## 📁 Project Structure

The project has the following structure:

```
├── .idea                 # IntelliJ IDEA project configuration files ⚙️
├── .settings             # Settings files for Java tools 🛠️
├── src
│   └── main
│       └── java
│           └── com.pedroid.advent
│               └── day04
│                   ├── Day04Part1.java    # Solution for Part 1️⃣ of Day 4
│                   ├── Day04Part2.java    # Solution for Part 2️⃣ of Day 4
│                   ├── utils
│                   │   └── InputReader.java # 📄 Utility to read input files
│                   └── App.java           # 🚀 Entry point for the project
│       └── resources
│           └── inputs
│               └── day04.txt             # 📥 Input file for Day 4 challenge
├── test                 # Placeholder for future tests 🧪
├── target               # Generated files during the build 🛠️
├── .classpath           # Classpath configuration for Eclipse 🖥️
├── .gitignore           # Files and directories to ignore in version control 🚫
├── .project             # Eclipse project configuration 📁
├── LICENSE              # License file for the project 📜
├── pom.xml              # Maven project configuration file 🛠️
└── README.md            # 📖 Project documentation (this file)
```

### 📄 File Details
- **Day04Part1.java**: Contains the solution for Part 1️⃣ of Day 4. This file implements the core logic 🧠 to solve the first part of the challenge.
- **Day04Part2.java**: Contains the solution for Part 2️⃣ of Day 4. This file extends the logic to handle the more advanced conditions presented in Part 2.
- **InputReader.java**: A utility class 🛠️ for reading the input data from files. This class simplifies reading from the `resources/inputs/day04.txt`.
- **App.java**: The entry point 🚀 class to run solutions manually if needed.
- **day04.txt**: The input data 📥 for Day 4 challenge. This file is expected to be placed in the `resources/inputs` folder.

## ▶️ How to Run the Project

This project uses Maven 🛠️ for build automation and dependency management. Make sure you have [Maven installed](https://maven.apache.org/install.html) on your system.

### Running Part 1️⃣

To run the solution for Part 1️⃣ of Day 4, use the following command:

```bash
mvn exec:java -Dexec.mainClass="com.pedroid.advent.day04.Day04Part1"
```

### Running Part 2️⃣

To run the solution for Part 2️⃣ of Day 4, use the following command:

```bash
mvn exec:java -Dexec.mainClass="com.pedroid.advent.day04.Day04Part2"
```

## 📋 Requirements

- Java 11 ☕ or higher 🔝
- Maven 3.6+ 🛠️

### 🛠️ Setting up the Project

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/advent-of-code-day4.git
   cd advent-of-code-day4
   ```
2. **Build the Project**:
   ```bash
   mvn clean install
   ```

## 🚀 Usage

- Ensure that the input file (`day04.txt`) contains the correct puzzle 🧩 input from [Advent of Code 2024 - Day 4](https://adventofcode.com/2024/day/4).
- Execute Part 1️⃣ or Part 2️⃣ as shown above to see the respective outputs for the challenge.

## 📝 Notes

- A Haskell version of the solution for Part 1️⃣ is also available [here](https://github.com/pedroid999/advent-of-code-haskell), with plans to include Part 2️⃣ in the future.

- Each solution is designed to work independently with its respective command.
- The `InputReader.java` utility helps in managing input files seamlessly, making it easy to switch between different test data 🗃️.

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgements

- Thanks to [Advent of Code](https://adventofcode.com/) for providing these challenges! 🎄✨
- Inspired by the fun and creativity 🎨 of coding puzzles during the holiday season 🎅🎁.

---

Happy Coding 💻 and Good Luck! ⭐️🍀

