# Project 01: Grade & Report Card Generator

**Phase:** 1 - Warm-up 
**Status:** ✅ Completed
**Date Started:** 2026-08-31
**Date Completed:** 2026-09-01

## Goal

A command-line program that takes a student's scores for several subjects (entered by the user), then calculates and displays a simple report: each subject's letter grade, the overall average, and a final letter grade — plus some basic statistics.

## Requirements

- [ ] Ask the user how many subjects they want to enter (e.g. 5).
- [ ] For each subject, prompt for a subject name and a numeric score (0–100).
- [ ] Validate the score: if the user enters something outside 0–100, reject it and re-prompt for that subject (don't just crash or silently accept it).
- [ ] After all subjects are entered, print a report showing:
       - Each subject name, its score, and its letter grade (use a reasonable scale, e.g. 90+ = A, 80–89 = B, etc. — your choice).
       - The average score across all subjects.
       - The highest and lowest scoring subjects (name + score).
       - An overall letter grade based on the average.
- [ ] Format the output cleanly and readably (aligned columns, clear labels — not just raw values dumped to the console).

## Concepts & Skills Targeted

<List the specific Java concepts this project is meant to reinforce or introduce.>

- Loops (for-loop for subject count, while-loop for input re-validation)
- Conditional logic (if/else chains or switch for grade mapping)
- Input validation patterns
- Scanner-based user input
- Methods/functions — breaking logic into reusable pieces, parameters and return values
- Running calculations across a loop (sum, average, min/max tracking without arrays)
- Basic output formatting (String.format or printf for aligned columns)

## Notes / Approach

<Optional: jot down your plan before starting, e.g. what classes/methods you think you'll need.>

## What I Learned / Struggled With

I learned how to use methods in order to simplify validations, struggled with printf and figuring out how to track data without an array.

## Optional Challenges

<Add extra stretch goals here once the main requirements are done, if you want to push further.>
