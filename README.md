# Kotlin Collection Builders

A demonstration project showcasing various approaches to building collections in Kotlin, from simple to advanced 
techniques.

## Overview

This project illustrates different ways to create and manipulate collections in Kotlin, using NCAA Football 
conferences and schools as example data. It demonstrates the evolution of collection building techniques from basic 
to more sophisticated approaches.

## Features

- Multiple approaches to collection building:
  - Basic `listOf()` with hardcoded values
  - List concatenation with the `+` operator
  - Transformation with `map` and `mapIndexed`
  - DSL-style building with `buildList {}`
  - Conditional collection building
  - Working with immutable collections

## Project Structure

- `data/` - Data models and sample data
  - `DataModels.kt` - Core data classes for conferences and schools
  - `conf_models/` - Sample data for different conferences
- `runner1/` through `runner5/` - Different examples of collection building techniques

## Getting Started

### Prerequisites

- JDK 17 or higher
- Kotlin 2.0.20 or compatible version

### Building the Project

```bash
./gradlew build
```

### Running Examples

Each runner demonstrates a different approach to collection building:

```bash
# Run the basic example
./gradlew run -PmainClass=io.cursedfunction.runner1.Runner1Kt

# Run the list concatenation example
./gradlew run -PmainClass=io.cursedfunction.runner2.Runner2Kt

# Run the DSL-style building example
./gradlew run -PmainClass=io.cursedfunction.runner3.Runner3Kt

# Run the buildList DSL example
./gradlew run -PmainClass=io.cursedfunction.runner4.Runner4Kt

# Run the immutable collections example
./gradlew run -PmainClass=io.cursedfunction.runner5.Runner5Kt

# Run other examples

# Demonstrate how you can mutate a collection in-place
./gradlew run -PmainClass=io.cursedfunction.runner3.Runner3_1Kt

# Run the buildList DSL but demonstrating the lack of immutability
# This will catch the exception and print it. It will also
# run the "surprise" example which demonstrates how one could
# get around the "read-only" nature of List<T>
./gradlew run -PmainClass=io.cursedfunction.runner4.Runner4_1Kt

# Run the immutable collections that will throw an exception
# or just simply do nothing
./gradlew run -PmainClass=io.cursedfunction.runner5.Runner5_1Kt
```

## Collection Building Techniques Demonstrated

1. **Basic Collection Creation** (Runner1)
   - Using `listOf()` with hardcoded values

2. **List Concatenation** (Runner2)
   - Using the `+` operator to combine lists
   - Using `mapIndexed` to transform collections

3. **BuildList DSL** (Runner4)
   - Using Kotlin's `buildList {}` DSL
   - Adding elements with `add()`
   - Using `mapIndexedTo()` for transformation

4. **List Immutability** (runner4 & runner5 modules)
   - Working with immutable collections using `kotlinx-collections-immutable`
   - Demonstrating the use of `persistentListOf` and `persistentMapOf`

## Dependencies

- kotlinx-collections-immutable (0.3.5) - For working with immutable collections

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

CursedFunction
