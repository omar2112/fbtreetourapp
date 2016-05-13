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
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        List<String> favorites = new ArrayList<String>();
        switch(itemValue) {

            case ("Monterey Pine"):
                imageView.setImageResource(R.drawable.montereypine);
                description.setText("Earth has more than 100 pine species, and ten important ones grow west of Anderson Hall. A Monterey Pine stands on the north side of the C10 parking lot on the west side of Blodel and Anderson Halls. Foresters relish Monterey Pine's fast growth, attained even on poor soils. The tree bears 3- to 5-inch (7- to13-centimeter) needles in bundles of three and distinctive cones: roughly baseball-sized, woody-textured, knobby, staying closed and clinging tightly to the tree for decades. Fire allows the cones to expand and release their seeds. The bark is red-brown to blackish-brown and deeply furrowed. Severe winters turn Monterey pines brown, but do not usually kill them.\n" +
                        "\n" +
                        "\n" +
                        "Though native only in a small part of California, this bright green pine is planted in vast portions of the planet for wood. In New Zealand, Monterey Pine is considered an invasive species where it has escaped plantation forests. The seeds of all pine species are edible and were used by Native American tribes as an important food source. Monterey Pine seeds were a valuable resource because the cones remain closed on the tree year round, and the seeds can be harvested during any season by placing the cones on or near a fire. Monterey Pine is effective for controlling erosion and stabilizing steep slopes because it is fast growing and has a wide spreading root system. ");
                tourButtonPress(itemValue);
                break;
            case ("European Larch"):
                imageView.setImageResource(R.drawable.europeanlarch);
                description.setText("On the path next to Garfield Place, across the street from Anderson Hall, is a European Larch. Larches, also called tamaracks, are deciduous conifers, primarily montane and far-northern denizens, able to grow as large as their evergreen peers, with wood as strong and useful, but offering cheery yellow fall color and an April flush of tender new needles beautiful enough to rank with the prettiest sights in treedom. European larch is grown in our area as an ornamental, being more easily cultivated than our two Washington native species, albeit no better-looking. Its cones are soft, 1.5 inches (3.8 centimeters) long, green flushed with red when immature, brown and opening when mature to release seeds, and turn black and remain on the tree for many years past maturity.\n" +
                        "\n" +
                        "\n" +
                        "The wood of European larch is tough and durable, but also flexible when cut into thin strips, making this species an ideal material for yacht building. The wood used for yachts must be from older trees that had their side branches pruned when young to prevent knots from forming.  European larch is cold tolerant, surviving in temperatures as low as -58° F (-50° C), allowing it to survive at high altitudes up to 7,900 feet (2,400 meters). ");
                tourButtonPress(itemValue);
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
                break;
            case ("Cedar of Lebanon"):
                imageView.setImageResource(R.drawable.cedaroflebanon);
                description.setText("Two trees stand prominently in front of the Art building: the purpleleaf beech and the lofty Cedar of Lebanon. While there are many different kinds of trees whose wood qualities caused them to be commonly named as cedars, the Lebanese is one of just a few true cedars that grow in the Pacific Northwest. It is in the genus Cedrus, Latinized from the ancient Greek kedros, and grows not only in Lebanon but in Turkey and adjacent countries.\n" +
                        "\n" +
                        "\n" +
                        "Deodar and Atlas cedars are its close kindred. These illustrious trees are not easily distinguished because the three species are often similar looking. The Art building tree, however, is a classic libani; it shows perfectly the attributes of the Lebanese: flushing forth early in bright green spring needles in contrast to the dark green needles that have over-wintered; growing with tabular branches, bearing sharp needles longer than those of Atlas cedar, shorter and more densely set than those of the Deodar. The bark is the darkest of all three. This specimen bears only male cones, but if it did make female ones they would be mostly at the top of the tree and larger than those of Atlas cedar. One reason Lebanese cedars are so rare is that they make fewer cones that have lower seed germination rates than the other species, and the seedlings grow slowly. The wood is hard and extremely durable and retains a delightful cedar fragrance for many years. An essential oil extracted from the wood is used in perfumes. ");
                tourButtonPress(itemValue);
                break;
            case ("Hybrid Holly"):
                imageView.setImageResource(R.drawable.hybridholly);
                description.setText("Against Johnson and Mary Gates Halls, three Hybrid Hollies stand out with their dark, evergreen foliage. Unlike regular English hollies, these have larger, less spiny leaves and bigger berries. When young the leaves and stems can have a reddish-purple tinge. Holly is pollinated by bees. The seeds of this species can take up to 18 months to germinate, and they do not tollerate root disturbane well, so they should be planted in their permanent location. ");
                tourButtonPress(itemValue);
                break;
            case ("Atlas Cedar"):
                imageView.setImageResource(R.drawable.atlascedar);
                description.setText("Alone on the edge of lawn next to Suzzallo Library's tower is a landmark evergreen with a massive, pillar-upright trunk, from which arch forth irregular boughs laden with short, sharply tufted needles and avocado-sized cones. It is relatively rare to see such Atlas Cedars, since people usually plant powder blue varieties of the species. This tree derives its name from the Atlas Mountains of Algeria and Morocco where it thrives in the hot, dry climate better than most conifers.\n" +
                        "\n" +
                        "\n" +
                        "Atlas cedar is closely related to Deodar Cedar and Cedar of Lebanon, and some people even consider it to be a subspecies of the Cedar of Lebanon. The form of all three species is comparatively spidery, with remarkably \"reaching\" limbs giving it an open, jagged silhouette. The wood is fragrant and durable and often used for veneers and construction. Essential oils derived from this tree acts as an insect repellent, and the wood has also been used to make insect repelling containers for storing textiles. ");
                tourButtonPress(itemValue);
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
                break;
            case ("Hybrid Planetrees/Sycamore"):
                imageView.setImageResource(R.drawable.hybridplanetreessycamore);
                description.setText("More than 100 hybrid Planetrees, or Sycamores, placidly overhang  Memorial Way. The original 57 were planted in 1920 as memorials for UW faculty and students killed in the first World War. These trees are appropriate for the role, being monumentally large and long lived. The eastern United States sycamore (Platanus occidentalis) crossed with its Old World counterpart (P. orientalis) resulted in this vigorous offspring that have been planted since the late 1600s. The leaves are maple-like, but have rather short stalks. Round seed heads dangle on stout string-like stalks. The fall foliage color is drab yellow-brown, but the exfoliating patchy bark mottles the trunks handsomely, especially in severe winter cold. The most famous of these hybrid clones is the one called London Plane, which grows taller with paler bark and droopier branches than our campus trees. ");
                tourButtonPress(itemValue);
                break;
            case ("Deodar Cedar"):
                imageView.setImageResource(R.drawable.deodarcedar);
                description.setText("Stevens Way is lined by dozens of these graceful evergreens, which excel in Seattle's soil and climate, so far from their Himalayan homeland. Unlike our native cedar these bear sharp 1- to 2-inch (3- to 5-centimeter) needles ranging in color from bright green to powdery blue-green in dense clusters of 20-30 needles per shoot. The erect, fist-sized cones (produced only by female and bisexual trees) shatter to pieces while still on the tree in spring when the seeds ripen. In the spring the male cones release clouds of yellow pollen into the wind.\n" +
                        "\n" +
                        "\n" +
                        "Deodar Cedars unite the relaxed, drooping posture of hemlocks and the massive horizontal sturdiness of certain pines, whether yielding valuable wood in Indian forests or graciously decorating our landscapes. Among Hindus, Deodar Cedars are regarded as divine trees. The name Deodar derives from the Sanskrit term devadāru, meaning “wood of the gods”. The wood is highly prized as building material because of its fine, close grain and rot-resistant properties. If the lower branches are pruned, Deodar Cedars are used as street trees in urban areas because they can tolerate compacted, poor soils.  Compare Deodar with its congeners: Atlas cedar and cedar of Lebanon.");
                tourButtonPress(itemValue);
                break;
            case ("Evergreen Magnolia"):
                imageView.setImageResource(R.drawable.evergreenmagnolia);
                description.setText("An Evergreen Magnolia enjoys the hot, sunny southwest corner of the Atmospheric Sciences Building. One the world's most  famous ornamental trees, this species is native to the southern United States, where it grows large enough and fast enough to be a commercially valuable lumber tree. Large, waxy evergreen leaves make it look like a gigantic houseplant. The leaves have fine red-brown fuzz on the underside.  From May until winter it opens a succession of fragrant white blossoms, as much as a foot (0.3 meters) wide. After the blossoms, fuzzy brown cones appear and ripen in the fall and produce bright red seeds. The name magnolia commemorates Pierre Magnol (1638-1715) a French professor of botany at Montpelier.\n" +
                        "\n" +
                        "\n" +
                        "The roots of the evergreen magnolia can extend up to four times the canopy width. The wood is shock resistant, straight grained and tinted yellow or green.  It is used for furniture, boxes, pallets, venetian blinds, sashes, doors, and veneers.  The waxy coating on the leaves protects this tree from salt spray and air pollution. Extremely cold winters can turn the foliage bronze-colored and blotchy. ");
                tourButtonPress(itemValue);
                break;
            case("Crab Apple Trees"):
                imageView.setImageResource(R.drawable.crabappletrees);
                description.setText("Eighteen different kinds of crabapple trees decorate the area around Drumheller Fountain and the rose garden. First to bloom each spring is the Manchurian (M. baccata var. mandshurica) displaying fragrant snow white blossoms against rich green leaves. Last to leaf-out and flower is Malus yunnanensis var. Veitchii, with creamy white flowers of unpleasant odor. In fall, the showiest, most persistent fruits are the bright red ones of the large cherry crabapple (M. x robusta). Except for the sweet garland crabapple (M. coronaria), all began in Asia--including varieties of American origin whose parents were Asian species. ");
                tourButtonPress(itemValue);
                break;
            default:
                description.setText("default");
                break;
        }
    }
    private void tourButtonPress(final String itemValue) {
        Button b = (Button)findViewById(R.id.tourbutton);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                MainActivity.treeList.add(itemValue);
                Toast.makeText(TreeInformation.this, "Added " + itemValue + " to custom tree tour", Toast.LENGTH_SHORT).show();
            }

        });
    }

}

