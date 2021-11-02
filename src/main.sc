require: slotfilling/slotFilling.sc
  module = sys.zb-common
  

# Подключение javascript обработчиков
require: js/reply.js
require: js/actions.js



# Подключение сценарных файлов
require: scenario/serverActions.sc
require: scenario/comparePeriod.sc
require: scenario/zoomPeriod.sc
require: scenario/selectSeries.sc
require: scenario/cancel.sc
require: scenario/toggleIntegrations.sc
require: scenario/navigation.sc




patterns:
    $AnyText = $nonEmptyGarbage
    $OneWord = $oneWord
    
    
    # Паттерны для запуска сценария
    $OpenSkipWords = (хочу|мне|мое|моё|пожалуйста|в|прошу|тебя|может|с)
    $OpenKeyWords = (навык|игра|игру|скил|скилл|приложение|апп|)
    $projectName = sber report


theme: /
    state: Запуск
        # При запуске приложения с кнопки прилетит сообщение /start.
        q!: $regex</start>
        
        # При запуске приложения с голоса прилетит сказанная фраза.
        q!: [$repeat<$OpenSkipWords>] 
            $repeat<$OpenKeyWords>
            [$repeat<$OpenSkipWords>] 
            $projectName
        a: Навык Sber911 подключен

    state: Fallback
        event!: noMatch
        a: Команда не распознана, попробуйте еще раз
