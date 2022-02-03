let fs=require("fs")
for(let i=1;i<=9;i++){
    let p=`${i}_Nov_2021`
    let z=`0${i}_Nov_2021`
    // fs.writeFileSync(dirpath+".java","")
    fs.renameSync(p+".java", z+".java")
}


