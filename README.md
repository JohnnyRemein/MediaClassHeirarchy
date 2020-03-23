# MediaClassHeirarchy

  The purpose of this project was to create a media class hierarchy of several different abstract
and concrete classes representing different types of media.
  The structure of the media classes starts with the most general, the Medium class. This
abstract class contains fields common to all types of media such as creator, title, and year.
Next is another abstract class, the TimedMedium class. This class adds an instance of a
Time object, which itself contains fields of hours, minutes, and seconds to define the length
of timed media types such as video and audio. Three concrete classes make up the bottom of
the hierarchy, Audio, Video, and Print. The TimedMedium class extends the Medium class
and naturally Audio and Video extend the TimedMedium class while Print extends directly
from the Medium class. Each concrete class, except Audio, adds fields of its own to further
describe the media type. Print adds a field for number of pages, and Video adds a field for
resolution of the video.
  Every media class contains getters, setters, toString(), equals(), and hashcode() methods
used and tested by the test class that houses the main method, MediumDriver. The Time
class, instantiated by TimedMedium types, is immutable. It containing getters, toString(),
equals(), and hashcode() methods as well as a method to return the total media length in
seconds, getSecondsTotal().
  There is not a user interface associated with the project. The program simply creates
media of each type, filling an ArrayList, and runs an exhaustive testing procedure for every
method in every class.
