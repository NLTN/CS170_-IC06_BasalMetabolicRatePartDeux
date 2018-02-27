# CS170_-IC06_BasalMetabolicRatePartDeux

Chapter 3, PP 6

Java Project Name:  IC06_BasalMetabolicRatePartDeux

Extend your Java console application from Week 2 (IC #03) so that this time, it as a user to input the string "Female" or "Male".  Use (and display) only the Female formula if they choose "Female" and only the Male formula if they choose "Male".  Also, ask the user which of the following four groupings applies:

1. Sedentary (not active)
2. Somewhat active (exercise occasionally)
3. Active (exercise 3-4 times per week)
4. Highly Active (exercise every day)

Ask the user to select the category by entering a number between 1-4.   If the user chooses "Sedentary", increase the calculated BMR by 20% (e.g. multiply the BMR by 1.2).  If the user enters "Somewhat active", increase BMR by 30%, if the user enters "Active", increase by 40% and finally, if the user enters "Highly Active", increase BMR by 50%.  Output the calories and number of chocolate bars based on the new BMR value.

As a recap from last week, BMR estimates the number of calories your body needs to maintain your weight if you do no exercise.  This is called your BMR (or Basal Metabolic Rate) and can be calculated with the Harris-Benedict equation.

The calories needed for a woman to maintain her weight is:

BMR (calories) = 655 + (4.35 * weight in pounds) + (4.7 * height in inches) - (4.7 * age in years)

The calories needed for a man to maintain his weight is:

BMR (calories) = 66 + (6.23 * weight in pounds) + (12.7 * height in inches) - (6.8 * age in years)

Write a program that allows the user to input his or her weight in pounds, height in inches, and age in years.  Your program should output two things 1) The number of calories needed to maintain one's weight for only what the user enters (Female or Male) and activity type  (Sedentary, Somewhat active, Active or Highly Active) AND  2) The number of chocolate bars that should be consumed to maintain this amount of calories (a typical chocolate bar contains about 230 calories)
