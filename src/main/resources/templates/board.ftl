<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Board</title>
    <link rel="stylesheet" href="/css/main.css">
    <#list deck as card>
        <style>
            #card${card.id}{
                position: absolute;
                left: ${card.value}px;
            }
            /*body {*/
            /*    background: url(https://pl.sterlingcdn.com/wp-content/uploads/sites/3/2018/07/blackjack-classic-background.jpg) no-repeat center top fixed;*/
            /*    -webkit-background-size: cover;*/
            /*    -moz-background-size: cover;*/
            /*    -o-background-size: cover;*/
            /*    background-size: cover;*/
            /*}*/
        </style>
    </#list>
</head>
<body>
<h1 class="text">GAME</h1>
<a href="/ui/give/cards"><button>Give cards</button></a>
<#--<button><a href="/ui/give/cards/to/dealer">Give cards for dealer</a></button>-->
<a href="/ui/shuffle"><button>shuffle</button></a>
<a href="/ui/move/to/trash"><button>move to trash</button></a>
<a href="/ui/dealer/move"><button>dealer moves</button></a>
<a href="/ui/give/up"><button>give up</button></a>
<a href="/ui/rechargeCards"><button>recharge cards</button></a>
<h1 class="play">${turn}</h1>
<div class="allcards">
    <div class="trumpCard">
        <img src="${trumpCard.image}" alt="">
    </div>
    <div class="deck">
        <#list deck as card>
            <img src="${card.image}" id="card${card.id}" alt="">
        </#list>
        <h3 class="cardsNumb">cards: ${cardsSize}</h3>
    </div>
</div>
<div class="dealerCards">
    <#list dealerCards as card>
        <img src="/image/back.png" alt="++">
    </#list>
</div>
<div class="table">
    <div class="dealermoves">
        <#list dealerMoves as card>
            <img src="${card.image}" alt="">
        </#list>
    </div>
    <div class="playerMoves">
        <#list playerMoves as card>
            <img src="${card.image}" alt="">
        </#list>
    </div>
</div>
<h1 class="finalMessage">${finalMessage}</h1>
<div class="playerCards">
    <#list playerCards as card>
        <a onclick="window.location.href='/ui/player/throw/${card.id}'"><img src="${card.image}" alt=""></a>
    </#list>
</div>
</body>
</html>