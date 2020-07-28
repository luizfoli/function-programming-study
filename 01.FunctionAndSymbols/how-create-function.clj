;;;; How create a function and a 'variable'?
;;;;    
;;;;    In clojure and others function languages we don't have the concept of variable.
;;;;    In other case, the similiar a variable it's Symbol. Symbol always be global and
;;;;    it's not good pratice to use like a variable.
;;;;
;;;;    To create a function and symbol it's similar, in both case we use "def" first like define.

(def myName "Luiz Felipe Oliveira")

(def printMyName (
    println "Hello World," myName))