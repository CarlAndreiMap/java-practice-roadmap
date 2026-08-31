# Java Practice Roadmap

A personal, structured roadmap for building Java skills through regular, hands-on projects — not isolated exercises. This repo tracks the journey from "I know the syntax" to "I can design and build programs on my own."

## Purpose & Goal

I already know Java fundamentals (syntax, variables, operators, conditionals, loops, `Scanner`, basic methods). What I don't have yet is practice **designing and building** programs from scratch.

This repository exists to:

- Build a **consistent, daily coding habit** — small, regular reps beat occasional long sessions.
- Progress deliberately from fundamentals → new concepts → independent program design.
- Keep a visible record of what was built, what was learned, and what was hard.
- Turn practice into a portfolio of real, working Java projects over time.

The GitHub contribution graph is a side effect of consistency, not the goal itself. Commits should represent **real progress**, not busywork — see [Commit Guidelines](#git--github-workflow) below.

## How Projects Are Organized

Every project lives in its own folder under `projects/`, named with a two-digit number prefix and a short slug:

```
projects/
├── _template/              ← copy this to start a new project
│   └── README.md
├── 01-warmup-name/
│   ├── README.md
│   └── Main.java (or src/ if the project grows)
├── 02-warmup-name/
├── 03-project-name/
└── ...
```

Each project folder has its own `README.md` describing:
- What the project does
- Concepts/skills it targets
- Requirements
- Notes, challenges, or what I learned (filled in as I go)

Numbering is sequential in the order projects are actually built, so the folder list itself reads as a timeline of progress.

## Roadmap Phases

Projects move through five broad phases. Phases overlap on purpose — new concepts get folded in while old ones keep getting reinforced.

| Phase | Focus | Concepts Introduced |
|---|---|---|
| **1. Warm-ups** | Reinforce existing fundamentals with slightly meatier problems (not "print hello world") | Loops, conditionals, Scanner input, string manipulation, basic methods — combined, not isolated |
| **2. Combining Basics** | Small multi-feature programs | Multiple methods working together, basic input validation, simple program flow design |
| **3. New Concepts** | Introduce concepts not yet learned, one or two at a time | Arrays, more complex methods, intro to classes/objects |
| **4. Structured Programs** | Build programs with real structure | Classes & objects, `ArrayList`, file I/O, exceptions, enums, basic OOP design |
| **5. Independent Projects** | Larger, self-directed builds | Combining everything — design decisions, multiple classes, structuring a program from a vague problem statement |

Projects don't have to perfectly fit one phase — the point is the general trend of increasing independence and complexity.

## Progress Tracker

| # | Project | Phase | Status | Concepts Covered | Date Completed |
|---|---|---|---|---|---|
| 01 | *(not started)* | 1 - Warm-up | 🔲 Not Started | | |
| 02 | *(not started)* | 1 - Warm-up | 🔲 Not Started | | |

**Status key:** 🔲 Not Started · 🟡 In Progress · ✅ Completed · ⏸ Paused

> Update this table whenever a project starts, changes status, or is completed. This is the single source of truth for overall progress — add rows as new projects are planned.

## Concepts & Skills Log

A running list of everything covered so far, so it's easy to see what's been reinforced and what's still new. Update this alongside the progress tracker.

| Concept | First Introduced In | Reinforced In |
|---|---|---|
| *(none yet)* | | |

## Learning Log

Day-to-day reflections, struggles, and "aha" moments live in [`LEARNING_LOG.md`](./LEARNING_LOG.md) rather than cluttering this README. Keep entries short — a few honest lines is enough.

## Guidelines for Adding a New Project

1. Copy `projects/_template/` to `projects/NN-short-name/` (next sequential number).
2. Fill in the project's `README.md`: goal, requirements, concepts targeted.
3. Add a row to the **Progress Tracker** above with status `🔲 Not Started`.
4. When you start working, update status to `🟡 In Progress`.
5. Commit meaningful progress as you go (see workflow below).
6. When finished, mark `✅ Completed`, fill in "Concepts Covered" and "Date Completed", and write a short reflection in `LEARNING_LOG.md`.
7. Update the **Concepts & Skills Log** if new concepts were introduced.

## Git & GitHub Workflow

The goal is **meaningful, frequent commits** — not empty ones just to fill the contribution graph. A project spanning several days should have several commits, each representing real progress.

### Suggested Commit Message Convention

```
<type>(project-NN): short description
```

**Types:**
- `start` — scaffold a new project (folder, README, empty skeleton)
- `feat` — add a feature or working piece of functionality
- `fix` — fix a bug
- `refactor` — improve/clean up existing code without changing behavior
- `learn` — commit made while exploring a new concept (spike/experiment code is OK here)
- `docs` — update a README, this file, or the learning log
- `done` — mark a project complete (final cleanup, polish)

**Examples:**
```
start(project-03): scaffold number guessing game
feat(project-03): implement guess loop and input validation
fix(project-03): correct off-by-one in attempt counter
refactor(project-03): extract input validation into its own method
learn(project-04): experiment with ArrayList basics
docs: update progress tracker and learning log for project-03
done(project-03): complete number guessing game
```

### Suggested Daily Flow

1. Open the project you're working on (or start a new one).
2. Make real progress — even 20–30 minutes of focused work counts.
3. Commit that specific chunk of progress with a clear message.
4. If you learned something noteworthy or got stuck, jot a line in `LEARNING_LOG.md` and commit it (can be combined with the code commit or separate).
5. Update the Progress Tracker table if a project's status changed.

Commits don't need to be daily by rule — but the habit works best when most practice sessions produce at least one honest commit.

## Repository Structure

```
java-practice-roadmap/
├── README.md              ← you are here: overview & progress tracker
├── LEARNING_LOG.md         ← daily/session reflections
├── .gitignore
└── projects/
    ├── _template/          ← template for new projects
    └── NN-project-name/    ← individual projects, numbered sequentially
```
