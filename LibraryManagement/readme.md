# 📚 Machine Coding — Question 3
## Library Management System

> **Time : 75 Minutes**
> **Level : Fresher → Mid**

---

## 🏢 Background

You are building a system for a Library.

The library has different types of books and different types of members.
Each member type has different borrowing rules.

Your job is to design this system using **Inheritance** and **Composition**
following proper OOP principles.

---

## 📖 Part 1 — Book Hierarchy

Design an abstract class `Book` that holds common fields shared by all book types:
- book ID (auto generated)
- title
- author
- availability status (default available)

Each book type must be able to tell:
- what category it belongs to
- how many days it can be borrowed for
- its full details

Create the following book types:

**1. FictionBook**
- Has a genre (like Thriller, Romance)
- Can be borrowed for 14 days

**2. TextBook**
- Has a subject and an edition number
- Can be borrowed for 7 days only (high demand)

**3. ReferenceBook**
- Has a topic
- **Cannot be borrowed at all — only read inside the library**
- Must clearly indicate this when showing details

---

## 👥 Part 2 — Member Hierarchy

Design an abstract class `Member` that holds common fields shared by all member types:
- member ID (auto generated)
- name
- list of currently borrowed books

Each member type must be able to tell:
- how many books they can borrow at one time
- what type of member they are

The logic for borrowing and returning a book must be written
**once** in the parent class and shared by all member types.

Create the following member types:

**1. StudentMember**
- Belongs to a standard (like Class 10)
- Can borrow maximum 2 books at a time

**2. TeacherMember**
- Belongs to a department
- Can borrow maximum 5 books at a time

**3. GuestMember**
- Belongs to an organisation
- Can borrow maximum 1 book at a time
- Charged ₹10 per extra day as fine

---

## 📋 Part 3 — Borrowing Rules

When a member tries to borrow a book, the system must check:

1. If the book is already borrowed by someone else → reject with a message
2. If the book is a Reference book → reject with a message
3. If the member has already reached their borrowing limit → reject with a message
4. If all checks pass → mark book as unavailable and add to member's list

When a member returns a book:

5. Mark the book as available again and remove from member's list

---

## 🏛️ Part 4 — Library

Create a `Library` class that manages the entire system.

It should be able to:
- Add books to the library
- Add members to the library
- Show only the books that are currently available
- Show all members along with the books they have borrowed
- Search for a book by its title

---

## 🖥️ Expected Output

```
=== Available Books ===
[BK-001] "Harry Potter" by J.K. Rowling  | Fiction   | 14 days         | ✅ Available
[BK-002] "Physics Vol 1" by H.C. Verma   | TextBook  |  7 days         | ✅ Available
[BK-003] "Encyclopedia" by Britannica    | Reference | IN-LIBRARY ONLY

=== Borrow Action ===
✅ Rahul borrowed "Harry Potter"  (return in 14 days)
✅ Rahul borrowed "Physics Vol 1" (return in 7 days)
❌ Rahul cannot borrow more       — limit reached (max: 2)
❌ Cannot borrow "Encyclopedia"   — Reference books: in-library only

=== After Borrowing — Available Books ===
[BK-003] "Encyclopedia" by Britannica | Reference | IN-LIBRARY ONLY

=== Rahul's Borrowed Books ===
1. Harry Potter   [Fiction]   due in 14 days
2. Physics Vol 1  [TextBook]  due in 7 days

=== Return Action ===
✅ Rahul returned "Harry Potter"

=== After Return — Available Books ===
[BK-001] "Harry Potter" by J.K. Rowling  | Fiction   | ✅ Available
[BK-003] "Encyclopedia" by Britannica    | Reference | IN-LIBRARY ONLY
```

---

## 🔄 Follow-Up Questions

These will be asked after the main solution is complete.

**F1.** Add a new book type `MagazineBook` that can be borrowed for 3 days and has a genre.

**F2.** Add a new member type `PremiumMember` who can borrow 10 books at a time and is charged ₹5 fine per extra day.

**F3.** Add a method to the Library that shows:
- Total books in the library
- How many are currently borrowed
- How many are available

---

*Machine Coding Series — Question 3*
*Concepts : Inheritance · Composition · Abstract Classes · Business Rules · State Management*c