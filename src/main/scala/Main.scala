// Marvish Chandra
// Compare between Carnival, Celebrity, and Disney Cruises


class MyCruisePref{
  def cruiseselection(location,cost):
    if location == "Alaska":
      if cost == 1329:
        println("Choose Carnival Cruises, a fourteen day cruise.")
      if cost == 1352:
        println("Choose Celebrity Cruises, a seven day cruise.")
      if cost == 3273:
        println("Choose Disney Cruises, a five day cruise.")
    if location == "The Bahamas":
      if cost == 400:
        println("Choose Carnvial Cruises, a three day cruise.")
      if cost == 482:
        println("Choose Celebrity Cruises, a four day cruise.")
      if cost == 1281:
        println("Choose Disney Cruises,a four day cruise.")
    if location == "The Bermuda":
        if cost == 1012:
          println("Choose Carnival Cruises, a four day cruise.")
        if cost == 1386:
          println("Choose Celebrity Cruises, a seven day cruise.")
        if cost == 1936:
          println("Choose Disney Cruises, a five day cruise.")
    if location == "Canada":
        if cost == 558:
          println("Choose Carnival Cruises, a seven day cruise.")
        if cost == 1560:
          println("Choose Celebrity Cruises, an eleven day cruise.")
        if cost == 2498:
          println("Choose Disney Cruises, a four day cruise.")
    if location == "The Caribbean":
        if cost == 278:
          println("Choose Carnival Cruises, a four day cruise.")
        if cost == 1246:
          println("Choose Celebrity Cruises, a seven day cruise.")
        if cost == 1162:
          println("Choose Disney Cruises, a four day cruise.")
    if location == "Europe":
        if cost == 1548:
          println("Choose Carnvial Cruises, a nine day cruise.")
        if cost == 2928:
          println("Choose Celebrity Cruises, a nine day cruise.")
        if cost == 3483:
          println("Choose Disney Cruises, a four day cruise.")
    if location == "Hawaii":
       if cost == 2636:
        println("Choose Celebrity Cruises, a twelve day cruise.")
      if cost == 3588:
        println("Choose Carnival Cruises, a fifteen day cruise.")
    if location == "Mexico":
      if cost == 248:
        println("Choose Carnival Cruises, a four day cruise.")
      if cost == 698:
        println("Choose Celebrity Cruises, a seven day cruise.")
      if cost == 1014:
        println("Choose Disney Cruises, a three day cruise.")
    if location == "Panama Canal":
      if cost == 1288:
        println("Choose Carnival Cruises, an eight day cruise.")
      if cost == 2798:
        println("Choose Celebrity Cruises, a eleven day cruise.")
      if cost == 4732:
        println("Choose Disney Cruises, a fourteen day cruise.")
    if location == "Transatlantic":
      if cost == 1218:
        println("Choose Carnival Cruises, a thirteen day cruise.")
      if cost == 1786:
        println("Choose Celebrity Cruises, a fourteen day cruise.")
      if cost == 4721:
        println("Choose Disney Cruises, an eleven day cruise.")
    if location == "Australia":
      if cost == 392:
        println("Choose Carnival Cruises, a three day cruise.")
      if cost == 1834:
        println("Choose Celebrity Cruises, an eleven day cruise.")  
      end if
    else: println("Unfortunately, Disney Cruises does not offer passage to Australia.")
      
      
}