<b>Strategy Design Pattern </b>

What does Strategy mean ?
“a plan of action designed to achieve a long-term or overall aim.”

Lets think in terms of Software design !!
STRATEGIES = DIFFERENT ALGORITHMS

Questions to consider before thinking about this pattern

How often do you feel the need to select an algorithm at run time?
Do you have a set of algorithms that are selected based on certain run time changes / configs ?
Is your code Open for Extension ?

If the answer is yes for any of the above questions , Strategy Pattern might be a good option for you.

<b>Definition </b>: The strategy pattern is a behavioral pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly , we can pass the algorithm at run time from a family of algorithms.

For Instance , a application that uses REST to call apis might need to choose from different REST Templates(Ex:  Proxy Enabled, SSL Configured) based on the build env( dev, test , prod). This might not be known until run time . 

Strategy design pattern lets you choose the correct Rest Template based on the env during run time without any changes in the code. Other classic example is when you have set of validation algorithms that needs to be selected based on inputs.

Strategy uses Composition instead of Inheritance.It is also compatible with OCP , which states that class should be open for extension but closed for modification.
