;;;; How create a function and a 'variable'?
;;;;    
;;;;    In clojure and others function languages we don't have the concept of variable.
;;;;    In other case, the similiar a variable it's Symbol. Symbol always be global and
;;;;    it's not good pratice to use like a variable.
;;;;
;;;;    To create a function and symbol it's similar, the difference it's to create
;;;;    a function we use "defn" and to create a symbol we use "def"

(def myName "Luiz Felipe Oliveira")

(defn printHelloWorldWithSomebodyName [name] (
    println "Hello World, sir" myName))

(printHelloWorldWithSomebodyName myName)