<?php include("./menu/header.php") ?>


        <!-- this is a section for the mobile header(Responsiveness hearder) -->
        <?php include("./menu/headerMobile.php") ?>
    </section>
   <section  class="w-full flex justify-center mt-[180px]">
    <div class="w-[700px] md:w-[900px] container h-auto  ">
        <p class="w-full text-center uppercase text-white tracking-widest [word-spacing:8px] mb-4">Lets travel the world with us</p>
        <h1 class="w-full text-center text-white text-5xl md:text-7xl font-secondary uppercase tracking-widest">Explore The World With <span class="BENED">BENED</span></h1>
    </div>
   </section>
   <section  class="w-full justify-center mt-[80px] hidden lg:flex relative">
        <div class=" bg-white bg-opacity-40 container absolute w-[1000px] xl:w-[1200px] h-[100px] flex justify-center items-center backdrop-blur-lg">
                <div class="w-[950px] xl:w-[1100px]  container h-auto absolute m-[10px]  ">
                        <form action="" class="flex font-primary"> 
                                <input type="text" placeholder="where to?" class="py-[15px] ps-5 w-[25%] outline-none focus:outline-none">
                                <select name="" id="" class="w-[25%] py-[15px] bg-white  ps-5" id="target">
                                        <option value="dest" selected   class="bg-color1 text-white">Destination</option>
                                        <option value="it" class="text-stone-600" >Italy</option>
                                        <option value="fr" class="text-stone-600">France</option>
                                        <option value="mal" class="text-stone-600" >Maldives</option>
                                        <option value="gr" class="text-stone-600" >Greece</option>
                                        <option value="ca" class="text-stone-600" >Canada</option>
                                        <option value="du" class="text-stone-600"> Dubai</option>
                                </select>
                                <select name="" id="" class="w-[25%] py-[15px] bg-white  ps-5" id="target">
                                        <option value="du" selected   class="bg-color1 text-white">Deuration</option>
                                        <option value="it" class="text-stone-600" >1 Day Tour</option>
                                        <option value="fr" class="text-stone-600">2-4 Days Tour</option>
                                        <option value="mal" class="text-stone-600" >5-7 Days Tour</option>
                                        <option value="gr" class="text-stone-600" >7+ Days Tour</option>
                                </select> 
                               <a href="" role="button" class="col bg-color1 w-[25%] text-white flex items-center justify-center text-[18px] hover:bg-color3 transition-all duration-500" ><i class="bi bi-search me-2"></i>Find Now</a>
                        </form>
                </div>
        </div>
   </section>
   <?php include ("./menu/Mobile-search-tour.php"); ?>
    </section>
   
    <section class="w-full flex justify-center bg-color5 h-auto">
        <div class="w-full container flex justify-between flex-wrap px-0 2xl:px-36 h-auto py-16 ">
                <div class="w-full lg:w-[50%]  bg-color px-5 ">
                        <p class="text-color4 uppercase">The best travel agency</p>
                        <p class="text-color3 text-5xl font-bold uppercase font-secondary my-4" >Discover the <span class="text-color1"> world</span> with our guide</p>
                        <p class="text-color6">Explore the world with our exceptional travel and tour services. Whether you're planning a vacation or a business trip, we've got you covered. Our team specializes in handling various visa types, including tourist visas, student visas, work permits, and business visas. We also assist with bank statements, certificates, and standardized foreign CVs to ensure a smooth application process.
But our services don't stop there. We go above and beyond to provide a seamless experience for our clients. From airport pick-ups to managing projects for those investing in Ghana while abroad, we're here to support you every step of the way.</p>
                        <p class="text-color6 my-4">Trust us to handle the details, so you can focus on making the most of your journey. Get ready to embark on unforgettable adventures with us!</p>
                        <div class="flex items-center"> <i class="bi bi-check text-white bg-color4  rounded-[50%] px-2 py-1 me-3"></i> <p class="text-color6">20 Years of Experience</p></div>
                        <div class="flex items-center my-4"> <i class="bi bi-check text-white bg-color4  rounded-[50%] px-2 py-1 me-3"></i> <p class="text-color6">150+ Tour Destinations</p></div>
                        <div class="flex items-center"><i class="bi bi-telephone-forward text-color1 text-2xl me-3"></i><div><p class="text-color6 ">For information</p><p class="text-color6 text-2xl">+233-59-591-9802</p></div></div>
                </div>
                <div class=" w-full lg:w-[50%]   flex flex-col justify-center items-center bg-color5 h-auto pb-8 lg:pb-0 mt-10 lg:mt-0 ">
                        <figure class="w-[70%] h-[500px] relative">
                                <div class="col w-[100%] h-[100%] bg-color3 absolute left-8 top-8"></div>
                                <img src="img/about.jpeg" alt="" class="w-[100%] h-[100%] absolute z-10 object-cover hover:scale-[.95] transition-all duration-500">
                        </figure>
                </div>
        </div>
    </section>
    <section class="w-full flex justify-center bg-color7 py-8 ">
        <div class="w-full container 2xl:px-36">
                <div>
                        <p class="text-color4 uppercase px-5">Choose your place</p>
                        <p class="text-5xl font-secondary text-color3 px-5">Popular <span class="text-color1">Tours</span></p>
                        <div class="flex flex-wrap md:justify-between gap-10 px-6 xl:px-0 py-8 lg:px-3 ">
                                <figure class="w-full md:w-[45%] xl:w-[30%] h-[450px] relative photo transition-all duration-1000 ">
                                        <div class="w-[100%] h-[100%] bottom-photo absolute bg-white flex flex-col justify-center px-5">
                                                <p class="text-3xl text-color3 capitalize font-secondary">Maldives tour</p>
                                                <p class="text-color1 mb-4">$2.500 / per persons</p>
                                                <p class="text-color6">Travel non lorem ac erat susce bibendum nulla facilisi. Sedeuter nunc voluat miss conse viventa amet vestibulum.</p>
                                                <div class="flex flex-wrap my-4">
                                                        <div class="w-[50%] flex"><i class="bi bi-clock text-color4"></i><p class="text-color6 ms-2">12 Days</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-geo-alt text-color4"></i><p class="text-color6 ms-2">Maldives</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-person text-color4"></i></i><p class="text-color6 ms-2">12+</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-emoji-smile text-color4"></i></i><p class="text-color6 ms-2">9.8 Superb</p></div>
                                                </div>
                                                <a href="" class="underline decoration-color1 text-color6 flex mb-2">Tour details</a>
                                        </div>
                                        <img src="img/maldives1.jpg" alt="" class="w-[100%] h-[100%] object-cover brightness-75 absolute">
                                        <p class="absolute uppercase text-white bg-color3 px-4 py-1 right-1 top-12 rotate-[-90deg] ">Maldives</p>
                                        <figcaption class="absolute text-white bottom-8 right-10 fig">
                                                <p class="capitalize font-secondary text-3xl">Maldives tours</p>
                                                <p class="text-right">$2500 / per persons</p>
                                        </figcaption>
                                </figure>
                                <figure class="w-full md:w-[45%] xl:w-[30%] h-[450px] relative photo transition-all duration-1000 ">
                                        <div class="w-[100%] h-[100%] bottom-photo absolute bg-white flex flex-col justify-center px-5">
                                                <p class="text-3xl text-color3 capitalize font-secondary">Roma</p>
                                                <p class="text-color1 mb-4">$1.300 / per persons</p>
                                                <p class="text-color6">Travel non lorem ac erat susce bibendum nulla facilisi. Sedeuter nunc voluat miss conse viventa amet vestibulum.</p>
                                                <div class="flex flex-wrap my-4">
                                                        <div class="w-[50%] flex"><i class="bi bi-clock text-color4"></i><p class="text-color6 ms-2">6 Days</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-geo-alt text-color4"></i><p class="text-color6 ms-2">Italy</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-person text-color4"></i></i><p class="text-color6 ms-2">10+</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-emoji-smile text-color4"></i></i><p class="text-color6 ms-2"> 9.5 Superb</p></div>
                                                </div>
                                                <a href="" class="underline decoration-color1 text-color6 flex mb-2">Tour details</a>
                                        </div>
                                        <img src="img/2.jpg" alt="" class="w-[100%] h-[100%] object-cover brightness-75 absolute">
                                        <p class="absolute uppercase text-white bg-color3 px-4 py-1 right-1 top-12 rotate-[-90deg] ">italy</p>
                                        <figcaption class="absolute text-white bottom-8 right-10 fig">
                                                <p class="capitalize font-secondary text-3xl">Roma</p>
                                                <p class="text-right">$1.300 / per persons</p>
                                        </figcaption>
                                </figure>
                                <figure class="w-full md:w-[45%] xl:w-[30%] h-[450px] relative photo transition-all duration-1000">
                                        <div class="w-[100%] h-[100%] bottom-photo absolute bg-white flex flex-col justify-center px-5">
                                                <p class="text-3xl text-color3 capitalize font-secondary">France</p>
                                                <p class="text-color1 mb-4">$400 / per persons</p>
                                                <p class="text-color6">Travel non lorem ac erat susce bibendum nulla facilisi. Sedeuter nunc voluat miss conse viventa amet vestibulum.</p>
                                                <div class="flex flex-wrap my-4">
                                                        <div class="w-[50%] flex"><i class="bi bi-clock text-color4"></i><p class="text-color6 ms-2">10 Days</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-geo-alt text-color4"></i><p class="text-color6 ms-2">France</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-person text-color4"></i></i><p class="text-color6 ms-2">6+</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-emoji-smile text-color4"></i></i><p class="text-color6 ms-2">9.5 Superb</p></div>
                                                </div>
                                                <a href="" class="underline decoration-color1 text-color6 flex mb-2">Tour details</a>
                                        </div>
                                        <img src="img/france1.jpg" alt="" class="w-[100%] h-[100%] object-cover brightness-75 absolute">
                                        <p class="absolute uppercase text-white bg-color3 px-4 py-1 right-1 top-12 rotate-[-90deg] ">France</p>
                                        <figcaption class="absolute text-white bottom-8 right-10 fig">
                                                <p class="capitalize font-secondary text-3xl">France</p>
                                                <p class="text-right">$400 / per persons</p>
                                        </figcaption>
                                </figure>
                                <figure class="w-full md:w-[45%] xl:w-[30%] h-[450px] relative photo transition-all duration-1000 ">
                                        <div class="w-[100%] h-[100%] bottom-photo absolute bg-white flex flex-col justify-center px-5">
                                                <p class="text-3xl text-color3 capitalize font-secondary">greece tour</p>
                                                <p class="text-color1 mb-4">$500 / per persons</p>
                                                <p class="text-color6">Travel non lorem ac erat susce bibendum nulla facilisi. Sedeuter nunc voluat miss conse viventa amet vestibulum.</p>
                                                <div class="flex flex-wrap my-4">
                                                        <div class="w-[50%] flex"><i class="bi bi-clock text-color4"></i><p class="text-color6 ms-2">10 Days</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-geo-alt text-color4"></i><p class="text-color6 ms-2">greece</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-person text-color4"></i></i><p class="text-color6 ms-2">12+</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-emoji-smile text-color4"></i></i><p class="text-color6 ms-2">9.3 Superb</p></div>
                                                </div>
                                                <a href="" class="underline decoration-color1 text-color6 flex mb-2">Tour details</a>
                                        </div>
                                        <img src="img/greece1.jpg" alt="" class="w-[100%] h-[100%] object-cover brightness-75 absolute">
                                        <p class="absolute uppercase text-white bg-color3 px-4 py-1 right-[-15px] top-12 rotate-[-90deg] ">greece</p>
                                        <figcaption class="absolute text-white bottom-8 right-10 fig">
                                                <p class="capitalize font-secondary text-3xl">greece tours</p>
                                                <p class="text-right">$500 / per persons</p>
                                        </figcaption>
                                </figure>
                                <figure class="w-full md:w-[45%] xl:w-[30%] h-[450px] relative photo transition-all duration-1000 ">
                                        <div class="w-[100%] h-[100%] bottom-photo absolute bg-white flex flex-col justify-center px-5">
                                                <p class="text-3xl text-color3 capitalize font-secondary">Canada tour</p>
                                                <p class="text-color1 mb-4">$300 / per persons</p>
                                                <p class="text-color6">Travel non lorem ac erat susce bibendum nulla facilisi. Sedeuter nunc voluat miss conse viventa amet vestibulum.</p>
                                                <div class="flex flex-wrap my-4">
                                                        <div class="w-[50%] flex"><i class="bi bi-clock text-color4"></i><p class="text-color6 ms-2">7 Days</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-geo-alt text-color4"></i><p class="text-color6 ms-2">canada</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-person text-color4"></i></i><p class="text-color6 ms-2">10+</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-emoji-smile text-color4"></i></i><p class="text-color6 ms-2"> 9.3 Superb</p></div>
                                                </div>
                                                <a href="" class="underline decoration-color1 text-color6 flex mb-2">Tour details</a>
                                        </div>
                                        <img src="img/canada1.jpg" alt="" class="w-[100%] h-[100%] object-cover brightness-75 absolute">
                                        <p class="absolute uppercase text-white bg-color3 px-4 py-1 right-[-15px] top-12 rotate-[-90deg] ">canada</p>
                                        <figcaption class="absolute text-white bottom-8 right-10 fig">
                                                <p class="capitalize font-secondary text-3xl">canada tours</p>
                                                <p class="text-right">$300 / per persons</p>
                                        </figcaption>
                                </figure>
                                <figure class="w-full md:w-[45%] xl:w-[30%] h-[450px] relative photo transition-all duration-1000 ">
                                        <div class="w-[100%] h-[100%] bottom-photo absolute bg-white flex flex-col justify-center px-5">
                                                <p class="text-3xl text-color3 capitalize font-secondary">dubai</p>
                                                <p class="text-color1 mb-4">$200 / per persons</p>
                                                <p class="text-color6">Travel non lorem ac erat susce bibendum nulla facilisi. Sedeuter nunc voluat miss conse viventa amet vestibulum.</p>
                                                <div class="flex flex-wrap my-4">
                                                        <div class="w-[50%] flex"><i class="bi bi-clock text-color4"></i><p class="text-color6 ms-2">7 Days</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-geo-alt text-color4"></i><p class="text-color6 ms-2">dubai</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-person text-color4"></i></i><p class="text-color6 ms-2">10+</p></div>
                                                        <div class="w-[50%] flex"><i class="bi bi-emoji-smile text-color4"></i></i><p class="text-color6 ms-2">9.8 Superb</p></div>
                                                </div>
                                                <a href="" class="underline decoration-color1 text-color6 flex mb-2">Tour details</a>
                                        </div>
                                        <img src="img/44-1.jpg" alt="" class="w-[100%] h-[100%] object-cover brightness-75 absolute">
                                        <p class="absolute uppercase text-white bg-color3 px-4 py-1 right-[-15px] top-12 rotate-[-90deg] ">dubai</p>
                                        <figcaption class="absolute text-white bottom-8 right-10 fig">
                                                <p class="capitalize font-secondary text-3xl">dubai</p>
                                                <p class="text-right">$200 / per persons</p>
                                        </figcaption>
                                </figure>
                        </div>
                </div>
        </div>
    </section>
    <section class="w-full bg-sea py-32 relative bg-cover bg-fixed flex justify-center after:content-[''] after:absolute after:w-[100%] after:h-[100%] after:bg-black after:bg-opacity-50 after:top-0">
        <div class="w-full container 2xl:px-36 flex flex-wrap relative z-10 justify-center md:justify-between">
                <div class="w-full md:w-[20%] my-5 ">
                        <figure class="flex flex-col items-center  group">
                                <div class="bg-white bg-opacity-50  rounded-[50%] p-5 flex items-center relative overflow-hidden outline outline-8  outline-offset-8 out  "><i class="bi bi-airplane text-5xl text-white absolute ms-[-100%] group-hover:ms-[0%] transition-all duration-300"></i><i class="bi bi-airplane text-5xl text-white  group-hover:ms-[200%] transition-all duration-300"></i></div>
                                <figcaption class="text-center text-white font-secondary mt-10"><p class="text-3xl">600</p><p class="text-xl">Flight Booking</p></figcaption>
                        </figure>
                </div>
                <div class="w-full md:w-[20%] my-5">
                        <figure class="flex flex-col items-center  group">
                                <div class="bg-white bg-opacity-50  rounded-[50%] p-5 flex items-center relative overflow-hidden outline outline-8  outline-offset-8 out  "><i class="bi bi-house-heart text-5xl text-white absolute ms-[-100%] group-hover:ms-[0%] transition-all duration-300"></i><i class="bi bi-house-heart text-5xl text-white  group-hover:ms-[200%] transition-all duration-300"></i></div>
                                <figcaption class="text-center text-white font-secondary mt-10"><p class="text-3xl">250</p><p class="text-xl">Amazing Tour</p></figcaption>
                        </figure>
                </div>
                <div class="w-full md:w-[20%] my-5">
                        <figure class="flex flex-col items-center  group">
                                <div class="bg-white bg-opacity-50  rounded-[50%] p-5 flex items-center relative overflow-hidden outline outline-8  outline-offset-8 out  "><i class="bi bi-rocket text-5xl text-white absolute ms-[-100%] group-hover:ms-[0%] transition-all duration-300"></i><i class="bi bi-rocket text-5xl text-white  group-hover:ms-[200%] transition-all duration-300"></i></div>
                                <figcaption class="text-center text-white font-secondary mt-10"><p class="text-3xl">100</p><p class="text-xl">Cruises Booking</p></figcaption>
                        </figure>
                </div>
                <div class="w-full md:w-[20%] my-5">
                        <figure class="flex flex-col items-center  group">
                                <div class="bg-white bg-opacity-50  rounded-[50%] p-5 flex items-center relative overflow-hidden outline outline-8  outline-offset-8 out  "><i class="bi bi-postage-heart text-5xl text-white absolute ms-[-100%] group-hover:ms-[0%] transition-all duration-300"></i><i class="bi bi-postage-heart text-5xl text-white  group-hover:ms-[200%] transition-all duration-300"></i></div>
                                <figcaption class="text-center text-white font-secondary mt-10"><p class="text-3xl">100</p><p class="text-xl">Hotel Booking</p></figcaption>
                        </figure>
                </div>
             
        </div>
    </section>
    <section class="w-full flex justify-center bg-color7 lg:h-[800px]">
        <div class="w-full container 2xl:px-36 py-16 bg-color7 ">
                <p class="text-color4 uppercase px-5">TOP DESTINATION</p>
                <p class="text-3xl sm:text-5xl font-secondary text-color1 px-5">Travel <span class=" text-color3">Countries</span></p>
                <div class="w-full flex lg:relative py-10 flex-wrap lg:px-3 xl:px-0 px-6">
                        <figure class="w-full lg:w-[70%] lg:absolute">
                                <img src="img/2.jpg" alt="" class="w-[100%]">
                        </figure>
                        <div class="w-full lg:w-[50%] lg:absolute lg:h-[400px] bg-map bg-no-repeat bg-center z-10 lg:right-0 xl:top-[170%] md:top-20 px-10 py-16 bg-white" >
                                <p class="uppercase text-color1">Travel Countries</p>
                                <p class="uppercase text-3xl font-secondary text-color3 pb-4">ITALy, Europe</p>
                                <p class="text-color6">You can choose any country with good tourism. Agency elementum sesue the aucan vestibulum aliquam justo in sapien rutrum volutpat. Donec in quis the pellentesque velit. Donec id velit ac arcu posuere blane.</p>
                                <div class=" flex flex-wrap py-4 ">
                                        <div class="flex w-[33%]"><i class="bi bi-geo-alt text-color1"></i><p class="text-color6">Roma</p></div>
                                        <div class="flex w-[33%]"><i class="bi bi-geo-alt text-color1"></i><p class="text-color6">Italy</p></div>
                                        <div class="flex w-[33%]"><i class="bi bi-geo-alt text-color1"></i><p class="text-color6">Venise</p></div>
                                        <div class="flex w-[33%]"><i class="bi bi-geo-alt text-color1"></i><p class="text-color6">Milano</p></div>
                                        <div class="flex w-[33%]"><i class="bi bi-geo-alt text-color1"></i><p class="text-color6">Perugia</p></div>
                                        <div class="flex w-[33%]"><i class="bi bi-geo-alt text-color1"></i><p class="text-color6">Parma</p></div>
                                        
                                </div>
                                <a href="" class="capitalize flex py-4 relative  text-color1 before:content-[''] before:h-[1px] before:absolute before:w-[100%] before:bg-color6 before:bg-opacity-50 before:top-0"><p>view all places</p><i class="bi bi-arrow-right"></i></a>

                        </div>
                </div>
        </div>
    </section>
    <section class="w-full bg-boat bg-cover bg-bottom bg-no-repeat h-[50vh] flex justify-center bg-color2 bg-blend-multiply bg-opacity-50">
       <div class="w-full container flex justify-center items-center flex-col">
        <p class="text-white font-secondary text-3xl 2xl:text-6xl">Costa Victoria Cochin</p>
        <div class="flex mt-5 gap-5">
                <div class="flex items-center"><i class="bi bi-geo-alt text-white text-2xl me-2"></i><p class="text-white">Maldives</p></div>
                <div class="flex items-center"><i class="bi bi-clock text-white text-2xl me-2"></i><p class="text-white"> 4 Days + 3 Nights   </p></div>
        </div>
       </div>
    </section>
    <section class="w-full flex justify-center bg-color7 py-8 ">
        <div class="w-full container 2xl:px-36">
                <div>
                        <p class="text-color4 uppercase px-5">MOST POPULAR</p>
                        <p class="text-5xl font-secondary text-color3 px-5">Popular <span class="text-color1">Destination</span></p>
                        <div class="flex flex-wrap justify-center xl:justify-between gap-10 px-6 xl:px-0 py-8 lg:px-3 ">
                                <figure class="w-full md:w-[45%] xl:w-[30%] h-[450px] relative  transition-all duration-1000 overflow-hidden group ">   
                                        <img src="img/canada1-1.jpeg" alt="" class="w-[100%] h-[100%] object-cover group-hover:brightness-75 group-hover:scale-[1.2] absolute transition-all duration-1000">
                                        <p class="absolute uppercase text-white bg-color1 px-4 py-1 right-1 top-12 rotate-[-90deg] ">2 Tours</p>
                                        <figcaption class="absolute text-white bottom-[20px] left-5  group-hover:bottom-[50px]  transition-all duration-700 w-full  ">
                                               <div class="flex after:contetn-[''] after:h-[1px] after:bg-op-50 after:w-[20%] after:bg-white after:absolute after:bottom-[-8px] group-hover:after:w-[90%]  after:transition-all after:duration-1000" ><i class="bi bi-geo-alt text-2xl text-white me-2"></i> <p class="capitalize font-secondary text-3xl">Canada</p></div>
                                               <div class="flex justify-between absolute  mt-5 w-full  ">
                                                <p>2 Tours Package</p>
                                                <a href="" class="flex  me-9 " >Explore<i class="bi bi-arrow-right"></i></a>
                                            </div>
                                                
                                        </figcaption>
                                </figure>
                                <figure class="w-full md:w-[45%] xl:w-[30%] h-[450px] relative  transition-all duration-1000 overflow-hidden group ">   
                                        <img src="img/maldives1-1.jpeg" alt="" class="w-[100%] h-[100%] object-cover group-hover:brightness-75 group-hover:scale-[1.2] absolute transition-all duration-1000">
                                        <p class="absolute uppercase text-white bg-color1 px-4 py-1 right-1 top-12 rotate-[-90deg] ">2 Tours</p>
                                        <figcaption class="absolute text-white bottom-[20px] left-5  group-hover:bottom-[50px]  transition-all duration-700 w-full  ">
                                               <div class="flex after:contetn-[''] after:h-[1px] after:bg-op-50 after:w-[20%] after:bg-white after:absolute after:bottom-[-8px] group-hover:after:w-[90%]  after:transition-all after:duration-1000" ><i class="bi bi-geo-alt text-2xl text-white me-2"></i> <p class="capitalize font-secondary text-3xl">Maldives</p></div>
                                               <div class="flex justify-between absolute  mt-5 w-full  ">
                                                <p>2 Tours Package</p>
                                                <a href="" class="flex  me-9  " >Explore<i class="bi bi-arrow-right"></i></a>
                                            </div>
                                                
                                        </figcaption>
                                </figure>
                                <figure class="w-full md:w-[45%] xl:w-[30%] h-[450px] relative  transition-all duration-1000 overflow-hidden group ">   
                                        <img src="img/italy1.jpeg" alt="" class="w-[100%] h-[100%] object-cover group-hover:brightness-75 group-hover:scale-[1.2] absolute transition-all duration-1000">
                                        <p class="absolute uppercase text-white bg-color1 px-4 py-1 right-1 top-12 rotate-[-90deg] ">6 Tours</p>
                                        <figcaption class="absolute text-white bottom-[20px] left-5  group-hover:bottom-[50px]  transition-all duration-700 w-full  ">
                                               <div class="flex after:contetn-[''] after:h-[1px] after:bg-op-50 after:w-[20%] after:bg-white after:absolute after:bottom-[-8px] group-hover:after:w-[90%]  after:transition-all after:duration-1000" ><i class="bi bi-geo-alt text-2xl text-white me-2"></i> <p class="capitalize font-secondary text-3xl">Italy</p></div>
                                               <div class="flex justify-between absolute  mt-5 w-full  ">
                                                <p>6 Tours Package</p>
                                                <a href="" class="flex me-9 " >Explore<i class="bi bi-arrow-right"></i></a>
                                            </div>
                                                
                                        </figcaption>
                                </figure>
                        </div>
                </div>
        </div>
    </section>
    <section class="w-full flex justify-center bg-color3 py-8 h-auto">
        <div class="w-full container 2xl:px-36 h-auto">
                <div>
                        <p class="text-color4 uppercase px-5">TRAVEL BLOG</p>
                        <p class="text-5xl font-secondary text-color4 px-5">Travel<span class="text-white"> Experience</span></p>
                        <div class="flex flex-wrap justify-center xl:justify-between gap-10 px-6 xl:px-0 py-8 lg:px-3 ">
                                <figure class="w-full md:w-[45%] xl:w-[30%] h-[450px] relative  transition-all duration-1000  group mb-20   ">   
                                   <div class="w-[100%] h-[100%] overflow-hidden group transition-all duration-1000 relative">     <img src="img/22.jpeg" alt="" class="w-[100%] h-[100%] object-cover group-hover:brightness-75 group-hover:scale-[1.2] absolute transition-all duration-1000"></div>
                                        <div class="absolute uppercase text-white bg-color1 px-2 left-3 top-12 flex flex-col items-center "><p>Aug</p><p class="font-bold">02</p></div>
                                        <figcaption class=" absolute h-[150px] w-[85%]  bg-white bottom-[-80px]  left-[8%] flex flex-col justify-center px-8 group-hover:bottom-10 transition-all duration-1000 ">
                                                <p class="uppercase text-color4">Tours</p>
                                                <p class="capitalize text-color3 font-secondary text-2xl">most popular yacht charter routes </p>
                                        </figcaption>
                                </figure>
                                <figure class="w-full md:w-[45%] xl:w-[30%] h-[450px] relative  transition-all duration-1000  group mb-20   ">   
                                        <div class="w-[100%] h-[100%] overflow-hidden group transition-all duration-1000 relative">     <img src="img/11.jpeg" alt="" class="w-[100%] h-[100%] object-cover group-hover:brightness-75 group-hover:scale-[1.2] absolute transition-all duration-1000"></div>
                                             <div class="absolute uppercase text-white bg-color1 px-2 left-3 top-12 flex flex-col items-center "><p>Aug</p><p class="font-bold">07</p></div>
                                             <figcaption class=" absolute h-[150px] w-[85%]  bg-white bottom-[-80px]  left-[8%] flex flex-col justify-center px-3 group-hover:bottom-10 transition-all duration-1000 ">
                                                     <p class="uppercase text-color4">travel</p>
                                                     <p class="capitalize text-color3 font-secondary text-2xl">practical information for travelling to egypt</p>
                                             </figcaption>
                                     </figure>
                                     <figure class="w-full md:w-[45%] xl:w-[30%] h-[450px] relative  transition-all duration-1000  group mb-20   ">   
                                        <div class="w-[100%] h-[100%] overflow-hidden group transition-all duration-1000 relative">     <img src="img/18-1.jpeg" alt="" class="w-[100%] h-[100%] object-cover group-hover:brightness-75 group-hover:scale-[1.2] absolute transition-all duration-1000"></div>
                                             <div class="absolute uppercase text-white bg-color1 px-2 left-3 top-12 flex flex-col items-center "><p>Aug</p><p class="font-bold">02</p></div>
                                             <figcaption class=" absolute h-[150px] w-[85%]  bg-white bottom-[-80px]  left-[8%] flex flex-col justify-center px-5 group-hover:bottom-10 transition-all duration-1000 ">
                                                     <p class="uppercase text-color4">Destinations</p>
                                                     <p class="capitalize text-color3 font-secondary text-2xl">tips towards a flawless honeymoon </p>
                                             </figcaption>
                                     </figure>
                        </div>
                </div>
        </div>
    </section>
    <section class="w-full flex justify-center bg-color7 overflow-hidden  ">
        <div class="w-full container flex whitespace-nowrap overflow-hidden group  ">
             <div class="flex  logos-slide animate-anime w-full flex-wrap whitespace-nowrap group-hover:pause  ">
                <figure class="w-[25%] "><img src="img/1.png" alt="" w-[100%]></figure>
                <figure class="w-[25%] "><img src="img/2.png" alt="" w-[100%]></figure>
                <figure class="w-[25%]  "><img src="img/3.png" alt="" w-[100%]></figure>
                <figure class="w-[25%]  "><img src="img/4.png" alt="" w-[100%]></figure>
             </div>
             <div class="flex  logos-slide  w-full flex-wrap  whitespace-nowrap ms-[-200%] animate-anime group-hover:pause ">
                <figure class="w-[25%] "><img src="img/1.png" alt="" w-[100%]></figure>
                <figure class="w-[25%] "><img src="img/2.png" alt="" w-[100%]></figure>
                <figure class="w-[25%]  "><img src="img/3.png" alt="" w-[100%]></figure>
                <figure class="w-[25%]  "><img src="img/4.png" alt="" w-[100%]></figure>
             </div>
               </div>
    </section>


<?php include("./menu/footer.php") ?>
