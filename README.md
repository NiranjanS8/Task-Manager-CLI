# 🧩 Task Manager CLI (Java Project with Custom Data Structures)

## 📘 Overview
This is a **Command-Line Task Manager** built in **Java**, designed to manage daily tasks efficiently using **custom-built data structures** instead of built-in Java collections.

It demonstrates **core DSA concepts**, **object-oriented programming**, and **file handling** — making it a perfect project for students or interview portfolios.

---

## 🚀 Features
✅ Add, View, Update, and Delete Tasks  
✅ Mark tasks as completed  
✅ Persistent storage using text files  
✅ Custom Linked List implementation (no Java Collections)  
✅ CLI-based clean interaction  

---

## 🧠 Data Structures Used
- **CustomLinkedList** → Stores and manages tasks internally.  
- **Node** → Represents individual elements (tasks) in the linked list.

---

## 🧱 Folder Structure
```
TaskManagerCLI/
│
├── src/
│   ├── TaskManagerCLI.java           # Main CLI class
│   ├── model/
│   │   └── Task.java                 # Task model class
│   ├── datastructures/
│   │   └── CustomLinkedList.java     # Custom Linked List implementation
│   └── manager/
│       └── TaskList.java             # Handles operations & file I/O
│
└── tasks.txt                         # (Auto-created) Stores all saved tasks
```

---

## 🛠️ How to Run
### 1️⃣ Compile the project
Navigate to the `src` folder and compile all Java files:
```bash
javac */*.java */*/*.java TaskManagerCLI.java
```

### 2️⃣ Run the project
```bash
java TaskManagerCLI
```

---

## 🧾 Example CLI Output
```
=== Task Manager ===
1. Add Task
2. View Tasks
3. Mark Complete
4. Delete Task
5. Save & Exit
Enter your choice: 1

Enter title: Learn DSA
Enter description: Practice LinkedList
Enter due date: 2025-11-10
Enter priority (Low/Medium/High): High
Task added successfully!
```

---

## 📦 File Handling
- All tasks are stored in **tasks.txt** in CSV format.
- When you restart the program, it automatically loads the previous tasks.

---

## 🧩 Future Enhancements
- Add Undo (using custom Stack)
- Add Task Search or Sorting by Due Date
- JSON-based storage for readability
- Colorized CLI output

---

## 🏆 Resume Description Example
**Task Manager CLI (Java, DSA Project)**  
Built a command-line task manager using custom data structures (LinkedList). Implemented CRUD operations, data persistence, and efficient task tracking with file-based storage.

---

## 👨‍💻 Author
Developed by *[Your Name]*  
Feel free to fork or improve this project!
