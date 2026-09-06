# Learning Log

A running, informal log of practice sessions. Keep entries short and honest — the point is to notice patterns over time (what clicks fast, what keeps tripping you up), not to write polished notes.

## How to Use This

Add a new entry each time you finish a practice session (doesn't have to be every day, but aim for most days you code). A few lines is enough:

- What you worked on
- What went well / clicked
- What you struggled with or got wrong, and why
- Anything you want to revisit later

Newest entries at the top.

---

## Template

```
### YYYY-MM-DD — Project NN: <name>

**Worked on:** 
**Went well:** 
**Struggled with:** 
**To revisit:** 
```

---

<!-- Add new entries below this line, newest first -->
### 2026-09-01 — Project 01: Grade & Report Card Generator

**Worked on:** full report card program — validated input, tracked running stats without arrays, built a formatted report table.

**Went well:** extracting getValidatedInt() and scoreToGrade() into reusable methods clicked fast. Bug spotting on the highest/lowest else-if was mine.

**Struggled with:** Understanding how to keep track of values without using arrays, Also had trouble with how print formatting works specifically with how the padding works.

**To revisit:** printf/String.format width specifiers before next formatting-heavy project.

**AI (Claude) Rating:** Readability: 8/10. Clear variable names, Structure/efficiency: 8/10. Good method extraction, Correctness/robustness: 8/10. You caught and fixed the bug.

---
### 2026-09-06 — Project 02: Number & Pattern Analyzer

**Worked on:** Number & Pattern Analyzer — validated a numeric range, checked each number for primality, perfect-square status, and ascending digits, then printed matches and a summary.

**Went well:** Correctly identified and fixed the stale-variable bug in ascendingCheck (comparing against a frozen i instead of the shrinking number) after tracing execution by hand. Method extraction into primeCheck, perfectSquareCheck, and ascendingCheck was clean from the start.

**Struggled with:** Understanding why digits extracted with % 10 come out right-to-left, and how that flips the comparison logic needed to detect "ascending" order. Also missed an edge case in primeCheck where Math.floor(Math.sqrt(n)) caused 2 and 3 to be misclassified as not prime.

**To revisit:** Floating-point pitfalls with Math.sqrt (rounding vs. truncation, verify-by-squaring pattern), and the i * i <= number approach as a safer alternative to sqrt-based loop bounds.

**AI (Claude) Rating:** Readability: 7/10, Structure/efficiency: 6/10, Correctness/robustness: after review — one bug found (2/3 misclassified as non-prime), rest of logic including input validation and ascending check was correct.

---
