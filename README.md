# ASCII Art

Transforms an innocent image into an utter spew of characters on your
terminal, transforming each pixel into an ASCII character using their
brightness

## Example

<!--- https://imgur.com/a/KlrAq21 --->
<!--- https://imgur.com/a/7iabA8E --->
<p align="center">
  <img width="350" height="350" src="https://i.imgur.com/PtEIl53.jpg">
  <img width="350" height="350" src="https://i.imgur.com/xk15yL3.png">
</p>

## How To Run

On your terminal run 

`java -jar ascii-art-1.0.jar [arguments]`

Valid arguments include:
* `None!`
  * When given no arguments the program will spit out a sample image
    of a pineapple
* `Path/to/image.jpg`
  * When given one argument the program will use it as a path to an
    image and look for it, starting for the home directory
  * The image will automatically be resized to 100 x 80  
  * *On Windows separate it by backslashes*
* `width` and `height`
  * The image will automatically be resized to the supplied
    `width`x`height`
  * These only work when **all** the arguments are given, including
    the path to the image
    
So an example of a valid run would be 

`java -jar ascii-art-1.0.jar Pictures/dog.jpg 200 150`

If you want to output it into a file, call the program and redirect
it to a file of choosing using `>`, like this

`java -jar ascii-art-1.0.jar > pineapple.txt`

## Technologies Used

* Git for version control
* Maven for a build/tests manager to help integrate continuous development
* JUnit 5 as the main library for unit testing