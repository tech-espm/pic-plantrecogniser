# PlantRecogniser - A Neural Network Aproach #

This Artificial Neural Network was developed in the IntelliJ IDE 2017.3.4 and using Java 1.8 for recognise, based on inputs, plants of the family _Iris_.

-----------------------------------------------

## Inputs ##

The input layer has __4__ neurons and accept this following normalized values:

* 1. sepal length
* 2. sepal width
* 3. petal length 
* 4. petal width 

_Obs: You can find the input values at the data folder._

----------------------------

## Structure ##

You can find at the packages __paes.training.c1__ or __paes.training.c2__, respectively, RNAs with one and two hidden layers. This files contains the propagation and the backpropagation algorithm (training algorithm). At __paes.test.c1__ or __paes.test.c2__, you can find the responsible classes for testing assertiveness rate.

### Variables ###

* int n = 3 - _This variable is responsible for the number of neurons in the hidden layer;_
* int minValue = 0 - _This variable is responsible for control the input's matrix;_
* int age = 1 - _This variable is responsible for count the number of ages;_

_Obs: 1 age is equals 120 iterations._

### Methods ###

#### Propagation ####
* ponderationL1();
* activationL1();
* ponderationL2();
* activationL2();
* ponderationL3() _Obs: Only in c2 classes_;
* activationL3() _Obs: Only in c2 classes_;

#### Error Calculation ####
* errorCalculation();

#### BackPropagation ####
* gradientCalculationL3() _Obs: Only in c2 classes_;
* gradientCalculationL2();
* gradientCalculationL1();
* weightsUpdateL3() _Obs: Only in c2 classes_;
* weightsUpdateL2();
* weightsUpdateL1();
---------------------------------------

## Outputs ##

The output layer has __3__ neurons. The following combination represents one of the multiples outputs, that can be printed by the RNA.

* _Iris-Setosa_: 0 0 1;
* _Iris-Versicolor_: 0 1 0;
* _Iris-Virginica_: 1 0 0';
* _Unidentified Species detected!_: 0 0 0;
* _Unidentified Species detected!_: 1 1 1.

----------------------------

## Results - c1 (one hidden layer)

#### Sigmoid Function ####

* __2 Neurons:__
  * _NaN_;
 
* __3 Neurons:__
  * 93.33 % Success (28/30 successes);
 
* __8 Neurons:__
  * 93.33 % Success (28/30 successes);

#### Hyperbolic Tangent (tanh) ####

* __2 Neurons:__
  * _NaN_;
 
* __3 Neurons:__
  * 3.00 % Success (1/30 successes);
 
* __8 Neurons:__
  * 13.33 % Success (4/30 successes);

#### ReLU (Rectified linear unit) ####

* __2 Neurons:__
  * _Time Exception_;
 
* __3 Neurons:__
  * _Time Exception_;
 
* __8 Neurons:__
  * _Time Exception_;
  
 ___Obs:___ 
 * _NaN: Incapacibility of achieving a Numeric Value. Probably because the flutuant pointer has exploded_;
 * _Time Exception: Incapacibility of converging in a polynomial time, or, at least, the incapacibility of converging in a time next to the sigmoid or tanh functions times_.
---------------------------------------

## Results - c2 (two hidden layers)

#### Sigmoid Function ####

* __2 Neurons:__
  * _NaN_;
 
* __3 Neurons:__
  * _NaN_;
 
* __8 Neurons:__
  * 33.33 % Success (10/30 successes);

#### Hyperbolic Tangent (tanh) ####

* __2 Neurons:__
  * _Time Exception_;
 
* __3 Neurons:__
  * _Time Exception_;
 
* __8 Neurons:__
  * 0.00 % Success (0/30 successes);

#### ReLU (Rectified linear unit) ####

* __2 Neurons:__
  * _Time Exception_;
 
* __3 Neurons:__
  * _Time Exception_;
 
* __8 Neurons:__
  * _Time Exception_;
  
 ___Obs:___ 
 * _NaN: Incapacibility of achieving a Numeric Value. Probably because the flutuant pointer has exploded_;
 * _Time Exception: Incapacibility of converging in a polynomial time, or, at least, the incapacibility of converging in a time next to the sigmoid or tanh functions times_.
---------------------------------------

## References Links ##

__Activation Functions:__
* <https://en.wikipedia.org/wiki/Activation_function/>

__FACURE, Matheus:__
* <https://matheusfacure.github.io/2017/07/12/activ-func/>

__HAYKIN, Simon:__ 
* Neural Network. 3rd Edition. Artmed. 2008

__Rectifier Nonlinearities Improve Neural Network Acoustic Models__:
* <http://web.stanford.edu/~awni/papers/relu_hybrid_icml2013_final.pdf/>

__Sample repository:__
* <https://archive.ics.uci.edu/ml/datasets/iris/>

--------------------------------------------------
