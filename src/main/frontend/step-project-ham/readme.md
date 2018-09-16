## Задание

Сверстать макет [psd](./step-project-ham.psd). Подключить динамические элементы (см. ниже)

#### Командная работа
На данном проекте все студенты разделены на группы по два человека. Для каждого из участников команды определен перечень заданий, которые он должен выполнить. Участники команды могут самостоятельно решить, кто будет выпонять задание №1, а кто - задание №2. 

### Задание для студента №1
 - Сверстать шапку сайта с верхним меню. 
 - Сверстать четыре квадратных области под шапкой. Они должны занимать всю доступную ширину экрана.
 - Сверстать секцию `Our Amazing Work`. Кнопка `Load more` имитирует подгрузку с сервера новых картинок. При ее нажатии в секции снизу должно добавиться еще 12 картинок (изображения можно взять любые). После этого кнопка исчезает.
 - Кнопки на вкладке `Our amazing work` являются "фильтрами продукции". Предварительно каждой из картинок нужно присвоить одну из четырех категорий, на ваше усмотрение (на макете это `Graphic design`, `Web design`, `Landing pages`, `Wordpress`). При нажатии на кнопку категории необходимо показать только те картинки, которые относятся к данной категории. `All` показывает картинки из всех категорий. Категории и картинки для них можно взять любые, не обязательно использовать те, что расположены на макете.
 - Сверстать секцию `Gallery of best images` и футер страницы. Картинки внутри блока необходимо расположить как на макете с помощью плагина [Masonry](https://masonry.desandro.com/).

#### Не обязательные задания продвинутой сложности:
 - Привязать пункты верхнего меню к разным секциям страницы. При клике на какой-либо из них делать плавную анимированную прокрутку вниз к соответствующей секции.
 - Кнопку `Load more` в секции `Our amazing work` можно нажать два раза, каждое нажатие добавляет 12 картинок снизу. То есть максимум в этой секции может быть расположено 36 картинок. После второго нажатия кнопка исчезает.
 - Кнопка `Load more` в секции `Gallery of best images` также должна быть рабочей и добавлять порцию новых картинок на страницу.
 - При клике на каждую из кнопок `Load more` имитировать загрузку картинок с сервера. Показывать вместо кнопки или над ней две секунды CSS анимацию загрузки (можно написать самому или взять любой пример из интернета, например [здесь](https://freefrontend.com/css-loaders/) или [здесь](http://nisnom.com/preloadery-loader/)), и только после этого добавить картинки на страницу. 

### Задание для студента №2
 - Светстать секцию `Our Services` и блок, который идет сразу под ней. Вкладки в секции `Our services` должны переключаться при нажатии мышью. Текст и картинки для других вкладок вставить любые.
 - Светстать секцию `Breaking news`. Карточки в ней должны быть кликабельными ссылками.
 - Сверстать секцию `What people say about theHam`. Карусель на ней должна быть рабочей, по клику как на иконку фотографии внизу, так и на стрелки вправо-влево. В карусели должна меняться как картинка, так и весь текст над ней (текст вверху, имя, должность). Карусель обязательно должна быть с анимацией скролла влево-вправо, как [здесь](http://kenwheeler.github.io/slick/).
 - При клике на любую из кнопок `Purchase now` (на макете их две) показывать по центру экрана модальное окно регистрации пользователя. Внешний вид и содержание модального окна показаны на отдельном [макете](./step-project-ham_modal.psd). Как должны выглядеть все элементы внутри модельного окна при наведении на них курсора мыши показано [здесь](./step-project-ham_modal-hover.psd).
 - Когда модальное окно открыто, весь остальной документ на его фоне должен быть немного затемнен.
 - Закрывать модальное окно при клике на кнопку `Order now`, либо на любую из кнопок регистрации через соцсети.

#### Не обязательные задания продвинутой сложности:
 - Закрывать модальное окно при клике мышкой вне его границ, на затемненной области.

### Общее задание для команды:
 - Код обоих участников команды должен находиться в одном репозитории.
 - Нужно сделать верстку только под широкоформатные мониторы, с шириной экрана 1200 пикселей или более (то есть ширина контента фиксированная в пикселях). Максимальная ширина контейнера с контентом - 1160 пикселей (кроме второго блока с квадратами, который занимает всю ширину экрана).
 - Все фоновые изображения должны занимать всю доступную ширину экрана и не двигаться при скролле вниз (параллакс). 
 - Разместить проект в интернете с помощью [Github pages](https://pages.github.com/) или [Gitlab pages](https://docs.gitlab.com/ee/user/project/pages/) (не забудьте потом добавить ссылку в резюме).
 - Для подключения всех динамических элементов можно использовать любые библиотеки - как jQuery/его плагины, так и чистый Javascript код.

Для удобства все картинки с макета размещены в [архиве](./Step%20Project%20Ham%20Pictures.zip).

#### Удачи!