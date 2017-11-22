# plantRecogniser - A Neural Network Aproach #

This Artificial Neural Network was developed in Java 1.8 for recognise, based on inputs, plants of the family _Iris_.

-----------------------------------------------

## Inputs ##

The input layer has __4__ nodes and accept this following normalized values:

* 1. sepal length in cm 
* 2. sepal width in cm 
* 3. petal length in cm 
* 4. petal width in cm 

_Obs¹: You can find the input values at the data folder_

----------------------------

## Structure ##

You can find at the __paes._sigmoid_.training__ the training algorithm for the sigmoid function. This file contains the propagation and the backpropagation algorithm, and the main goal of this structure is to achieve the best Layer's weights.

### Variables ###

* int n = 3 - _This variable is responsible for the number of neurons in the hidden layer;_
* int minValue = 0 - _This variable is responsible for control the input's matrix;_
* int age = 1 - _This variable is responsible for count the number of ages;_

_Obs²: 1 age is equals 120 iterations_

### Methods ###

#### Propagation ####
* ponderationL1();
* activationL1();
* ponderationL2();
* activationL2();

* errorCalculation();

#### BackPropagation ####
* gradientCalculationL2();
* gradientCalculationL1();
* weightsUpdateL2();
* weightsUpdateL1();
---------------------------------------

## Outputs ##

The output layer has __3__ nodes. The following combination represents one of the three plants of the family _Iris_.

* _Iris-Setosa_: 0 0 1;
* _Iris-Versicolor_: 0 1 0;
* _Iris-Virginica_: 1 0 0.

----------------------------

## Results ##

#### Sigmoid Function ####

* __2 Neurons:__
  * 66.67 % Success (20/30 successes);
 
* __3 Neurons:__
  * 93.33 % Success (28/30 successes);
 
* __8 Neurons:__
  * 93.33 % Success (28/30 successes);

#### reLU (Rectified linear unit) ####

#### Softplus ####

---------------------------------------

## References Links ##

__Sample repository:__
* <https://archive.ics.uci.edu/ml/datasets/iris/>

__Activation Functions:__
* <https://en.wikipedia.org/wiki/Activation_function/>

--------------------------------------------------
