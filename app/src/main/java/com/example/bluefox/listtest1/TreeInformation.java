package com.example.bluefox.listtest1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TreeInformation extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_tree_information, null, false);
        mDrawerLayout.addView(contentView, 0);
        mDrawerLayout.closeDrawer(Gravity.LEFT);


        Intent launchedMe = getIntent();
        String itemValue = launchedMe.getStringExtra("trees");
        TextView topic_name = (TextView)findViewById(R.id.topic_id);
        topic_name.setText(itemValue);
        setInformation(itemValue);
    }

    private void setInformation(final String itemValue) {
        TextView description = (TextView) findViewById(R.id.description);
        TextView science = (TextView) findViewById(R.id.science);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        List<String> favorites = new ArrayList<String>();
        switch(itemValue) {

            case ("Monterey Pine"):
                imageView.setImageResource(R.drawable.montereypine);
                description.setText("Earth has more than 100 pine species, and ten important ones grow west of Anderson Hall. A Monterey Pine stands on the north side of the C10 parking lot on the west side of Blodel and Anderson Halls. Foresters relish Monterey Pine's fast growth, attained even on poor soils. The tree bears 3- to 5-inch (7- to13-centimeter) needles in bundles of three and distinctive cones: roughly baseball-sized, woody-textured, knobby, staying closed and clinging tightly to the tree for decades. Fire allows the cones to expand and release their seeds. The bark is red-brown to blackish-brown and deeply furrowed. Severe winters turn Monterey pines brown, but do not usually kill them.\n" +
                        "\n" +
                        "\n" +
                        "Though native only in a small part of California, this bright green pine is planted in vast portions of the planet for wood. In New Zealand, Monterey Pine is considered an invasive species where it has escaped plantation forests. The seeds of all pine species are edible and were used by Native American tribes as an important food source. Monterey Pine seeds were a valuable resource because the cones remain closed on the tree year round, and the seeds can be harvested during any season by placing the cones on or near a fire. Monterey Pine is effective for controlling erosion and stabilizing steep slopes because it is fast growing and has a wide spreading root system. ");
                science.setText("(Pinus radiata)");
                tourButtonPress(itemValue);
                break;
            case ("European Larch"):
                imageView.setImageResource(R.drawable.europeanlarch);
                description.setText("On the path next to Garfield Place, across the street from Anderson Hall, is a European Larch. Larches, also called tamaracks, are deciduous conifers, primarily montane and far-northern denizens, able to grow as large as their evergreen peers, with wood as strong and useful, but offering cheery yellow fall color and an April flush of tender new needles beautiful enough to rank with the prettiest sights in treedom. European larch is grown in our area as an ornamental, being more easily cultivated than our two Washington native species, albeit no better-looking. Its cones are soft, 1.5 inches (3.8 centimeters) long, green flushed with red when immature, brown and opening when mature to release seeds, and turn black and remain on the tree for many years past maturity.\n" +
                        "\n" +
                        "\n" +
                        "The wood of European larch is tough and durable, but also flexible when cut into thin strips, making this species an ideal material for yacht building. The wood used for yachts must be from older trees that had their side branches pruned when young to prevent knots from forming.  European larch is cold tolerant, surviving in temperatures as low as -58° F (-50° C), allowing it to survive at high altitudes up to 7,900 feet (2,400 meters). ");
                tourButtonPress(itemValue);
                science.setText("(Larix decidua)");
                break;
            case ("Yoshino Cherry"):
                imageView.setImageResource(R.drawable.yoshinocherry);
                description.setText("Enter the Quad and you now behold the Yoshino cherries. This locally famous planting brings the campus joy every March or early April, as the dark trunks and branches blossom with millions of white or faintest pink flowers. Photographers mill about, people have picnics, everyone smiles. These trees were moved here from the arboretum because of highway construction; their loss was our gain.\n" +
                        "\n" +
                        "\n" +
                        "Yoshino cherry originated around 1870 in Tokyo as a natural hybrid. It grows larger than most flowering cherries, and sets some fruit, albeit small and plain. Later in spring you can see Hisakura cherries open their pinker, larger flowers.\n" +
                        "\n" +
                        "\n" +
                        "The blossoms of cherry trees are edible and are often pickled and then made into a tea and drunk at festivals such as weddings. A green dye can be obtained from the leaves, and a dark grey to green dye can be obtained from the fruit.");
                tourButtonPress(itemValue);
                science.setText("(Prunus x yedoensis)");
                break;
            case ("Cedar of Lebanon"):
                imageView.setImageResource(R.drawable.cedaroflebanon);
                description.setText("Two trees stand prominently in front of the Art building: the purpleleaf beech and the lofty Cedar of Lebanon. While there are many different kinds of trees whose wood qualities caused them to be commonly named as cedars, the Lebanese is one of just a few true cedars that grow in the Pacific Northwest. It is in the genus Cedrus, Latinized from the ancient Greek kedros, and grows not only in Lebanon but in Turkey and adjacent countries.\n" +
                        "\n" +
                        "\n" +
                        "Deodar and Atlas cedars are its close kindred. These illustrious trees are not easily distinguished because the three species are often similar looking. The Art building tree, however, is a classic libani; it shows perfectly the attributes of the Lebanese: flushing forth early in bright green spring needles in contrast to the dark green needles that have over-wintered; growing with tabular branches, bearing sharp needles longer than those of Atlas cedar, shorter and more densely set than those of the Deodar. The bark is the darkest of all three. This specimen bears only male cones, but if it did make female ones they would be mostly at the top of the tree and larger than those of Atlas cedar. One reason Lebanese cedars are so rare is that they make fewer cones that have lower seed germination rates than the other species, and the seedlings grow slowly. The wood is hard and extremely durable and retains a delightful cedar fragrance for many years. An essential oil extracted from the wood is used in perfumes. ");
                tourButtonPress(itemValue);
                science.setText("(Cedrus libani)");
                break;
            case ("Hybrid Holly"):
                imageView.setImageResource(R.drawable.hybridholly);
                description.setText("Against Johnson and Mary Gates Halls, three Hybrid Hollies stand out with their dark, evergreen foliage. Unlike regular English hollies, these have larger, less spiny leaves and bigger berries. When young the leaves and stems can have a reddish-purple tinge. Holly is pollinated by bees. The seeds of this species can take up to 18 months to germinate, and they do not tollerate root disturbane well, so they should be planted in their permanent location. ");
                tourButtonPress(itemValue);
                science.setText("(Ilex altaclerensis 'Camelliifolia')");
                break;
            case ("Atlas Cedar"):
                imageView.setImageResource(R.drawable.atlascedar);
                description.setText("Alone on the edge of lawn next to Suzzallo Library's tower is a landmark evergreen with a massive, pillar-upright trunk, from which arch forth irregular boughs laden with short, sharply tufted needles and avocado-sized cones. It is relatively rare to see such Atlas Cedars, since people usually plant powder blue varieties of the species. This tree derives its name from the Atlas Mountains of Algeria and Morocco where it thrives in the hot, dry climate better than most conifers.\n" +
                        "\n" +
                        "\n" +
                        "Atlas cedar is closely related to Deodar Cedar and Cedar of Lebanon, and some people even consider it to be a subspecies of the Cedar of Lebanon. The form of all three species is comparatively spidery, with remarkably \"reaching\" limbs giving it an open, jagged silhouette. The wood is fragrant and durable and often used for veneers and construction. Essential oils derived from this tree acts as an insect repellent, and the wood has also been used to make insect repelling containers for storing textiles. ");
                tourButtonPress(itemValue);
                science.setText("(Cedrus atlantica)");
                break;
            case ("Lombardy Poplar"):
                imageView.setImageResource(R.drawable.lombardypoplar);
                description.setText("\n" +
                        "\n" +
                        "Across the street from the Architecture Building on the corner of Stevens Way and Grant Place is a large Lombardy poplar. This is a towering columnar tree whose burly trunk dates from the 1909 Alaska-Yukon-Exposition. Since the tree is readily reproduced by suckers, it has become a common, well known tree in many parts of the world. It originated as a chance mutation in Lombardy, Italy in the late 1600s or early 1700s. Western Washington suits it better than about anywhere else in the United States, so we have many old, landmark specimens.\n" +
                        "\n" +
                        "\n" +
                        "The leaves are diamond-shaped to triangular and turn a blazing golden yellow in the fall.  The bark is grey-green when young but becomes blackened and cracked with furrows, often with large burls. It can be used as a cork substitute. The root system is extensive and aggressive, so this tree should not be planted around drainage systems or close to building foundations. An extract of the shoots of this plant can be used as a rooting hormone for cuttings of other plants. In the spring when the leaves unfold the tree gives off a fragrance similar to balsam. The wood is soft, light and wooly, and not durable or highly flammable. ");
                tourButtonPress(itemValue);
                science.setText("(Populus nigra 'Italica')");
                break;
            case ("Cherry Plum"):
                imageView.setImageResource(R.drawable.cherryplum);
                description.setText("Beauty of architecture juxtaposed with nature's unique form is splendidly epitomized with this tree, saved from a threatened death when Allen Library was constructed. View the tree against the library, or from within the building--either way shows how saving mature trees when new buildings go up can lend dignified beauty.\n" +
                        "\n" +
                        "\n" +
                        "An Asia Minor species, this is the ancestor to the ubiquitous Purpleleaf Plums. In earliest spring the tree's gnarly old trunk, rough and dark, contrasts sublimely with snow white blossoms covering each twig. Then lush green new leaves adorn it.  This craggy specimen grows only a few, small, yellow plums.\n" +
                        "\n" +
                        "\n" +
                        "A green dye can be obtained from this trees leaves, and a dark grey to green dye can be obtained from its fruit. The species survives well in light shade but will produce more fruit in the sun. Most members of the Prunus genus produce hydrogen cyanide, a poison that gives almonds their characteristic flavor. The toxin is found mainly in the leaves and seeds and can be detected by its bitter taste. It is not usually present in enough quantity to do harm, but still bitter fruits should not be eaten. ");
                tourButtonPress(itemValue);
                science.setText("(Prunus cerasifera)");
                break;
            case ("Hybrid Planetrees/Sycamore"):
                imageView.setImageResource(R.drawable.hybridplanetreessycamore);
                description.setText("More than 100 hybrid Planetrees, or Sycamores, placidly overhang  Memorial Way. The original 57 were planted in 1920 as memorials for UW faculty and students killed in the first World War. These trees are appropriate for the role, being monumentally large and long lived. The eastern United States sycamore (Platanus occidentalis) crossed with its Old World counterpart (P. orientalis) resulted in this vigorous offspring that have been planted since the late 1600s. The leaves are maple-like, but have rather short stalks. Round seed heads dangle on stout string-like stalks. The fall foliage color is drab yellow-brown, but the exfoliating patchy bark mottles the trunks handsomely, especially in severe winter cold. The most famous of these hybrid clones is the one called London Plane, which grows taller with paler bark and droopier branches than our campus trees. ");
                tourButtonPress(itemValue);
                science.setText("(Platanus x hybrida)");
                break;
            case ("Deodar Cedar"):
                imageView.setImageResource(R.drawable.deodarcedar);
                description.setText("Stevens Way is lined by dozens of these graceful evergreens, which excel in Seattle's soil and climate, so far from their Himalayan homeland. Unlike our native cedar these bear sharp 1- to 2-inch (3- to 5-centimeter) needles ranging in color from bright green to powdery blue-green in dense clusters of 20-30 needles per shoot. The erect, fist-sized cones (produced only by female and bisexual trees) shatter to pieces while still on the tree in spring when the seeds ripen. In the spring the male cones release clouds of yellow pollen into the wind.\n" +
                        "\n" +
                        "\n" +
                        "Deodar Cedars unite the relaxed, drooping posture of hemlocks and the massive horizontal sturdiness of certain pines, whether yielding valuable wood in Indian forests or graciously decorating our landscapes. Among Hindus, Deodar Cedars are regarded as divine trees. The name Deodar derives from the Sanskrit term devadāru, meaning “wood of the gods”. The wood is highly prized as building material because of its fine, close grain and rot-resistant properties. If the lower branches are pruned, Deodar Cedars are used as street trees in urban areas because they can tolerate compacted, poor soils.  Compare Deodar with its congeners: Atlas cedar and cedar of Lebanon.");
                tourButtonPress(itemValue);
                science.setText("(Cedrus deodara)");

                break;
            case ("Evergreen Magnolia"):
                imageView.setImageResource(R.drawable.evergreenmagnolia);
                description.setText("An Evergreen Magnolia enjoys the hot, sunny southwest corner of the Atmospheric Sciences Building. One the world's most  famous ornamental trees, this species is native to the southern United States, where it grows large enough and fast enough to be a commercially valuable lumber tree. Large, waxy evergreen leaves make it look like a gigantic houseplant. The leaves have fine red-brown fuzz on the underside.  From May until winter it opens a succession of fragrant white blossoms, as much as a foot (0.3 meters) wide. After the blossoms, fuzzy brown cones appear and ripen in the fall and produce bright red seeds. The name magnolia commemorates Pierre Magnol (1638-1715) a French professor of botany at Montpelier.\n" +
                        "\n" +
                        "\n" +
                        "The roots of the evergreen magnolia can extend up to four times the canopy width. The wood is shock resistant, straight grained and tinted yellow or green.  It is used for furniture, boxes, pallets, venetian blinds, sashes, doors, and veneers.  The waxy coating on the leaves protects this tree from salt spray and air pollution. Extremely cold winters can turn the foliage bronze-colored and blotchy. ");
                tourButtonPress(itemValue);
                science.setText("(Magnolia grandiflora)");
                break;
            case("Crab Apple Trees"):
                imageView.setImageResource(R.drawable.crabappletrees);
                description.setText("Eighteen different kinds of crabapple trees decorate the area around Drumheller Fountain and the rose garden. First to bloom each spring is the Manchurian (M. baccata var. mandshurica) displaying fragrant snow white blossoms against rich green leaves. Last to leaf-out and flower is Malus yunnanensis var. Veitchii, with creamy white flowers of unpleasant odor. In fall, the showiest, most persistent fruits are the bright red ones of the large cherry crabapple (M. x robusta). Except for the sweet garland crabapple (M. coronaria), all began in Asia--including varieties of American origin whose parents were Asian species. ");
                tourButtonPress(itemValue);
                science.setText("(Malus species and hybrids)");
                break;
            case("Japanese Snowbell Tree"):
                imageView.setImageResource(R.drawable.japanesesnowbelltree);
                description.setText("Anderson Hall's lawn has a small tree whose hard wood and petite white 'bell' flowers in June make it a lovely and practical tree. Insect pests and diseases avoid this species, and as long as it doesn't suffer summer drought it serves as an excellent understory tree. In the fall the shiny leaves turn yellow making a bright addition to shady Pacific Northwest gardens. Japanese Snowbell Tree wood is strong and has traditionally been used to make prayer beads and umbrella handles in Asia. The smooth attractive bark has interlacing fissures of orange and brown, making it interesting to view in the winter as well as the summer. Be warned: the flowers are known to attract large numbers of bees, so be careful when viewing the bark up close in the summer time.");
                tourButtonPress(itemValue);
                science.setText("(Styrax japonicus)");
                break;
            case("Coast Redwood"):
                imageView.setImageResource(R.drawable.coastredwood);
                description.setText("A commanding Coast Redwood decorates Stevens way east of Anderson Hall. Stand under its wide branches, stare at its enormous trunk, and become keenly aware why it is a world famous species. Giant growth, especially lofty height, and its habit of forming pure forests of red pillars on the fog-shrouded coast of northern California, are what make it so special. Its needles are about an inch (2.5 centimeters) long, flat, and rather resemble yew foliage but are stiffer. The cones are thimble-size. Across the street in the Medicinal Herb Garden, is the Sierra or Giant Redwood, a mountainous peak 106 feet (32 meters) tall. Dawn Redwood is the deciduous Chinese cousin of these Californians. Coast Redwood lumber is highly valued because it is attractive, light weight, and decay resistant. It is also fire resistant because it has relatively low resin content. It was commonly used as railroad ties and trestles throughout California, and wood from burls formed by this species is prized for the production of table tops and veneers. The world’s tallest living organism is a Coast Redwood in Redwood National Park in northern California. It is known as Hyperion, measuring 379.3 feet (115.61 meters) tall. Coast Redwoods reproduce sexually and asexually. Sexual seed crops occur frequently, but seed viability is low, typically below 15%. Asexually the trees can reproduce through sprouting from the root crown, stump, or even fallen branches.");
                tourButtonPress(itemValue);
                science.setText("(Sequoia sempervirens)");
                break;
            case("Coulter Pine"):
                imageView.setImageResource(R.drawable.coulterpine);
                description.setText("Heavy cones of woody texture, armed with stout, sharp hooks distinguish the fruit of the Coulter pine. Bricklike cones require unusually thick branches and twigs. The 9- to14-inch (22.9- to 35.6-centimeter) needles, clustered in trios, are similarly sturdy. The bark is dark grey, thick, and deeply furrowed into scaly ridges. This Californian native's name commemorates Thomas Coulter (1793-1843), an Irish botanist and physician who discovered the species while collecting plants in Mexico and California. The tree has been cultivated since 1832 for its striking ornamental qualities. A tan or green dye can be obtained from the needles of the Coulter pine. The needles of pine trees contain a substance called terpene that is released when rain falls over the needles. Terpene acts as an herbicide and restricts the plant growth beneath the canopy of these trees. The lumber is weak and soft, so there is little use for the wood other than for firewood. These pines, native to southern California and northern Baja California in Mexico, prefer south-facing slopes between 600-7500 feet (200-2,300 meters) in elevation.");
                tourButtonPress(itemValue);
                science.setText("(Pinus coulteri)");
                break;
            case("Lawson Cypress"):
                imageView.setImageResource(R.drawable.lawsoncypress);
                description.setText("Lawson Cypress of horticulture is the Port Orford Cedar of forestry. Rainier Vista's west side, south of Stevens Way, has more than a dozen specimens. Native to southwest Oregon and adjacent California, this species grows large, yielding excellent wood. It occurs from sea level up to 4,900 feet (1,500 meters) in elevation in mountain valleys and often along streams.  It has been widely planted as an ornamental because in cultivation it shows astonishing variation: no conifer varies more in color, form and foliage. Only the wood and fragrance is constant. Their round, pea-size cones contain seeds that could give rise to yellow, bright green, baby blue or other offspring. Root-rot disease now kills Lawson Cypresses so often that nurseries stock few varieties.\n" +
                        "\n" +
                        "The bark is fibrous to scaly in vertical strips and reddish-brown. The foliage is fern-like, resembling the native cedars to this region. Lawson Cypress wood is light and durable, and is used to construct coffins, as well as shrines and temples. The grain of the wood is straight, making it preferred for manufacturing arrow shafts. The wood was once used for constructing aircraft.  ");
                tourButtonPress(itemValue);
                science.setText("(Chamaecyparis lawsoniana)");
                break;
            case("English Elm"):
                imageView.setImageResource(R.drawable.englishelm);
                description.setText("English Elms shade Stevens Way in front of Roberts Hall. Procera means lofty. Their lower branches were removed, but numerous suckers reappear annually, often developing distinctive corky flanges. The leaves are dark, raspy, and lopsided. Late in fall they fade to an unspectacular gold before dropping. In earliest spring the twigs become wreathed with tiny purplish flowers, followed by thousands of pale wafer-like winged seeds. The seeds are always sterile, and decay readily. This elm is reproduced solely by suckers.\n" +
                        "\n" +
                        "English Elms prefer full sun and moist soils and are tolerant of atmospheric pollution. The inner bark of this tree is tough and has been used to make ropes and mats. The wood of English Elm is close-grained, has few knots, and is durable under water.  Because of this the wood has been used to make water pipes, wheels, mallet heads, and ship keels. The leaves, fruits, and bark of this tree have been used for many edible and medicinal purposes. ");
                tourButtonPress(itemValue);
                science.setText("(Ulmus procera)");
                break;
            case("Pin Oak"):
                imageView.setImageResource(R.drawable.pinoak);
                description.setText("Stevens Way and the nearby vicinity have several Pin Oaks. Native to the eastern U.S., this species is a strong, undemanding urban shade tree. Pin Oak  bears deeply lobed leaves, small acorns, and pretty fall color. On young trees the dead leaves hang on to the branches through the winter and fall off when new leaves appear in the spring. The name \"pin\" refers to plentiful slender twigs, which end up ultimately as pin-like knots in the wood.\n" +
                        "\n" +
                        "The pin oak thrives in bottom lands or moist uplands and is often found growing on poorly drained clay soils. The acorns of the pin oak are an important food source for mallards and wood ducks during their fall migration. The acorns are also a food source for deer, squirrels, turkeys, woodpeckers, and blue jays. Mulch made from the leaves will repel slugs and grubs. The galls that form on the trunk can be used to produce black ink, and the wood has been used for the production of shingles, furniture, and wooden nails. Twenty four oak species exist on campus including: Cork Oak, Red Oak, Bur Oak, Shumard Red Oak and Oregon White Oak.  ");
                tourButtonPress(itemValue);
                science.setText("(Quercus palustris)");
                break;
            case("Eastern Dogwood"):
                imageView.setImageResource(R.drawable.easterndogwood);
                description.setText("On the lawn north of the Electrical Engineering building stands a solid mass of foliage, tightly set on closely spaced twigs. In winter, the tree's naked silhouette is appealing, as is the rough chunky bark on its two trunks. In May the copious white flowers are stunningly attractive. This species from eastern North America is one of the most familiar and beloved flowering trees. Its fall color can also be superb. Many specimens are planted around campus. Our native counterpart Pacific dogwood is leggier, larger, and nowhere near so amenable to cultivation.\n" +
                        "\n" +
                        "Eastern dogwood is an extremely hardy species. It can succeed in any soil of good or moderate fertility and can withstand temperatures down to -13° F (-25°C). The wood is heavy, strong, and extremely shock resistant. It has been used to produce wheel hubs, tool handles, and the heads of golf clubs. A red dye can be obtained from the fibrous roots. The twigs of this tree can be peeled and used as toothbrushes and can be chewed to create natural paintbrushes. This tree was an important source of medicinal substances to the native people who lived within its native range. The fruits, seeds, flowers, and twigs of this tree are an extremely valuable food source to many species of wildlife including: chipmunks, foxes, skunks, rabbits, deer, beavers, black bears, and many species of birds. However, the seeds of this tree are poisonous to humans. ");
                tourButtonPress(itemValue);
                science.setText("(Cornus florida)");
                break;
            case("Ginkgo"):
                imageView.setImageResource(R.drawable.ginkgo);
                description.setText("The Burke Museum displays fossilized Ginkgo leaves 48 million years old which look like the ones before you. This tree of ancient lineage is the oldest unchanged tree species on the planet, so is aptly called Golden Fossil tree (it turns yellow-gold in fall). The ginkgo by the Aerospace and Engineering building is still young and has not flowered yet. Male ginkgo catkins droop conspicuously in April; female trees produce tiny green flowers that give rise to orange, plum-like fruit in October. Within the pungent fruit is an edible nut, much prized in the tree's native China.\n" +
                        "\n" +
                        "Extracts of ginkgo leaf are rumored to increase memory potential and treat many illnesses, and it has been used in Chinese medicine for thousands of years.  Ginkgo are resistant to disease and insects and because of this they have been known to live up to 2,500 years. Ginkgo grows best in soils that are well-watered and well-drained. The wood of Ginkgo trees is lightweight and brittle and does not have many uses. ");
                tourButtonPress(itemValue);
                science.setText("(Ginkgo biloba)");
                break;
            case("American White Elm"):
                imageView.setImageResource(R.drawable.americanwhiteelm);
                description.setText("Superb form and majestic presence make this tree at the HUB bus-stop special. In Seattle at least, American White Elms, unlike English Elms, make comparatively few, tiny, hairy seeds in spring. The leaves turn bright yellow early in the fall. The bark is more ropelike and less chunky. The roots don't sucker. Above all, the American Elm builds an arching, vase-like crown of uplifting branches from which descend fine branchlets of more refined foliage.\n" +
                        "\n" +
                        "American White Elm is native to most of Eastern North America. A fungal infection known as Dutch elm disease has caused catastrophic die-off throughout the range of the species. These elms are also susceptible to several other pathogens, making it difficult to use them as street trees, but otherwise they are ideal because of their fast growth and stress tolerance. The wood of an American Elm is moderately heavy, hard, and stiff with interlocking grain that makes it difficult to split but ideal for use in the production of hockey sticks where bending is necessary. It has also been used for production of furniture, flooring, construction, and mining timbers.  The inner bark is fibrous and used to make strong ropes. Fibers obtained from the stems have been used to make beige paper. ");
                tourButtonPress(itemValue);
                science.setText("(Ulmus americana)");
                break;
            case("Honey Locust"):
                imageView.setImageResource(R.drawable.honeylocust);
                description.setText("A lovely contrast between delicate greenery and red brick hardscape is afforded by the Honey Locusts in front of Loew Hall and the Engineering Library. Locusts are distinguished by their foot-long (30-centimeter long), honey-rich seedpods and fiercely hard, large thorns. Where the species occurs wild in its native Midwest these traits are well known, but this variety is podless and thornless. \"Inermis\" translates to \"without thorns\". Golden fall color ends the growing season.\n" +
                        "In nature these trees are found along stream banks; because of this it is tolerant of flooding and poorly aerated soils. Despite the name the tree is not a source of honey, but the seed pods do have a sweet taste and can be fermented to make beer. The wood is durable and produces high quality timber that polishes well. It is used for posts and rails because it is rot resistant even when in soil. It has a fast growth rate and can tolerate poor site conditions making it an ideal tree for places where shade is needed quickly or disturbed sites. ");
                tourButtonPress(itemValue);
                science.setText("(Gleditsia triacanthos f. inermis)");
                break;
            case("Silk Tree"):
                imageView.setImageResource(R.drawable.silktree);
                description.setText("Silk Tree's showy blossoms during the height of summer makes up for its tardiness to waken from winter dormancy. A large old specimen is on your left as you face the HUB lawn and a younger one to the right. The rarefied lightness of its frond-like leaflets and its bright pink flower puffs make it unmistakable. Silk Tree is named from its threadlike flowers and is unrelated to the mulberry tree from which silk is produced. It is native over much of Asia and now grows wild in the eastern United States where it was introduced in 1785. Although it produces many seedpods in Seattle, it rarely springs up wild here.\n" +
                        "Each night and while it rains, the leaves of the silk tree close slowly, the leaflets bowing down as if the tree was sleeping. The synonym nemu tree is an adaptation of the Japanese name nemunki, meaning sleeping tree. The silk-like flowers are attractive to bees, butterflies, and hummingbirds. In the wild this tree tends to grow in dry plains, sandy valleys and uplands. It can tolerate strong winds but cannot grow in the shade.  The bark or cortex is used to cure bruises and as a vermicide. The wood of the silk tree is dense, hard, and strong and has been used to make furniture. ");
                tourButtonPress(itemValue);
                science.setText("(Albizia julibrissin)");
                break;
            case("Pindrow Fir"):
                imageView.setImageResource(R.drawable.pindrowfir);
                description.setText("A pair of lush, symmetric, dark firs mark one end of Sieg Hall. The needles of this Himalayan evergreen are flat, long, but not sharp, fragrant, and both densely borne and long persisting. Three- to five-inch (7.6- to 12.7-centimeter) cones perch at the tops of the trees then disintegrate when mature in late summer or fall. Pindrow is a native vernacular name originating from its Nepalese name.The wood of the Pindrow Fir is light, soft and not durable, so its uses are restricted to things like house interiors and furniture. These firs are shade tolerant and prefer moist but not water-logged soils. They grow well in heavy clay soils, and they are sensitive to frost, especially as seedlings. ");
                tourButtonPress(itemValue);
                science.setText("(Abies pindrow)");
                break;
            case("Cork Oak"):
                imageView.setImageResource(R.drawable.corkoak);
                description.setText("Next to the HUB's sunny west-facing wall is Washington's largest Cork Oak. Like many oaks, this one is evergreen, with dull, often cupped, prickly leaves. The leaves are adapted to a hot, dry existence. Like all oaks, this produces acorns to reproduce itself. This species is the famous Mediterranean native from which people obtain cork: strip off the spongy bark, and it grows back better than before--a great boon for humanity. The cork from this tree is used for heat and sound insulation, flooring, and floats.  The bark of a cork oak is first harvested when the tree is 25-30 years old and can be harvested every 6-12 years after that. A large tree can yield up to 1 ton of cork. The cork oak is intolerant of extremely cold conditions.");
                tourButtonPress(itemValue);
                science.setText("(Quercus Suber)");
                break;
            case("Bay Laurel"):
                imageView.setImageResource(R.drawable.baylaurel);
                description.setText("Sniff these trees. Scratch a leaf or twig with your fingernail and inhale the spritely fragrance of sweet bay, renowned for its use as a flavoring since ancient Grecian times. The two multitrunked trees next to Sieg Hall's entrance are the largest in Washington, the taller being 40 feet (12.2 meters). They're both males, cutting-grown specimens, so they are genetically identical to most of the other bay laurels planted locally. Like the Cork Oak, this is a Mediterranean native that suffers damage in severely cold winters. As an element in Italian, formal, or herbal gardens, bay laurels are indispensible.  The fruit of the laurel is a small black berry about a half inch (one centimeter) long containing a single seed.\n" +
                        "In Chinese folklore there is a great laurel tree on the moon, and the Chinese name for the laurel translates to “moon laurel”. A laurel wreath was presented to the victors of athletic competitions, ancient Olympics, and poetic meets in ancient Greece. The Bay Laurel is highly resistant to pests and diseases, and it is said to protect neighboring plants from these pathogens as well. The highly aromatic leaves can be used as an insect repellent and can be used to protect stored grains and beans from weevils. The wood is sweetly scented and is used as a veneer, for walking sticks, and for friction sticks for starting fires. ");
                tourButtonPress(itemValue);
                science.setText("(Laurus nobilis)");
                break;
            case("Douglas Fir"):
                imageView.setImageResource(R.drawable.douglasfir);
                description.setText("Douglas-fir is the preeminent Pacific Northwest tree. It covers more acres, grows larger, and provides more wood than any other species in the region. For mature trees, two characteristics stand out: first the trunks tend to be like telephone poles, without low branches, and are covered with thick, dark, corky bark—to protect from fire. Secondly, the trees are dark, from the density of their inch-long (2.5-centimeter-long) needles. The cones, 3 to 4 inches (7.6 to10.2 centimeters) long, are easily distinguished from hemlock, spruce, or pine cones by the little “mouse tails” that stick out from between the scales. A Native American myth explains that the three ended bract comprises the back legs and tail of a mouse that hid inside the cone during forest fires for protection, and the tree was kind enough to be its sanctuary. \n" +
                        "Douglas-fir is a common species for Christmas trees. Its wood is heavy, strong, fine grained, and often used in structural applications with high load requirements.  It has also been used for aircraft, telephone poles, furniture, etc. The bark contains pitch, burns with a lot of heat and almost no smoke, and is highly prized as a fuel. Resin from the trunk is used in the manufacturing of glues and candles, and can be used to caulk boats. A good way to identify Douglas-fir is by the red bud tips on the ends of the branches. ");
                tourButtonPress(itemValue);
                science.setText("(Pseudotsuga menziesii)");
                break;
            case("Western Red Cedar"):
                imageView.setImageResource(R.drawable.westernredcedar);
                description.setText("Western Red Cedar is a very important tree in the Pacific Northwest. The bark is fibrous, stringy, and red tinged on a singularly fluted, buttressed trunk. The sprays of yellow-green foliage are fragrant, scaly, and set with small cones no bigger than peanuts. Cedar doesn’t grow as tall as Douglas-fir, but makes trunks as thick, and lives as long. The campus has plenty of both.\n" +
                        "Western red cedar is not actually a cedar but belongs to the Cupressaceae family along with cypresses. The name plicata derives from a greek word meaning “folded in plaits”, referring to the patterns in its leaves. Western red cedar has been called “the tree of life” because it provided so many medicinal and practical uses to the native peoples in the Pacific Northwest. The wood is soft and red-brown and was used to make canoes, houses, totem poles, bowls, spoons, and tools. The wood contains powerful fungicides that prevent decay for many years after the tree is dead. The inner bark has been used to make baskets and wicks for oil lamps, as well as Waterproof hats, capes, trousers, and skirts. The roots and bark have been used to make fishing nets. The list of uses goes on and on. ");
                tourButtonPress(itemValue);
                science.setText("(Thuja plicata)");
                break;
            case("Red Oak"):
                imageView.setImageResource(R.drawable.redoak);
                description.setText("Red oaks contribute to the substantial grove between Smith Hall and Suzzallo Library. Originally this area was part of the University's first International Grove, planted in 1932. Now some of the oaks are 100 feet (30 meters) tall. Among oaks this eastern North American species is distinguished by its large, shallowly but sharply lobed leaves, and huge, comparatively smooth-barked trunk. Red oaks are easily identified by the ridges in their bark that appear to have shiny stripes down the center. A few other oaks have this feature high up on their trunks, but Red oak is the only species that has the stripes all the way down the trunk. Its acorns, the size of large cherries, are produced abundantly. The foliages turns gold or red in autumn.\n" +
                        "The wood of this important American lumber source is coarse grained, hard, strong and heavy, but not highly durable. It is used for flooring, furniture, veneers and various aspects of construction. The grain of Red oak wood is so open that smoke can be blown through the grain of the wood if cut parallel to the trunk. As with all oak species, the acorns are an important source of food to many species of wildlife and for several Native American tribes at one time. The bark of this species also provided many important medicinal properties to the tribes. ");
                tourButtonPress(itemValue);
                science.setText("(Quercus rubra)");
                break;
            case("Copper Beech"):
                imageView.setImageResource(R.drawable.copperbeech);
                description.setText("Color is the operative word for this tree. In this specimen, on the HUB lawn near Thompson Hall, the leaves are copper colored instead of the normal green.  Copper beech is a gigantic shade tree that produces tiny nuts and is a frequently planted ornamental because of its beauty.  Silvery, smooth bark on the trunk distinguishes beeches even in winter. The blunt leaves are shaped like an egg. Next to the Art building (near the Cedar of Lebanon) is a dark purple variant.\n" +
                        "Beeches here are not valued for their nuts, since most of them are hollow, and squirrels eat most that are not. However, oil made from the nuts is said to be equal in delicacy to olive oil. Consumed in excess, the seeds can be poisonous.  The wood of beech is less useful than that of its oak relatives because it is often attacked by beetles and it not durable enough for use outdoors. The leaf buds harvested in the winter and dried on the twigs can be used as toothpicks. ");
                tourButtonPress(itemValue);
                science.setText("(Fagus sylvatixa f. purpurea)");
                break;
            case("Sugar Maple"):
                imageView.setImageResource(R.drawable.sugarmaple);
                description.setText("Across the lane north of the HUB lawn is an old Sugar Maple with an atypical concentration of heavy horizontal limbs emanating from its ashy gray trunk. Its leaves are as wide as they are long with 5 lobes each. The turn bright orange, red, and yellow in autumn often with different branches on the same tree changing at different times. This species displays the doubly winged seeds typical of maples that drop in autumn. Sugar maple is the most shade tolerant of all large deciduous trees.\n" +
                        "The chief attributes of this species are its being a major component of forests in much of eastern North America, its warm fall color, its highly useful wood, and its sweet sap. When the trees are leafless in late winter, their sap rises and descends with the temperature, and people extract it to make maple syrup or sugar. Our climate is too warm in winter for commercially worthwhile sap harvest, but the trees grow well here. Bowling alleys and bowling pins are usually made of sugar maple wood, along with basketball courts. Many musical instruments are part sugar maple, including violin sides and backs, guitar necks, and drum shells. Pool cue shafts are another product of this fine timber species. Sugar maple leaves are packed around apples, root crops, and other such foods to help preserve them. ");
                tourButtonPress(itemValue);
                science.setText("(Acer saccharum)");
                break;
            case("Paper Birch"):
                imageView.setImageResource(R.drawable.paperbirch);
                description.setText("At the southeast corner of Thomson Hall stands a white-barked Paper Birch, a species whose native range extends from Alaska all across Canada and the northern United States. Native in Seattle, it is rare here, and is vastly outnumbered by its European cousin Weeping European White Birch. Its leaves are larger than those of the European Birch. Paper Birch also has a whiter trunk. The tree we single out at this stop has been hurt by the wall constructed next to it, so its top is thin and its leaves smaller than when it was healthy. Larger examples can be found elsewhere on campus.\n" +
                        "Paper Birch is a pioneer species, quickly recolonizing disturbed land. However it is easily overtaken by other species that reproduce better in shade. The thin outer white bark of this species is easily harvested without killing the tree and is resinous, tough, durable, and waterproof. This was used to make drinking vessels, canoe skins, roofing tiles, buckets, and sunglasses to prevent snow blindness. A brown to red dye can be obtained from the inner bark. The wood is useful as a fuel because it burns well with a considerable amount of heat even when green, but it tends to coat chimneys with a layer of tar. ");
                tourButtonPress(itemValue);
                science.setText("(Betula papyrifera)");
                break;
            case("Swedish Whitebeam"):
                imageView.setImageResource(R.drawable.swedishwhitebeam);
                description.setText("At the northeast corner of Thomson Hall is a small relative of the common mountain ash: the Swedish Whitebeam. The leaves are green on top and pale grey and hairy underneath. It has small creamy-white flowers borne in tight clusters in April, giving rise to little red berries--especially pretty as the leaves turn yellow in October. It may grow to 50 feet (15 meters) or more in height, but is normally smaller. As its name suggests, it is from northern Europe.\n" +
                        "Swedish Whitebeam is grown as an ornamental tree and is valued as an urban street tree. It appears commonly along avenues and in parks. This tree is wind resistant and can be used in windbreaks. It also tolerates salt spray. Birds often forage on the berries on this tree. ");
                tourButtonPress(itemValue);
                science.setText("(Sorbus intermedia)");
                break;
            case("Katsura"):
                imageView.setImageResource(R.drawable.swedishwhitebeam);
                description.setText("Padelford Hall is shadowy and lush with a forest-like setting of Katsura trees and Scots pines. Katsura has a Japanese name, but it is native to Japan and China. Its roundish heart-shaped leaves are bronze as they emerge in spring, then green all summer before lighting up in fall in yellow, apricot or red. Fall's glowing colors are often accompanied by a fragrance of burnt sugar, strawberries, or cotton candy. As long as katsuras receive sufficient summer moisture they do well in our climate and soils, growing large and proving hardy, disease-free and long lived.\n" +
                        "The katsura was introduced to the United States in 1865 by Thomas Hogg, who sent seeds from Japan to his brother for propagation in their family nursery in New York. The trees wood is white, soft, and fine-grained and is used in cabinetry, paneling, furniture, building interiors and boxes. ");
                tourButtonPress(itemValue);
                science.setText("(Ceridiphyllum japonicum)");
                break;
            case("Scots Pine"):
                imageView.setImageResource(R.drawable.scotspine);
                description.setText("The Scots Pines interplanted with the Padelford Hall katsuras are best seen in winter, when their orange bark and blue-green needles show up with less competition from other trees. Notice how shade kills their lower limbs. Scotland indeed in one home of this species, but it also grows all the way east to the Pacific. No other tree has such an extensive range. The Scots is identified by its slender orange trunk, 2- to 4-inch (5- to 10-centimeter) blue green, stiff needles in bundles of two, and  2- to 3-inch (5- to 7.6-centimeter) cones. Most similar is Japanese Red Pine.\n" +
                        "It is a major species in European forestry, as well as an ornamental in North America. Scot's Pine survives well on drought prone sites and is effective in controlling erosion. Scot's pine has many other uses. The needles provide a tan or green dye and can also be used as a packing material. A reddish-yellow dye can be obtained from the cones. The roots burn well because they are resinous and can be used as a candle substitute. Resin and turpentine are made from either tapping the trunk or distillation of the wood. After turpentine is removed from the tree a substance called rosin is left over, and rosin is used by violinists on their bows and is also used as a sealing wax or varnish. ");
                tourButtonPress(itemValue);
                science.setText("(Pinus sylvestris)");
                break;
            case("Weeping European White Birch"):
                imageView.setImageResource(R.drawable.weepingeuropeanwhitebirch);
                description.setText("On the lawn north of the Music building, 40 feet (12.2 meters) from an eastern white pine, is a Weeping European White Birch. This fine tree drips its slender twigs making a fountain of foliage. Like Scots Pine, this birch is a denizen of northern Europe, and is widely familiar because of its bark. It is easily distinguished from Paper Birch by the darker color and rougher texture of the bark. This individual is infested with black branch galls of dormant buds. It is so common locally that many Seattleites may think it is native here.\n" +
                        "The wood of this birch is soft, light, and durable making it useful for a range of purposes. A high quality charcoal made from the bark is often used by artists. The leaves of this tree are a good addition to a compost heap because they improve fermentation. The sap is used to make glue and a brown dye is obtained from the inner bark. A tar-oil can be obtained from the bark in the spring. It fungicidal properties and is used as an insect repellent. ");
                tourButtonPress(itemValue);
                science.setText("(Betula pendula 'Tristis')");
                break;
            case("English Maple"):
                imageView.setImageResource(R.drawable.englishmaple);
                description.setText("Two English maples are by the wheelchair ramp at the Music building's southeast end. This species is the only Acer native in England, and was the first tree to receive the name \"maple.\" It is cultivated where a tough small tree is desired and is often found in English hedgerows. Its softly lobed leaves lack the elegance and vibrant colors of some maples and change to yellow in November. The seeds are conspicuous in horizontal pairs. The bark is somewhat corky and finely fissured.\n" +
                        "The wood is fine-grained, tough, elastic, and hard to split, but it is rarely used for timber purposes because it is such a small species. The wood of the roots is desirable because of its knotted texture. The wood makes an excellent fuel as well as the charcoal. The sap of this maple can be used as a drink or concentrated into syrup by boiling off the water. This syrup has lower sugar content than that of the sugar maple (Acer saccharum). ");
                tourButtonPress(itemValue);
                science.setText("(Acer campestre)");
                break;
            case("Horse Chestnut"):
                imageView.setImageResource(R.drawable.englishmaple);
                description.setText("Horse Chestnut trees line Skagit Lane, forming a shady colonnade. Native to Greece and Albania, this species was introduced to the United States in the 1740s because it has the showiest floral display of all large shade trees, with foot-long (0.3 meter-long) clusters of white flowers in late April or early May. Unlike the true Chestnut tree the nuts produced by this species, known as conkers, are inedible. Squirrels gather many, and plant those that they don't eat causing many wild horse chestnut seedlings in this area. The leaves turn to gold or pale brown in autumn, revealing large sticky buds which will burst with a flourish early next spring.\n" +
                        "The name \"Horse Chestnut\" was probably given originally because the fruits were used by the Turks as a drug for horses suffering from broken wind or coughs. The seeds were used in France and Switzerland for whitening hemp, flax, silk, and wool and can also dye fabrics a sky-blue color. The conkers placed in the corners of a room are rumored to keep spiders away. The flowers contain quercetin, a dye and an antihistamine. The wood is soft, light, and not durable. ");
                tourButtonPress(itemValue);
                science.setText("(Aesculus hippocastanum)");
                break;
            case("Japanese Maple"):
                imageView.setImageResource(R.drawable.japanesemaple);
                description.setText("A Japanese maple is west of the Music building facing Miller Hall. There is no tree native in North America has as many ornamental varieties as the Japanese maple. Acer palmatum, while one of 20 maple species native in Japan, is the most common and widely variable. Depending on the variety, it can range from a low bush to a 60 foot (18.3 meter) high tree. The species name palmatum refers to the hand-like shape of the leaves, which can vary greatly in laciness. In color they vary delightfully too. The Music building example has a red tinge at its leaf tips that gives the whole tree a bronze appearance. This tree is planted almost totally as an ornamental. There are hundreds of variations within this species, in terms of form, color, leaf type, size, and preferred growing conditions. ");
                tourButtonPress(itemValue);
                science.setText("(Acer palmatum)");
                break;
            case("Sweetgum"):
                imageView.setImageResource(R.drawable.japanesemaple);
                description.setText("Sweetgum trees stand between the Art building and MacKenzie Hall. They are vigorous shade trees from the southeastern United States with star-shaped leaves that smell sweetly resinous if scratched. From the leaf shape you might think it a maple, except that no maple can match the sweet odor. Moreover, maple leaves and twigs are opposite one another, whereas sweetgum leaves are alternate like those of most trees. Several features make sweetgum one of the most popular urban ornamental trees. It is strong, adaptable to varied soil conditions, and produces a safe, handsome crown of branches. The fall leaf color can be spectacular red usually changing from green later in the season than most trees. Practically no insects or diseases bother this species. A drawback is its prickly seedballs littering the ground, crunching underfoot.\n" +
                        "Sweet gum resin can be used as a stabilizer in cakes and other foods and can be chewed to sweeten the breath. It also has medicinal, incense, perfume, soap, and adhesive uses. The wood is fine-grained with red heartwood that displays traverse blackish belts when cut. It is used for lumber, veneer, plywood, and railroad ties. The lumber is used to produce boxes and crates, furniture, and radio, television, and phonograph cabinets.  ");
                tourButtonPress(itemValue);
                science.setText("(Liquidambar styraciflua)");
                break;
            case("Yellow Birch"):
                imageView.setImageResource(R.drawable.yellowbirch);
                description.setText("West of MacKenzie Hall stands a Yellow birch in a grassy triangle with Douglas firs and a huge English elm. If you can reach a branch, the living twigs smell like wintergreen. Its bark has a horizontal peeling pattern like other birches, but the tree is named for its yellow-tinged dark gray color instead of the familiar chalky white of the paper birch. The catkins, however, and little seed-cones, declare this species a Betula. As an ornamental it serves as a broad shade tree, had bright yellow fall color, is free of insect and disease, but is not liked enough to rival its pale bark cousins.\n" +
                        "The wood is close-grained, hard, and strong. It is a great lumber tree in the central and eastern United States, used for furniture, boxes, hubs of wheels, and floors. The wood is too dense to float. Similar to maple trees, the sap can be harvested by tapping the trunk and then consumed as a drink or boiled down into a syrup; however birch syrup has a much lower sugar content than maple. ");
                tourButtonPress(itemValue);
                science.setText("(Betula alleghaniensis)");
                break;
            case("Japanese Red Pine"):
                imageView.setImageResource(R.drawable.japaneseredpine);
                description.setText("By the shallow stairs at Balmer Hall's east corner is a Japanese Red Pine. The trunk's reddish-orange color and peeling bark give away its identity. The needles are slender, soft, yellow-green and borne in bundles of two, along with cones that suggest those of Scots pine. To the Japanese, it is feminine, while the Japanese black pine is masculine. Like this specimen, it often is multi-trunked and broad, not a robust upright grower like many pines. Thus it is well suited for use in garden design. In Japan it is a used for timber production and as an ornamental. Japanese Red Pine is one of the more medicinally useful pines. It is used internally and externally to treat a wide variety of conditions. Aka matsu is its Japanese name. It was first introduced in the United States in 1854. ");
                tourButtonPress(itemValue);
                science.setText("(Pinus densiflora)");
                break;
            case("Red Hickory"):
                imageView.setImageResource(R.drawable.redhickory);
                description.setText("North of Denny Hall is the only old hickory on campus. Red hickory was once considered a hybrid species, a cross of pignut and shagbark hickories, but now it is recognized as its own species. All hickory trees are known for their nuts, their strong yet supple wood, and bright yellow October color. This specimen, healthy and handsome, makes small nuts that are not worth eating. Red hickory forms a straight trunk that continues the entire height of the tree, occasionally splitting off into two or three large limbs. The lower limbs grow bending downwards, the middle limbs grow horizontally, and the top limbs reach upward to the sky. This is a defining feature of all hickories. Red hickory commonly has seven leaflets on its compound leaves, but this specimen has only five. The bark is grey to dark brown and sharply furrowed with deep crevices and red highlights between scales. The wood is heavy, hard, tough and elastic. In the past it has been used to make wagons, agricultural tools, and tool handles. ");
                tourButtonPress(itemValue);
                science.setText("(Carya ovalis)");
                break;
            case("Monkey Puzzle"):
                imageView.setImageResource(R.drawable.monkeypuzzle);
                description.setText("On the lawn in front of Denny Hall down towards Savery Hall is a Monkey Puzzle. This is surely among the most memorable of all the campus trees. It is a common introduction in the maritime Northwest but rare or nonexistent in the rest of the United States. It is a native of Chile and Argentina, being the only commonly cultivated South American conifer hereabouts. Newcomers here are always amazed at its dark, snake-like branches and prehistoric looking trunk.\n" +
                        "Similar to the ginko, this is an extremely old species and is known as a living fossil. The nuts from female trees provide a valuable food resource. The wood is also useful. Although this specimen is a female and it makes the large cones, the nuts within are mostly hollow. A pollinator male (with dangling, cucumber shaped cones) is necessary for meaty seeds.  Seeds are not usually produced until the tree is 30-40 years of age; however once established these trees can survive as long as 1,000 years. ");
                tourButtonPress(itemValue);
                science.setText("(Araucaria araucana)");
                break;
            case("Black Walnut"):
                imageView.setImageResource(R.drawable.monkeypuzzle);
                description.setText("On the lawn south of Denny Hall by the stone bench erected by the Class of 1915 is a stately Black Walnut tree. Across the path from it is the largest pine on campus, a Western White Pine. We've all eaten walnuts, but black walnuts possess zestier flavor and are harder to crack than the nuts of other walnut species. They grow on enormous trees, native in much of the United States, but not the Pacific Northwest.  The wood is supreme in its fine grain, lovely dark color, and hardness. Besides the food and wood, the trees serve as excellent long lived shade trees.\n" +
                        "Black walnut trees have insect repelling qualities and the leaves and husks have been used to repel fleas, flies, and bedbugs. The roots and leaves contain chemicals that suppress the growth of other plants and these chemicals are washed off the leaves by the rain, creating a unique understory plant assemblage. Black walnut can be added to a compost pile to speed bacterial activity and decomposition. The nut casings contain a dark black-brown dye and tannins which act as a mordant, a chemical that helps fix a dye.");
                tourButtonPress(itemValue);
                science.setText("(Juglans nigra)");
                break;
            case("Bur Oak"):
                imageView.setImageResource(R.drawable.buroak);
                description.setText("On the south side of Denny hall is a shaded corner dominated by a Bur Oak more than 80 feet (24.4 meters) tall whose straight, stout trunk develops into huge limbs high out of reach. These broad arms bear large leaves, dark green on top, pale underneath, and distinctive with their narrow \"waists.\" Bur Oak is so-called since its acorns are in bristly husks. Also called prairie oak, it is native in central and eastern North America, and is the state tree of Illinois.\n" +
                        "Bur Oak typically grows in the open away from a forest canopy. Having the largest acorns in North America, these fruits are valuable to wildlife species such as black bear, deer, porcupine, and cattle. Wildlife also eat the leaves, twigs, and bark. A mulch of dried leaves can be used to repel slugs and grubs; however a mulch of fresh leaves will inhibit plant growth. The wood is hard, durable, and close grained. It has been used in making baskets, flooring, cabinet making, and ship building. ");
                tourButtonPress(itemValue);
                science.setText("(Quercus macrocarpa)");
                break;
            case("Digger Pine"):
                imageView.setImageResource(R.drawable.diggerpine);
                description.setText("Southwest of the flagpole above Odegaard Library are two Digger Pines. Their coarse-barked, candelabrum trunks sport a light garb of long gray needles in bundles of three and large, squat, cantaloupe-sized cones, dark against the branches. Like Coulter Pine, these pines are native to California, where they stand out ghostly pale in the foothills. Their cones contain big edible \"pine nuts\", an important food for the native people of California. Gray pine is an apt, descriptive name, but little used. The specific scientific name commemorates Joseph Sabine (1770-1837), secretary of the Horticultural Society of London, an attorney, naturalist, and patron of David Douglas (of Douglas-fir fame).\n" +
                        "Digger pine is drought tolerant but cannot grow in the shade. The wood is light, soft and brittle and is not useful as lumber. The pitch was used as an adhesive and the twigs and rootlets was used as a sewing material for coiled and twined baskets. An essential oil called abietine is obtained by distilling the resin and is used as a cleaning agent and insecticide. ");
                tourButtonPress(itemValue);
                science.setText("(Pinus sabiniana)");
                break;
            case("Eastern White Pine"):
                imageView.setImageResource(R.drawable.easternwhitepine);
                description.setText("West of the flagpole are two Eastern White Pines. This species is eastern North America's most important forest tree and is the State Tree of both Maine and Michigan. Its towering height, abundance, valuable wood, and graceful beauty make it stand out. The name white pine contrasts it with black and red pines, which have darker foliage and heavier, pitchier wood, and whose needles are borne in bundles of two or three instead of five like white pines. The cones are usually 4- to 8- inches (10.2- to 20.3- centimeters) long and banana-like.\n" +
                        "The wood was used for many purposes from ship masts to matches. Freshly cut white pine is creamy white or pale straw in color, but after aging for many years it tends to take on a deep rich tan. A tea made from the young needles is used to treat a sore throat, and as with all pines the oil is effective in treating burns. White pine grows in well-drained soil and cool, humid climates but also appears in boggy areas and rocky highlands. Squirrels and many forest birds look to this tree for food and shelter. ");
                tourButtonPress(itemValue);
                science.setText("(Pinus strobus)");
                break;
            case("Western White Pine"):
                imageView.setImageResource(R.drawable.easternwhitepine);
                description.setText("East of the flagpole are two Western White Pines, two Eastern White Pines, and an Austrian black pine. How do you tell who's who? The Austrian stands out with squat cones and dark blackish-green foliage. Western white pine, compared to its eastern cousin, is narrower, darker, has chunkier bark, larger cones, and stiffer needles, and is more blue-green. Also, the twigs are usually stouter and always hairier as you peer between the needle bundles. The two species are equally prized for lumber; as ornamentals the eastern is preferred, since it is less dense, therefore less prone to being blown over in storms. Most large white pines on campus are eastern, although the western is native here.\n" +
                        "All pine seeds are edible, but the seeds of this species are fairly small and mainly used as a seasoning. A tea made from the fresh needles is aromatic and high in vitamins A and C. A candy can be made by boiling the tender new shoots in syrup. The wood is appreciated for decorative uses such as paneling because it has dark knots. ");
                tourButtonPress(itemValue);
                science.setText("(Pinus monticola)");
                break;
            case("Purpleleaf Plum"):
                imageView.setImageResource(R.drawable.purpleleafplum);
                description.setText("Along the south side of the path between Savery and Gowen Halls stand two Purpleleaf Plum trees. Their soft pink flowers bloom before the Quad's Yoshino Cherries , and then these trees wear purple foliage until fall. In between, the trees produce deep red plums no larger than huge cherries. A variant of the typical Cherry Plum first arose in Persia as the original purpleleaf plum. This variant was sent to France around 1800 by M. Pissard, and all other varieties are related to this old variant. Now, fifty additional varieties are on record; as a group they're also called flowering or ornamental plums, names which don't preclude delicious fruit on some. All plants in this genus produce substances that break down in water to form cyanide. However in small amounts this toxin can stimulate respiration, improve digestion, and give a sense of well-being. ");
                tourButtonPress(itemValue);
                science.setText("(Prunus cerasifera 'Pissardii')");
                break;
            case("Norway Maple"):
                imageView.setImageResource(R.drawable.norwaymaple);
                description.setText("Norway Maples by Kane Hall face the Suzzallo Library. Few species are more widely planted as urban street-trees; every major temperate city where the climate allows displays Norway maple in its downtown area. This may also be because it tolerates pollution well. Norway maple admirably combines requisite size, strength, thriftiness, and ease of propagation. It also varies easily, so the nursery trade has developed mushroom-shaped dwarfs, columnar sentries, ovals, purple-leaved cultivars, and even cut-leaved varieties. No, it isn't as stirring in silhouetted beauty or as enchanting in fall color as Sugar Maple, but it is a better choice for less-than-ideal sites. The grey-brown and shallowly grooved trunk is quite similar to that of Seattle's native bigleaf maple, but the leaf is not as large or deeply cut, and the seeds spread their wings wider and have no bristly hairs.\n" +
                        "It leafs out earlier than other maples and tends to hold onto its leaves for longer in the autumn. A rose colored dye can be obtained from the bark. Unlike most other maples, this one does not develop shaggy bark at maturity. The petiole, the stalk of the leaf, is 3 to 8 inches (8 to 20 centimeters) long and secretes a milky juice when broken. Norway maple has one unfortunate characteristic: it releases chemicals underground that discourage anything else from growing underneath it, and this tends to cause bare muddy run-off conditions beneath the crown. It is considered an invasive species in some states because of this characteristic. ");
                tourButtonPress(itemValue);
                science.setText("(Acer platanoides)");
                break;
            case("Shumard Red Oak"):
                imageView.setImageResource(R.drawable.shumardredoak);
                description.setText("Shumard Red Oaks stand like six guards facing Red Square in front of Gerberding Hall. Named for Benjamin Franklin Shumard (1820-1869), state geologist of Texas in 1860, this species calls the southern United States home and is remarkable for its energetic growth and retaining leaves late into fall. Unlike regular Red Oak, its acorns and leaves are modest sized, but ultimately it grows just as large. The bark is rougher, and the undersides of the leaves have scattered tufts of tawny hairs. The acorns provide food for songbirds, game birds, waterfowl, white-tail deer, feral hogs, and squirrels among others, but the tree does not bear seeds until at least 25 years old. In nature it borders on streams and swamps in rich, moist soils. It can tolerate a large range of soil pH and is drought-tolerant. The roots do not tolerate disturbance, so this tree needs to be planted in its permanent position.");
                tourButtonPress(itemValue);
                science.setText("(Quercus shumardii)");
                break;
            case("Hisakura Cherry"):
                imageView.setImageResource(R.drawable.hisakuracherry);
                description.setText("A double row of nine Hisakura cherry trees introduces Rainier Vista, between Suzzallo Library and Gerberding Hall. Hisakura is an extremely rare Japanese flowering cherry that differs from common kwanzan in blooming earlier, not having pompom-weight flowers, growing broader, staying smaller and more dense, and in having narrower leaves less fringed on the edges. Its chief virtues are its earlier bloom and lesser space requirements. These are the only campus specimens, and the variety is not available at nurseries.");
                tourButtonPress(itemValue);
                science.setText("(Prunus serrulata 'Choshu-hisakura')");
                break;
            case("Shore Pine"):
                imageView.setImageResource(R.drawable.shorepine);
                description.setText("South of Meany Hall are bushy Shore Pines. Fairly compact and shrub-like, shore pine bears 1 to 3 inch (2.5 to 7.6 centimeter) needles in bundles of two and small prickly cones. Native in Seattle, this species is planted where \"cast iron\" hardiness is needed: toleration of dry, exposed sites and wretched soil. Its mountain kindred the Lodgepole pine (P. contorta var. latifolia) is slender and thin-barked with many similarities in needles and cones. Given good conditions Lodgepole pine grows up to 125 feet (40 meters) tall, but Shore pine often only reaches 40 feet (12 meters).\n" +
                        "The cones of Shore pine require high heat to open and release the seeds, and because of this the tree depends on fires to regenerate itself. Infrequent, high-severity fire events often replace an entire stand of Shore pine and open up the cones to allow a new generation to become established. Because it is rich in pitch, the wood from this species will burn well even when green. The roots are strong and can be braided to make rope. ");
                tourButtonPress(itemValue);
                science.setText("(Pinus contorta var. contorta)");
                break;
            case("Poderosa Pine"):
                imageView.setImageResource(R.drawable.poderosapine);
                description.setText("At Guthrie Annex 4, right up against Stevens Way, is a prominent Ponderosa Pine. The tree is precariously close to a road, a birch, and a building. It doubtless is stunted somewhat, yet still has a handsome, symmetric crown of long needles. This pine is the most common of all Pinus in western North America, having a vast range from Canada into Mexico.  The needles are 5 to10 inches (12.7 to 25.4 centimeters) long and borne in bundles of three. It is fortunate that the fairly large prickly cones weigh so little as they hover above pedestrians and vehicles.\n" +
                        "\"Ponderosa\" means heavy, ponderous, or weighty. The trees have deep black crevasses in distinctive orange bark that smells sweet like butterscotch. The cones and bark scales burn easily and give off little smoke. An important timber source, the wood is light, strong and fine-grained. It is used to make furniture, boxes, toys, and fence posts. It also makes good kindling and was used historically as material for torches. These giants can live to be 300-600 years old in nature, and are known to grow up to 227 feet (69.2 meters) tall and 8 feet (2.4 meters) in diameter. ");
                tourButtonPress(itemValue);
                science.setText("(Pinus ponderosa)");
                break;
            case("Bristlecone Pine"):
                imageView.setImageResource(R.drawable.bristleconepine);
                description.setText("Bristlecone pines are located north of Architecture Hall, near a group of Shore Pines. A unique characteristic distinguishing this pine is its needles frosted with tiny white pitch droplets. In other respects, the tree is like various southwestern \"foxtail pines,\" dense in growth, the shoots set with dark, short needles, five per bundle. The cones which give this species its name are purple-brown and tipped by slender spines or bristles. Besides its distinctive look, bristlecone pine is famous for its longevity. In its arid mountain home of Colorado, New Mexico and Arizona, it can live for thousands of years, with the oldest known species reaching 2,435 years. In cultivation it grows slowly and tenacious on difficult sites.\n" +
                        "The wood of this species is soft and resinous. Clark's nutcrackers eats the seeds and take shelter in the branches of this tree, along with several other small birds and mammals. Because they are so long lived these trees provide tree ring chronologies for past climate indicators such as temperature changes and are an important cross-reference for carbon dating. ");
                tourButtonPress(itemValue);
                science.setText("(Pinus aristata)");
                break;
            case("European Chestnut"):
                imageView.setImageResource(R.drawable.europeanchestnut);
                description.setText("Near a group of fire hydrants north of Bagley Hall is a European Chestnut tree. Its trunk is about one and a half feet (one half meter) thick. Recall the Skagit Lane Horse Chestnuts, and note the difference in leaves, flowers and nuts. Each leaf is prominently ribbed with straight veins ending in pointy teeth. The bark has a net-shaped pattern with deep furrows running in a spiral pattern in both directions around the trunk. The flowers are narrow spikes, pungent and creamy-white in late June or July. Needles completely cover the nut husks. Most of the nuts are small and empty; good ones are plump and similar to those in stores. Roasted the nuts are a delicacy used as a flavoring, a flour, or a sweetener.\n" +
                        "Native to southeastern Europe and Asia Minor, these trees can live up to a thousand years. An infusion of leaves and fruit husks can produce a shampoo rumored to give hair a golden gleam. The wood is light colored, hard, and strong. It is rot resistant and used to make posts, fencing, barrels, and roof beams. Ground into meal the seeds can be used as a wash to whiten linens. ");
                tourButtonPress(itemValue);
                science.setText("(Castanea sativa)");
                break;

            case("Dawn Redwood"):
                imageView.setImageResource(R.drawable.dawnredwood);
                description.setText("East of the Guggenheim annex there is a Dawn Redwood, another living fossil like the ginko and the monkey puzzle tree. The genus Metasequoia was first discovered from a fossil in 1941. Then in 1944 a stand of previously unidentified trees was found in China and was discovered to be M. glyptostroboides.  This example probably dates from 1948 when the Arnold Arboretum of Harvard University sent an expedition to collect seeds and distribute them to universities and arboreta worldwide for growth trials. \n" +
                        "This native of China's eastern Szechuan and NW Hupeh is famous for being the only non-extinct deciduous redwood, as well as for being an excellent ornamental conifer wherever room allows--it grows 200 feet (61 meters) tall and has a thick trunk. In winter its reddish, buttressed trunk is striking. The summer foliage is delicate green and then turns orange or brown in autumn before falling off. The root system of the dawn redwood is extensive and can be used to stabilize stream banks. ");
                tourButtonPress(itemValue);
                science.setText("(Metasequoia glyptostroboides)");
                break;
            case("China Fir"):
                imageView.setImageResource(R.drawable.chinafir);
                description.setText("The northwest corner of Blodel Hall is home to several China-firs. A gorgeously colored redwood cousin, this tree features spongy cinnamon bark and broad, flat, 1- to 2.5-inch (2.5- to 6.4-centimeters) needles in sumptuous, curving arrays along stout twigs. This distinctive species is a large-growing, common, important Chinese conifer. China-Fir has been cultivated in the West since 1804. Unlike many evergreens, it can reproduce by suckers from its base. The walnut-sized, prickly cones are firmly attached and fall with the dry, brown, old twigs. Though China-Fir foliage is normally shiny dark green, here you see the matte bluish form. \n" +
                        "Cold winter conditions can tint the foliage with bronze, but these damaged branches will quickly be replaced in the spring. China Fir prefers moist, well-drained acidic soils, and is well adapted to urban soils and useful as an ornamental conversation piece because of its unique branch structure. Its wood used to make coffins and for many less ghastly roles such as furniture, ship, and temple building. This species is often planted on college campuses and golf courses. ");
                tourButtonPress(itemValue);
                science.setText("(Cunninghamia lanceolata)");
                break;
            case("Cucumber Tree"):
                imageView.setImageResource(R.drawable.cucumbertree);
                description.setText("South towards Rainier Vista, a path goes into the woods. As you enter the forest, on the left is a Pacific dogwood, on the right is its cousin, the Old World Cornus sanguinea. Between the woods and Stevens way is the Medicinal Herb Garden. On the Rainier Vista side is a giant Cucumber Tree above the bench. This species is a deciduous magnolia from eastern North America that grows as a forest tree. Its unripe seed-cones resemble small cucumbers. Its huge leaves are out when its greenish-yellow flowers begin opening in May. The red seed-cones of autumn are pretty against the yellow leaves. No magnolia has better fall color.\n" +
                        "This is one of the largest and most cold-hardy magnolias. The wood is fine grained, soft, durable, but not strong. It polishes well and is used for boxes, crates, flooring, and cabinets.  The bark has been chewed by people trying to break a tobacco habit. The national champion tree in Stark County, Ohio measures more than 7 feet (2 meters) in diameter although it is only 79 feet (24 meters) tall. ");
                tourButtonPress(itemValue);
                science.setText("(Magnolia acuminata)");
                break;
            case("Hawthorn Trees"):
                imageView.setImageResource(R.drawable.hawthorntrees);
                description.setText("Five different Hawthorns are along Stevens way adjacent to the Medicinal Herb Garden. From Rainier Vista to the west these are: a Common Hawthorn (C. monogyna), from Europe and now naturalized here; two Cockspur Hawthorns (C. crus-galli), broad, thorny and glossy; a native Black-Fruited Hawthorn (C. Douglasii), suckering; three Scarlet Hawthorns (C. coccinea), of tight, upright form; a Frosted Hawthorn (C. pruinosa), by the vent. These hawthornes bloom from April into early June. The fruit is most showy in October and early November.\n" +
                        "The bark of most hawthorne trees is smooth and grey when young, developing into shallow longitudinal fissures with narrow ridges when older. The serrated or lobed leaves (of most species) grow spirally arranged on long shoots and in clusters on spur shoots on the branches and twigs. Related to crabapple trees, hawthorns in general are thorny little trees with much less showy, less variable flowers. Comparatively few are cultivated for either beauty or their fruit. Some are valued for the tough rot resistant wood's specialized uses.\n" +
                        "Hawthornes have a strong role in folklore. They were regarded as an emblem of hope by the ancient Greeks. Serbian and Croatian lore state that stakes of this wood are particularly deadly to vampires. In Celtic lore howthornes were once said to heal a broken heart. In Gaelic lore this species “marks the entrance to the otherworld” and is strongly associated with fairies, and it is said to be bad luck to cut the tree unless it is in bloom. Although it rarely blooms before mid May, it is customary to decorate with flowering hawthorne branches on May Day. ");
                tourButtonPress(itemValue);
                science.setText("(Crataegus species and hybrids)");
                break;
            case("Sierra Redwood"):
                imageView.setImageResource(R.drawable.sierraredwood);
                description.setText("With its trunk 5.5 feet (1.7 meters) thick, this mighty tree is among the most asked about on campus. You've met Coast Redwood across the street by Winkenwerder and a Dawn Redwood east of the Guggenheim annex. This one is larger than either. It grows in the mountains of California, including Yosemite National Park. A billowing mass of scaly blue-green foliage soars to a neat, cone-shaped top. It almost looks sheared compared to coast or dawn redwoods. This specimen may date from the turn of the century, so you can appreciate how fast it has grown.\n" +
                        "The bark is red, fibrous, furrowed, and thick to prevent damage from fires common in its native habitat. The cones look like many sets of lips all held together from the inside. The longest-lived known individual of this species was 3,500 years old. Because the brittle wood of these giants would often shatter when they were felled, probably less than 50% of it ever got to the mill ");
                tourButtonPress(itemValue);
                science.setText("(Sequoiadendron giganteum)");
                break;
            case("Crape Myrtle"):
                imageView.setImageResource(R.drawable.crapemyrtle);
                description.setText("In the Medicinal Herb Garden east of Garfield Lane lane is one of the smaller trees on this tour: Washington's largest Crape Myrtle, just over 30 feet (9.1 meters) tall. The Lagerstroemia genus contains other species that range from less than one foot (0.3 meters) to 100 feet (30 meters) in height. The trunk is multicolored in smooth, almost animal-like ripples covered with peeling bark. The crown of leaves is light and shiny. In the fall the foliage shifts to showy oranges, reds, and yellows. From about mid-August to mid-October, varying yearly, the tree has spectacular bright pink flowers that look as if they are made of crepe paper. Though native to the Indian subcontinent, Southeast Asia, northern Australia and parts of Oceania, this tree is known to most of us as a common ornamental in the Southern United States and California. It grows fine in Seattle, too, but blooms well only when placed in hot sites.\n" +
                        "The wood makes strong timber used to construct bridges, furniture and railroad ties. The beautiful bark of this species is thin and can be easily damaged, but it can make an attractive street tree if the lower limbs are removed. It often grows with multiple trunks, but it can be trained to grow with a single trunk. Nurseries sometimes plant crape myrtle around their borders to attract insects away from other plants. ");
                tourButtonPress(itemValue);
                science.setText("(Lagerstroemia indica)");
                break;
            case("Irish Yew"):
                imageView.setImageResource(R.drawable.irishyew);
                description.setText("In the old part of the Medicinal Herb Garden west of Garfield Lane are four Irish Yews. The two in the middle are golden, and the others are regular green. This variety of yew originated before 1760 in the mountains above Florence Court, Co. Fermanagh, Ireland. It is especially common in old neighborhoods and cemeteries. It is a small tree reaching 35-65 feet (10-20 meters) in height. The bark is thin, brown and scaly and the leaves are needle-like and arranged in spirals around the branches. The leaf bases twist to align the leaves into two rows with one on either side of the branch. Some claims have Yew trees living to be 5,000-9,000 years old; however other evidence points to the oldest species being around 2,000 years. Regardless, it is the longest living plant in Europe.\n" +
                        "Yew is poisonous, so don't eat the slimy red berries or the leaves. Its wood is hard, heavy, dark, fine, lovely and prized for making bows. It can also be burned as incense. The invaluable taxol alkaloid in the bark of our native Pacific Coast species generated considerable publicity about yews in recent years because of its possible use in treating ovarian cancer. It is tolerant of trimming and is used in topiary. It is rumored that even 1,000 year-old plants will re-sprout if cut back. ");
                tourButtonPress(itemValue);
                science.setText("(Taxus baccata 'Fastigiata')");
                break;
            case("Chinese Juniper"):
                imageView.setImageResource(R.drawable.chinesejuniper);
                description.setText("In the Medicinal Herb Garden, at the corner by your right is a 40-foot-tall (12.1-meter-tall) Chinese Juniper with big, pale berries. It is pollinated by a 50-foot (15.2-meter) male of the same species along the path leading to Benson Hall. Many of us think of junipers as shrubs, so these are good examples to show they can be real trees. This northeast Asian native has a weaker odor than many junipers, and can be either prickly or smooth in its foliage. The cones are berry-like, blue-black, and have a whitish waxy bloom. The United States also has several species of native juniper trees.\n" +
                        "The Chinese juniper is a popular species for bonsai cultivation. Another kind of juniper, called by the French \"genièvre,\" had its berries used to flavor the beverage that became known as gin. Oil of juniper has a lovely warm, fresh, balsamic, woody pine needle odor. It is used medicinally to treat a variety of ailments. ");
                tourButtonPress(itemValue);
                science.setText("(Juniperus chinensis)");
                break;
            case("Oregon White Oak"):
                imageView.setImageResource(R.drawable.oregonwhiteoak);
                description.setText("Against Benson Hall's south-facing concrete patio, by the bicycle rack, is an Oregon White Oak. This is the only oak species native  to Washington. The example before you is somewhat inferior specimen, not the norm. It is called Garry Oak in British Columbia, after Nicholas Garry (1781-1856), Secretary and later Deputy Governor of the Hudson Bay Co.\n" +
                        "Among oaks it has especially stout twigs bearing large, hairy buds, with deep dark green leaves, rounded in their lobes unlike Red Oak or Shumard Red Oak, and rather large acorns in shallow cups. This species grows slower and is more prone to galls and leaf scorching than many other oaks. The rugged, broad branching habit of aged trees is inspiring, but though the wood is strong, it does break, and native people knew not to camp underneath these trees. The wood is difficult to season without warping, so it has no commercial value. However it has been used experimentally in Oregon for creating casks for aging wine. ");
                tourButtonPress(itemValue);
                science.setText("(Quercus Garryana)");
                break;
            default:
                description.setText("default");
                break;
        }
    }
    private void tourButtonPress(final String itemValue) {
        Button b = (Button)findViewById(R.id.tourbutton);
        if (b != null) {
            b.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    if (!containsMultiple(itemValue)) {
                        MainActivity.treeList.add(itemValue);
                        Toast.makeText(TreeInformation.this, "Added " + itemValue + " to custom tree tour", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(TreeInformation.this, itemValue + " is already in your list", Toast.LENGTH_SHORT).show();
                    }
                }

            });
        }
    }

    boolean containsMultiple(String itemValue) {
        for (String t: MainActivity.treeList) {
            if (t.equals(itemValue)) {
                return true;
            }
        }
        return false;
    }
}

