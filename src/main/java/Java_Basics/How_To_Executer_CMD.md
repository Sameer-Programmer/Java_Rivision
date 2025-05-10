# 📘 Java Class Naming and Compilation Rules

## 🔹 Class Name and Filename Rules

- If there is **no access modifier** (like `public`) for the class name,  
  👉 the **filename and class name can be different**. No problem.

- If the class is declared with the **`public` access modifier**,  
  👉 then the **filename must be the same as the class name**.

---

## 🔧 How to Compile and Run Java Code from Command Prompt

### ✅ Step 1: Check if Java is Installed
Use the following command:
```bash
java --version
```

---

### 🛠️ Step 2: Compilation
Use the `javac` command to compile the Java file:
```bash
javac filename.java
```

---

### ▶️ Step 3: Execution
Use the `java` command to run the compiled class:
```bash
java classname
```

> ⚠️ Note: Do **not** include `.class` in the execution command.
