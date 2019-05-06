package com.example.saadiqbal.ghalibbookindividual;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.saadiqbal.ghalibbookindividual.BookTitle;
import com.example.saadiqbal.ghalibbookindividual.Item;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ReaderBook extends AppCompatActivity implements View.OnClickListener {

    TextView bookchapte,heading,textt;
    ImageView back,nextchap,prevchap,home;
    Bundle b = new Bundle();
    String filename,headingchapter;
    private int size = 20;
    ImageView zoomin,zoomout;
    ArrayList<Item> itemsList;
    String indexpagecall,boook;
    EditText editText;
    int temp;
    int currentPosition ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader_book);
        heading = (TextView) findViewById(R.id.textView);
        bookchapte = (TextView) findViewById(R.id.bookcahper);
        back = (ImageView)findViewById(R.id.backindex);
        textt = (TextView) findViewById(R.id.textViewheading);
        zoomin = (ImageView)findViewById(R.id.zoomin) ;
        zoomout = (ImageView)findViewById(R.id.zoomout) ;
        zoomout.setOnClickListener(this);
        zoomin.setOnClickListener(this);
        back.setOnClickListener(this);
        nextchap = (ImageView)findViewById(R.id.forwardtoforward);
        prevchap = (ImageView)findViewById(R.id.backtoback);
        home = (ImageView)findViewById(R.id.homescreen);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/mnw.ttf");
        bookchapte.setTypeface(typeface);
        textt.setTypeface(typeface);
        itemsList=new ArrayList<>();



        b = getIntent().getExtras();
        filename = b.getString("file");
        indexpagecall = b.getString("class");
        headingchapter = b.getString("headings");
        currentPosition = b.getInt("itemPosition");
        boook = b.getString("bookname");
        heading.setText(headingchapter);
        //////////////////////////////////////
        if(boook.equals("Dewan-e-Ghalib")) {
            itemsList.add(new Item("اس کتاب کے بارے میں", "GN-001.txt", false));
            itemsList.add(new Item("غالبؔ کی ردیف", "GN-002.txt", false));
            itemsList.add(new Item("حروفِ تہجی", "GN-003.txt", false));
            itemsList.add(new Item("اُردو حروف تہجی", "GN-004.txt", false));
            itemsList.add(new Item("حروف تہجی کا چارٹ", "GN-005.txt", false));
            itemsList.add(new Item("کلمات ِ تشکر", "GN-006.txt", false));
            itemsList.add(new Item("غزلیات", "1", true));
            itemsList.add(new Item("ردیف الف", "1", true));
            itemsList.add(new Item("نقش، فریادی ہے کس کی شوخیِ تحریر کا", "GN-007.txt", false));
            itemsList.add(new Item("جُز قیس اور کوئی نہ آیا برُوئے کار", "GN-008.txt", false));
            itemsList.add(new Item("کہتے ہو نہ دیں گے ہم، دل اگر پڑا پایا", "GN-009.txt", false));
            itemsList.add(new Item("دل مرا سوزِ نہاں سے بے مُحابا جل گیا", "GN-0010.txt", false));
            itemsList.add(new Item("شوق، ہر رنگ رقیبِ سرو ساماں نکلا", "GN-0011.txt", false));
            itemsList.add(new Item("دھمکی میں مرگیا، جو نہ بابِ َنبرَد تھا", "GN-0012.txt", false));
            itemsList.add(new Item("شمارِ سُبَحہ، مرغوب بتِ مشکل پسند آیا", "GN-0013.txt", false));
            itemsList.add(new Item("دہر میں، نقشِ وفا وجہِ تسلّی نہ ہوا", "GN-0014.txt", false));
            itemsList.add(new Item("ستائش گر ہے زاہد، اس قدر جس باغِ رضواں کا", "GN-0015.txt", false));
            itemsList.add(new Item("محرم نہیں ہے تو ہی، نواہائے راز کا", "GN-0016.txt", false));
            itemsList.add(new Item("رکھیو یارب! یہ درِ گنجینۂ گوہر کھُلا", "GN-0017.txt", false));
            itemsList.add(new Item("شب، کہ برقِ سوزِ دل سے زَہرۂ ابر آب تھا", "GN-0018.txt", false));
            itemsList.add(new Item("نالۂ دل میں شب اندازِ اثر نایاب تھا", "GN-0019.txt", false));
            itemsList.add(new Item("ایک ایک قطرے کا مجھے دینا پڑا حساب", "GN-0020.txt", false));
            itemsList.add(new Item("بس کہ دشوار ہے ہر کام کا آساں ہونا", "GN-0021.txt", false));
            itemsList.add(new Item("ب، خُمارِ شوقِ ساقی رُستخیز اندازہ تھا", "GN-0022.txt", false));
            itemsList.add(new Item("دوست، غم خواری میں میری، سعی فرمائیں گے کیا", "GN-0023.txt", false));
            itemsList.add(new Item("یہ نہ تھی ہماری قسمت کہ وصالِ یار ہوتا", "GN-0024.txt", false));
            itemsList.add(new Item("ہوس کو ہے نشاطِ کار کیا کیا!", "GN-0025.txt", false));
            itemsList.add(new Item("درخورِ قہر و غضب، جب کوئی ہم سا نہ ہوا", "GN-0026.txt", false));
            itemsList.add(new Item("پئے نذرِ کرم، تحفہ ہے شرمِ نارسائی کا", "GN-0027.txt", false));
            itemsList.add(new Item("گر نہ اندوہِ شبِ فرقت بیاں ہوجائے گا", "GN-0028.txt", false));
            itemsList.add(new Item("درد منت کشِ دوا نہ ہوا", "GN-0029.txt", false));
            itemsList.add(new Item("گلہ ہے شوق کو، دل میں بھی تنگیِ جا کا", "GN-0030.txt", false));
            itemsList.add(new Item("جب، بہ تقریبِ سفر یار نے محمل باندھا", "GN-0031.txt", false));
            itemsList.add(new Item("میں، اور بزم مَے سے یوں تشنہ کام آئوں!", "GN-0032.txt", false));
            itemsList.add(new Item("گھر ہمارا، جو نہ روتے بھی تو ویراں ہوتا", "GN-0033.txt", false));
            itemsList.add(new Item("نہ تھا کچھ، تو خُدا تھا، کچھ نہ ہوتا، تو خُدا ہوتا", "GN-0034.txt", false));
            itemsList.add(new Item("یک ذرۂ زمیں نہیں بیکار باغ کا", "GN-0035.txt", false));
            itemsList.add(new Item("وہ مری چینِ جبیں سے، غمِ پنہاں سمجھا", "GN-0036.txt", false));
            itemsList.add(new Item("پھر، مجھے دیدۂ تر یاد آیا", "GN-0037.txt", false));
            itemsList.add(new Item("ہوئی تاخیر، تو کچھ باعثِ تاخیر بھی تھا", "GN-0038.txt", false));
            itemsList.add(new Item("تو دوست کسی کا بھی، ستم گر! نہ ہوا تھا", "GN-0039.txt", false));
            itemsList.add(new Item("شب کہ وہ مجلس فروزِ خلوتِ ناموس تھا", "GN-0040.txt", false));
            itemsList.add(new Item("عرضِ نیازِ عشق کے قابل نہیں رہا", "GN-0041.txt", false));
            itemsList.add(new Item("رشک کہتا ہے کہ، اُس کا غیر سے اخلاص حیف!", "GN-0042.txt", false));
            itemsList.add(new Item("ذکر اُس پری وش کا، اور پھر بیاں اپنا", "GN-0043.txt", false));
            itemsList.add(new Item("غافل ، بہ وہمِ ناز خود آرا ہے، ورنہ یاں", "GN-0044.txt", false));
            itemsList.add(new Item("جَور سے باز آئے، پر باز آئیں کیا!", "GN-0045.txt", false));
            itemsList.add(new Item("لطافت بے کثافت، جلوہ پیدا کر نہیںسکتی", "GN-0046.txt", false));
            itemsList.add(new Item("عشرتِ قطرہ ہے، دریا میں فنا ہوجانا", "GN-0047.txt", false));
            itemsList.add(new Item("ردیف  ب", "1", true));
            itemsList.add(new Item("پھر ہوا وقت کہ ہوبال کُشا موجِ شراب", "GN-0048.txt", false));
            itemsList.add(new Item("ردیف  ’’پ ‘‘", "GN-0049.txt", false));
            itemsList.add(new Item("ردیف  ت", "1", true));
            itemsList.add(new Item(" افسوس، کہ دیداں کا کیا رزق فلک نے", "GN-0050.txt", false));
            itemsList.add(new Item("رہا گر کوئی تا قیامت، سلامت", "GN-0051.txt", false));
            itemsList.add(new Item("آمدِ خط سے ہوا ہے سرد جو بازارِ دوست", "GN-0052.txt", false));
            itemsList.add(new Item("ردیف  ’’ٹ ‘‘", "GN-0053.txt", false));
            itemsList.add(new Item("ردیف  ’’ث ‘‘", "GN-0054.txt", false));
            itemsList.add(new Item("ردیف  ج", "1", true));
            itemsList.add(new Item("گلشن میں بندوبست بہ رنگِ دگر ہے آج", "GN-0055.txt", false));
            itemsList.add(new Item("ردیف چ", "1", true));
            itemsList.add(new Item("نفس نہ انجمنِ آرزو سے باہر کھینچ", "GN-0056.txt", false));
            itemsList.add(new Item("ردیف  ’’ح ‘‘", "GN-0057.txt", false));
            itemsList.add(new Item("ردیف خ", "GN-0058.txt", false));
            itemsList.add(new Item("ردیف  د", "1", true));
            itemsList.add(new Item("حُسن، غمزے کی کشاکش سے چُھٹا میرے بعد", "GN-0059.txt", false));
            itemsList.add(new Item("ردیف  ر", "1", true));
            itemsList.add(new Item("حُسن، غمزے کی کشاکش سے چُھٹا میرے بعد", "GN-0060.txt", false));
            itemsList.add(new Item("گھر، جب بنالیا ترے در پر، کہے بغیر", "GN-0061.txt", false));
            itemsList.add(new Item("کیوں جل گیا نہ، تابِ رُخِ یار دیکھ کر", "GN-0062.txt", false));
            itemsList.add(new Item("لرزتا ہے مرا دل، زحمتِ مہرِ درخشاں پر", "GN-0063.txt", false));
            itemsList.add(new Item("ہے بس کہ ہر اک اُن کے اشارے میںنشاں اور", "GN-0064.txt", false));
            itemsList.add(new Item("صفائے حیرتِ آئینہ ہے، سامانِ زنگ آخر", "GN-0065.txt", false));
            itemsList.add(new Item("جنوں کی دستگیری کِس سے ہو، گر ہو نہ عریانی", "GN-0066.txt", false));
            itemsList.add(new Item("لازم تھا کہ دیکھو مرا رستہ کوئی دن اور", "GN-0067.txt", false));
            itemsList.add(new Item("ردیف  ’’ڑ ‘‘ ", "GN-0068.txt", false));
            itemsList.add(new Item("فارغ مجھے نہ جان، کہ مانندِ صبح و مہر", "GN-0069.txt", false));
            itemsList.add(new Item("حریفِ مطلبِ مشکل نہیں فسونِ نیاز", "GN-0070.txt", false));
            itemsList.add(new Item("وسعت سعیِ کرم دیکھ کہ سرتا سرِ خاک", "GN-0071.txt", false));
            itemsList.add(new Item("کیوں کر اُس بُت سے رکھوں جان عزیز", "GN-0072.txt", false));
            itemsList.add(new Item("نہ گلِ نغمہ ہوں، نہ پردۂ ساز", "GN-0073.txt", false));
            itemsList.add(new Item("ردیف  ’’ژ ‘‘ ", "GN-0074.txt", false));
            itemsList.add(new Item("ردیف  س", "1", true));
            itemsList.add(new Item("مژدہ، اے ذوقِ اسیری! کہ نظر آتا ہے", "GN-0075.txt", false));
            itemsList.add(new Item("ردیف  ش", "1", true));
            itemsList.add(new Item("نہ لیوے گر، خسِ جوہر طراوت سبزۂ خط سے", "GN-0076.txt", false));
            itemsList.add(new Item("ردیف  ’’ ص   ‘‘", "GN-0077.txt", false));
            itemsList.add(new Item("ردیف  ’’ ض   ‘‘", "GN-0078.txt", false));
            itemsList.add(new Item("ردیف  ’’ ط   ‘‘", "GN-0079.txt", false));
            itemsList.add(new Item("ردیف  ’’ ظ   ‘‘", "GN-0080.txt", false));
            itemsList.add(new Item("ردیف  ع", "1", true));
            itemsList.add(new Item("رُخِ نگار سے ہے سوزِ جاودانیِ شمع", "GN-0081.txt", false));
            itemsList.add(new Item("ردیف  ’’ غ   ‘‘", "GN-0082.txt", false));
            itemsList.add(new Item("ردیف  ف", "1", true));
            itemsList.add(new Item("بیمِ رقیب سے نہیں کرتے وداعِ ہوش", "GN-0083.txt", false));
            itemsList.add(new Item("ردیف  ’’ ق   ‘‘", "GN-0084.txt", false));
            itemsList.add(new Item("ردیف  ک", "1", true));
            itemsList.add(new Item("زخم پر چھڑکیں کہاں، طفلانِ بے پروا نمک", "GN-0085.txt", false));
            itemsList.add(new Item("آہ کو چاہیے ایک عمر اثر ہونے تک", "GN-0086.txt", false));
            itemsList.add(new Item("ردیف  گ", "1", true));
            itemsList.add(new Item("گر تجھ کو ہے یقینِ اجابت، دُعا نہ مانگ", "GN-0087.txt", false));
            itemsList.add(new Item("ردیف  ل", "1", true));
            itemsList.add(new Item("ہے کس قدر ہلاکِ فریبِ وفائے گُل", "GN-0088.txt", false));
            itemsList.add(new Item("ردیف  م", "1", true));
            itemsList.add(new Item("غم نہیں ہوتا ہے آزادوں کو بیش از یک نفس", "GN-0089.txt", false));
            itemsList.add(new Item("ردیف  ن", "1", true));
            itemsList.add(new Item("وہ فراق اور وہ وصال کہاں", "GN-0090.txt", false));
            itemsList.add(new Item("کی وفا ہم سے، تو غیر اُس کو جفا کہتے ہیں", "GN-0091.txt", false));
            itemsList.add(new Item("آبرو کیا خاک اُس گل کی کہ گلشن میں نہیں", "GN-0092.txt", false));
            itemsList.add(new Item("عُہدے سے مدحِ ناز کے باہر نہ آسکا", "GN-0093.txt", false));
            itemsList.add(new Item("مہرباں ہو کے بُلالو مجھے، چاہو جس وقت", "GN-0094.txt", false));
            itemsList.add(new Item("ہم سے کھُل جائو بہ وقتِ مَے پرستی ایک دن", "GN-0095.txt", false));
            itemsList.add(new Item("ہم پر جفا سے، ترکِ وفا کا گماں نہیں", "GN-0096.txt", false));
            itemsList.add(new Item("مانعِ دشت نوردی، کوئی تدبیر نہیں", "GN-0097.txt", false));
            itemsList.add(new Item("عشق تاثیر سے نومید نہیں", "GN-0098.txt", false));
            itemsList.add(new Item("جہاں تیرا نقشِ قدم دیکھتے ہیں", "GN-0099.txt", false));
            itemsList.add(new Item("ملتی ہے خوئے یار سے نار، التہاب میں", "GN-00100.txt", false));
            itemsList.add(new Item("کل کے لیے، کر آج نہ خِسَّت شراب میں", "GN-00101.txt", false));
            itemsList.add(new Item("حیراں ہوں، دل کو روئوںکہ پیٹوں جگر کو میں", "GN-00102.txt", false));
            itemsList.add(new Item("ذکر میرا، بہ بدی بھی اُسے منظور نہیں", "GN-00103.txt", false));
            itemsList.add(new Item("نالہ جُز حُسنِ طلب، اے سِتم ایجاد! نہیں", "GN-00104.txt", false));
            itemsList.add(new Item("یہ ہم، جو ہجر میں، دیوار و در کو دیکھتے ہیں", "GN-00105.txt", false));
            itemsList.add(new Item("نہیں کہ مجھ کو قیامت کا اعتقاد نہیں", "GN-00106.txt", false));
            itemsList.add(new Item("تیرے توسن کو صبا باندھتے ہیں", "GN-00107.txt", false));
            itemsList.add(new Item("دائم پڑا ہوا ترے دَر پر نہیں ہوں میں", "GN-00108.txt", false));
            itemsList.add(new Item("سب کہاں، کچھ لالہ و گُل میں نمایاں ہوگئیں", "GN-00109.txt", false));
            itemsList.add(new Item("دیوانگی سے، دوش پہ زُنّار بھی نہیں", "GN-00110.txt", false));
            itemsList.add(new Item("نہیں ہے زخم کوئی، بخیے کے درخُور مرے تن میں", "GN-00111.txt", false));
            itemsList.add(new Item("مزے جہان کے اپنی نظر میں خاک نہیں", "GN-00112.txt", false));
            itemsList.add(new Item("دل ہی تو ہے، نہ سنگ و خشت، درد سے بھر نہ آئے کیوں!", "GN-00113.txt", false));
            itemsList.add(new Item("غنچۂ ناشگفتہ کو دُور سے مت دکھا کہ’’یوں‘‘", "GN-00114.txt", false));
            itemsList.add(new Item("حسد سے، دل اگر افسردہ ہے، گرمِ تماشا ہو", "GN-00115.txt", false));
            itemsList.add(new Item("کعبے میں جارہا، تو نہ دو طعنہ، کیا کہِیں", "GN-00116.txt", false));
            itemsList.add(new Item("وارستہ اِس سے ہیں کہ محبت ہی کیوں نہ ہو", "GN-00117.txt", false));
            itemsList.add(new Item("قفس میں ہوں، گر اچھا بھی نہ جانیں میرے شیون کو", "GN-00118.txt", false));
            itemsList.add(new Item("دھوتا ہوں جب میں پینے کو اُس سیم تن کے پانو", "GN-00119.txt", false));
            itemsList.add(new Item("واں پہنچ کر جو غش آتا پیہم ہے ہم کو", "GN-00120.txt", false));
            itemsList.add(new Item("قطعہ", "1", true));
            itemsList.add(new Item("لکھنؤ آنے کا باعث نہیں کھلتا، یعنی", "GN-00121.txt", false));
            itemsList.add(new Item("تم جانو، تم کو غیر سے جو رسم و راہ ہو", "GN-00122.txt", false));
            itemsList.add(new Item("گئی وہ بات کہ، ہو گفتگو، تو کیوں کر ہو!", "GN-00123.txt", false));
            itemsList.add(new Item("کسی کو دے کے دل کوئی، نوا سنجِ فغاں کیوں ہو", "GN-00124.txt", false));
            itemsList.add(new Item("رہیے اب ایسی جگہ چل کر، جہاں کوئی نہ ہو", "GN-00125.txt", false));
            itemsList.add(new Item("از مہر تا بہ زرہ دل و دل ہے آئینہ", "GN-00126.txt", false));
            itemsList.add(new Item("صد جلوہ رُو بہ رُو ہے، جو مژگاں اُٹھائیے", "GN-00127.txt", false));
            itemsList.add(new Item("مسجد کے زیرِ سایہ خرابات چاہیے", "GN-00128.txt", false));
            itemsList.add(new Item("بساطِ عجز میں تھا ایک دل، یک قطرہ خوں وہ بھی", "GN-00129.txt", false));
            itemsList.add(new Item("ہے بزمِ بتاں میں سخن آزردہ لبوں سے", "GN-00130.txt", false));
            itemsList.add(new Item("غمِ دُنیا سے گرپائی بھی فرصت سر اُٹھانے کی", "GN-00131.txt", false));
            itemsList.add(new Item("کیا تنگ ہم سِتم زدگاں کا جہان ہے", "GN-00132.txt", false));
            itemsList.add(new Item("درد سے میرے، ہے تجھ کو بے قراری، ہائے ہائے!", "GN-00133.txt", false));
            itemsList.add(new Item("سرگشتگی میں، عالمِ ہستی سے یاس ہے", "GN-00134.txt", false));
            itemsList.add(new Item("گرخامُشی سے فائدہ اِخفاے حال ہے", "GN-00135.txt", false));
            itemsList.add(new Item("ایک جا حرفِ وفا لکھا تھا، وہ بھی مٹ گیا", "GN-00136.txt", false));
            itemsList.add(new Item("مری ہستی، فضائے حیرت آبادِ تمنّا ہے", "GN-00137.txt", false));
            itemsList.add(new Item("رحم کر، ظالم! کہ کیا بودِ چراغ، کُشتہ ہے", "GN-00138.txt", false));
            itemsList.add(new Item("عشق مجھ کو نہیں، وحشت ہی سہی", "GN-00139.txt", false));
            itemsList.add(new Item("ہے آرمیدگی میں نکوہش بجا مجھے", "GN-00140.txt", false));
            itemsList.add(new Item("اُس بزم میں مجھے، نہیں بنتی حیا کیے", "GN-00141.txt", false));
            itemsList.add(new Item("رفتارِ عُمر، قطعِ رہِ اِضطراب ہے", "GN-00142.txt", false));
            itemsList.add(new Item("دیکھنا قسمت کہ آپ اپنے پہ رشک آجائے ہے", "GN-00143.txt", false));
            itemsList.add(new Item("گرمِ فریاد رکھا، شکلِ نہالی نے مجھے", "GN-00144.txt", false));
            itemsList.add(new Item("کار گاہِ ہستی میں لالہ، داغ ساماں ہے", "GN-00145.txt", false));
            itemsList.add(new Item("سادگی پر اُس کی، مرجانے کی حسرت دل میں ہے", "GN-00146.txt", false));
            itemsList.add(new Item("دل سے تری نگاہ، جگر تک اُتر گئی", "GN-00147.txt", false));
            itemsList.add(new Item("تسکیں کو ہم نہ روئیں، جو ذوقِ نظر ملے", "GN-00148.txt", false));
            itemsList.add(new Item("کوئی دن، گر زندگانی اور ہے", "GN-00149.txt", false));
            itemsList.add(new Item("کوئی اُمّید بَر نہیں آتی", "GN-00150.txt", false));
            itemsList.add(new Item("دلِ ناداں! تجھے ہُوا کیا ہے؟", "GN-00151.txt", false));
            itemsList.add(new Item("کہتے تو ہو تم سب کہ بُتِ غالیہ مُو آئے", "GN-00152.txt", false));
            itemsList.add(new Item("پھر کچھ اِک دل کو بیقراری ہے", "GN-00153.txt", false));
            itemsList.add(new Item("نکوہش ہے سزا، فریادیِ بیدادِ دلبر کی", "GN-00154.txt", false));
            itemsList.add(new Item("بے اعتدالیوں سے سُبک سب میں ہم ہوئے", "GN-00155.txt", false));
            itemsList.add(new Item("جو نہ نقدِ داغِ دل کی کرے شعلہ پاسبانی", "GN-00156.txt", false));
            itemsList.add(new Item("ظُلمت کدے میں میرے شبِ غم کا جوش ہے", "GN-00157.txt", false));
            itemsList.add(new Item("نہ ہوئی گر مرے مرنے سے تسلی نہ سہی", "GN-00158.txt", false));
            itemsList.add(new Item("عجب نشاط سے جلّاد کے چلے ہیں ہم آگے", "GN-00159.txt", false));
            itemsList.add(new Item("آکہ مری جان کو قرار نہیں ہے", "GN-00160.txt", false));
            itemsList.add(new Item("ہجومِ غم سے، یاں تک سرنگونی مجھ کو حاصل ہے", "GN-00161.txt", false));
            itemsList.add(new Item("پا بہ دامن ہورہا ہوں بس کہ میں صحرا نورد", "GN-00162.txt", false));
            itemsList.add(new Item("جس بزم میں تو ناز سے گُفتار میں آوے", "GN-00163.txt", false));
            itemsList.add(new Item("حُسنِ مہ، گرچہ بہ ہنگامِ کمال، اچھا ہے", "GN-00164.txt", false));
            itemsList.add(new Item("شکوے کے نام سے بے مہر خفا ہوتا ہے", "GN-00165.txt", false));
            itemsList.add(new Item("ہر ایک بات پہ کہتے ہو تم کہ ’’ تُو کیا ہے؟‘‘", "GN-00166.txt", false));
            itemsList.add(new Item("میں اُنہیں چھیڑوں، اور کچھ نہ کہیں", "GN-00167.txt", false));
            itemsList.add(new Item("غیر لیں محفل میں، بوسے جام کے", "GN-00168.txt", false));
            itemsList.add(new Item("پھر اس انداز سے بہار آئی", "GN-00169.txt", false));
            itemsList.add(new Item("کب وہ سنتا ہے کہانی میری", "GN-00170.txt", false));
            itemsList.add(new Item("نقشِ نازِ بُتِ طنّاز، بہ آغوشِ رقیب", "GN-00171.txt", false));
            itemsList.add(new Item("گلشن کو تری صحبت از بس کہ خوش آئی ہے", "GN-00172.txt", false));
            itemsList.add(new Item("جس زخم کی ہوسکتی ہو تدبیر رفو کی", "GN-00173.txt", false));
            itemsList.add(new Item("سیماب، پُشت گرمیِ آئینہ دے ہے، ہم", "GN-00174.txt", false));
            itemsList.add(new Item("چاہیے اچھوں کو، جتنا چاہیے", "GN-00175.txt", false));
            itemsList.add(new Item("ہر قدم دُوریِ منزل ہے نمایاں مجھ سے", "GN-00176.txt", false));
            itemsList.add(new Item("نکتہ چیں ہے، غمِ دل اُس کو سنائے نہ بنے", "GN-00177.txt", false));
            itemsList.add(new Item("چاک کی خواہش، اگر وحشت بہ عُریانی کرے", "GN-00178.txt", false));
            itemsList.add(new Item("وہ آکے، خواب میں، تسکینِ اضطراب تو دے", "GN-00179.txt", false));
            itemsList.add(new Item("تپش سے میری، وقفِ کشمکش، ہرتارِ بستر ہے", "GN-00180.txt", false));
            itemsList.add(new Item("فریاد کی کوئی لَے نہیں ہے", "GN-00181.txt", false));
            itemsList.add(new Item("ہم رشک کو اپنے بھی، گوارا نہیں کرتے", "GN-00182.txt", false));
            itemsList.add(new Item("کرے ہے بادہ، ترے لب سے، کسبِ رنگِ فروغ", "GN-00183.txt", false));
            itemsList.add(new Item("کیوں نہ ہو چشمِ بُتاں محوِ تغافل، کیوں نہ ہو؟", "GN-00184.txt", false));
            itemsList.add(new Item("دیا ہے دل اگر اُس کو، بشر ہے، کیا کہیے", "GN-00185.txt", false));
            itemsList.add(new Item("دیکھ کر در پردہ گرمِ دامن افشانی مجھے", "GN-00186.txt", false));
            itemsList.add(new Item("یاد ہے شادی میں بھی، ہنگامۂ یارب مجھے", "GN-00187.txt", false));
            itemsList.add(new Item("حضورِ شاہ میں، اہلِ سخن کی آزمائش ہے", "GN-00188.txt", false));
            itemsList.add(new Item("کبھی نیکی بھی اُس کے جی میں گر آجائے ہے، مجھ سے", "GN-00189.txt", false));
            itemsList.add(new Item("زبسکہ مشقِ تماشا، جُنوں علامت ہے", "GN-00190.txt", false));
            itemsList.add(new Item("لاغِر اتنا ہوں کہ گر تو بزم میں جا، دے مجھے", "GN-00191.txt", false));
            itemsList.add(new Item("بازیچۂ اطفال ہے، دُنیا، مرے آگے", "GN-00192.txt", false));
            itemsList.add(new Item("کہوں جو حال، تو کہتے ہو، ’’مُدّعا کہیے‘‘", "GN-00193.txt", false));
            itemsList.add(new Item("رونے سے، اور عشق میں بیباک ہوگئے", "GN-00194.txt", false));
            itemsList.add(new Item("عرضِ نازِ شوخیِ دنداں، برائے خندہ ہے", "GN-00195.txt", false));
            itemsList.add(new Item("جب تک دہانِ زخم نہ پیدا کرے کوئی", "GN-00196.txt", false));
            itemsList.add(new Item("ابنِ مریم ہوا کرے کوئی", "GN-00197.txt", false));
            itemsList.add(new Item("بہت سہی غمِ گیتی، شراب کم کیا ہے!", "GN-00198.txt", false));
            itemsList.add(new Item("باغ، پاکر خَفَقانی، یہ ڈراتا ہے مجھے", "GN-00199.txt", false));
            itemsList.add(new Item("روندی ہوئی ہے کوکبۂ شہر یار کی", "GN-00200.txt", false));
            itemsList.add(new Item("ہزاروں خواہشیں ایسی کہ، ہر خواہش پہ دَم نکلے", "GN-00201.txt", false));
            itemsList.add(new Item("کوہ کے ہوں بارِ خاطر، گر صدا ہوجائیے", "GN-00202.txt", false));
            itemsList.add(new Item("مستی بہ ذوقِ غفلتِ ساقی ہلاک ہے", "GN-00203.txt", false));
            itemsList.add(new Item("ہجومِ نالہ، حیرتِ عاجزِ عرضِ یک افغاں ہے", "GN-00204.txt", false));
            itemsList.add(new Item("خموشیوں میں، تماشا ادا نکلتی ہے", "GN-00205.txt", false));
            itemsList.add(new Item("جس جا نسیم شانہ کشِ زلفِ یار ہے", "GN-00206.txt", false));
            itemsList.add(new Item("آئینہ کیوں نہ دوں کہ تماشا کہیں جسے", "GN-00207.txt", false));
            itemsList.add(new Item("شبنم بہ گُلِ لالہ، نہ خالی زادا ہے", "GN-00208.txt", false));
            itemsList.add(new Item("منظور تھی یہ شکل، تجلّی کو نور کی", "GN-00209.txt", false));
            itemsList.add(new Item("غم کھانے میں بودا دلِ ناکام بہت ہے", "GN-00210.txt", false));
            itemsList.add(new Item("مدّت ہوئی ہے یار کو مہماں کیے ہوئے", "GN-00211.txt", false));
            itemsList.add(new Item("نویدِ امن ہے، بیدادِ دوست جاں کے لیے", "GN-00212.txt", false));
            itemsList.add(new Item("سازِ یک ذرّہ، نہیں فیضِ چمن سے بیکار", "GN-00213.txt", false));
            itemsList.add(new Item("فیض سے تیرے ہے، اے شمعِ شبستانِ بہار!", "GN-00214.txt", false));
            itemsList.add(new Item("دہر، جُز جلوۂ یکتائی معشوق نہیں", "GN-00215.txt", false));
            itemsList.add(new Item("ہاں، مہِ نو! سنیں ہم اُس کا نام", "GN-00216.txt", false));
            itemsList.add(new Item("جب کہ چودہ منازلِ فلکی", "GN-00217.txt", false));
            itemsList.add(new Item("زہرِ غم کرچکا تھا میرا کام", "GN-00218.txt", false));
            itemsList.add(new Item("مرحبا! موشگافیِ ناوک!", "GN-00219.txt", false));
            itemsList.add(new Item("رعد کا کررہی ہے کیا دم بند", "GN-00220.txt", false));
            itemsList.add(new Item("فنِّ صورت گری میں تیرا گُرز", "GN-00221.txt", false));
            itemsList.add(new Item("قصیدہ چہارم", "1", true));
            itemsList.add(new Item("صُبح دم دروازۂ خاور کھُلا", "GN-00222.txt", false));
            itemsList.add(new Item("قطعہ", "1", true));
            itemsList.add(new Item("توسنِ شہ میں وہ خوبی ہے کہ جب", "GN-00223.txt", false));
            itemsList.add(new Item("غزل", "1", true));
            itemsList.add(new Item("کُنج میں بیٹھا رہوں یُوں پر کھُلا", "GN-00224.txt", false));
            itemsList.add(new Item("ہاں دلِ دردمندِ زمزمہ ساز", "GN-00225.txt", false));
            itemsList.add(new Item("جان دینے میں اس کو یکتا جان", "GN-00226.txt", false));
            itemsList.add(new Item("خوش ہو اے بخت! کہ ہے آج ترے سر سہرا", "GN-00227.txt", false));
            itemsList.add(new Item("منظور ہے گزارشِ احوالِ واقعی", "GN-00228.txt", false));
            itemsList.add(new Item("اے شہنشاہِ فلک منظرِ بے مثل و نظیر!", "GN-00229.txt", false));
            itemsList.add(new Item("نہ پوچھ اِس کی حقیقت، حضورِ والا نے", "GN-00230.txt", false));
            itemsList.add(new Item("کلکتّے کا جو ذکر کیا تونے ہم نشیں!", "GN-00231.txt", false));
            itemsList.add(new Item("ہے جو صاحب کے کفِ دست پہ یہ چکنی ڈلی", "GN-00232.txt", false));
            itemsList.add(new Item("نصرتُ الملک بہادر! مجھے بتلا کہ مجھے", "GN-00233.txt", false));
            itemsList.add(new Item("ہے چار شنبہ آخرِ ماہِ صَفَر، چلو", "GN-00234.txt", false));
            itemsList.add(new Item("غیروں سے وفا داری", "GN-00235.txt", false));
            itemsList.add(new Item("اے شاہِ جہاں گیر، جہاں بخشِ جہاندار!", "GN-00236.txt", false));
            itemsList.add(new Item("افطارِ صوم کی کچھ، اگر دستگاہ ہو", "GN-00237.txt", false));
            itemsList.add(new Item("اے شہنشاہِ آسماں اورنگ!", "GN-00238.txt", false));
            itemsList.add(new Item("گو ایک بادشاہ کے سب خانہ زاد ہیں", "GN-00239.txt", false));
            itemsList.add(new Item("سہل تھا مُسہل ولے یہ سخت مشکل آپڑی", "GN-00240.txt", false));
            itemsList.add(new Item("سیہ گلیم ہوں، لازم ہے میرا نام نہ لے", "GN-00241.txt", false));
            itemsList.add(new Item("خجستہ انجمنِ طُوئے میرزا جعفر", "GN-00242.txt", false));
            itemsList.add(new Item("بعد از اِتمامِ بزمِ عیدِ اطفال", "GN-00243.txt", false));
            itemsList.add(new Item("شب زلف و رُخِ عَرَق فِشاں کا غم تھا", "GN-00244.txt", false));
            itemsList.add(new Item("آتش بازی ہے جیسے شغلِ اَطفال", "GN-00245.txt", false));
            itemsList.add(new Item("دل تھا کہ جو جانِ دردِ تمہید سہی", "GN-00246.txt", false));
            itemsList.add(new Item("ہے خلقِ حسد قماش لڑنے کے لیے", "GN-00247.txt", false));
            itemsList.add(new Item("دل سخت نژند ہوگیا ہے گویا", "GN-00248.txt", false));
            itemsList.add(new Item("دُکھ، جی کے پسند ہوگیا ہے، غالبؔ!", "GN-00249.txt", false));
            itemsList.add(new Item("مشکل ہے زبس کلام میرا، اے دل!", "GN-00250.txt", false));
            itemsList.add(new Item("بھیجی ہے جو مجھ کو، شاہِ جم جاہ نے، دال", "GN-00251.txt", false));
            itemsList.add(new Item("ہیں شہ میں صفاتِ ذوالجلالی باہم", "GN-00252.txt", false));
            itemsList.add(new Item("حق، شہ کی بقا سے، خلق کو شاد کرے", "GN-00253.txt", false));
            itemsList.add(new Item("اِس رشتے میں لاکھ تار ہوں، بلکہ سوا", "GN-00254.txt", false));
            itemsList.add(new Item("کہتے ہیں کہ’’ اب وہ مردم آزار نہیں‘‘", "GN-00255.txt", false));
            itemsList.add(new Item("ہم گرچہ بنے سلام کرنے والے", "GN-00256.txt", false));
            itemsList.add(new Item("سامانِ خور و خواب کہاں سے لائوں!", "GN-00257.txt", false));
            itemsList.add(new Item("اِن سیم کے بیجوں کو کوئی کیا جانے!", "GN-00258.txt", false));
            itemsList.add(new Item("ضمیمہ اول", "1", true));
            itemsList.add(new Item("یہاں وہ غزلیں، قصیدے، قطعات اوراشعار درج ہیں جو بیشتردیوانِ میں شامل نہیں ", "1", true));
            itemsList.add(new Item("دیکھنے میں ہیں گرچہ دو، پر ہیں یہ دونوں یار ایک", "GN-00260.txt", false));
            itemsList.add(new Item("ممکن نہیں، کہ بھول کے بھی آرمیدہ ہوں", "GN-00261.txt", false));
            itemsList.add(new Item("اپنا احوالِ دل زار، کہوں یا نہ کہوں", "GN-00262.txt", false));
            itemsList.add(new Item("شبِ وصال میں، مُونس گیا ہے بن تکیہ", "GN-00263.txt", false));
            itemsList.add(new Item("میں ہوں مشتاقِ جفا، مجھ پہ جفا اور سہی", "GN-00264.txt", false));
            itemsList.add(new Item("آپ نے ’’مسنی الضرّ‘‘ کہا ہے تو سہی", "GN-00265.txt", false));
            itemsList.add(new Item("لطفِ نظارۂ قاتل، دمِ بسمل آئے", "GN-00266.txt", false));
            itemsList.add(new Item("بھولے سے کاش وہ اِدھر آئیں تو شام ہو", "GN-00267.txt", false));
            itemsList.add(new Item("بتائیں ہم تمہارے عارض و کاکل کو کیا سمجھے", "GN-00268.txt", false));
            itemsList.add(new Item("نسیمِ صبح جب کنعان  میں بُوے پیرہن لائی", "GN-00269.txt", false));
            itemsList.add(new Item("وفا جفا کی طلب گار ہوتی آئی ہے", "GN-00270.txt", false));
            itemsList.add(new Item("یونہی افزائشِ وحشت کے جو ساماں ہوں گے", "GN-00271.txt", false));
            itemsList.add(new Item("نمائشِ پردہ وارِ طرز بیدادِ تغافل ہے", "GN-00272.txt", false));
            itemsList.add(new Item("خود جان دے کے روح کو آزاد کیجیے", "GN-00273.txt", false));
            itemsList.add(new Item("ہم ہمیشہ مشقِ ازخود رفتگی کرتے رہے", "GN-00274.txt", false));
            itemsList.add(new Item("درد ہو دل میں تو دوا کیجئے ", "GN-00275.txt", false));
            itemsList.add(new Item("سکوت و خامشی اظہار حال بے زبانی ہے", "GN-00276.txt", false));
            itemsList.add(new Item("کس کی برقِ شوخی رفتار کا دلدادہ ہے", "GN-00277.txt", false));
            itemsList.add(new Item("اس جورو جفا پر بھی، بدظن نہیں ہم تجھ سے", "GN-00278.txt", false));
            itemsList.add(new Item("نالے دل کھول کے دوچار کروں یا نہ کروں", "GN-00279.txt", false));
            itemsList.add(new Item("نہ پوچھ حال اس انداز، اس عتاب کے ساتھ", "GN-00280.txt", false));
            itemsList.add(new Item("وضعِ نیرنگیِ آفاق نے مارا ہم کو", "GN-00281.txt", false));
            itemsList.add(new Item("حسنِ بے پروا گرفتار خود آرائی نہ ہو", "GN-00282.txt", false));
            itemsList.add(new Item("خزینہ دارِ محبت ہوئی ہو، اے چمن", "GN-00283.txt", false));
            itemsList.add(new Item("کرم ہی کچھ سببِ لطف و التفات نہیں", "GN-00284.txt", false));
            itemsList.add(new Item("جوں شمع ہم اک سوختہ سامانِ وفا ہیں", "GN-00285.txt", false));
            itemsList.add(new Item("آفت آہنگ ہے کچھ نالۂ بلبل، ورنہ", "GN-00286.txt", false));
            itemsList.add(new Item("بدتر از ویرانہ ہے فصلِ خزاں میں صحنِ باغ", "GN-00287.txt", false));
            itemsList.add(new Item("کرتا ہے چرخ روز بہ صد گو نہ احترام", "GN-00288.txt", false));
            itemsList.add(new Item("گنی ہیں سال کے رشتے میں بیس بار گرہ", "GN-00289.txt", false));
            itemsList.add(new Item("مرحبا! سالِ فرخی آئیں", "GN-00290.txt", false));
            itemsList.add(new Item("ملاذِ کشور و لشکر، پناہِ شہر و سپاہ", "GN-00291.txt", false));
            itemsList.add(new Item("ہند میں اہل تسنّن کی ہیں دو سلطنتیں", "GN-00292.txt", false));
            itemsList.add(new Item("مقامِ شکر ہے اے ساکنانِ خطّۂ خاک", "GN-00293.txt", false));
            itemsList.add(new Item("بسکہ فعال ما یرید ہے آج", "GN-00294.txt", false));
            itemsList.add(new Item("خوشی ہے یہ آنے کی برسات کے", "GN-00295.txt", false));
            itemsList.add(new Item("اس کتابِ طرب نصاب نے جب", "GN-00296.txt", false));
            itemsList.add(new Item("سلیم خاں کہ وہ ہے نورِچشمِ واصل خاں", "GN-00297.txt", false));
            itemsList.add(new Item("اٹھا اک دن بگولا سا جو کچھ میں جوش وحشت میں", "GN-00298.txt", false));
            itemsList.add(new Item("کیا ان دنوں بسر ہو ہماری فراغ میں", "GN-00299.txt", false));
            itemsList.add(new Item("مجلسِ شمع عِذاراں میں جو آجاتا ہوں", "GN-00300.txt", false));
            itemsList.add(new Item("پیری میں بھی کمی نہ ہوئی تاک جھانک کی", "GN-00301.txt", false));
            itemsList.add(new Item("دیکھ وہ برقِ تبسُّم، بسکہ دل بیتاب ہے", "GN-00302.txt", false));
            itemsList.add(new Item("اک آہِ گرم کی تو ہزاروں کے گھر جلے", "GN-00303.txt", false));
            itemsList.add(new Item("گوڑ گانویں کی ہے جتنی رعیت وہ یک قلم", "GN-00304.txt", false));
            itemsList.add(new Item("ہم نشیں تارے ہیں اور چاند شہاب الدین خان", "GN-00305.txt", false));
            itemsList.add(new Item("چرخ تک دُھوم ہے، کس دھوم سے آیا سہرا", "GN-00306.txt", false));
            itemsList.add(new Item("جب کہ سید غلام بابا نے", "GN-00307.txt", false));
            itemsList.add(new Item("ایک اہلِ درد نے سنسان جو دیکھا قفس", "GN-00308.txt", false));
            itemsList.add(new Item("گھستے گھستے پائوں میں زنجیر آدھی رہ گئی", "GN-00309.txt", false));
            itemsList.add(new Item("سلام اسے کہ اگر بادشا کہیں اس کو", "GN-00310.txt", false));
            itemsList.add(new Item("ہاں! اے نفسِ بادِ سحر شعلہ فشاں ہو", "GN-00311.txt", false));
            itemsList.add(new Item("اے منشیِ خیرہ سر سخن ساز نہ ہو", "GN-00312.txt", false));
            itemsList.add(new Item("رقعے کا جواب کیوں نہ بھیجا تم نے", "GN-00313.txt", false));
            itemsList.add(new Item("جگر میں ٹوٹ کے سوئی ہوئی سناں پیدا", "GN-00314.txt", false));
            itemsList.add(new Item("سات جِلدوں کا پارسل پہنچا", "GN-00315.txt", false));
            itemsList.add(new Item("ملے دو مرشدوں کو قدرتِ حق سے ہیں دو طالب", "GN-00316.txt", false));
            itemsList.add(new Item("سنینِ عمر کے ستر ہوئے شمار برس", "GN-00317.txt", false));
            itemsList.add(new Item("ولی عہدی میں شاہی ہو مبارک", "GN-00318.txt", false));
            itemsList.add(new Item("درم و دام اپنے پاس کہاں", "GN-00319.txt", false));
            itemsList.add(new Item("تم سلامت رہو قیامت تک", "GN-00320.txt", false));
            itemsList.add(new Item("روز اس شہر میں اک حکم نیا ہوتا ہے", "GN-00321.txt", false));
            itemsList.add(new Item("ایک دن مثلِ پتنگِ کاغذی", "GN-00322.txt", false));
            itemsList.add(new Item("انتخاب نسخہ حمیدیہ", "GN-00323.txt", false));
            itemsList.add(new Item("تنگی رفیقِ رہ تھی، عدم یا وجود تھا", "GN-00324.txt", false));
            itemsList.add(new Item("ہے کہاں تمنا کا، دوسرا قدم، یارب", "GN-00325.txt", false));
            itemsList.add(new Item("کچھ کھٹکتا تھا مرے سینے میں، لیکن آخر", "GN-00326.txt", false));
            itemsList.add(new Item("ناتوانی ہے تماشائیِ عمرِ رفتہ", "GN-00327.txt", false));
            itemsList.add(new Item("زبس آتش نے فصلِ رنگ میں رنگِ دگر پایا", "GN-00328.txt", false));
            itemsList.add(new Item("شر فرصت نگہ، سامانِ یک عالم چراغاں ہے", "GN-00329.txt", false));
            itemsList.add(new Item("ضعفِ جنوں کو وقتِ تپش در بھی دُور تھا", "GN-00330.txt", false));
            itemsList.add(new Item("خود پرستی سے رہے باہمدگر نا آشنا", "GN-00331.txt", false));
            itemsList.add(new Item("ہر گام آبلے سے ہے، دل، در تہِ قدم", "GN-00332.txt", false));
            itemsList.add(new Item("رکھا غفلت نے دُور افتادۂ ذوقِ فنا ورنہ", "GN-00333.txt", false));
            itemsList.add(new Item("بہ رہنِ شرم ہے، باوصفِ شوخی اہتمام اُس کا", "GN-00334.txt", false));
            itemsList.add(new Item("دُود کو آج اُس کے ماتم میں سیہ پوشی ہوئی", "GN-00335.txt", false));
            itemsList.add(new Item("پھر وہ سوئے چمن آتا ہے خدا خیر کرے", "GN-00336.txt", false));
            itemsList.add(new Item("بہ مُہرِ نامہ جو بوسہ گلِ پیام رہا", "GN-00337.txt", false));
            itemsList.add(new Item("جاتا ہوں جدھر سب کی اٹھے ہے اُدھر انگشت", "GN-00338.txt", false));
            itemsList.add(new Item("اسدؔ! مایوس مت ہو، گرچہ رونے میں اثر کم ہے", "GN-00339.txt", false));
            itemsList.add(new Item("ہے سوا نیزے پہ اس کے قامتِ نوخیز سے", "GN-00340.txt", false));
            itemsList.add(new Item("دو عالم کی ہستی پہ خطِ وفا کھینچ", "GN-00341.txt", false));
            itemsList.add(new Item("ہاتھ آیا زخمِ تیغ پارسا پہلو نشیں", "GN-00342.txt", false));
            itemsList.add(new Item("بزم، داغِ طرب و باغ، کشادِ پرِ رنگ", "GN-00343.txt", false));
            itemsList.add(new Item("کمالِ بندگیِ گل ہے رہنِ آزادی", "GN-00344.txt", false));
            itemsList.add(new Item("ظلم کرنا گدائے عاشق پر", "GN-00345.txt", false));
            itemsList.add(new Item("ہر گردِ باد، حلقۂ فتراکِ بے خودی", "GN-00346.txt", false));
            itemsList.add(new Item("فریبِ صنعتِ ایجاد کا تماشا دیکھ", "GN-00347.txt", false));
            itemsList.add(new Item("صد تجلّی کدہ ہے حرفِ جبینِ غربت", "GN-00348.txt", false));
            itemsList.add(new Item("کون آیا؟ جو چمن بے تابِ استقبال ہے", "GN-00349.txt", false));
            itemsList.add(new Item("تھی میرے ہی جلانے کو اے آہِ شعلہ ریز!", "GN-00350.txt", false));
            itemsList.add(new Item("تھی نگہ میری نہاںخانۂ دل کی نقاب", "GN-00351.txt", false));
            itemsList.add(new Item("اے آرزو شہیدِ وفا! خوں بہا نہ مانگ", "GN-00352.txt", false));
            itemsList.add(new Item("بدر ہے آئینۂ طاقِ ہلال", "GN-00353.txt", false));
            itemsList.add(new Item("ہم غلط سمجھے تھے، لیکن زخمِ دل پر رحم کر", "GN-00354.txt", false));
            itemsList.add(new Item("گر کرے انجام کو آغاز ہی میں یاد، گل", "GN-00355.txt", false));
            itemsList.add(new Item("فرطِ بے خوابی سے ہیں شبہائے ہجرِ یار میں", "GN-00356.txt", false));
            itemsList.add(new Item("نفس ہو نہ معزولِ شعلہ درودَن", "GN-00357.txt", false));
            itemsList.add(new Item("وہ التماسِ لذّتِ بیداد ہوں کہ میں", "GN-00358.txt", false));
            itemsList.add(new Item("صبر اور یہ ادا کہ دل آوے اسیرِ چاک", "GN-00359.txt", false));
            itemsList.add(new Item("ہے نزاکت بسکہ فصلِ گل میں معمارِ چمن", "GN-00360.txt", false));
            itemsList.add(new Item("کس دل پہ ہے عزمِ صفِ مژگانِ خود آرا", "GN-00361.txt", false));
            itemsList.add(new Item("کی متصل ستارہ شناسی میں عمر صرف", "GN-00362.txt", false));
            itemsList.add(new Item("اے نواسازِ تماشا، سر بہ کف جلتا ہوں میں", "GN-00363.txt", false));
            itemsList.add(new Item("طلسمِ مستیِ دل آں سوئے ہجومِ سرشک", "GN-00364.txt", false));
            itemsList.add(new Item("ہوسکے کب کُلفتِ دل، مانعِ سیلانِ اشک", "GN-00365.txt", false));
            itemsList.add(new Item("ہے وطن سے باہر اہلِ دل کی قدر و منزلت", "GN-00366.txt", false));
            itemsList.add(new Item("بے درد سر بہ سجدۂ اُلفت فرو نہ ہو", "GN-00367.txt", false));
            itemsList.add(new Item("خلق ہے صفحۂ عبرت سے سبق ناخواندہ", "GN-00368.txt", false));
            itemsList.add(new Item("شکوہ و شکر کو ثمر بیم و اُمید کا سمجھ", "GN-00369.txt", false));
            itemsList.add(new Item("واسطے فکرِ مضامین متین کے، غالبؔ!", "GN-00370.txt", false));
            itemsList.add(new Item("گر مصیبت تھی تو غربت میں اٹھا لیتے اسدؔ", "GN-00371.txt", false));
            itemsList.add(new Item("تا چند پست فطرتیِ طبعِ آرزو؟", "GN-00372.txt", false));
            itemsList.add(new Item("بہا یاں تک ہے اشکوں میں غبارِ کلفتِ خاطر", "GN-00373.txt", false));
            itemsList.add(new Item("تمثالِ جلوہ عرض کر اے حُسن! کب تلک", "GN-00374.txt", false));
            itemsList.add(new Item("کیا ہے ترکِ دُنیا کاہلی سے", "GN-00375.txt", false));
            itemsList.add(new Item("خراباتِ جنوں میں ہے، اسدؔ! وقتِ قدح نوشی", "GN-00376.txt", false));
            itemsList.add(new Item("نے حسرتِ تسلّی، نے ذوقِ بے قراری", "GN-00377.txt", false));
            itemsList.add(new Item("رخسارِ یار کی جو ہوئی جلوہ گستری", "GN-00378.txt", false));
            itemsList.add(new Item("صبح سے معلوم آثارِ ظہور شام ہے", "GN-00379.txt", false));
            itemsList.add(new Item("توڑ بیٹھے جب کہ ہم جام و سبو، پھر ہم کو کیا", "GN-00380.txt", false));
            itemsList.add(new Item("تاچند نازِ مسجد و بُت خانہ کھینچئے!", "GN-00381.txt", false));
            temp = 3;

        }
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(ReaderBook.this,MainAppScreenHome.class);
                startActivity(n);
            }
        });
        nextchap.setOnClickListener(this);
        prevchap.setOnClickListener(this);
        /*back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(ReaderBook.this,indexpagecall.getClass());
                startActivity(n);
            }
        });*/
        String content = "";
        Log.d("file   name",filename);
        try {
            InputStream is = getAssets().open(filename);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            content = new String(buffer);
            bookchapte.setText(content);
        } catch (IOException e) {
            Log.e("ReaderBook",""+e.getLocalizedMessage());
            e.printStackTrace();
        }

        bookchapte.setTypeface(typeface);
        heading.setTypeface(typeface);
    }

    private void fileRead(int position)
    {
        String content = "";
        Log.d("file   name",filename);
        try {
            InputStream is = getAssets().open(itemsList.get(position).getFileName());
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            content = new String(buffer);
            bookchapte.setText(content);
        } catch (IOException e) {
            Log.e("ReaderBook",""+e.getLocalizedMessage());
            e.printStackTrace();
        }
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/mnw.ttf");
        bookchapte.setTypeface(typeface);
        heading.setTypeface(typeface);
        heading.setText(itemsList.get(position).getIndex());


    }
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.forwardtoforward:
                if(currentPosition < itemsList.size()  -1 ) {
                    currentPosition++;
                    if(itemsList.get(currentPosition).getType()) {
                        if (currentPosition < itemsList.size() - 1)
                            currentPosition++;
                    }
                    else
                        fileRead(currentPosition);
                }
                else
                {

                }
                break;
            case R.id.backtoback:
                if(currentPosition >0 ) {
                    currentPosition--;
                    if(itemsList.get(currentPosition).getType()) {
                        if (currentPosition  > 0)
                            currentPosition--;
                    }
                    else
                        fileRead(currentPosition);

                }
                else
                {

                }
                break;
            case  R.id.backindex:
                Intent i = new Intent(ReaderBook.this,FirstBookIndex.class);
                startActivity(i);
                break;
            case R.id.zoomin:
                if(bookchapte.getTextSize() > 50)
                {
                    // Toast.makeText(getApplicationContext(), "Font Size is Maximum", Toast.LENGTH_SHORT).show();
                }
                else {
                    size++;
                    bookchapte.setTextSize(size);
                }
                break;
            case R.id.zoomout:
                if(bookchapte.getTextSize() < 25)
                {
                    //Toast.makeText(getApplicationContext(), "Font Size is Minimun", Toast.LENGTH_SHORT).show();
                }
                else {
                    size--;
                    bookchapte.setTextSize(size);
                }
                break;
                    }

    }
}
