# Instructions
1. Create the `config.toml`.
    ```
    Username="YourUserName"
    Cookie="LEETCODE_SESSION=YourLeetCodeSession;"
    ```
2. Generate the MarkdownGenerator.
    ```
    make
    ```

# Usage
1. Generate README.md & Favorite.md.
    ```
    make readme
    ```
2. Generate Questions Directories. Replace the `QuestionNumber` with the question number, such as 1, 2, etc.
    ```
    make prepare N=QuestionNumber
    ```
