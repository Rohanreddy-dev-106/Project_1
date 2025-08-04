# 🎬 Movie Management System (Java + DSA)

A **comprehensive Java-based Movie Management System** that demonstrates the full spectrum of **Data Structures and Algorithms (DSA)** for storing, searching, sorting, and managing a collection of movies efficiently.

## ✨ Features

### 🎯 Core Movie Operations
- **Add Movies**: Insert new movies with title, description, genre, rating, and year
- **Display Movies**: View all movies in beautiful formatted tables with ratings, years, and genres
- **View Movie Details**: Get complete information about any movie including descriptions
- **Search Movies**: Find movies by title using multiple search algorithms:
  - Linear Search
  - Binary Search  
  - Binary Search Tree (BST) Search
- **Sort Movies**: Sort movies using different algorithms:
  - **Bubble Sort** by rating
  - **Merge Sort** by title (alphabetical)
  - **Quick Sort** by release year

### 🎞️ Advanced Movie Management
- **Watch Movies**: Select and "watch" movies from your collection
- **Watch History**: Stack-based recently watched movies (LIFO - Last In, First Out)
- **Watch Later Queue**: Queue-based movie playlist (FIFO - First In, First Out)
- **Recommended Movies**: Curated list of popular movies using linked lists
- **Top Rated Movies**: Priority queue implementation showing highest-rated movies first

### 📊 Data Structures Implemented
- **ArrayList**: Main movie storage and management
- **Linked List**: Recommended movies system
- **Stack**: Watch history (recently watched movies)
- **Queue**: Watch later functionality
- **Binary Search Tree (BST)**: Efficient movie searching and alphabetical ordering
- **Priority Queue**: Top-rated movies ranking system

### 🔍 Algorithms Implemented
- **Searching Algorithms**:
  - Linear Search with performance timing
  - Binary Search with performance timing
  - BST Search for efficient lookups
- **Sorting Algorithms**:
  - Bubble Sort (by movie rating)
  - Merge Sort (by movie title)
  - Quick Sort (by release year)
  - Performance timing for all sorting operations

---

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line/terminal access

### Quick Start
1. **Clone the repository**:
   ```bash
   git clone https://github.com/alxspiker/Project_1.git
   cd Project_1
   ```

2. **Compile the Java files**:
   ```bash
   javac *.java
   ```

3. **Run the application**:
   ```bash
   java App
   ```

4. **Navigate the menu**: Use the numbered options to explore all features!

---

## 🎮 Usage Guide

### Main Menu Options
```
╔═══════════════════════════════════╗
║        🎬 MOVIE MENU 🎬          ║
╠═══════════════════════════════════╣
║ 1. Display Movies                 ║
║ 2. View Movie Info                ║
║ 3. Show Recommended Movies        ║
║ 4. Search Movie by Title          ║
║ 5. Select Movie to Watch          ║
║ 6. Watch Recommended Movie        ║
║ 7. Watch History                  ║
║ 8. Watch Later Queue              ║
║ 9. Sort Movies                    ║
║ 10. Add New Movie                 ║
║ 11. Top Rated Movies              ║
║ 12. BST Operations                ║
║ 0. Exit                           ║
╚═══════════════════════════════════╝
```

### Key Features Walkthrough

**🔍 Search Movies (Option 4)**
- Choose between Linear Search, Binary Search, or BST Search
- Performance timing shows search efficiency
- Case-insensitive movie title matching

**📊 Sort Movies (Option 9)**
- Bubble Sort: Sorts by rating (highest first)
- Merge Sort: Alphabetical sorting by title
- Quick Sort: Chronological sorting by release year
- Performance timing for algorithm comparison

**🎬 Watch System (Options 5, 7, 8)**
- **Watch Movie**: Adds movie to watch history stack
- **Watch History**: Shows recently watched movies (Stack - LIFO)
- **Watch Later**: Queue system for planned viewing (Queue - FIFO)

**➕ Add Movies (Option 10)**
- Add custom movies with all details
- Automatic integration with all search and sort systems

---

## 📚 Data Structures & Algorithms Demonstrated

### Data Structures
| Structure | Usage | Implementation |
|-----------|--------|----------------|
| **ArrayList** | Main movie storage | `MovieManager.movies` |
| **Linked List** | Recommended movies | `SuggestMovies` class |
| **Stack** | Watch history | `MovieManager.watchHistory` |
| **Queue** | Watch later queue | `MovieManager.watchLaterQueue` |
| **Binary Search Tree** | Efficient searching | `MovieBST` class |
| **Priority Queue** | Top-rated rankings | `displayTopRatedMovies()` |

### Algorithms
| Algorithm | Type | Time Complexity | Use Case |
|-----------|------|-----------------|----------|
| **Linear Search** | Search | O(n) | Simple title lookup |
| **Binary Search** | Search | O(log n) | Sorted array search |
| **BST Search** | Search | O(log n) avg | Tree-based lookup |
| **Bubble Sort** | Sort | O(n²) | Rating comparison |
| **Merge Sort** | Sort | O(n log n) | Title alphabetization |
| **Quick Sort** | Sort | O(n log n) avg | Year-based sorting |

---

## 🏗️ Project Structure

```
Project_1/
├── App.java              # Main application with menu system
├── Movie.java            # Movie data model class
├── MovieManager.java     # Core movie operations & data structures
├── MovieBST.java         # Binary Search Tree implementation
├── SuggestMovies.java    # Recommended movies (Linked List)
├── Node.java             # Node class for linked structures
├── Addmovies.java        # Legacy file (deprecated)
├── README.md             # This documentation
└── How-TO-MAKE.pdf       # Original project guide
```

---

## 🎯 Sample Movies Included

The system comes pre-loaded with popular movies:
- **RRR** (2022) - Action - 8.8/10
- **Inception** (2010) - Sci-Fi - 8.8/10  
- **Interstellar** (2014) - Sci-Fi - 8.6/10
- **KGF** (2018) - Action - 8.2/10
- **3 Idiots** (2009) - Comedy - 8.4/10

Plus 10 additional recommended movies in the linked list system!

---

## 🔬 Performance Features

- **Search Timing**: Microsecond-precision timing for search operations
- **Sort Analysis**: Performance comparison between different sorting algorithms
- **Memory Efficiency**: Optimal data structure usage for different operations
- **Algorithm Comparison**: Real-time performance metrics

---

## 🛠️ Technical Implementation

### Object-Oriented Design
- **Movie Class**: Encapsulates all movie properties with proper getters/setters
- **MovieManager**: Centralized operations with clean separation of concerns
- **MovieBST**: Self-contained binary search tree with recursive operations

### Error Handling
- Input validation for menu choices
- Bounds checking for array operations
- Null pointer protection for movie operations

### Generic Programming
- Type-safe generic implementations
- Proper parameterized types for data structures
- Eliminated unchecked operation warnings

---

## 📝 Author

**Rohan Reddy**  
Web Developer | DSA Enthusiast

**Enhanced by**: Advanced AI implementation with comprehensive DSA integration

---

## 🎉 What Makes This Special

This isn't just a simple movie list - it's a **comprehensive demonstration** of:
- ✅ **All major data structures** (ArrayList, LinkedList, Stack, Queue, BST, Priority Queue)
- ✅ **Multiple searching algorithms** with performance analysis
- ✅ **Various sorting techniques** with timing comparisons  
- ✅ **Real-world application** of abstract data structures
- ✅ **Clean object-oriented design** with proper encapsulation
- ✅ **Interactive user experience** with beautiful console UI
- ✅ **Performance metrics** for algorithm comparison

Perfect for learning DSA concepts through practical implementation! 🚀
