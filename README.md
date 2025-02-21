# MatchError in Scala Auxiliary Constructor

This example demonstrates a subtle issue in Scala related to overriding a `val` within an auxiliary constructor using an anonymous class instance.  The code compiles without errors, but throws a `MatchError` at runtime.

## Problem

The primary constructor of `MyClass` takes an integer. The auxiliary constructor provides a default value. Attempting to override the `x` value within an anonymous class instance using `override val x = 10` results in the unexpected `MatchError`.

## Solution

The solution involves understanding how Scala handles auxiliary constructors and value overriding in this specific scenario.  Refer to `BugSolution.scala` for a corrected approach, which involves refactoring to directly assign a default value during the object creation in the `Main` object. Alternatively, a `var` can be used to enable overriding; however, this changes the immutability.