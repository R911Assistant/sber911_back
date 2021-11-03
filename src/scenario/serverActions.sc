# Когда приходит ServerAction, сообщение прилетает в состояние, 
# с условием на вход action_id.
# пример:
#     event!: action_id

theme: /

    state: Неудача
        event!: fail
        event!: FAIL

        random: 
            a: Не могу выполнить
            a: Не получается
            
    state: Открываем
        event!: open
        event!: OPEN

        random: 
            a: Открываю
            a: Секунду

           
    state: ПереходимНаСтраницу
        event!: go_to
        event!: GO_TO

        random: 
            a: Перехожу
           