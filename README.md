Below is a **ready-to-use, detailed theoretical document** you can **directly paste into your assignment / PDF / Google Doc**.
It is written in **simple, examiner-friendly language** and **matches your practical work (Eclipse + Git Bash)**.

---

# 📘 Git-Based Calculator Repository

## Detailed Documentation

---

## 1. Introduction

This project demonstrates the practical use of **Git version control** while developing a simple **Calculator application in Java**.
The focus of the assignment is not only on coding but also on understanding **Git commands, branching strategy, merging techniques, and merge conflict resolution**.

The project was developed using:

* **IDE:** Eclipse
* **Version Control:** Git (Git Bash)
* **Remote Repository:** GitHub

---

## 2. Git Repository Initialization

### Command Used

```bash
git init
```

### Purpose

* Initializes a new Git repository in the project directory.
* Creates a hidden `.git` folder which tracks all changes in the project.

After initialization, all project files were added and committed using:

```bash
git add .
git commit -m "Initial calculator project"
```

---

## 3. Branching Strategy

### Branches Created

* **main** → Stable and final branch
* **addition** → Contains addition-related changes
* **subtraction** → Contains subtraction-related changes
* **multiplication** → Contains multiplication-related changes

### Commands Used

```bash
git branch addition
git branch subtraction
git branch multiplication
```

### Purpose of Branching

* Branching allows developers to work on **different features independently**.
* It avoids breaking the main codebase.
* Each operation of the calculator was implemented and tested in its own branch.

---

## 4. Working with Branches

To switch between branches:

```bash
git checkout branch_name
```

Each branch contained **independent commits** related only to its feature.
After completing the work, branches were merged into `main`.

---

## 5. Git Stash

### Commands Used

```bash
git stash
git stash pop
```

### Purpose

* `git stash` temporarily saves uncommitted changes.
* `git stash pop` restores the saved changes back to the working directory.

### Use Case

This is useful when:

* You want to switch branches
* You are not ready to commit changes yet

---

## 6. Git Fetch vs Git Pull

### Commands Used

```bash
git fetch origin
git pull origin main
```

### Difference

| Command     | Description                                      |
| ----------- | ------------------------------------------------ |
| `git fetch` | Downloads updates from remote but does not merge |
| `git pull`  | Fetches and merges changes into current branch   |

---

## 7. Merging Branches Using `git merge`

### Command Example

```bash
git checkout main
git merge addition
```

### Explanation

* `git merge` combines changes from one branch into another.
* It creates a **merge commit**.
* If there are no conflicting changes, Git merges automatically.

---

## 8. Merge Using ORT Strategy

During some merges, Git displayed:

```
Merge made by the 'ort' strategy.
```

### Explanation

* **ORT (Optimized Recursive Tree)** is Git’s default merge strategy.
* It automatically merges branches when:

  * Changes are in different files, or
  * Changes are on different lines of the same file.
* No manual intervention is required when ORT succeeds.

---

## 9. Intentional Merge Conflict

### What is a Merge Conflict?

A merge conflict occurs when:

* Two branches modify the **same line of the same file** differently.
* Git cannot decide which change to keep.

### How the Conflict Was Created

* The same line in `Calculator.java` was modified in both:

  * `addition` branch
  * `subtraction` branch

### Command That Triggered Conflict

```bash
git merge subtraction
```

Git response:

```
CONFLICT (content): Merge conflict in src/calculator/Calculator.java
Automatic merge failed; fix conflicts and then commit the result.
```

---

## 10. Identifying Merge Conflict

Git inserts conflict markers inside the file:

```java
<<<<<<< HEAD
// code from current branch
=======
/ code from merging branch
>>>>>>> subtraction
```

These markers clearly indicate:

* Current branch changes
* Incoming branch changes

---

## 11. Resolving Merge Conflict

### Steps Followed

1. Open the conflicted file in Eclipse
2. Analyze both versions of code
3. Decide the final correct logic
4. Remove conflict markers
5. Save the file

### Commands Used

```bash
git add src/calculator/Calculator.java
git commit -m "Resolved merge conflict in Calculator.java"
```

This completes the conflict resolution process.

---

## 12. Merge Using `git rebase`

### Commands Used

```bash
git checkout multiplication
git rebase main
git checkout main
git merge multiplication
```

### Purpose

* `git rebase` reapplies commits on top of another branch
* Creates a **linear and clean commit history**
* Avoids unnecessary merge commits

---

## 13. Additional Git Commands Used

| Command                     | Purpose                           |
| --------------------------- | --------------------------------- |
| `git status`                | Shows current working tree status |
| `git log --oneline --graph` | Displays commit history visually  |
| `git branch -d branch_name` | Deletes merged branches           |

These were mentioned in class comments for shared understanding.

---

## 14. Conclusion

This project successfully demonstrates:

* Git repository setup
* Feature-based branching strategy
* Use of stash, fetch, pull
* Merge using `git merge` and `git rebase`
* Intentional creation and resolution of merge conflicts
* Proper version control practices using Git and GitHub

The assignment helped in gaining hands-on experience with real-world Git workflows.

---

If you want, I can:

* Convert this into **PDF format**
* Shorten it for **exam answers**
* Match it exactly to **screenshots you took**
* Review your **GitHub repo before final submission**

Just tell me 👍
