#fractionReducer.rb

def reduce(fraction) #receives a string fraction of form num/den
	num = getNumerator(fraction)
	den = getDenominator(fraction)

	gcd = getGCD(num, den)
	return "" + (num/gcd).to_s + "/" + (den/gcd).to_s
end

def getNumerator(fraction)
	return fraction.split('/')[0].strip.to_i
end

def getDenominator(fraction)
	return fraction.split('/')[1].strip.to_i
end

# Greatest Common Divisor using Euclid's algorithm
def getGCD(a, b)
	if b.zero?
		return a
	else
		return getGCD(b, a%b)
	end
end

quit = false
begin
	puts "Type a fraction (num/den): "
	sFraction = gets.chomp
	unless sFraction == "quit" || sFraction == "exit"
		puts sFraction + " reduces to " + reduce(sFraction) + "\n"
	else
		quit = true
	end
end while !quit