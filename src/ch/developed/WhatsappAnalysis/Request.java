package ch.developed.WhatsappAnalysis;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author Samuel Stalder
 * @version 12.11.2019
 */
public class Request {
	List<Message> messageList = new ArrayList<>();
	List<Word> wordList = new ArrayList<>();
	List<Word> specWordList = new ArrayList<>();
	private final static String ALL_USER = null;
	private String notAllLowerCaseLetterRegex = "[^a-zäöü ]*";
	//almost worked as planed
	private String regexEmojiReduced = "[^a-zäöü 😀😁😂🤣😃😄😅😆😉😊😋😎😍😘🥰😗😙😚☺️🙂🤗🤩🤔🤨😐😑😶🙄😏😣😥😮🤐😯😪😫😴😌😛😜😝🤤😒😓😔😕🙃🤑😲☹️🙁😖😞😟😤😢😭😦😧😨😩🤯😬😰😱🥵🥶😳🤪😵😡😠🤬😷🤒🤕🤢🤮🤧😇🤠🤡🤥🤫🤭🧐🤓😈👿👹👺💀👻👽🤖💩😺😸😹😻😼😽🙀😿😾👶👧🧒👦👩🧑👨👵🧓👴👲👳‍♀️👳‍♂️🧕🧔👱‍♂️👱‍♀️👨‍🦰👩‍🦰👨‍🦱👩‍🦱👨‍🦲👩‍🦲👨‍🦳👩‍🧦🧤🧣🎩🧢👒🎓⛑👑👝👛👜💼🎒👓🕶👶🏿👦🏿👧🏿👨🏿👩🏿👱🏿‍♀️👱🏿👴🏿👵🏿👲🏿👳🏿‍♀️👳🏿👮🏿‍♀️👮🏿👷🏿‍♀️👷🏿💂🏿‍♀️💂🏿🕵🏿‍♀️🕵🏿👩🏿‍⚕️👨🏿‍⚕️👩🏿‍🌾👨🏿‍🌾👩🏿‍🍳👨🏿‍🍳👩🏿‍🎓👨🏿‍🎓👩🏿‍🎤👨🏿‍🎤👩🏿‍🏫👨🏿‍🏫👩🏿‍🏭👨🏿‍🏭👩🏿‍💻👨🏿‍💻👩🏿‍💼👨🏿‍💼👩🏿‍🔧👨🏿‍🔧👩🏿‍🔬👨🏿‍🔬👩🏿‍🎨👨🏿‍🎨👩🏿‍🚒👨🏿‍🚒👩🏿‍✈️👨🏿‍✈️👩🏿‍🚀👨🏿‍🚀👩🏿‍⚖️👨🏿‍⚖️🤶🏿🎅🏿👸🏿🤴🏿👰🏿🤵🏿👼🏿🤰🏿🙇🏿‍♀️🙇🏿💁🏿💁🏿‍♂️🙅🏿🙅🏿‍♂️🙆🏿🙆🏿‍♂️🙋🏿🙋🏿‍♂️🤦🏿‍♀️🤦🏿‍♂️🤷🏿‍♀️🤷🏿‍♂️🙎🏿🙎🏿‍♂️🙍🏿🙍🏿‍♂️💇🏿💇🏿‍♂️💆🏿💆🏿‍♂️🕴🏿💃🏿🕺🏿🚶🏿‍♀️🚶🏿🏃🏿‍♀️🏃🏿🤲🏿👐🏿🙌🏿👏🏿🙏🏿👍🏿👎🏿👊🏿✊🏿🤛🏿🤜🏿🤞🏿✌🏿🤟🏿🤘🏿👌🏿👈🏿👉🏿👆🏿👇🏿☝🏿✋🏿🤚🏿🖐🏿🖖🏿👋🏿🤙🏿💪🏿🖕🏿✍🏿🤳🏿💅🏿👂🏿👃🏿🐶🐱🐭🐹🐰🦊🦝🐻🐼🐨🐯🦁🐮🐷🐽🐸🐵🙈🙉🙊🐒🐔🐧🐦🐤🐣🐥🦆🦢🦅🦉🦚🦜🦇🐺🐗🐴🦄🐝🐛🦋🐌🐚🐞🐜🦗🕷🕸🦂🦟🦠🐢🐍🦎🦖🦕🐙🦑🦐🦀🐡🐠🐟🐬🐳🐋🦈🐊🐅🐆🦓🦍🐘🦏🦛🐪🐫🦙🦒🐃🐂🐄🐎🐖🐏🐑🐐🦌🐕🐩🐈🐓🦃🕊🐇🐁🐀🐿🦔🐾🐉🐲🌵🎄🌲🌳🌴🌱🌿☘️🍀🎍🎋🍃🍂🍁🍄🌾💐🌷🌹🥀🌺🌸🌼🌻🌞🌝🌛🌜🌚🌕🌖🌗🌘🌑🌒🌓🌔🌙🌎🌍🌏💫⭐️🌟✨⚡️☄️💥🔥🌪🌈☀️🌤⛅️🌥☁️🌦🌧⛈🌩🌨❄️☃️⛄️🌬💨💧💦☔️☂️🌊🌫🍏🍎🍐🍊🍋🍌🍉🍇🍓🍈🍒🍑🍍🥭🥥🥝🍅🍆🥑🥦🥒🥬🌶🌽🥕🥔🍠🥐🍞🥖🥨🥯🧀🥚🍳🥞🥓🥩🍗🍖🌭🍔🍟🍕🥪🥙🌮🌯🥗🥘🥫🍝🍜🍲🍛🍣🍱🥟🍤🍙🍚🍘🍥🥮🥠🍢🍡🍧🍨🍦🥧🍰🎂🍮🍭🍬🍫🍿🧂🍩🍪🌰🥜🍯🥛🍼☕️🍵🥤🍶🍺🍻🥂🍷🥃🍸🍹🍾🥄🍴🍽🥣🥡🥢⚽️🏀🏈⚾️🥎🏐🏉🎾🥏🎱🏓🏸🥅🏒🏑🥍🏏⛳️🏹🎣🥊🥋🎽⛸🥌🛷🛹🎿⛷🏂🏋️‍♀️🏋🏻‍♀️🏋🏼‍♀️🏋🏽‍♀️🏋🏾‍♀️🏋🏿‍♀️🏋️‍♂️🏋🏻‍♂️🏋🏼‍♂️🏋🏽‍♂️🏋🏾‍♂️🏋🏿‍♂️🤼‍♀️🤼‍♂️🤸‍♀️🤸🏻‍♀️🤸🏼‍♀️🤸🏽‍♀️🤸🏾‍♀️🤸🏿‍♀️🤸‍♂️🤸🏻‍♂️🤸🏼‍♂️🤸🏽‍♂️🤸🏾‍♂️🤸🏿‍♂️⛹️‍♀️⛹🏻‍♀️⛹🏼‍♀️⛹🏽‍♀️⛹🏾‍♀️⛹🏿‍♀️⛹️‍♂️⛹🏻‍♂️⛹🏼‍♂️⛹🏽‍♂️⛹🏾‍♂️⛹🏿‍♂️🤺🤾‍♀️🤾🏻‍♀️🤾🏼‍♀️🤾🏾‍♀️🤾🏾‍♀️🤾🏿‍♀️🤾‍♂️🤾🏻‍♂️🤾🏼‍♂️🤾🏽‍♂️🤾🏾‍♂️🤾🏿‍♂️🏌️‍♀️🏌🏻‍♀️🏌🏼‍♀️🏌🏽‍♀️🏌🏾‍♀️🏌🏿‍♀️🏌️‍♂️🏌🏻‍♂️🏌🏼‍♂️🏌🏽‍♂️🏌🏾‍♂️🏌🏿‍♂️🏇🏇🏻🏇🏼🏇🏽🏇🏾🏇🏿🧘‍♀️🧘🏻‍♀️🧘🏼‍♀️🧘🏽‍♀️🧘🏾‍♀️🧘🏿‍♀️🧘‍♂️🧘🏻‍♂️🧘🏼‍♂️🧘🏽‍♂️🧘🏾‍♂️🧘🏿‍♂️🏄‍♀️🏄🏻‍♀️🏄🏼‍♀️🏄🏽‍♀️🏄🏾‍♀️🏄🏿‍♀️🏄‍♂️🏄🏻‍♂️🏄🏼‍♂️🏄🏽‍♂️🏄🏾‍♂️🏄🏿‍♂️🏊‍♀️🏊🏻‍♀️🏊🏼‍♀️🏊🏽‍♀️🏊🏾‍♀️🏊🏿‍♀️🏊‍♂️🏊🏻‍♂️🏊🏼‍♂️🏊🏽‍♂️🏊🏾‍♂️🏊🏿‍♂️🤽‍♀️🤽🏻‍♀️🤽🏼‍♀️🤽🏽‍♀️🤽🏾‍♀️🤽🏿‍♀️🤽‍♂️🤽🏻‍♂️🤽🏼‍♂️🤽🏽‍♂️🤽🏾‍♂️🤽🏿‍♂️🚣‍♀️🚣🏻‍♀️🚣🏼‍♀️🚣🏽‍♀️🚣🏾‍♀️🚣🏿‍♀️🚣‍♂️🚣🏻‍♂️🚣🏼‍♂️🚣🏽‍♂️🚣🏾‍♂️🚣🏿‍♂️🧗‍♀️🧗🏻‍♀️🧗🏼‍♀️🧗🏽‍♀️🧗🏾‍♀️🧗🏿‍♀️🧗‍♂️🧗🏻‍♂️🧗🏼‍♂️🧗🏽‍♂️🧗🏾‍♂️🧗🏿‍♂️🚵‍♀️🚵🏻‍♀️🚵🏼‍♀️🚵🏽‍♀️🚵🏾‍♀️🚵🏿‍♀️🚵‍♂️🚵🏻‍♂️🚵🏼‍♂️🚵🏽‍♂️🚵🏾‍♂️🚵🏿‍♂️🚴‍♀️🚴🏻‍♀️🚴🏼‍♀️🚴🏽‍♀️🚴🏾‍♀️🚴🏿‍♀️🚴‍♂️🚴🏻‍♂️🚴🏼‍♂️🚴🏽‍♂️🚴🏾‍♂️🚴🏿‍♂️🏆🥇🥈🥉🏅🎖🏵🎗🎫🎟🎪🤹‍♀️🤹🏻‍♀️🤹🏼‍♀️🤹🏽‍♀️🤹🏾‍♀️🤹🏿‍♀️🤹‍♂️🤹🏻‍♂️🤹🏼‍♂️🤹🏽‍♂️🤹🏾‍♂️🤹🏿‍♂️🎭🎨🎬🎤🎧🎼🎹🥁🎷🎺🎸🎻🎲🧩♟🎯🎳🎮🎰🚗🚕🚙🚌🚎🏎🚓🚑🚒🚐🚚🚛🚜🛴🚲🛵🏍🚨🚔🚍🚘🚖🚡🚠🚟🚃🚋🚞🚝🚄🚅🚈🚂🚆🚇🚊🚉✈️🛫🛬🛩💺🛰🚀🛸🚁🛶⛵️🚤🛥🛳⛴🚢⚓️⛽️🚧🚦🚥🚏🗺🗿🗽🗼🏰🏯🏟🎡🎢🎠⛲️⛱🏖🏝🏜🌋⛰🏔🗻🏕⛺️🏠🏡🏘🏚🏗🏭🏢🏬🏣🏤🏥🏦🏨🏪🏫🏩💒🏛⛪️🕌🕍🕋⛩🛤🛣🗾🎑🏞🌅🌄🌠🎇🎆🌇🌆🏙🌃🌌🌉🌁⌚️📱📲💻⌨️🖥🖨🖱🖲🕹🗜💽💾💿📀📼📷📸📹🎥📽🎞📞☎️📟📠📺📻🎙🎚🎛⏱⏲⏰🕰⌛️⏳📡🔋🔌💡🔦🕯🗑🛢💸💵💴💶💷💰💳🧾💎⚖️🔧🔨⚒🛠⛏🔩⚙️⛓🔫💣🔪🗡⚔️🛡🚬⚰️⚱️🏺🧭🧱🔮🧿🧸📿💈⚗️🔭🧰🧲🧪🧫🧬🧯🔬🕳💊💉🌡🚽🚰🚿🛁🛀🛀🏻🛀🏼🛀🏽🛀🏾🛀🏿🧴🧵🧶🧷🧹🧺🧻🧼🧽🛎🔑🗝🚪🛋🛏🛌🖼🛍🧳🛒🎁🎈🎏🎀🎊🎉🧨🎎🏮🎐🧧✉️📩📨📧💌📥📤📦🏷📪📫📬📭📮📯📜📃📄📑📊📈📉🗒🗓📆📅📇🗃🗳🗄📋📁📂🗂🗞📰📓📔📒📕📗📘📙📚📖🔖🔗📎🖇📐📏📌📍✂️🖊🖋✒️🖌🖍📝✏️🔍🔎🔏🔐🔒🔓❤️🧡💛💚💙💜🖤💔❣️💕💞💓💗💖💘💝💟☮️✝️☪️🕉☸️✡️🔯🕎☯️☦️🛐⛎♈️♉️♊️♋️♌️♍️♎️♏️♐️♑️♒️♓️🆔⚛️🉑☢️☣️📴📳🈶🈚️🈸🈺🈷️✴️🆚💮🉐㊙️㊗️🈴🈵🈹🈲🅰️🅱️🆎🆑🅾️🆘❌⭕️🛑⛔️📛🚫💯💢♨️🚷🚯🚳🚱🔞📵🚭❗️❕❓❔‼️⁉️🔅🔆〽️⚠️🚸🔱⚜️🔰♻️✅🈯️💹❇️✳️❎🌐💠Ⓜ️🌀💤🏧🚾♿️🅿️🈳🈂️🛂🛃🛄🛅🚹🚺🚼🚻🚮🎦📶🈁🔣ℹ️🔤🔡🔠🆖🆗🆙🆒🆕🆓0️⃣1️⃣2️⃣3️⃣4️⃣5️⃣6️⃣7️⃣8️⃣9️⃣🔟🔢#️⃣️⃣⏏️▶️⏸⏯⏹⏺⏭⏮⏩⏪⏫⏬◀️🔼🔽➡️⬅️⬆️⬇️↗️↘️↙️↖️↕️↔️↪️↩️⤴️⤵️🔀🔁🔂🔄🔃🎵🎶➕➖➗✖️♾💲💱™️©️®️〰️➰➿🔚🔙🔛🔝🔜✔️☑️🔘⚪️⚫️🔴🔵🔺🔻🔸🔹🔶🔷🔳🔲▪️▫️◾️◽️◼️◻️⬛️⬜️🔈🔇🔉🔊🔔🔕📣📢👁‍🗨💬💭🗯♠️♣️♥️♦️🃏🎴🀄️🕐🕑🕒🕓🕔🕕🕖🕗🕘🕙🕚🕛🕜🕝🕞🕟🕠🕡🕢🕣🕤🕥🕦🕧]*";
	private String regexEmojiOnly = "[😀😁😂🤣😃😄😅😆😉😊😋😎😍😘🥰😗😙😚☺️🙂🤗🤩🤔🤨😐😑😶🙄😏😣😥😮🤐😯😪😫😴😌😛😜😝🤤😒😓😔😕🙃🤑😲☹️🙁😖😞😟😤😢😭😦😧😨😩🤯😬😰😱🥵🥶😳🤪😵😡😠🤬😷🤒🤕🤢🤮🤧😇🤠🤡🤥🤫🤭🧐🤓😈👿👹👺💀👻👽🤖💩😺😸😹😻😼😽🙀😿😾👶👧🧒👦👩🧑👨👵🧓👴👲👳‍♀️👳‍♂️🧕🧔👱‍♂️👱‍♀️👨‍🦰👩‍🦰👨‍🦱👩‍🦱👨‍🦲👩‍🦲👨‍🦳👩‍🧦🧤🧣🎩🧢👒🎓⛑👑👝👛👜💼🎒👓🕶👶🏿👦🏿👧🏿👨🏿👩🏿👱🏿‍♀️👱🏿👴🏿👵🏿👲🏿👳🏿‍♀️👳🏿👮🏿‍♀️👮🏿👷🏿‍♀️👷🏿💂🏿‍♀️💂🏿🕵🏿‍♀️🕵🏿👩🏿‍⚕️👨🏿‍⚕️👩🏿‍🌾👨🏿‍🌾👩🏿‍🍳👨🏿‍🍳👩🏿‍🎓👨🏿‍🎓👩🏿‍🎤👨🏿‍🎤👩🏿‍🏫👨🏿‍🏫👩🏿‍🏭👨🏿‍🏭👩🏿‍💻👨🏿‍💻👩🏿‍💼👨🏿‍💼👩🏿‍🔧👨🏿‍🔧👩🏿‍🔬👨🏿‍🔬👩🏿‍🎨👨🏿‍🎨👩🏿‍🚒👨🏿‍🚒👩🏿‍✈️👨🏿‍✈️👩🏿‍🚀👨🏿‍🚀👩🏿‍⚖️👨🏿‍⚖️🤶🏿🎅🏿👸🏿🤴🏿👰🏿🤵🏿👼🏿🤰🏿🙇🏿‍♀️🙇🏿💁🏿💁🏿‍♂️🙅🏿🙅🏿‍♂️🙆🏿🙆🏿‍♂️🙋🏿🙋🏿‍♂️🤦🏿‍♀️🤦🏿‍♂️🤷🏿‍♀️🤷🏿‍♂️🙎🏿🙎🏿‍♂️🙍🏿🙍🏿‍♂️💇🏿💇🏿‍♂️💆🏿💆🏿‍♂️🕴🏿💃🏿🕺🏿🚶🏿‍♀️🚶🏿🏃🏿‍♀️🏃🏿🤲🏿👐🏿🙌🏿👏🏿🙏🏿👍🏿👎🏿👊🏿✊🏿🤛🏿🤜🏿🤞🏿✌🏿🤟🏿🤘🏿👌🏿👈🏿👉🏿👆🏿👇🏿☝🏿✋🏿🤚🏿🖐🏿🖖🏿👋🏿🤙🏿💪🏿🖕🏿✍🏿🤳🏿💅🏿👂🏿👃🏿🐶🐱🐭🐹🐰🦊🦝🐻🐼🐨🐯🦁🐮🐷🐽🐸🐵🙈🙉🙊🐒🐔🐧🐦🐤🐣🐥🦆🦢🦅🦉🦚🦜🦇🐺🐗🐴🦄🐝🐛🦋🐌🐚🐞🐜🦗🕷🕸🦂🦟🦠🐢🐍🦎🦖🦕🐙🦑🦐🦀🐡🐠🐟🐬🐳🐋🦈🐊🐅🐆🦓🦍🐘🦏🦛🐪🐫🦙🦒🐃🐂🐄🐎🐖🐏🐑🐐🦌🐕🐩🐈🐓🦃🕊🐇🐁🐀🐿🦔🐾🐉🐲🌵🎄🌲🌳🌴🌱🌿☘️🍀🎍🎋🍃🍂🍁🍄🌾💐🌷🌹🥀🌺🌸🌼🌻🌞🌝🌛🌜🌚🌕🌖🌗🌘🌑🌒🌓🌔🌙🌎🌍🌏💫⭐️🌟✨⚡️☄️💥🔥🌪🌈☀️🌤⛅️🌥☁️🌦🌧⛈🌩🌨❄️☃️⛄️🌬💨💧💦☔️☂️🌊🌫🍏🍎🍐🍊🍋🍌🍉🍇🍓🍈🍒🍑🍍🥭🥥🥝🍅🍆🥑🥦🥒🥬🌶🌽🥕🥔🍠🥐🍞🥖🥨🥯🧀🥚🍳🥞🥓🥩🍗🍖🌭🍔🍟🍕🥪🥙🌮🌯🥗🥘🥫🍝🍜🍲🍛🍣🍱🥟🍤🍙🍚🍘🍥🥮🥠🍢🍡🍧🍨🍦🥧🍰🎂🍮🍭🍬🍫🍿🧂🍩🍪🌰🥜🍯🥛🍼☕️🍵🥤🍶🍺🍻🥂🍷🥃🍸🍹🍾🥄🍴🍽🥣🥡🥢⚽️🏀🏈⚾️🥎🏐🏉🎾🥏🎱🏓🏸🥅🏒🏑🥍🏏⛳️🏹🎣🥊🥋🎽⛸🥌🛷🛹🎿⛷🏂🏋️‍♀️🏋🏻‍♀️🏋🏼‍♀️🏋🏽‍♀️🏋🏾‍♀️🏋🏿‍♀️🏋️‍♂️🏋🏻‍♂️🏋🏼‍♂️🏋🏽‍♂️🏋🏾‍♂️🏋🏿‍♂️🤼‍♀️🤼‍♂️🤸‍♀️🤸🏻‍♀️🤸🏼‍♀️🤸🏽‍♀️🤸🏾‍♀️🤸🏿‍♀️🤸‍♂️🤸🏻‍♂️🤸🏼‍♂️🤸🏽‍♂️🤸🏾‍♂️🤸🏿‍♂️⛹️‍♀️⛹🏻‍♀️⛹🏼‍♀️⛹🏽‍♀️⛹🏾‍♀️⛹🏿‍♀️⛹️‍♂️⛹🏻‍♂️⛹🏼‍♂️⛹🏽‍♂️⛹🏾‍♂️⛹🏿‍♂️🤺🤾‍♀️🤾🏻‍♀️🤾🏼‍♀️🤾🏾‍♀️🤾🏾‍♀️🤾🏿‍♀️🤾‍♂️🤾🏻‍♂️🤾🏼‍♂️🤾🏽‍♂️🤾🏾‍♂️🤾🏿‍♂️🏌️‍♀️🏌🏻‍♀️🏌🏼‍♀️🏌🏽‍♀️🏌🏾‍♀️🏌🏿‍♀️🏌️‍♂️🏌🏻‍♂️🏌🏼‍♂️🏌🏽‍♂️🏌🏾‍♂️🏌🏿‍♂️🏇🏇🏻🏇🏼🏇🏽🏇🏾🏇🏿🧘‍♀️🧘🏻‍♀️🧘🏼‍♀️🧘🏽‍♀️🧘🏾‍♀️🧘🏿‍♀️🧘‍♂️🧘🏻‍♂️🧘🏼‍♂️🧘🏽‍♂️🧘🏾‍♂️🧘🏿‍♂️🏄‍♀️🏄🏻‍♀️🏄🏼‍♀️🏄🏽‍♀️🏄🏾‍♀️🏄🏿‍♀️🏄‍♂️🏄🏻‍♂️🏄🏼‍♂️🏄🏽‍♂️🏄🏾‍♂️🏄🏿‍♂️🏊‍♀️🏊🏻‍♀️🏊🏼‍♀️🏊🏽‍♀️🏊🏾‍♀️🏊🏿‍♀️🏊‍♂️🏊🏻‍♂️🏊🏼‍♂️🏊🏽‍♂️🏊🏾‍♂️🏊🏿‍♂️🤽‍♀️🤽🏻‍♀️🤽🏼‍♀️🤽🏽‍♀️🤽🏾‍♀️🤽🏿‍♀️🤽‍♂️🤽🏻‍♂️🤽🏼‍♂️🤽🏽‍♂️🤽🏾‍♂️🤽🏿‍♂️🚣‍♀️🚣🏻‍♀️🚣🏼‍♀️🚣🏽‍♀️🚣🏾‍♀️🚣🏿‍♀️🚣‍♂️🚣🏻‍♂️🚣🏼‍♂️🚣🏽‍♂️🚣🏾‍♂️🚣🏿‍♂️🧗‍♀️🧗🏻‍♀️🧗🏼‍♀️🧗🏽‍♀️🧗🏾‍♀️🧗🏿‍♀️🧗‍♂️🧗🏻‍♂️🧗🏼‍♂️🧗🏽‍♂️🧗🏾‍♂️🧗🏿‍♂️🚵‍♀️🚵🏻‍♀️🚵🏼‍♀️🚵🏽‍♀️🚵🏾‍♀️🚵🏿‍♀️🚵‍♂️🚵🏻‍♂️🚵🏼‍♂️🚵🏽‍♂️🚵🏾‍♂️🚵🏿‍♂️🚴‍♀️🚴🏻‍♀️🚴🏼‍♀️🚴🏽‍♀️🚴🏾‍♀️🚴🏿‍♀️🚴‍♂️🚴🏻‍♂️🚴🏼‍♂️🚴🏽‍♂️🚴🏾‍♂️🚴🏿‍♂️🏆🥇🥈🥉🏅🎖🏵🎗🎫🎟🎪🤹‍♀️🤹🏻‍♀️🤹🏼‍♀️🤹🏽‍♀️🤹🏾‍♀️🤹🏿‍♀️🤹‍♂️🤹🏻‍♂️🤹🏼‍♂️🤹🏽‍♂️🤹🏾‍♂️🤹🏿‍♂️🎭🎨🎬🎤🎧🎼🎹🥁🎷🎺🎸🎻🎲🧩♟🎯🎳🎮🎰🚗🚕🚙🚌🚎🏎🚓🚑🚒🚐🚚🚛🚜🛴🚲🛵🏍🚨🚔🚍🚘🚖🚡🚠🚟🚃🚋🚞🚝🚄🚅🚈🚂🚆🚇🚊🚉✈️🛫🛬🛩💺🛰🚀🛸🚁🛶⛵️🚤🛥🛳⛴🚢⚓️⛽️🚧🚦🚥🚏🗺🗿🗽🗼🏰🏯🏟🎡🎢🎠⛲️⛱🏖🏝🏜🌋⛰🏔🗻🏕⛺️🏠🏡🏘🏚🏗🏭🏢🏬🏣🏤🏥🏦🏨🏪🏫🏩💒🏛⛪️🕌🕍🕋⛩🛤🛣🗾🎑🏞🌅🌄🌠🎇🎆🌇🌆🏙🌃🌌🌉🌁⌚️📱📲💻⌨️🖥🖨🖱🖲🕹🗜💽💾💿📀📼📷📸📹🎥📽🎞📞☎️📟📠📺📻🎙🎚🎛⏱⏲⏰🕰⌛️⏳📡🔋🔌💡🔦🕯🗑🛢💸💵💴💶💷💰💳🧾💎⚖️🔧🔨⚒🛠⛏🔩⚙️⛓🔫💣🔪🗡⚔️🛡🚬⚰️⚱️🏺🧭🧱🔮🧿🧸📿💈⚗️🔭🧰🧲🧪🧫🧬🧯🔬🕳💊💉🌡🚽🚰🚿🛁🛀🛀🏻🛀🏼🛀🏽🛀🏾🛀🏿🧴🧵🧶🧷🧹🧺🧻🧼🧽🛎🔑🗝🚪🛋🛏🛌🖼🛍🧳🛒🎁🎈🎏🎀🎊🎉🧨🎎🏮🎐🧧✉️📩📨📧💌📥📤📦🏷📪📫📬📭📮📯📜📃📄📑📊📈📉🗒🗓📆📅📇🗃🗳🗄📋📁📂🗂🗞📰📓📔📒📕📗📘📙📚📖🔖🔗📎🖇📐📏📌📍✂️🖊🖋✒️🖌🖍📝✏️🔍🔎🔏🔐🔒🔓❤️🧡💛💚💙💜🖤💔❣️💕💞💓💗💖💘💝💟☮️✝️☪️🕉☸️✡️🔯🕎☯️☦️🛐⛎♈️♉️♊️♋️♌️♍️♎️♏️♐️♑️♒️♓️🆔⚛️🉑☢️☣️📴📳🈶🈚️🈸🈺🈷️✴️🆚💮🉐㊙️㊗️🈴🈵🈹🈲🅰️🅱️🆎🆑🅾️🆘❌⭕️🛑⛔️📛🚫💯💢♨️🚷🚯🚳🚱🔞📵🚭❗️❕❓❔‼️⁉️🔅🔆〽️⚠️🚸🔱⚜️🔰♻️✅🈯️💹❇️✳️❎🌐💠Ⓜ️🌀💤🏧🚾♿️🅿️🈳🈂️🛂🛃🛄🛅🚹🚺🚼🚻🚮🎦📶🈁🔣ℹ️🔤🔡🔠🆖🆗🆙🆒🆕🆓0️⃣1️⃣2️⃣3️⃣4️⃣5️⃣6️⃣7️⃣8️⃣9️⃣🔟🔢#️⃣️⃣⏏️▶️⏸⏯⏹⏺⏭⏮⏩⏪⏫⏬◀️🔼🔽➡️⬅️⬆️⬇️↗️↘️↙️↖️↕️↔️↪️↩️⤴️⤵️🔀🔁🔂🔄🔃🎵🎶➕➖➗✖️♾💲💱™️©️®️〰️➰➿🔚🔙🔛🔝🔜✔️☑️🔘⚪️⚫️🔴🔵🔺🔻🔸🔹🔶🔷🔳🔲▪️▫️◾️◽️◼️◻️⬛️⬜️🔈🔇🔉🔊🔔🔕📣📢👁‍🗨💬💭🗯♠️♣️♥️♦️🃏🎴🀄️🕐🕑🕒🕓🕔🕕🕖🕗🕘🕙🕚🕛🕜🕝🕞🕟🕠🕡🕢🕣🕤🕥🕦🕧]*]";
	private String regexAllExceptEmoji = "[^😀😁😂🤣😃😄😅😆😉😊😋😎😍😘🥰😗😙😚☺️🙂🤗🤩🤔🤨😐😑😶🙄😏😣😥😮🤐😯😪😫😴😌😛😜😝🤤😒😓😔😕🙃🤑😲☹️🙁😖😞😟😤😢😭😦😧😨😩🤯😬😰😱🥵🥶😳🤪😵😡😠🤬😷🤒🤕🤢🤮🤧😇🤠🤡🤥🤫🤭🧐🤓😈👿👹👺💀👻👽🤖💩😺😸😹😻😼😽🙀😿😾👶👧🧒👦👩🧑👨👵🧓👴👲👳‍♀️👳‍♂️🧕🧔👱‍♂️👱‍♀️👨‍🦰👩‍🦰👨‍🦱👩‍🦱👨‍🦲👩‍🦲👨‍🦳👩‍🧦🧤🧣🎩🧢👒🎓⛑👑👝👛👜💼🎒👓🕶👶🏿👦🏿👧🏿👨🏿👩🏿👱🏿‍♀️👱🏿👴🏿👵🏿👲🏿👳🏿‍♀️👳🏿👮🏿‍♀️👮🏿👷🏿‍♀️👷🏿💂🏿‍♀️💂🏿🕵🏿‍♀️🕵🏿👩🏿‍⚕️👨🏿‍⚕️👩🏿‍🌾👨🏿‍🌾👩🏿‍🍳👨🏿‍🍳👩🏿‍🎓👨🏿‍🎓👩🏿‍🎤👨🏿‍🎤👩🏿‍🏫👨🏿‍🏫👩🏿‍🏭👨🏿‍🏭👩🏿‍💻👨🏿‍💻👩🏿‍💼👨🏿‍💼👩🏿‍🔧👨🏿‍🔧👩🏿‍🔬👨🏿‍🔬👩🏿‍🎨👨🏿‍🎨👩🏿‍🚒👨🏿‍🚒👩🏿‍✈️👨🏿‍✈️👩🏿‍🚀👨🏿‍🚀👩🏿‍⚖️👨🏿‍⚖️🤶🏿🎅🏿👸🏿🤴🏿👰🏿🤵🏿👼🏿🤰🏿🙇🏿‍♀️🙇🏿💁🏿💁🏿‍♂️🙅🏿🙅🏿‍♂️🙆🏿🙆🏿‍♂️🙋🏿🙋🏿‍♂️🤦🏿‍♀️🤦🏿‍♂️🤷🏿‍♀️🤷🏿‍♂️🙎🏿🙎🏿‍♂️🙍🏿🙍🏿‍♂️💇🏿💇🏿‍♂️💆🏿💆🏿‍♂️🕴🏿💃🏿🕺🏿🚶🏿‍♀️🚶🏿🏃🏿‍♀️🏃🏿🤲🏿👐🏿🙌🏿👏🏿🙏🏿👍🏿👎🏿👊🏿✊🏿🤛🏿🤜🏿🤞🏿✌🏿🤟🏿🤘🏿👌🏿👈🏿👉🏿👆🏿👇🏿☝🏿✋🏿🤚🏿🖐🏿🖖🏿👋🏿🤙🏿💪🏿🖕🏿✍🏿🤳🏿💅🏿👂🏿👃🏿🐶🐱🐭🐹🐰🦊🦝🐻🐼🐨🐯🦁🐮🐷🐽🐸🐵🙈🙉🙊🐒🐔🐧🐦🐤🐣🐥🦆🦢🦅🦉🦚🦜🦇🐺🐗🐴🦄🐝🐛🦋🐌🐚🐞🐜🦗🕷🕸🦂🦟🦠🐢🐍🦎🦖🦕🐙🦑🦐🦀🐡🐠🐟🐬🐳🐋🦈🐊🐅🐆🦓🦍🐘🦏🦛🐪🐫🦙🦒🐃🐂🐄🐎🐖🐏🐑🐐🦌🐕🐩🐈🐓🦃🕊🐇🐁🐀🐿🦔🐾🐉🐲🌵🎄🌲🌳🌴🌱🌿☘️🍀🎍🎋🍃🍂🍁🍄🌾💐🌷🌹🥀🌺🌸🌼🌻🌞🌝🌛🌜🌚🌕🌖🌗🌘🌑🌒🌓🌔🌙🌎🌍🌏💫⭐️🌟✨⚡️☄️💥🔥🌪🌈☀️🌤⛅️🌥☁️🌦🌧⛈🌩🌨❄️☃️⛄️🌬💨💧💦☔️☂️🌊🌫🍏🍎🍐🍊🍋🍌🍉🍇🍓🍈🍒🍑🍍🥭🥥🥝🍅🍆🥑🥦🥒🥬🌶🌽🥕🥔🍠🥐🍞🥖🥨🥯🧀🥚🍳🥞🥓🥩🍗🍖🌭🍔🍟🍕🥪🥙🌮🌯🥗🥘🥫🍝🍜🍲🍛🍣🍱🥟🍤🍙🍚🍘🍥🥮🥠🍢🍡🍧🍨🍦🥧🍰🎂🍮🍭🍬🍫🍿🧂🍩🍪🌰🥜🍯🥛🍼☕️🍵🥤🍶🍺🍻🥂🍷🥃🍸🍹🍾🥄🍴🍽🥣🥡🥢⚽️🏀🏈⚾️🥎🏐🏉🎾🥏🎱🏓🏸🥅🏒🏑🥍🏏⛳️🏹🎣🥊🥋🎽⛸🥌🛷🛹🎿⛷🏂🏋️‍♀️🏋🏻‍♀️🏋🏼‍♀️🏋🏽‍♀️🏋🏾‍♀️🏋🏿‍♀️🏋️‍♂️🏋🏻‍♂️🏋🏼‍♂️🏋🏽‍♂️🏋🏾‍♂️🏋🏿‍♂️🤼‍♀️🤼‍♂️🤸‍♀️🤸🏻‍♀️🤸🏼‍♀️🤸🏽‍♀️🤸🏾‍♀️🤸🏿‍♀️🤸‍♂️🤸🏻‍♂️🤸🏼‍♂️🤸🏽‍♂️🤸🏾‍♂️🤸🏿‍♂️⛹️‍♀️⛹🏻‍♀️⛹🏼‍♀️⛹🏽‍♀️⛹🏾‍♀️⛹🏿‍♀️⛹️‍♂️⛹🏻‍♂️⛹🏼‍♂️⛹🏽‍♂️⛹🏾‍♂️⛹🏿‍♂️🤺🤾‍♀️🤾🏻‍♀️🤾🏼‍♀️🤾🏾‍♀️🤾🏾‍♀️🤾🏿‍♀️🤾‍♂️🤾🏻‍♂️🤾🏼‍♂️🤾🏽‍♂️🤾🏾‍♂️🤾🏿‍♂️🏌️‍♀️🏌🏻‍♀️🏌🏼‍♀️🏌🏽‍♀️🏌🏾‍♀️🏌🏿‍♀️🏌️‍♂️🏌🏻‍♂️🏌🏼‍♂️🏌🏽‍♂️🏌🏾‍♂️🏌🏿‍♂️🏇🏇🏻🏇🏼🏇🏽🏇🏾🏇🏿🧘‍♀️🧘🏻‍♀️🧘🏼‍♀️🧘🏽‍♀️🧘🏾‍♀️🧘🏿‍♀️🧘‍♂️🧘🏻‍♂️🧘🏼‍♂️🧘🏽‍♂️🧘🏾‍♂️🧘🏿‍♂️🏄‍♀️🏄🏻‍♀️🏄🏼‍♀️🏄🏽‍♀️🏄🏾‍♀️🏄🏿‍♀️🏄‍♂️🏄🏻‍♂️🏄🏼‍♂️🏄🏽‍♂️🏄🏾‍♂️🏄🏿‍♂️🏊‍♀️🏊🏻‍♀️🏊🏼‍♀️🏊🏽‍♀️🏊🏾‍♀️🏊🏿‍♀️🏊‍♂️🏊🏻‍♂️🏊🏼‍♂️🏊🏽‍♂️🏊🏾‍♂️🏊🏿‍♂️🤽‍♀️🤽🏻‍♀️🤽🏼‍♀️🤽🏽‍♀️🤽🏾‍♀️🤽🏿‍♀️🤽‍♂️🤽🏻‍♂️🤽🏼‍♂️🤽🏽‍♂️🤽🏾‍♂️🤽🏿‍♂️🚣‍♀️🚣🏻‍♀️🚣🏼‍♀️🚣🏽‍♀️🚣🏾‍♀️🚣🏿‍♀️🚣‍♂️🚣🏻‍♂️🚣🏼‍♂️🚣🏽‍♂️🚣🏾‍♂️🚣🏿‍♂️🧗‍♀️🧗🏻‍♀️🧗🏼‍♀️🧗🏽‍♀️🧗🏾‍♀️🧗🏿‍♀️🧗‍♂️🧗🏻‍♂️🧗🏼‍♂️🧗🏽‍♂️🧗🏾‍♂️🧗🏿‍♂️🚵‍♀️🚵🏻‍♀️🚵🏼‍♀️🚵🏽‍♀️🚵🏾‍♀️🚵🏿‍♀️🚵‍♂️🚵🏻‍♂️🚵🏼‍♂️🚵🏽‍♂️🚵🏾‍♂️🚵🏿‍♂️🚴‍♀️🚴🏻‍♀️🚴🏼‍♀️🚴🏽‍♀️🚴🏾‍♀️🚴🏿‍♀️🚴‍♂️🚴🏻‍♂️🚴🏼‍♂️🚴🏽‍♂️🚴🏾‍♂️🚴🏿‍♂️🏆🥇🥈🥉🏅🎖🏵🎗🎫🎟🎪🤹‍♀️🤹🏻‍♀️🤹🏼‍♀️🤹🏽‍♀️🤹🏾‍♀️🤹🏿‍♀️🤹‍♂️🤹🏻‍♂️🤹🏼‍♂️🤹🏽‍♂️🤹🏾‍♂️🤹🏿‍♂️🎭🎨🎬🎤🎧🎼🎹🥁🎷🎺🎸🎻🎲🧩♟🎯🎳🎮🎰🚗🚕🚙🚌🚎🏎🚓🚑🚒🚐🚚🚛🚜🛴🚲🛵🏍🚨🚔🚍🚘🚖🚡🚠🚟🚃🚋🚞🚝🚄🚅🚈🚂🚆🚇🚊🚉✈️🛫🛬🛩💺🛰🚀🛸🚁🛶⛵️🚤🛥🛳⛴🚢⚓️⛽️🚧🚦🚥🚏🗺🗿🗽🗼🏰🏯🏟🎡🎢🎠⛲️⛱🏖🏝🏜🌋⛰🏔🗻🏕⛺️🏠🏡🏘🏚🏗🏭🏢🏬🏣🏤🏥🏦🏨🏪🏫🏩💒🏛⛪️🕌🕍🕋⛩🛤🛣🗾🎑🏞🌅🌄🌠🎇🎆🌇🌆🏙🌃🌌🌉🌁⌚️📱📲💻⌨️🖥🖨🖱🖲🕹🗜💽💾💿📀📼📷📸📹🎥📽🎞📞☎️📟📠📺📻🎙🎚🎛⏱⏲⏰🕰⌛️⏳📡🔋🔌💡🔦🕯🗑🛢💸💵💴💶💷💰💳🧾💎⚖️🔧🔨⚒🛠⛏🔩⚙️⛓🔫💣🔪🗡⚔️🛡🚬⚰️⚱️🏺🧭🧱🔮🧿🧸📿💈⚗️🔭🧰🧲🧪🧫🧬🧯🔬🕳💊💉🌡🚽🚰🚿🛁🛀🛀🏻🛀🏼🛀🏽🛀🏾🛀🏿🧴🧵🧶🧷🧹🧺🧻🧼🧽🛎🔑🗝🚪🛋🛏🛌🖼🛍🧳🛒🎁🎈🎏🎀🎊🎉🧨🎎🏮🎐🧧✉️📩📨📧💌📥📤📦🏷📪📫📬📭📮📯📜📃📄📑📊📈📉🗒🗓📆📅📇🗃🗳🗄📋📁📂🗂🗞📰📓📔📒📕📗📘📙📚📖🔖🔗📎🖇📐📏📌📍✂️🖊🖋✒️🖌🖍📝✏️🔍🔎🔏🔐🔒🔓❤️🧡💛💚💙💜🖤💔❣️💕💞💓💗💖💘💝💟☮️✝️☪️🕉☸️✡️🔯🕎☯️☦️🛐⛎♈️♉️♊️♋️♌️♍️♎️♏️♐️♑️♒️♓️🆔⚛️🉑☢️☣️📴📳🈶🈚️🈸🈺🈷️✴️🆚💮🉐㊙️㊗️🈴🈵🈹🈲🅰️🅱️🆎🆑🅾️🆘❌⭕️🛑⛔️📛🚫💯💢♨️🚷🚯🚳🚱🔞📵🚭❗️❕❓❔‼️⁉️🔅🔆〽️⚠️🚸🔱⚜️🔰♻️✅🈯️💹❇️✳️❎🌐💠Ⓜ️🌀💤🏧🚾♿️🅿️🈳🈂️🛂🛃🛄🛅🚹🚺🚼🚻🚮🎦📶🈁🔣ℹ️🔤🔡🔠🆖🆗🆙🆒🆕🆓0️⃣1️⃣2️⃣3️⃣4️⃣5️⃣6️⃣7️⃣8️⃣9️⃣🔟🔢#️⃣️⃣⏏️▶️⏸⏯⏹⏺⏭⏮⏩⏪⏫⏬◀️🔼🔽➡️⬅️⬆️⬇️↗️↘️↙️↖️↕️↔️↪️↩️⤴️⤵️🔀🔁🔂🔄🔃🎵🎶➕➖➗✖️♾💲💱™️©️®️〰️➰➿🔚🔙🔛🔝🔜✔️☑️🔘⚪️⚫️🔴🔵🔺🔻🔸🔹🔶🔷🔳🔲▪️▫️◾️◽️◼️◻️⬛️⬜️🔈🔇🔉🔊🔔🔕📣📢👁‍🗨💬💭🗯♠️♣️♥️♦️🃏🎴🀄️🕐🕑🕒🕓🕔🕕🕖🕗🕘🕙🕚🕛🕜🕝🕞🕟🕠🕡🕢🕣🕤🕥🕦🕧]*]";;
	String user = ALL_USER;
	
	
	public Request(List<Message> dataSetList) {
		this.messageList = dataSetList;
		this.wordList = processMessages(messageList);
	}
	
	public List<Word> mostWrittenWords(int numberOfWords) {
		sortWordListByFrequency();
		return wordList.subList(0, numberOfWords);
	}
	
	public List<Word> mostWrittenWords(int numberOfWords, String user) {
		sortWordListByFrequency();
		return wordList.subList(0, numberOfWords);
	}
	
	private void sortWordListByName() {
		Collections.sort(wordList, new Comparator<Word>() {
			public int compare(Word w1, Word w2) {
				return w1.getName().compareToIgnoreCase(w2.getName());
			}
		});
	}

	private void sortWordListByFrequency() {
		Collections.sort(wordList, new Comparator<Word>() {
			public int compare(Word w2, Word w1) {
				return Integer.compare(w1.getAmount(), w2.getAmount());
			}
		});
	}
	
	public HashMap<String, Integer> usernames() {
		HashMap<String, Integer> names = new HashMap<>();
		for (Message message : messageList) {
			if (!names.containsKey(message.getUser())) {
				names.put(message.getUser(), names.size());
			}			
		}
		return names;
	}
	
	public List<Word> analysis() {
		sortWordListByFrequency();
		return wordList;
	}
	
	public List<Message> searchWord(String user, String word) {
		if (user != Command.ALL_USER) {
			filterByUser(user);
		}
		//TODO: filter all messages witch includes a specific word
		return null;
	}
	
	public Period timeSpan() {
		return getTimePeriodOfChatExistence();
	}
	
	private Period getTimePeriodOfChatExistence() {
		LocalDate birthdayOfChat = messageList.get(1).getDate();
		LocalDate dateNow = LocalDate.now();
		Period period = Period.between(birthdayOfChat, dateNow);
		return period;
	}
	
	/**
	 * 0: 100 messages (24:00 - 1:00)
	 * 1: 221 messages (1:00 - 2:00)
	 * 2...
	 * @param timeTable
	 */
	public int[] timeTable(String user) {
		int[] hours = new int[24];
		if (user != Command.ALL_USER) {
			for (Message m : filterByUser(user)) {
				hours[m.getHour()] += 1;
			}
			return hours;
		}
		for (Message m : messageList) {
			hours[m.getHour()] += 1;
		}
		return hours;
	}
	
	public int totalWords(String user) {
		if (user != Command.ALL_USER) {			
			return processMessages(filterByUser(user)).size();
		}
		return wordList.size();
	}
	
	public int totalWords() {
		return wordList.size();
	}
	
	public int totalMessages(String user) {
		if (user != Command.ALL_USER) {
			return filterByUser(user).size();
		}
		return messageList.size();
	}
	
	public int totalLetters(String user) {
		String giantString = "";
		if (user != Command.ALL_USER) {
			List<Word> specWordList = processMessages(filterByUser(user));
			for (Word word : specWordList) {
				giantString += word;
			}
			return giantString.length();
		}
		for (Word word : wordList) {
			giantString += word;
		}
		return giantString.length();
	}
	
	public int totalMedia(String user) {
		int amountOfMedia = 0;
		if (user != Command.ALL_USER) {
			List<Message> specMessageList = filterByUser(user);
			for (Message message : specMessageList) {
				if (message.isMedia()) {
					amountOfMedia++;
				}
			}
			return amountOfMedia;
		}
		for (Message message : messageList) {
			if (message.isMedia()) {
				amountOfMedia++;
			}
		}
		return amountOfMedia;
	}
	
	public String favoriteEmoji() {
		//TODO: find most used emoji
		return ":)";
	}
	
	public int activeHour() {
		int[] hour = new int[24];
		for (Message m : messageList) {
			hour[m.getHour()] += 1;
		}
		int maxHour = 0;
		for (int i = 0; i < hour.length; i++) {
			if(hour[i] > hour[maxHour]) {
				maxHour = i;
			}
		}
		//int numberOfMessage = hour[maxHour];
		return maxHour;
	}
	
	/**
	 * Key
	 * ich
	 * du
	 * hab
	 * ...
	 */
	public List<String> favoriteWords() {
		List<String> words = new ArrayList<>();
		sortWordListByFrequency();
		for (int i = 0; i <= 10; i++) {
			words.add(wordList.get(i).getName());
		}
		return words;
	}
	
	public double averageMessageLength(String user) {
		return totalMessages(user) / totalWords(user);
	}
	
	public double averageMessagePerDay(String user) {
		//NOTE: not exact if the entry day after the birthday of the chat
		return getTimePeriodOfChatExistence().getDays() / totalMessages(user);
	}
	
	public double mediaPerMessage() {
		return 0;
	}
	
	public double messagePerPerson() {
		return 0;
	}
	
	public double messagePerDay() {
		return 0;
	}
	
	private List<Word> processMessages(List<Message> specMessageList) {
		String largeString = "";
		specWordList = new ArrayList<>();
		for (int i = 0; i < specMessageList.size(); i++) {
			largeString += specMessageList.get(i).getText();
		}
		largeString = largeString.toLowerCase();
		// remove all special character
		largeString = largeString.replaceAll(notAllLowerCaseLetterRegex, "");

		String[] wordArray = largeString.split(" ");
		for (int i = 0; i < wordArray.length; i++) {
			if(wordArray[i] != " " || wordArray[i] != "" || wordArray[i] != null) {
				if (foundSameWord(wordArray[i])) {
					updateAmountOfWord(wordArray[i]);
				} else {
					specWordList.add(new Word(wordArray[i], 1));				
				}
			}
		}
		return specWordList;
	}
	
	private boolean foundSameWord(String word) {
		for (Word w : specWordList) {
			if (w.getName().equals(word)) {
				return true;
			}
		}
		return false;
	}

	private void updateAmountOfWord(String word) {
		for (Word w : specWordList) {
			if (w.getName().equals(word)) {
				w.counterUpAmount();
			}
		}
	}
	
	private List<Message> filterByUser(String username) {
		List<Message> specificMessageList = new ArrayList<>();
		for (Iterator iterator = messageList.iterator(); iterator.hasNext();) {
			Message message = (Message) iterator.next();
			if (message.getUser().equals(username)) {
				specificMessageList.add(message);
			}
		}
		return specificMessageList;
	}

}
