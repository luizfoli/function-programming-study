;;;; How deal with local symbols/variables?
;;;;
;;;;    Aqui podemos entender como funciona o conceito de local symbol, ou variaveis locais,
;;;;    como o simbolo só existe no contexto em que é criado, a função que utiliza, no exemplo abaixo,
;;;;    o simbolo desconto, ela deve estar dentro do contexto (let ...).
;;;;
;;;;    Não importa o tamanho do algoritmo ou ações da função sempre será visto como retorno
;;;;    o resultado da última linha da função.
;;;;
;;;;    A indentação e o padrão de linha da função abaixo é considerado boa pratica 
;;;;    e simboliza um boa leitura do código.
;;;;
;;;; @author luizfoli
;;;; @since 28/07/2020

(defn valor-descontado
    "Retorna o valor com desconte de 10%." ;;; Aqui é o local onde é comum descrever a função.
    [valor-bruto]
    (let [desconto 0.10] 
        (* valor-bruto desconto)))

(def desconto (valor-descontado 7500))
(println desconto)