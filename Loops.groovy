package test.demo

//For loop
for (i=0;i<=5;i++) {
	println "For value of:"+i
}
println"****************"

i=0

while(i<=5) {
	println "while: "+i++
}

println"****************"
1.upto(5) { println "upto: $it" }


println"****************"
5.times { println "times demo: $it" }

println"****************"
10.step(500, 100) { println"Step demo: $it" }

println"****************"
1.upto(5) { println "upto: $it" }
