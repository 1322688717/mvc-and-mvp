# **mvc-and-mvp**

## MVC

* M层 ：Modle
  *  负责访问数据。数据可以是远端的Server API，本地数据库或者SharedPreference等 
* V层：View
  *  负责处理用户事件和视图部分的展示。在Android中，它可能是Activity或者Fragment类
* C层：Conroller(控制器) 
  *  是一个桥梁的作用，   这里用activity作为conroller层 

#### 优点

*  耦合性低 
*  可扩展性好 
*  模块职责划分明确 

#### 缺点

*  conroller层过于[冗余](https://so.csdn.net/so/search?q=冗余&spm=1001.2101.3001.7020)，使其可阅读性大大降低 
*  其中M层和V没有很好地进行隔离；他们之间可以进行直接的交互 

## MVP

* M层 ：Modle
  *  负责访问数据。数据可以是远端的Server API，本地数据库或者SharedPreference等 
* V层：View
  *  负责处理用户事件和视图部分的展示。在Android中，它可能是Activity或者Fragment类
* p层： presenter
  *   连接（或适配）View和Model的桥梁。 

#### 优点

*  模型与视图完全分离，我们可以修改视图儿不影响视图。即:M层和V层无法直接交互 
*  可以更高效的使用模型，因为所有的交互都被放在了P（persenter）层中，这也就导致我们可以多个视图，使用同一个P(persenter),而不需要改变P（persenter）的逻辑。即：视图的变化频率永远高于模型 
*  逻辑放在P（persenter）中，则可以让这些逻辑单独运行。即：可以做单元测试 

#### 缺点

*  接口类的爆炸，使用mvp时，将会导致类文件以及接口文件过多，进而导致APP体积的增大 
*  视图和P的交互将会过于频繁，这样就导致他们的联系过于紧密。即：视图有了变化，则P则需要做相应的修改 