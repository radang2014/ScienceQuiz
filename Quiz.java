/* Quiz.java
 * Purpose: Store the data of each multiple choice question in a two-dimensional array of Strings. Define methods that 
 * allow for the creation and manipulation of Quiz objects, allowing for another class to work with this data.
 * Written by: Randy Dang
 */
import java.io.*;
import java.util.*;
public class Quiz {
    //Store each multiple choice question, answer option, and correct answer in a two-dimensional array of Strings.
    private String[][] quizQuestions = {{"The nerve connecting the inner ear to the brain is called the...","Optic nerve","Jugular nerve","Cochlear nerve","Anger stimulating nerve","C"},{"What is located in the back of the human eye?","Glasses","Pupil","Iris","Retina","D"},{"A rock originating from a volcanic eruption is a(n)...","Sedimentary Rock","Igneous Rock","Metamorphosis Rock","None of the above","B"},{"A storm cloud is a...","Cumulonimbus cloud","Cumulus cloud","Stratus cloud","Cirrus cloud","A"},{"Sunny weather is usually indicative of...","Low barometric pressure","High barometric pressure","Mediocre barometric pressure","The transformation of all eggs into fried eggs","B"},{"Which of the following is true about a hypothesis?","It always turns out correct","Results inconsistent with it indicates experimental error","It is an educated guess","The universe will try its best to defy it","C"},{"Which of the following is an example of a fixed joint?","Skull","Elbow","Shoulder","Neck","A"},{"Muscles that work in the intestine are...","Cardiac muscles","Smooth muscles","Skeletal muscles","Rough muscles","B"},{"An advantage to having alveoli in the lungs (instead of just one giant sack of air) is...","Increase in volume","Decrease in volume","Increase in surface area","Decrease in surface area","C"},{"The left ventricle pumps blood into the...","aorta","vena cava","pulmonary artery","pulmonary vein","A"},{"Deoxygenated blood is...","Bright Red","Dark Red","Blue","Violet","B"},{"What prevents food from entering the trachea?","Esophagus","Larynx","Pharynx","Epiglottis","D"},{"Out of these, which of the following is first in the digestive system?","Stomach","Esophagus","Rectum","Small Intestine","B"},{"Roughly how long ago was the Earth formed?","4.6 trillion years","4.6 billion years","4.6 million years","4.6 years","B"},{"The \"explosion\" of different types of organisms that occurred roughly 541 million years ago was...","The Permian Explosion","The Cambrian Explosion","The Algae Explosion","The Wooly Explosion","B"},{"The human population pyramid of a developing country is generally...","Diamond shaped","House shaped","Triangle shaped","Yield sign shaped","C"},{"Omnivores eat...","Plants","Animals","All of the above","None of the above","C"},{"A disaccharide is a sugar with...","one monosaccharide","two monosaccharides","three or more monosaccharides","zero monosaccharides","B"},{"What is the start codon in any protein sequence?","AUG","UAA","UAG","CORRECT ANSWER","A"},{"What are the pyramidines in DNA?","Adenine, Thymine","Guanine, Cytosine","Adenine, Guanine","Thymine, Cytosine","D"},{"What enzyme joins DNA segments together into the double helix by creating sugar-phosphate bonds?","DNA Polymerase","Helicase","Ligase","RNA Primase","C"},{"What is apoptosis?","The process of turning a cell into a cancer cell","The process of ending the life of a cell","The process of mitosis, except three cells are formed","The process of creating a zygote","B"},{"The smallest unit of life is the...","atom","DNA","cell","tissue","C"},{"In meiosis in a female, what are the resulting cells that are NOT the egg cell?","Polar bodies","Smaller egg cells","Zygotes","Cancer cells","A"},{"Cross HH x hh. What probability is there for an offspring with Hh?","0%","25%","50%","100%","D"},{"A female friend of yours has hemophilia, an x-linked recessive disorder. What MUST be true?","Her mother is heterozygous for hemophilia","Her father is heterozygous for hemophilia","Her mother has hemophilia","Her father has hemophilia","D"},{"Which phase of mitosis involves sister chromatids being pulled apart by spindle fibers?","Prophase","Metaphase","Anaphase","Telophase","C"},{"The _____ undergoes evolution.","Individual","Species","Cell","Ecosystem","B"},{"A mutation has occurred where one of the codons in the middle of a protein sequence became the stop codon. This is a...","substitution mutation","frameshift mutation","nonsense mutation","cancer mutation","C"},{"A person with the sex chromosomes XYY would be a(n)...","female with Turner's syndrome","male with Klinefelter's syndrome","almost normal female","almost normal male","D"},{"Why does dimensional analysis work when converting between units?","You are always multiplying by the reciprocal of the number","Multiplying a unit by itself cancels it out","It just works...","It essentially is the multiplication of a value by 1","D"},{"The plum-pudding model of the atom was developed after who discovered the electron?","Robert Millikan","J.J. Thomson","Ernest Rutherford","Joseph Priestly","B"},{"The reactant that gets used up in a chemical reaction is the...","Limiting Reactant","Excess Reactant","Weird Reactant","Cheap Reactant","A"},{"All of the following are extensive properties except...","Mass","Density","Volume","Length","B"},{"Which of the following is NOT a state function?","Enthalpy","Elevation","Distance","Entropy","C"},{"A positive change in enthalpy signifies...","an odd number of electrons transferred","an even number of electrons transferred","an endothermic reaction","an exothermic reaction","C"},{"Gases behave most ideally at _____ temperatures and _____ pressures.","Low, Low","Low, High","High, Low","High, High","C"},{"How many joules are there in a liter atmosphere?","101325","101.3","4.184","8.314","B"},{"Why are solids and liquids ignored in equilibrium constant expressions?","They have a defined shape","Their activity is always the reference activity, or 1","They have a concentration, but no partial pressure","They have a vapor pressure","B"},{"A state of dynamic equilibrium involves...","The forward reaction being faster than the reverse reaction","The reverse reaction being faster than the forward reaction","The forward and reverse reactions having the same rate","The forward and reverse reactions both having a rate of 0","C"},{"A Lewis base is a base that...","produces OH^- ions in solution","accepts H^+ ions from solution","donates electron pairs in a chemical reaction","accepts electron pairs in a chemical reaction","C"},{"The autoionization of water has an equilibrium constant of...","1 x 10^-14 in all conditions","1 x 10^-14 at 25 degrees C","1 x 10^-7 in all conditions","1 x 10^-7 at 25 degrees C","B"},{"Who's principle said that you can't simultaneously know the position and momentum of an electron?","Erwin Schrodinger","Werner Heisenberg","Louis de Broglie","Neils Bohr","B"},{"Across a period, atomic radius...","Increases","Decreases","Stays the same","Becomes negative","B"},{"The transition metals are also known as...","s-block elements","p-block elements","d-block elements","f-block elements","C"},{"Reacting nonmetal oxides with water generally results in a(n)...","acid","base","salt","water","A"},{"All of the following are amphoteric EXCEPT...","H2SO4","H2PO4^-","H2O","HPO4^2-","A"},{"What hybridization is involved when the central atom has a trigonal planar molecular geometry?","sp","sp^2","sp^3","dsp^3","B"},{"All of the following are nonpolar molecules EXCEPT","CH4","BF3","XeF4","NH3","D"},{"Pure water at 80 degrees C would have a pH of...","<7.00","7.00",">7.00","7.00i","A"},{"Dispersion forces are stronger with increased...","polarizability","ionic forces","amount of induced dipoles","shielding","A"},{"Phenolphthalein is MOST appropriate when titrating...","a strong acid with a strong base","a strong acid with a weak base","a weak acid with a strong base","a weak acid with a weak base","C"},{"Molality is defined as...","mass of solute / liters of solution","mass of solute / kilograms of solution","mass of solute / kilograms of solvent","mass of solute / moles of solvent","C"},{"The boiling point of a substance is when...","vapor pressure is less than atmospheric pressure","vapor pressure is greater than atmospheric pressure","vapor pressure is equal to atmospheric pressure","vapor pressure is subtracted from atmospheric pressure","C"},{"Water is densest in which phase?","Solid","Liquid","Gas","Superfluid","B"},{"The van't Hoff factor (i) in the context of colligative properties in solutions is...","the number of atoms per formula unit","the number of ions per formula unit","the number of particles per formula unit","the number of molecules per formula unit","C"},{"Reduction is...","the loss of electrons","the gain of electrons","the disappearance of electrons","the appearance of electrons","B"},{"The half life is constant in a reaction with which order?","Zero order","First order","Second order","Five hundredth order","B"},{"When the reaction is irreversible...","the entropy of the universe is conserved","the entropy of the universe decreases","the entropy of the universe increases","the entropy of the universe equals the enthalpy","C"},{"Gibb's free energy is defined as...","H+TS","H-TS","S+TH","S-TH","B"},{"When delta G = 0, what also must be true?","Q=K","Q>K","Q<K","Q+K","A"},{"An entropy of zero is indicative of how many microstates?","0","1","250","1 mol","B"},{"From a salt bridge, the _____ will go towards the cathode, and the ______ will go towards the anode.","cations, cations","cations, anions","anions, cations","anions, anions","B"},{"One ampere is...","1 C/sec","1 J/C","1 V/sec","1 J/sec","A"},{"sin(30°) equals...","rad(3)/2","1/2","rad(3)/3","rad(2)/2","B"},{"The sec(x) equals...","1-cos(x)","csc(90°-x)","1+tan(x)","1+cot(x)","B"},{"How many radians are there in one revolution?","3","2","pi","2*pi","D"},{"The reference angle of 3 radians is...","3-pi radians","pi-3 radians","3 radians","3-2*pi radians","B"},{"A unit circle is a circle with a diameter of...","pi","1","2","rad(2)","C"},{"The average acceleration is...","the slope of the position vs. time graph","the slope of the velocity vs. time graph","the area under the velocity vs. time graph","the area under the acceleration vs. time graph","B"},{"All of the following describe one dimensional motion EXCEPT","a cart moving left at constant velocity","a car speeding up as it moves across a flat road","a ball being tossed straight up, then falling back down","a ferris wheel moving in a circle","D"},{"At the highest point of a projectile in a parabolic path, the velocity is...","0","a minimum","the average","a maximum","B"},{"Vectors have...","only a magnitude","only a direction","both a magnitude and a direction","neither a magnitude nor a direction","C"},{"An object's weight on Earth is approximately ______ that of the weight on the moon.","1/6","1/2","2 times","6 times","D"},{"The area under a force versus displacement graph is...","Displacement+1","Average Acceleration","Work","Power","C"},{"According to the work energy theorem, net work is the...","change in potential energy","change in kinetic energy","change in internal energy","change in conservative force","B"},{"Two items of the same mass are dropped to the floor. Which of these had a higher impulse?","Ball of clay","Bouncy rubber ball","Both had the same impulse","It is impossible to tell","B"},{"The formula v1i-v2i = v2f-v1f is only applicable when the collision is...","Inelastic","Elastic","Completely inelastic","Recoil","B"},{"When one lifts a textbook weighing 10 N up 50 m, what is the total work done?","500 J","50 J","0 J","-50 J","C"},{"At the equilibrium position of a spring in simple harmonic motion...","velocity is 0 and acceleration is at a maximum","acceleration is 0 and velocity is at a maximum","acceleration and velocity are both at a maximum","acceleration and velocity are both 0","B"},{"The angular velocity (omega) can be found by which formula?","omega=2*pi*f","omega=(2*pi)/(T)","omega=omega(0)+(alpha*t)","All of the above","D"},{"When measuring torque, it would be incorrect to report the result in Joules (J) because...","N*m and J are fundamentally different units","N*m and J are fundamentally the same unit","Torque is a vector; Joules is a unit measuring scalars","Torque is a scalar; Joules is a unit measuring vectors","C"},{"In rotational equilibrium...","Net force is 0","Net torque is 0","All of the above","None of the above","B"},{"Where on a door should one apply 20 N of force to achieve the maximum torque?","Far from the hinge","At the door's center of gravity","Close to the hinge","On a random bridge 50 miles away","A"},{"The quantity rho(fluid)V(submerged) as part of Archimedes' Principle is...","the total mass of the fluid","the mass of the displaced fluid","the total mass of the object","the density of the submerged section of the object","B"},{"Based on Bernoulli's Principle...","higher fluid velocity results in a lower pressure","higher fluid velocity results in a higher pressure","higher fluid velocity results in a lower moment of inertia","higher fluid velocity results in a higher moment of inertia","A"},{"Which component of acceleration is related to angular acceleration in circular motion?","Centripetal Acceleration","Tangential Acceleration","All of the above","None of the above","B"},{"The moment of inertia of a solid sphere is...","mR^2","(1/2)mR^2","(1/5)mR^2","(2/5)mR^2","D"},{"cos^-1(x) has to be between what two degree measurements?","0 and 180","-180 and 0","-90 and 90","90 and 270","A"},{"e is defined as the limit as n approaches infinity of what?","(0.01+1/n)^2n","(1+r/n)^nt","(1+1/n)^n","(100+1/n)^n","C"},{"The phase of a moon that is between the first quarter and a full moon is a...","Waxing Crescent","Waxing Gibbous","Waning Crescent","Waning Gibbous","B"},{"The \"dark side\" of the moon refers to...","the side shown during a solar eclipse","the side always facing away from the sun","the side always facing away from the earth","the side of the moon made of green cheese","C"},{"Which planet rotates in retrograde?","The Sun","Venus","Mars","Neptune","B"},{"A day on Earth is how many Earth days?","24","60","365","None of these","D"},{"What carries oxygenated blood to the heart?","Pulmonary artery","Coronary artery","Vena cava","Jugular vein","B"},{"Which of the following breaks down fats in the human body?","Bile","Amylase","Hydrochloric Acid","None of these","A"},{"Which of the following are true about water?\nI. Water is present on Planet Earth\nII. Liquid water is denser than ice\nIII. While water boils, its temperature increases\nIV. Water is amphoteric","I and III","I, III, and IV","I, II, and IV","I, II, III, and IV","C"},{"What does DNA stand for?","Do Not Abbreviate","Deoxyriboneuclic acid","Deoxyribonucleic acid","Do Not Abreviate","C"},{"A C-H bond is generally described as a...","Nonpolar covalent bond","Polar covalent bond","Ionic bond","Nonpolar ionic bond","A"},{"What intermolecular forces exist among water molecules in a pure sample of water?\nI. Ion-dipole forces\nII. Dipole-dipole forces\nIII. Dipole-induced dipole forces\nIV. Dispersion forces","I, II, and IV","II and IV","II only","I, II, III, and IV","B"},{"An adiabatic process involves...","no heat flow","no change in work","no change in pressure","no change in temperature","A"},{"The debey (D) is generally a unit for what?","Energy","Electric Charge","Dipole Moment","Force","C"},{"The wavelength of the fundamental in a standing wave on a string is...","Double the length of the string","The speed of the wave divided by the frequency","Quadruple the length of the string divided by two","All of these","D"},{"What is the speed of sound at the freezing temperature of water?","0 m/s","331.5 m/s","343 m/s","3.00 x 10^8 m/s","B"},{"A possible value for the fourth quantum number of an electron is...","1","0","-0.5","None of these","C"},{"When a wave's source moves towards an observer, the actual frequency is _____ the observed frequency.","the same as","lower than","higher than","both higher and lower than (with different probability densities)","B"},{"All of the following are examples of particles EXCEPT","H2O","NaCl","Mg^2+","B","B"},{"A central atom with 1 lone pair and 4 bonding pairs of electrons has what molecular geometry?","Tetrahedral","Seesaw","Trigonal bypyramidal","T-shaped","B"},{"A convex mirror is...","Converging","Diverging","Loud","Gruesome","B"},{"All of the following are examples of sinusoidal functions EXCEPT","velocity of ball tossed in air vs. time","y = sin(x)","height of horse on merry go round vs. time","displacement of spring in simple harmonic motion vs. time","A"},{"What is the period of the following sinusoidal function?\nx(t) = -1.5cos((2*pi/5)*t)+1.5; t>0","2*pi/5 sec","5/2*pi sec","5 sec","5 sec(x)","C"},{"Which of the following is NOT a domain in taxonomic biological classification?","Eukarya","Protista","Bacteria","Archaea","B"},{"Which of the following MUST be true for something to be considered acidic?","[H+] > [OH-]","[H+] < [OH-]","pH < 7.00","pH > 7.00","A"},{"Squaring a number, then taking the square root of that number, is the same as...","Leaving the number alone","Multiplying that number by -1","Finding the absolute value of that number","Factoring out i from that number","C"},{"The period of a pendulum is dependent on its...","Mass","Length","All of the above","None of the above","B"},{"(CH3)2NH is an example of a(n)...","Acid","Base","Salt","Hydrocarbon","B"},{"A strong acid generally has a...","Strong conjugate base","Unstable conjugate base","Stable conjugate base","Two of these","C"},{"A runner ran 2 miles in 10 minutes. For how long did the runner run?","0.2 mi./min.","10 min.","5 mi./min.","2 mi.","B"},{"What quantity is measured by the unit ft*m?","speed","angular displacement","distance","area","D"},{"Which of the following do all living things need to survive?","Vegetables","Water","Cell Phones","Helium","B"},{"Which of the following has the highest frequency?","Radio Waves","Gamma Rays","Infrared Light","Ultraviolet Light","B"},{"What is the oxidation number of each carbon in an oxalate ion?","-4","+2","+3","+4","C"},{"What would be the approximate polar coordinates for the rectangular coordinate (3, 4)?","(5, 53 degrees)","(5, 413 degrees)","(-5, 233 degrees)","All of these","D"},{"Charging by induction refers to a process where...","a charged object touches another object","an object becomes charged through friction with fur","a charged object causes a convection current","a charged object hovers near another object, polarizing it","D"},{"Conventional current is...","in the direction protons travel","in the direction opposite the direction protons travel","in the direction electrons travel","in the direction opposite the direction electrons travel","D"},{"What is the instrument that measures temperature?","Barometer","Clarinet","Thermometer","Piano","C"},{"What does a barometer measure?","Temperature","Air Pressure","Direction","Time","B"},{"Where are earthquakes most likely to happen?","In the United States","In the Ocean","In Space","Along fault lines","D"},{"Which statement is true?","Predators eat prey","Prey eat predators","Predators hug prey","Prey hug predators","A"},{"What is in charge of breaking down a dead animal's corpse?","Plants","Animals","Decomposers","Demons","C"},{"What makes its own food?","Producer","Consumer","Decomposer","Demon","A"},{"What is the liquid that is inside all cells?","Chyme","Cytoplasm","Apple Juice","Mitochondria","B"},{"In what section of the digestive system is chyme produced?","Mouth","Stomach","Large Intestine","Anus","B"},{"In what cell are there more mitochondria than normal?","Bone","Muscle","Heart","Brain","B"},{"Muscles only...","pull","push","eat","get angry","A"},{"Egg cells are produced from...","The spine","The stomach","The ovaries","The mouth","C"},{"What type of muscle is usually voluntary?","Skeletal","Smooth","Cardiac","Skull","A"},{"Who invented penicillin?","Albert Einstein","Alexander Fleming","Martin Luther King","Barack Obama","B"},{"Elements from which family in the periodic table usually do not form compounds?","Alkaline Earth Metals","Halogens","Noble Gases","Unnoble Gases","C"},{"What are metalloids?","Substances that change between being metals and nonmetals","Substances having the properties of metals and nonmetals","Substances that change between being dangerous and harmless","Substances that.... I ran out of ideas for wrong answers","B"},{"If the current is in the +x and the magnetic field is in the +y, along what axis is the force?","x","y","z","None of these","C"},{"The formula Epsilon=NBA(omega)sin(omega*t) is applicable in what?","Moving rails","Transformers","Generators","Long, straight wires","C"},{"An anti-neutrino is the product of which decay process?","Alpha Decay","Positive Beta Decay","Negative Beta Decay","Electron Capture","C"},{"Which of the following is a unit of mass?","N","Mev/c^2","m/s","J/m","B"},{"How many carbon atoms are in 3-ethyl-2,3-dimethyloctane?","8","10","11","12","D"},{"The formula R-O-R', where R and R' are hydrocarbon chains, describes which organic structure?","Ether","Ester","Aldehyde","Ketone","A"},{"All of the following readily dissolve in water EXCEPT","KCl","C12H22O11","C6H14","Ba(OH)2","C"},{"The derivative is the....","instantaneous rate of change","average rate of change","instantaneous integral","average integral","A"},{"The bond angle in a trigonal planar structure is ____ the bond angle in a tetrahedral structure","less than","equal to","greater than","It is impossible to tell","C"},{"In which of the following points is there a limit, but no derivative?","Vertex of parabola","Y intercept of a linear function","Vertical asymptote","Vertex of absolute value function","D"},{"Which of the following would most easily cross a cell membrane?","Small nonpolar molecule","Small polar molecule","Large nonpolar molecule","Large polar molecule","A"},{"What can be put between the two plates of a capacitor to increase capacitance?","Resistor","Battery","Equipotential","Dielectric","D"},{"The Henry (H) is the SI unit for...","Luminous Intensity","Electrical Inductance","Power","Resistance","B"},{"The rate constant of a first order reaction is measured in...","M/s","s^-1","M^-1 s^-1","M^-1 s^-2","B"},{"What is the antiderivative of 1/x, where x>0?","-1/x","-1/x^2","ln(x)","ln(x)+C","D"},{"The position of a particle is measured by 2t+763. What is its velocity at t = 642?","2","1,045","1,284","2,047","A"},{"Bob just moved. He can't remember new address because his old address still comes to mind.\nThis is an example of...","retrograde amnesia","anterograde amnesia","proactive interference","retroactive interference","C"},{"Which of the following crises, according to Erik Erikson, is characteristic of adolescents?","Integrity vs. Despair","Initiative vs. Guilt","Identity vs. Role Confusion","Intimacy vs. Isolation","C"},{"Put the following stages (in cell communication) in order.\n(1) Transduction - the conversion of the signal to another form\n(2) Response - transduced signal brings about a cellular response\n(3) Reception - the binding of a signal molecule to a receptor","1, 2, 3","1, 3, 2","2, 1, 3","3, 1, 2","D"},{"What is the minimum number of carbon atoms in a ketone?","1","2","3","4","C"},{"The process of turning an alkane to an alkene requires...","hydrogenation","dehydrogenation","hydration","dehydration","B"},{"ATP stores the potential to react with...","glucose","water","oxygen","carbon dioxide","B"},{"What is the sum of 3 and 5?","3","5","7","8","D"},{"The derivative of position is velocity. What is the indefinite integral of velocity?","Position","Displacement","Acceleration","Angular Velocity","B"},{"What quantity is the derivative of angular momentum?","angular velocity","moment of inertia","force","torque","D"},{"f(3)=5. f'(3)=0. f''(3)=-8. What conclusion can be drawn?","A relative minimum exists at x=3","A relative maximum exists at x=3","An inflection point exists at x=3","A zero exists at x=3","B"},{"All of the following are examples of stop codons EXCEPT...","UAA","UAG","UGA","UGG","D"},{"All of the following are examples of hydrocarbons EXCEPT","C2H5OH","C2H4","C4H8","C5H8","A"},{"After unwinding DNA, what attaches to the nitrogen bases to ensure that the strands don't re-attach?","Topoisomerase","Single stranded binding proteins","Helicase","DNA Polymerase III","B"},{"Cholesterol is a(n)...","unsaturated fat","steroid","saturated fat","protein","B"},{"What constant represents the charge of a mole of electrons in C/mol?","Faraday's Constant","Boltzmann's Constant","Ideal Gas Constant","Rate Constant","A"},{"cos(2x)=","cos^2(x)-sin^2(x)","1-2sin^2(x)","2cos^2(x)-1","All of these","D"},{"Adding ____ groups to histone proteins increases gene expression, while adding ____ groups decreases gene expression.","methyl, acetyl","acetyl, methyl","amino, carboxyl","carboxyl, amino","B"},{"The ft*lb is a unit of...","distance","weight","pressure","work","D"},{"The alpha helix or beta pleated sheet are examples of a protein's...","primary structure","secondary structure","tertiary structure","quaternary structure","B"},{"The brain and spinal cord are parts of the...","central nervous system","peripheral nervous system","sympathetic nervous system","parasympathetic nervous system","A"},{"Retinal disparity, where the image that hits each retina is slightly different, allows for...","depth perception","dizziness","sensory adaptation","perceptual adaptation","A"},{"The x axis is acceleration and the y axis is force. What does the quantity represented by the slope of the line?","mass","pressure","weight","power","A"},{"In RNA splicing, the segments that are cut out of the primary transcript before it becomes mRNA are called...","promoters","inducers","introns","exons","C"},{"The substance that, when allosterically binding to the repressor, turns it from its inactive to active form, is called...","an activator","a corepressor","an inducer","a transcription factor","B"}};
    
    //Constructor that is called to create a Quiz object.
    public Quiz() {
        quizQuestions = quizQuestions;
    }
    
    //Shuffles the questions that are stored in the quizQuestions array.
    public void shuffleQuestions() {
        //Declare new empty two-dimensional array of Strings
        String[][] result = new String[quizQuestions.length][quizQuestions[0].length];

        //Populate empty array with the data in the quizQuestions array in a random order.
        for (int i = 0; i<quizQuestions.length; i+=0) {
            int random = (int)(Math.random()*quizQuestions.length);
            if (!(quizQuestions[random][0]==null)) {
                for (int j = 0; j<quizQuestions[random].length; j++) {
                    result[i][j] = quizQuestions[random][j];
                    quizQuestions[random][j] = null;
                }
                i++;
            }
        }

        //Set the quizQuestions array to the originally empty array.
        quizQuestions = result;
    }
    
    //Display the question and answer options for the question indicated by the inputted index.
    //Returns true if the user answered the question correctly, false otherwise.
    public boolean displayQuestion(int num) {
        System.out.println(num+". "+quizQuestions[num-1][0]);
        char option = 'A';
        for (int i = 1; i<=4; i++) {
            System.out.println(option+". "+quizQuestions[num-1][i]);
            option++;
        }
        Scanner kbReader = new Scanner(System.in);
        String answer = kbReader.nextLine();
        if (answer.toUpperCase().equals(quizQuestions[num-1][5])) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("Wrong. The answer was "+quizQuestions[num-1][5]+". ");
        return false;
    }
    
    //Accessor method for the two-dimensional array containing question data.
    public String[][] getQuizQuestions() {
        return quizQuestions;
    }
}