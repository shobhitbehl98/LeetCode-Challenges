let fs = require("fs")
for (let i = 1; i <= 28; i++) {
    let y=0
    if (i >= 1 && i <= 9) {
        y=`0${ i }`
    } else {
        y=`${ i }`
    }
    fs.writeFileSync(y+ "_February" + ".java","")
}