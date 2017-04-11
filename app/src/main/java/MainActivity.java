package com.ilkaytasli.acilaramalar;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        AdView mAdView = (AdView) findViewById(R.id.adView);

        ConnectivityManager cm = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null) { // connected to the internet
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
              AdRequest adRequest = new AdRequest.Builder().build();
                mAdView.loadAd(adRequest);
            } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
                AdRequest adRequest = new AdRequest.Builder().build();
                mAdView.loadAd(adRequest);
            }
        } else {
            mAdView.setVisibility(View.GONE);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.hakkinda) {
            Intent intent = new Intent(getApplicationContext(), Hakkinda.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
    public static class PlaceholderFragment extends Fragment implements View.OnClickListener{

        View rootView;
        String n="";
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            rootView = inflater.inflate(R.layout.fragment_main, container, false);
            ScrollView s = (ScrollView) rootView.findViewById(R.id.scroll);
            RelativeLayout rl = (RelativeLayout) rootView.findViewById(R.id.rl);
            ImageView i1 = (ImageView)rootView.findViewById(R.id.image1);
            i1.setOnClickListener(this);
            ImageView i2 = (ImageView)rootView.findViewById(R.id.image2);
            i2.setOnClickListener(this);
            ImageView i3 = (ImageView)rootView.findViewById(R.id.image3);
            i3.setOnClickListener(this);
            ImageView i4 = (ImageView)rootView.findViewById(R.id.image4);
            i4.setOnClickListener(this);
            ImageView i5 = (ImageView)rootView.findViewById(R.id.image5);
            i5.setOnClickListener(this);
            ImageView i6 = (ImageView)rootView.findViewById(R.id.image6);
            i6.setOnClickListener(this);
            ImageView i7 = (ImageView)rootView.findViewById(R.id.image7);
            i7.setOnClickListener(this);
            ImageView i8 = (ImageView)rootView.findViewById(R.id.image8);
            i8.setOnClickListener(this);
            ImageView i9 = (ImageView)rootView.findViewById(R.id.image9);
            i9.setOnClickListener(this);
            ImageView i10 = (ImageView)rootView.findViewById(R.id.image10);
            i10.setOnClickListener(this);
            ImageView i11 = (ImageView)rootView.findViewById(R.id.image11);
            i11.setOnClickListener(this);
            ImageView i12 = (ImageView)rootView.findViewById(R.id.image12);
            i12.setOnClickListener(this);
            ImageView i13 = (ImageView)rootView.findViewById(R.id.image13);
            i13.setOnClickListener(this);
            ImageView i14 = (ImageView)rootView.findViewById(R.id.image14);
            i14.setOnClickListener(this);
            ImageView i15 = (ImageView)rootView.findViewById(R.id.image15);
            i15.setOnClickListener(this);
            AutoResizeTextView t1 = (AutoResizeTextView) rootView.findViewById(R.id.text1);
            AutoResizeTextView t2 = (AutoResizeTextView) rootView.findViewById(R.id.text2);
            AutoResizeTextView t3 = (AutoResizeTextView) rootView.findViewById(R.id.text3);
            AutoResizeTextView t4 = (AutoResizeTextView) rootView.findViewById(R.id.text4);
            AutoResizeTextView t5 = (AutoResizeTextView) rootView.findViewById(R.id.text5);
            AutoResizeTextView t6 = (AutoResizeTextView) rootView.findViewById(R.id.text6);
            AutoResizeTextView t7 = (AutoResizeTextView) rootView.findViewById(R.id.text7);
            AutoResizeTextView t8 = (AutoResizeTextView) rootView.findViewById(R.id.text8);
            AutoResizeTextView t9 = (AutoResizeTextView) rootView.findViewById(R.id.text9);
            AutoResizeTextView t10 = (AutoResizeTextView) rootView.findViewById(R.id.text10);
            AutoResizeTextView t11 = (AutoResizeTextView) rootView.findViewById(R.id.text11);
            AutoResizeTextView t12 = (AutoResizeTextView) rootView.findViewById(R.id.text12);
            AutoResizeTextView t13 = (AutoResizeTextView) rootView.findViewById(R.id.text13);
            AutoResizeTextView t14 = (AutoResizeTextView) rootView.findViewById(R.id.text14);
            AutoResizeTextView t15 = (AutoResizeTextView) rootView.findViewById(R.id.text15);

            PercentRelativeLayout prl1 = (PercentRelativeLayout)rootView.findViewById(R.id.prl1);
            PercentRelativeLayout prl2 = (PercentRelativeLayout)rootView.findViewById(R.id.prl2);
            PercentRelativeLayout prl3 = (PercentRelativeLayout)rootView.findViewById(R.id.prl3);
            PercentRelativeLayout prl4 = (PercentRelativeLayout)rootView.findViewById(R.id.prl4);
            PercentRelativeLayout prl5 = (PercentRelativeLayout)rootView.findViewById(R.id.prl5);

            int a = this.getArguments().getInt(ARG_SECTION_NUMBER);
            if(a == 1)
            {
                i15.setVisibility(View.INVISIBLE);
                i1.setImageResource(R.drawable.acilservis);
                i1.setTag(R.drawable.acilservis);
                t1.setText("112\nHızır Acil Servis");
                i2.setImageResource(R.drawable.aloafad);
                i2.setTag(R.drawable.aloafad);
                t2.setText("122\nAfet ve Acil Durum");
                i3.setImageResource(R.drawable.alozehir);
                i3.setTag(R.drawable.alozehir);
                t3.setText("114\nZehir Danışma Hattı");
                i4.setImageResource(R.drawable.alokizilay);
                i4.setTag(R.drawable.alokizilay);
                t4.setText("168\nTürkiye Kızılayı Hattı");
                i5.setImageResource(R.drawable.alosigara);
                i5.setTag(R.drawable.alosigara);
                t5.setText("171\nSigara Bırakma Hattı");
                i6.setImageResource(R.drawable.alohastane);
                i6.setTag(R.drawable.alohastane);
                t6.setText("182\nHastane Randevu Hattı");
                i7.setImageResource(R.drawable.alouyusturucu);
                i7.setTag(R.drawable.alouyusturucu);
                t7.setText("191\nUyuşturucu İle Mücadele Hattı");
                i8.setImageResource(R.drawable.alogida);
                i8.setTag(R.drawable.alogida);
                t8.setText("174\nAlo Gıda Danışma Hattı");
                i9.setImageResource(R.drawable.alosaglikyardim);
                i9.setTag(R.drawable.alosaglikyardim);
                t9.setText("113\nSağlık Yardım Hattı");
                i10.setImageResource(R.drawable.alosaglikbakan);
                i10.setTag(R.drawable.alosaglikbakan);
                t10.setText("132\nS.B.Acil Yardım Destek Hattı");
                i11.setImageResource(R.drawable.alourun);
                i11.setTag(R.drawable.alourun);
                t11.setText("130\nÜrün Güvenliği Hattı");
                i12.setImageResource(R.drawable.alosabim);
                i12.setTag(R.drawable.alosabim);
                t12.setText("184\nSağlık Danışma Hattı");
                i13.setImageResource(R.drawable.alotuketici);
                i13.setTag(R.drawable.alotuketici);
                t13.setText("175\nTüketici Danışma Hattı");
                i14.setImageResource(R.drawable.alocenaze);
                i14.setTag(R.drawable.alocenaze);
                t14.setText("188\nAmbulans ve Cenaze Hizmeti");
            }
            else if(a == 2)
            {
                i15.setVisibility(View.INVISIBLE);
                i1.setImageResource(R.drawable.alopolis);
                i1.setTag(R.drawable.alopolis);
                t1.setText("155\nPolis İmdat Hattı");
                i2.setImageResource(R.drawable.aloitfaiye);
                i2.setTag(R.drawable.aloitfaiye);
                t2.setText("110\nYangın İhbar Hattı");
                i3.setImageResource(R.drawable.alojandarma);
                i3.setTag(R.drawable.alojandarma);
                t3.setText("156\nJandarma İhbar Hattı");
                i4.setImageResource(R.drawable.aloteror);
                i4.setTag(R.drawable.aloteror);
                t4.setText("140\nTerörle Mücadele Hattı");
                i5.setImageResource(R.drawable.alosahil);
                i5.setTag(R.drawable.alosahil);
                t5.setText("158\nAlo Sahil Güvenlik Hattı");
                i6.setImageResource(R.drawable.alokiyi);
                i6.setTag(R.drawable.alokiyi);
                t6.setText("151\nAlo Kıyı Emniyet Hattı");
                i7.setImageResource(R.drawable.aloormanyangini);
                i7.setTag(R.drawable.aloormanyangini);
                t7.setText("177\nOrman Yangını İhbar Hattı");
                i8.setImageResource(R.drawable.alososyaldestek);
                i8.setTag(R.drawable.alososyaldestek);
                t8.setText("183\nSosyal Hizmetler Hattı");
                i9.setImageResource(R.drawable.alobeyaz);
                i9.setTag(R.drawable.alobeyaz);
                t9.setText("153\nBeyaz Masa Hattı");
                i10.setImageResource(R.drawable.alogumruk);
                i10.setTag(R.drawable.alogumruk);
                t10.setText("136\nGümrük Kaçakçılığı Hattı");
                i11.setImageResource(R.drawable.alososyal);
                i11.setTag(R.drawable.alososyal);
                t11.setText("144\nSosyal Yardım Hattı");
                i12.setImageResource(R.drawable.alocalisma);
                i12.setTag(R.drawable.alocalisma);
                t12.setText("170\nSosyal Güvenlik Kurumu");
                i13.setImageResource(R.drawable.aloinsanticareti);
                i13.setTag(R.drawable.aloinsanticareti);
                t13.setText("157\nİnsan Ticareti İhbar");
                i14.setImageResource(R.drawable.alotcdd);
                i14.setTag(R.drawable.alotcdd);
                t14.setText("131\nTCDD Acil Durum Hattı");
            }
            else if(a == 3)
            {
                i9.setVisibility(View.INVISIBLE);
                i1.setImageResource(R.drawable.alobasbakanlik);
                i1.setTag(R.drawable.alobasbakanlik);
                t1.setText("150\nBaşbakanlık İletişim Merkezi");
                i2.setImageResource(R.drawable.aloedevlet);
                i2.setTag(R.drawable.aloedevlet);
                t2.setText("160\nE-Devlet Çağrı Merkezi");
                i3.setImageResource(R.drawable.alokarayollari);
                i3.setTag(R.drawable.alokarayollari);
                t3.setText("159\nAlo Karayolları Hattı");
                i4.setImageResource(R.drawable.alovergi);
                i4.setTag(R.drawable.alovergi);
                t4.setText("189\nVergi Danışma Hattı");
                i5.setImageResource(R.drawable.aloborc);
                i5.setTag(R.drawable.aloborc);
                t5.setText("163\nTelekom Borç Sorgulama");
                i6.setImageResource(R.drawable.alogenclik);
                i6.setTag(R.drawable.alogenclik);
                t6.setText("123\nAlo Gençlik Hattı");
                i7.setImageResource(R.drawable.aloposta);
                i7.setTag(R.drawable.aloposta);
                t7.setText("169\nAlo Posta Hattı");
                i8.setImageResource(R.drawable.alopostakodu);
                i8.setTag(R.drawable.alopostakodu);
                t8.setText("119\nPosta Kodu Danışma");
                prl4.setVisibility(View.GONE);
                prl5.setVisibility(View.GONE);
            }
            else if(a == 4)
            {
                i1.setImageResource(R.drawable.alosu);
                i1.setTag(R.drawable.alosu);
                t1.setText("185\nSu Arıza Hattı");
                i2.setImageResource(R.drawable.aloelektrik);
                i2.setTag(R.drawable.aloelektrik);
                t2.setText("186\nElektrik Arıza Hattı");
                i3.setImageResource(R.drawable.alodogalgaz);
                i3.setTag(R.drawable.alodogalgaz);
                t3.setText("187\nGaz Arıza Hattı");
                i4.setImageResource(R.drawable.alotelefon);
                i4.setTag(R.drawable.alotelefon);
                t4.setText("121\nTelefon Arıza Hattı");
                i5.setImageResource(R.drawable.alokablo);
                i5.setTag(R.drawable.alokablo);
                t5.setText("126\nKablo Tv Arıza Hattı");
                i6.setImageResource(R.drawable.alootoyol);
                i6.setTag(R.drawable.alootoyol);
                t6.setText("161\nOtoyol Acil Yardım");
                prl3.setVisibility(View.GONE);
                prl4.setVisibility(View.GONE);
                prl5.setVisibility(View.GONE);
            }
            else if(a == 5)
            {
                i1.setImageResource(R.drawable.alomeb);
                i1.setTag(R.drawable.alomeb);
                t1.setText("147\nT.C. Milli Eğitim Balanlığı");
                i2.setImageResource(R.drawable.alovalilik);
                i2.setTag(R.drawable.alovalilik);
                t2.setText("179\nAlo Valilik Hattı");
                i3.setImageResource(R.drawable.alotaek);
                i3.setTag(R.drawable.alotaek);
                t3.setText("172\nAtom ve Enerji Kurumu");
                i4.setImageResource(R.drawable.alocevre);
                i4.setTag(R.drawable.alocevre);
                t4.setText("181\nÇevre Bilgi Hattı");
                i5.setImageResource(R.drawable.alotaksi);
                i5.setTag(R.drawable.alotaksi);
                t5.setText("134\nAlo Taksi Hattı");
                i6.setImageResource(R.drawable.alodask);
                i6.setTag(R.drawable.alodask);
                t6.setText("125\nDoğal Afet Sigortaları Kurumu");
                i7.setImageResource(R.drawable.alodin);
                i7.setTag(R.drawable.alodin);
                t7.setText("190\nDiyanet İşleri Başkanlığı");
                i8.setImageResource(R.drawable.alortuk);
                i8.setTag(R.drawable.alortuk);
                t8.setText("178\n Radyo ve Televizyon Kurumu");
                i9.setImageResource(R.drawable.alointernet);
                i9.setTag(R.drawable.alointernet);
                t9.setText("166\nİnternet Bilgi ve İhbar");
                i10.setImageResource(R.drawable.alobotas);
                i10.setTag(R.drawable.alobotas);
                t10.setText("152\nBotaş İhbar Hattı");
                i11.setImageResource(R.drawable.aloturizm);
                i11.setTag(R.drawable.aloturizm);
                t11.setText("176\nTurizm Dilek Hattı");
                i12.setImageResource(R.drawable.alonufus);
                i12.setTag(R.drawable.alonufus);
                t12.setText("199\nAlo Nüfus Hattı");
                prl5.setVisibility(View.GONE);
            }
            return rootView;
        }
        @Override
        public void onClick(View v) {
              switch((Integer)v.getTag())
              {
                  case R.drawable.acilservis:
                      popupCreate("HIZIR ACİL SERVİS \n\nYaşanan Acil Sağlık Sorunlarında başvurabileceğiniz öncelikli numaradır. " +
                                  "Lütfen gereksiz ve asılsız şekilde Hızır Acil Servisi rahatsız etmeyelim. İhtiyacı olan kişilerin" +
                                  " hayatları ile oynamayalım." , R.drawable.acilservis,"112");
                      break;
                  case R.drawable.aloafad:
                      popupCreate("T.C.BAŞBAKANLIK AFET VE ACİL DURUM YÖNETİMİ BAŞKANLIĞI\n\nKurum doğrudan Başbakanlık'a bağlı olarak" +
                                  " çalışmaktadır. Afet öncesi hazırlık ve zarar azaltma, afet esnasında yapılacak müdahale ve afet " +
                                  "sonrasındaki iyileştirme çalışmalarının yönetim ve koordinasyonunu gerçekleştirmek, kurumun temel " +
                                  "görev ve amacıdır." , R.drawable.aloafad,"122");
                      break;
                  case R.drawable.alobasbakanlik:
                      popupCreate("BAŞBAKANLIK İLETİŞİM MERKEZİ\n\nDevlet ile vatandaş arasındaki iletişim kanallarının tümü (elektronik, " +
                                  "mektup, faks, telefon ve şahsen) açık tutularak, vatandaşların kendileri ve kamuyla ilgili, talep, şikayet, " +
                                  "ihbar, görüş ve önerileri ile bilgi edinme haklarına ilişkin idari makamlara yapacakları müracaatlara cevapların " +
                                  "hızlı ve etkin bir şekilde verilmesi, iş ve işlemlerin merkezden kamu nezdinde takip ve denetimi hedeflenmiştir." ,
                                  R.drawable.alobasbakanlik,"150");
                      break;
                  case R.drawable.alobeyaz:
                      popupCreate("BEYAZ MASA\n\nYaşlılar için özel ev de tedavi kontrol hizmetleri," +
                                  " Yürüme engelliler için tekerlekli sandalyeli ulaşım (sınırlı sayıda özel ulaşım veya sınav ulaşım hizmetleri için)," +
                                  " Yaralı hayvan ihbarı," +
                                  " Yerel belediyeler tarafından yürütülebilinecek her türlü hizmet esaslı faaliyetler." , R.drawable.alobeyaz,"153");
                      break;
                  case R.drawable.aloborc:
                      popupCreate("TELEKOM BORÇ SORGULAMA\n\nSabit Hattınızın ne kadar borcu olduğunu öğrenmek için bu numarayı arayabilirsiniz." ,
                                  R.drawable.aloborc,"163");
                      break;
                  case R.drawable.alobotas:
                      popupCreate("BOTAŞ İHBAR HATTI\n\nBOTAŞ’a ait petrol ve doğalgaz boru hatları ile ilgili ihbar numarasıdır." , R.drawable.alobotas,"152");
                      break;
                  case R.drawable.alocalisma:
                      popupCreate("ÇALIŞMA VE SOSYAL GÜVENLİK BAKANLIĞI SOSYAL GÜVENLİK KURUMU BAŞKANLIĞI\n\nÇalışma ve Sosyal Güvenlik Bakanlığı ile Sosyal " +
                                  "Güvenlik Kurumu, Türkiye İş Kurumu ve Mesleki Yeterlilik Kurumu tarafından sunulan tüm hizmetlerle ilgili olarak bilgilendirme" +
                                  " yapmakta ve çözüm üretmektedir." , R.drawable.alocalisma,"170");
                      break;
                  case R.drawable.alocenaze:
                      popupCreate("AMBULANS VE CENAZE HİZMETLERİ\n\nHamilelerin doğum merkezlerine, yatalak hastaların hastaneye, diyaliz hastalarının ise diyaliz " +
                                  "merkezlerine ücretsiz ulaşımını sağlarken, cenazeleri ücretsiz defin alanlarına taşıyor. " , R.drawable.alocenaze,"188");
                      break;
                  case R.drawable.alocevre:
                      popupCreate("ÇEVRE BİLGİ\n\nKişiler karşılaştıkları hava kirliliği yaratan etkenler, su ve toprak kirliliği, radyoaktivite özelliği taşıyan " +
                                  "kirlilikler ve buna benzer her türlü mevcut ya da potansiyel çevre sorunlarını söz konusu hat üzerinden ihbar ederek en kısa " +
                                  "zamanda problemlerin çözülmesine yardımcı olmaktadırlar." , R.drawable.alocevre,"181");
                      break;
                  case R.drawable.alodask:
                      popupCreate("DOĞAL AFET SİGORTALARI KURUMU\n\n Sigortalılar Alo DASK 125’i arayarak" +
                                  " poliçeleriyle ilgili güncel bilgilere ulaşmanın yanı sıra depremlerin ardından hasar ihbarında" +
                                  " bulunup hasar tespit çalışmaları ile tazminat ödemeleri hakkında bilgi edinebilecek, hasar" +
                                  " dosyalarını takip edebilecekler. Henüz poliçesi bulunmayan ev sahipleri ise Alo DASK 125" +
                                  " Zorunlu Deprem Sigortası Hattı’ndan zorunlu deprem sigortasıyla ilgili detaylı bilgi" +
                                  " alabilecekler." , R.drawable.alodask,"125");
                      break;
                  case R.drawable.alodin:
                      popupCreate("T.C. BAŞBAKANLIK DİYANET İŞLERİ BAŞKANLIĞI\n\nSabit ve cep telefonlarından 190 numarasını çevirerek, " +
                                  "bulundukları şehrin il müftülüğüne bağlanacak olan vatandaşlar, müftülüklerde bulunan “Dini Soruları" +
                                  " Cevaplandırma Komisyonu” üyelerine sorularını yöneltebilecek."
                               , R.drawable.alodin,"190");
                      break;
                  case R.drawable.alodogalgaz:
                      popupCreate("GAZ ARIZA\n\n Aşağıdaki durumlarda Alo 187 aranmalıdır." +
                                  "1-Konut içerisinde gaz kokusu,\n" +
                                  "2-Bina İçi/ merdiven boşluğunda gaz kokusu,\n" +
                                  "3-Sokak genelinde gaz kokusu,\n" +
                                  "4-Servis hattında/kutusunda gaz kokusu,\n" +
                                  "5-Doğal gaz yangını ve Patlama,\n" +
                                  "6-Baca gazı zehirlenmeleri,\n" +
                                  "7-Gaz yokluğu" , R.drawable.alodogalgaz,"187");
                      break;
                  case R.drawable.aloedevlet:
                      popupCreate("E-DEVLET KAPISI ÇAĞRI MERKEZİ\n\nBu danışma hattı sayesinde vatandaşlar e-devlet sistemi ile ilgili olan" +
                                  " istek ve şikayetlerini kolay bir şekilde ilgili birimlere bildirebilme olanağına sahip olabilmektedir."  +
                                  "Bunun dışında da Al0 160 e-devlet danışma hattı ile e-devlet hakkında merak edilenler ve yaşanan sorunlar " +
                                  "ile ilgili olarak da danışılabilmektedir. Bu sayede de vatandaşların e-devlet sistemi üzerinde yaşadıkları " +
                                  "sorunların giderilmesi sağlanabilmektedir." , R.drawable.aloedevlet,"160");
                      break;
                  case R.drawable.aloelektrik:
                      popupCreate("ELEKTRİK ARIZA\n\nAboneler Çağrı Merkezini aradıklarında;\n" +
                                  " \n" +
                                  "Elektrik arıza ihbarında bulunabilir;\n" +
                                  "Kaçak kullanım ihbarı yapabilir;\n" +
                                  "Sokak ve cadde aydınlatmaları hakkında arıza ve eksiklikleri bildirebilir;\n" +
                                  "Planı kesintiler hakkında bilgi alabilir;\n" +
                                  "Fatura bilgilerini öğrenebilir;\n" +
                                  "Abonelik işlemler hakkında bilgi alabilirler." , R.drawable.aloelektrik,"186");
                      break;
                  case R.drawable.alogenclik:
                      popupCreate("ALO GENÇLİK HATTI\n\nTürkiye'deki gençlerin sorunlarının neler olduğu tespit edilecek. " +
                                  "Onlara yardımcı olunacak. Çağrı merkezinde her türlü soruya cevap aranacak. Başarısızlık, " +
                                  "evdeki geçimsizlik, maddi problemler, sorunların çözümü için başvurulacak adresler, kredili " +
                                  "yurtlarda yaşanan sorunlar cevaplandırılacak. Bunun sonucunda çağrı merkezini kaç insan arıyor, " +
                                  "hangi konuda derdini anlatıyor verileri tespit edilecek." , R.drawable.alogenclik,"123");
                      break;
                  case R.drawable.alogumruk:
                      popupCreate("ALO GÜMRÜK KAÇAKÇILIĞI\n\nHavada,karada,denizde her türlü kaçakçılık ihbarınız için ALO 136'yı " +
                                  "ülke genelinden ücretsiz olarak 7/24 süreyle arayabilirsiniz. " , R.drawable.alogumruk,"136");
                      break;
                  case R.drawable.alogida:
                      popupCreate("ALO GIDA HATTI\n\nTüketicinin gıda güvenilirliği ile ilgili her türlü ihbar ve şikâyette ilgili " +
                                  "merciye kolay bir şekilde ulaşabilmesi, iletişimin tek merkezden yönlendirilmesi, tüketiciye en kısa " +
                                  "zamanda dönüş yapılabilmesi ve sonucun takibi amacıyla kurulmuştur." , R.drawable.alogida,"174");
                      break;
                  case R.drawable.alohastane:
                      popupCreate("HASTANE RANDEVU HATTI\n\nEv, iş, ankesör ve cep telefonlarından ALO 182 aranır. Çağrıyı karşılayan " +
                                  "operatöre hastanın T.C. Kimlik Numarası verilir. Randevu talep edilen hastane, poliklinik ve varsa hekim" +
                                  " tercihleri operatöre bildirilir. Operatör uygun tarih ve saat dilimlerini vatandaşa bildirir. Vatandaş" +
                                  " seçimini yaparak randevusunu alır." , R.drawable.alohastane,"182");
                      break;
                  case R.drawable.aloinsanticareti:
                      popupCreate("İNSAN TİCARETİ MAĞDURLARINA YARDIM VE İHBAR HATTI\n\n insan ticareti mağdurlarının kurtarılmasına destek " +
                                  "sağlanması amacıyla kurulmuştur. Hat, aynı zamanda insan ticareti riski altında bulunan bireylere, acil " +
                                  "durumları içermeyen bir temelde bilgi sağlamaktadır. Bu, vizeler ve mağdur durumdaki göçmenlerin güvenli " +
                                  "bir şekilde ülkelerine dönmelerine ilişkin prosedürler ile ilgili bilgileri de içermektedir." ,
                              R.drawable.aloinsanticareti,"157");
                      break;
                  case R.drawable.alointernet:
                      popupCreate("ALO İNTERNET BİLGİ İHBAR\n\nİntihara Yönlendirme,\n" +
                                  " Çocukların Cinsel İstismarı,\n" +
                                  " Uyuşturucu veya Uyarıcı Madde Kullanılmasını Kolaylaştırma,\n" +
                                  " Sağlık için Tehlikeli Madde Temini,\n" +
                                  " Müstehcenlik,\n" +
                                  " Fuhuş,\n" +
                                  " Kumar Oynanması için Yer ve İmkân Sağlama,\n" +
                                  " Atatürk Aleyhine İşlenen Suçlar\n" +
                                  "ile ilgili yeterli şüpheye sahip olduğunu düşündüğünüz içeriği, aşağıda yer alan ilgili alandan seçim yaparak " +
                                  "ihbar edebilirsiniz." , R.drawable.alointernet,"166");
                      break;
                  case R.drawable.aloitfaiye:
                      popupCreate("YANGIN İHBAR\n\n110, ülkemiz genelinde yangın ve itfai olaylarla ilgili acil yardım ihtiyacı duyulduğunda " +
                                  "aranacak numaradır. 110’u aramadan önce acil olarak bir yardıma ihtiyacınız olup olmadığına karar vermelisiniz. " +
                                  "Eğer yangın ve itfai olay gibi acil durumlara maruz kalmışsanız 110’u arayınız. Diğer konularla ilgili olarak ise" +
                                  " İletişim bilgileri için tıklayınız.. kısmından ilgili birimimizle irtibata geçmeniz uygun olacaktır. 110, Çocuklar," +
                                  " yaşlılar ve erişkinler için acil durumlarda hatırlanması kolay bir numaradır. 110’u aradığınızda size İstanbul " +
                                  "itfaiyesi haberleşme personeli yardımcı olacaktır. 110’u aradığınızda karşınıza çıkan haberleşme personeline, " +
                                  "bilgileriniz dahilinde olay yerinin açık adresini (İlçe, semt, mahalle, cadde, sokak ve kapı numarası, irtibat " +
                                  "telefon numarası), görebiliyorsanız yangının çeşidi, yangın yerinin kaç katlı olduğu, mahsur kalan olup olmadığı" +
                                  " ve biliyorsanız yaralılar hakkında bilgiyi (Örneğin: Baca yangını, çatı yangını, üst katlarda mahsur kalanlar var vb.. )" +
                                  " sakin, açık ve anlaşılır bir şekilde aktarınız." , R.drawable.aloitfaiye,"110");
                      break;
                  case R.drawable.alojandarma:
                      popupCreate("JANDARMA İHBAR\n\nJandarmaya tahsis edilmiş özel bir hattır ve aramak ücretsizdir. " +
                                  "Vatandaşlarımızın can ve mal güvenliklerinin tehlike altında bulunduğu durumlar ile toplumun " +
                                  "huzurunu ve memleketin asayişini bozan durumlarda yapılan başvurulara ivedi cevap veren bir hizmettir. " +
                                  "Ülkenin neresinde olursa olsun 156’yı direkt çeviren vatandaşlarımız karşısında Jandarmayı bulacaktır." ,
                                  R.drawable.alojandarma,"156");
                      break;
                  case R.drawable.alokablo:
                      popupCreate("KABLO TV ARIZA\n\nTürksat – Kablolu TV kullanıcıları hem bireysel hem de kurumsal " +
                                  "müşterilerin yaşadığı ve yaşayacağı sorunların çözümü için ayrıca bağlantı, kopma, sık-sık " +
                                  "net kesilmesi, telefon çalışmaması vs. gibi her türlü sorununuzu iletebilirsiniz. " ,
                                  R.drawable.alokablo,"126");
                      break;
                  case R.drawable.alokarayollari:
                      popupCreate("ALO KARAYOLLARI\n\nTürkiye’nin karayolları yol ağında bulunan otoyollar, devlet yolları ve il " +
                                  "yollarında seyahat eden sürücülerin seyahat esnasında veya seyahatten önce kullanacağı yol güzergahı " +
                                  "ile ilgili tüm soru ve sorunları hakkında bilgi ve yardım alacağı bir hat olarak hizmet veriyor." +
                                  "Özellikle seyahate çıkacak olan sürücülerin Alo 159 Karayolları Bilgi Hattı’ndan gideceği " +
                                  "yol güzergahının durumu, yol güzergahının açık olup olmadığı, yolda çalışma olup olmadığı, yolun " +
                                  "fiziki yapısı hakkında bilgi alınarak yola çıkmaları daha faydalı olacaktır. Aynı zamanda seyahat " +
                                  "esnasında sürücülerin yolda gördüğü herhangi bir olumsuzluğun veya problemin iletilmesi, yolda meydana " +
                                  "gelen maddi hasarlı, ölümlü veya yaralanmalı bir kazanın iletilerek her türlü teknik ve kurtarma yardımının" +
                                  " istenmesi gibi durumlarda Alo159 hattından yararlanabilecekler." , R.drawable.alokarayollari,"159");
                      break;
                  case R.drawable.alokiyi:
                      popupCreate("ALO KIYI EMNİYET\n\nKıyı Emniyeti Genel Müdürlüğü'nün 5 ana görevi vardır.\nBunlar seyir yardımcılar, " +
                                  "fenerlerin bakımı, kurtarma römorklarının ve hızlı arama kurtarma botlarıyla arama kurtarma çalışmaları, " +
                                  "haberleşme hizmetleri, gemi kurtarma ve can kurtarma hizmetleri ve Türk boğazlarında gemi trafiği hizmetleridir." +
                                  "Bu konular ili ilgili ihbar veya bilgi almak için iletişime geçebilirsiniz." , R.drawable.alokiyi,"151");
                      break;
                  case R.drawable.alokizilay:
                      popupCreate("TÜRKİYE KIZILAYI\n\nMerkezin faaliyetlerden haberdar olmak, bağışta bulunmak, kampanyalara katkı sağlamak " +
                                  "isteyenlere cevap veren, aynı zamanda talep, istek ve şikayetleri en kısa sürede yanıtlayarak çözüme kavuşturan " +
                                  "hizmet hattıdır.Ayrıca Kurban ve zekat gbi konularda da ihtiyaç sahiplerine ulaşmak için yardımcı olunmaktadır. " ,
                                  R.drawable.alokizilay,"168");
                      break;
                  case R.drawable.alomeb:
                      popupCreate("T.C. MİLLİ EĞİTİM BAKANLIĞI İLETİŞİM MERKEZİ\n\nBakanlığın görev ve sorumluluklarıyla ilgili her türlü;\n" +
                                  "Talep\n" +
                                  "Şikâyet\n" +
                                  "Görüş-Öneri\n" +
                                  "İhbar\n" +
                                  "Bilgi edinme sorularınızı\n" +
                                  "etkin ve hızlı bir biçimde çözüme kavuşturabilmek amacıyla kurulmuştur. " , R.drawable.alomeb,"147");
                      break;
                  case R.drawable.alonufus:
                      popupCreate("ALO NÜFUS\n\nVatandaşların bilgi talepleri, şikayet, öneri ve başvuru işlemleri ve " +
                                  "Kamu Kuruluşlarının (Mernis, Kps, Maks, Adres vb.) taleplerinin kayıt altına alınarak tek " +
                                  "elden karşılanması amaçlanmaktadır.\n" +
                                  "\n" +
                                  "ÇAĞRI MERKEZİ İÇERİSİNDE KULLANILAN SERVİSLER\n" +
                                  "1- Kişi Sorgulama ve Doğrulama\n" +
                                  "2- Yabancı Kişi Sorgulama\n" +
                                  "3- Mavi Kartlı Kişi Sorgulama\n" +
                                  "4- Vatandaşlık Başvurusu Sorgulama\n" +
                                  "5- Başvuru Kaydı Sorgulama\n" +
                                  "\n" +
                                  "ÇAĞRI MERKEZİNE ENTEGRE EDİLECEK HİZMETLER \n" +
                                  "1- Yeni kimlik kartı işlemleri bilgi alma\n" +
                                  "2- Randevu alma\n" +
                                  "3- Randevu iptal\n" +
                                  "4- Randevu değişikliği\n" +
                                  "5- Randevu sorgulama" , R.drawable.alonufus,"199");
                      break;
                  case R.drawable.aloormanyangini:
                      popupCreate("ORMAN YANGINI İHBAR\n\nBu hattı orman yangınları ile birlikte işgal, kaçak yapılaşma izinsiz kaçak " +
                                  "kesim ve ormancılık alanlarına yapılan her türlü tacizi ihbar için ücretsiz arayabilirsiniz." ,
                                  R.drawable.aloormanyangini,"177");
                      break;
                  case R.drawable.alootoyol:
                      popupCreate("OTOYOL ACİL YARDIM\n\nOtoyollarda yaşayabileceğiniz her hangi bir durum hakkında bilgi almak ya da " +
                                  "ihbarda bulunmak için iletişime geçebilirsiniz." , R.drawable.alootoyol,"161");
                      break;
                  case R.drawable.alopolis:
                      popupCreate("POLİS İMDAT\n\nSuçun önlenmesi, eğer suç işlenmişse suçlunun bir an önce yakalanması ve vatandaşımızın " +
                                  "devam eden mağduriyetinin giderilmesi için kullanılan hattır. \n\n155’ Polis imdat hattına Gelen İhbarların " +
                                  "Değerlendirilmesi\n" +
                                  "Yapılan tüm ihbarlar gerçek kabul edilir.\n" +
                                  "155’e gelen ihbarlarda açık adres alınmaya çalışılır. \n" +
                                  "Alınan ihbar sisteme kaydedilir. \n" +
                                  "Zaman kaybedilmeden ilgili ekip olay yerine sevk edilir.\n\n" +
                                  "EşkâlAlınırken Nelere Dikkat Edilmelidir? \n" +
                                  "Olaya karışan şahsın; \n" +
                                  "Yaşı\n" +
                                  "Boyu\n" +
                                  "Kilosu\n" +
                                  "Ten, saç ve göz rengi\n" +
                                  "Gömlek, tişört, mont, pantolon, ayakkabı vb. kıyafet bilgileri.\n" +
                                  "Olaya karışan şahıs bir oto ile olay yerinden uzaklaştı ise aracın;\n" +
                                  "Plaka Numarasını\n" +
                                  "Marka ve Modelini\n" +
                                  "Rengini mutlaka bize bildiriniz." , R.drawable.alopolis,"155");
                      break;
                  case R.drawable.aloposta:
                      popupCreate("ALO POSTA\n\nKapıdan kapıya teslim (KKTS) PTT'nin Acele Posta Servisi'nin" +
                                  " (APS) aynı gün içerisinde bir telefonla gönderinizi kapınızdan teslim alıp " +
                                  "alıcıya aynı gün içerisinde teslim servisinin" , R.drawable.aloposta,"169");
                      break;
                  case R.drawable.alopostakodu:
                      popupCreate("POSTA KODU DANIŞMA\n\n İstediğiniz ilin veya ilçenin posta kodunu sorgulamak " +
                                  "istediğinizde kullanabileceğiniz hizmettir." , R.drawable.alopostakodu,"119");
                      break;
                  case R.drawable.alortuk:
                      popupCreate("ALO RTÜK\n\nVatandaşların, rahatsız olduğu televizyon programları hakkındaki" +
                                  " şikayetlerini hem daha ucuza hem daha kolay bildirebilmesi için oluşturulan servistir." ,
                                  R.drawable.alortuk,"178");
                      break;
                  case R.drawable.alosabim:
                      popupCreate("SAĞLIK DANIŞMA\n\nVatandaşlar SABİM'i arayarak sağlık sisteminin işleyişine yönelik her " +
                                  "konuda bilgi alabilir, Sağlık sistemine yönelik taleplerini, eleştirilerini ve önerilerini dile " +
                                  "getirebilir, Sağlık hzimetlerinden yararlandıkları sırada sistemin herhangi bir aşamasında yaşadıkları " +
                                  "problemleri ALO 184 SABİM'i arayarak dile getirebilirler." , R.drawable.alosabim,"184");
                      break;
                  case R.drawable.alosaglikbakan:
                      popupCreate("SAĞLIK BAKANLIĞI ACİL YARDIM HİZMETLERİ DESTEK HATTI" ,
                              R.drawable.alosaglikbakan,"132");
                      break;
                  case R.drawable.alosaglikyardim:
                      popupCreate("ALO SAĞLIK YARDIM\n\nÇalışanların şiddet olaylarını bildirmek için 24 saat hizmet verecek “113” numaralı " +
                                  "telefonu ve web sitesindeki bildirim formunu kullanabileceklerdir. Sağlık çalışanına yönelik herhangi bir şiddet " +
                                  "olayı gerçekleştiğinde kurum yöneticileri tarafından derhal “113” numaralı telefonla Beyaz Kod Birimine bildirim " +
                                  "yapılması gerekmektedir. . Eş zamanlı olarak olayın; ilgili kurumun hukuk birimine ve adli mercilere intikal ettirilmesi," +
                                  " müteakiben de web sitemizde “Beyaz Kod Bildirim Formu”nun eksiksiz bir şekilde doldurulması büyük önem arz etmektedir." +
                                  " Şiddete uğrayan sağlık çalışanı tarafından “113” numaralı telefona doğrudan da bildirim yapılabilecektir. " , R.drawable.alosaglikyardim,"113");
                      break;
                  case R.drawable.alosahil:
                      popupCreate("ALO SAHİL GÜVENLİK\n\n•Denizde tehlikede olanlarla ilgili yardım talepleri,\n" +
                                  "• Denizi kirleten her türlü davranış,\n" +
                                  "• Denizden yapılan her türlü kaçakçılık,\n"  +
                                  "• Yasa dışı su ürünleri avcılığı0, ve dalış,\n" +
                                  "• Kıyılarımızdan ülkemize yasa dışı giriş ve çıkışlar,\n" +
                                  "• Denizlerimizde yapılacak terörist eylemlere ilişkin duyumlar için başvuracağınız ilk adres ALO 158 olsun." , R.drawable.alosahil,"158");
                      break;
                  case R.drawable.alosigara:
                      popupCreate("ALO SİGARA BIRAKMA HATTI\n\nDanışma hattına gelen çağrılar, sigara bırakma konusunda eğitim almış operatör aracılığı" +
                                  " ile 7/24 saat hizmet verecek şekilde karşılanmaktadır. Ayrıca, ALO 171 Sigara Bırakma Danışma Hattı’nı arayarak sigarayı" +
                                  " bırakmaya karar vermiş danışanlara, sigara bırakma planı çerçevesinde belli aralıklarla geri dönüş aramaları yapılarak " +
                                  "kişinin takibinin yapılması sağlamaktadır.\n" , R.drawable.alosigara,"171");
                      break;
                  case R.drawable.alososyal:
                      popupCreate("SOSYAL YARDIM HATTI\n\n2022 maaşları, gıda yardımları, nakdi yardımlar, kömür yardımları, \n" +
                                  "Şartlı eğitim ve Şartlı sağlık yardımları, eşi vefat edenlere yapılan yardımlar\n" +
                                  "ve diğer yardımlar hakkında bilgilendirme yönlendirme sağlayan sosyal yardım hattıdır." ,
                                  R.drawable.alososyal,"144");
                      break;
                  case R.drawable.alososyaldestek:
                      popupCreate("KADIN VE SOSYAL HİZMETLER\n\nİhmal, istismar ve şiddet vakaları veya töre ve namus cinayetlerinin önlenmesi için " +
                                  "tedbir mahiyetindeki ihbarlar, durumun aciliyeti göz önünde tutuluyor. Vakanın bulunduğu ilin acil müdahale ekip " +
                                  "sorumlusuna veya kolluk kuvvetlerine bildiriliyor. Acil müdahale ekibi vakayı değerlendirdikten sonra emniyet veya " +
                                  "jandarma birimleri ile koordinasyon sağlayarak, kısa zamanda müdahale edilmesini sağlamaktadırlar." ,
                                  R.drawable.alososyaldestek,"183");
                      break;
                  case R.drawable.alosu:
                      popupCreate("SU ARIZA\n\n" +
                                  "7 gün /  24 saat hizmet veren Alo 185 Çağrı Merkezimizi arayarak;\n" +
                                  "İçmesuyu Arızaları\n" +
                                  "Kanalizasyon Arızaları\n" +
                                  "Sayaç Arızaları\n" +
                                  "Su Kirliliği\n" +
                                  "Susuzluk\n" +
                                  "Kaçak Su Kullanımı\n" +
                                  "hakkında ihbarda bulunabilirsiniz.\n" +
                                  "\n" +
                                  "Ayrıca yine Çağrı Merkezimizi arayarak;\n" +
                                  "Abonelik işlemleri hakkında bilgi alabilir,\n" +
                                  "Fatura borç bilgilerinizi öğrenebilir,\n" +
                                  "Kurumumuzla ilgili diğer faaliyetler hususunda sorgulama yapabilirsiniz" , R.drawable.alosu,"185");
                      break;
                  case R.drawable.alotaek:
                      popupCreate("TÜRKİYE ATOM ve ENERJİ KURUMU\n\nRadyasyon, nükleer enerji vs. gibi konularda bilgi almak veya ihbarda " +
                                  "bulunmak için kullanabileceğiniz hizmettir." , R.drawable.alotaek,"172");
                      break;
                  case R.drawable.alotaksi:
                      popupCreate("ALO TAKSİ\n\nÖzellikle büyük kentlerimizde ticari taksilerin, yolcu almak için park edilmesi " +
                                  "yasak yerlere park ederek bekleme yapmaları veya aynı amaçla trafikte seyir halinde bulunmaları şehir" +
                                  " içi trafiğini olumsuz etkilediği gibi gereksiz enerji sarfiyatını da beraberinde getirmektedir. Bu " +
                                  "nedenle belediye sınırları içindeki ticari taksilerin tek merkezden yönetilmesini sağlamak amacıyla " +
                                  "belediyelerimiz tarafından taksi yönetim merkezi ve çağrı merkezleri kurulabileceği düşünülmüş ve " +
                                  "sistemin hayata geçmesi ile birlikte Ulaşımda Enerji Verimliliğinin Artırılmasına İlişkin Usul ve " +
                                  "Esaslar Hakkında Yönetmelikle verilen görevlerin de yerine getirilmesi hedeflenmiştir." ,
                                  R.drawable.alotaksi,"134");
                      break;
                  case R.drawable.alotcdd:
                      popupCreate("TCDD ACİL DURUM İHBAR HATTI\n\nDanışmanlar Kurulunun yaptığı çalışmalar sonucunda hemzemin " +
                                  "geçitlerde meydana gelecek acil durumlarda vatandaşların ulaşabileceği 131 no.lu hat tahsis edildi." , R.drawable.alotcdd,"131");
                      break;
                  case R.drawable.alotelefon:
                      popupCreate("TELEFON ARIZA\n\nSabit Telefon arızalarınız için iletişime geçebilirsiniz." , R.drawable.alotelefon,"121");
                      break;
                  case R.drawable.aloteror:
                      popupCreate("ALO TERÖR İHBAR HATTI\n\nTerörle Mücadele Kanunu Kapsamına Giren Suçların Faillerinin Yakalanmasına Yardımcı" +
                                  " Olanlara Verilecek Ödül Hakkında Yönetmeliğe göre, suç faillerinin yakalanmasına yardımcı olanlara veya yerlerini ya da " +
                                  "kimliklerini bildirenlere belirli miktarlarda ödül verilecektir.  " , R.drawable.aloteror,"140");
                      break;
                  case R.drawable.alotuketici:
                      popupCreate("ALO TÜKETİCİ HATTI\n\n Tüketiciler satın aldıkları her türlü ürün ve hizmetlere yönelik tüm şikayetler ve " +
                                  "ihbarları ALO 175'e paylaşabilir." , R.drawable.alotuketici,"175");
                      break;
                  case R.drawable.aloturizm:
                      popupCreate("TURİZM DİLEK HATTI\n\n Çağrı merkezinde, gelen turistlerin ülkemizle ilgili soruları, bilgi talepleri ve " +
                                  "yaşanılan anlık sorunlar, şikâyetler iletişim merkezi tarafından Türkçe veya İngilizce dil seçenekleri ile " +
                                  "yanıtlanıyor. İlgili birimlere anlık olarak iletilen talepler, yerli ve yabancı tüm turistlere erişmek istedikleri " +
                                  "bilgilere doğru ve hızlı bir şekilde ulaştırıyor. " , R.drawable.aloturizm,"176");
                      break;
                  case R.drawable.alourun:
                      popupCreate("ALO ÜRÜN GÜVENLİĞİ\n\nVatandaşların, asansörler, asansör bakım ve servis firmaları gibi hizmetlerden " +
                                  "deodorantlara, gazla kullanılan cihazlardan motorlu araç aksamlarına kadar çok geniş bir yelpazadeki ürünleri" +
                                  "şikayet ve ihbar edebileceklerini kaydeden Akçadırcı, vatandaşların ihbar ve şikayet mekanizmasını daha yaygın " +
                                  "bir şekilde kullanmaları halinde, denetimlerde güvensiz ürünlere daha kolay ulaşılabilecektir." , R.drawable.alourun,"130");
                      break;
                  case R.drawable.alouyusturucu:
                      popupCreate("UYUŞTURUCU İLE MÜCADELE DANIŞMA VE DESTEK HATTI\n\nUyuşturucu ile mücadele çalışmaları temelde " +
                                  "üç aşamada yürütülmektedir. Bunlar; önleme, tedavi ve tedavi sonrası rehabilitasyondur. Danışma hattı" +
                                  " bu üç aşamayı da destekleyecek şekilde düzenlenmiştir. Bununla birlikte öncelikli olarak; hem maddeyle" +
                                  " tanışmamış kişilerin (özellikle gençlerin) hem de madde kullanımı olan ancak bağımlı hale gelmemiş " +
                                  "bireylerin korunması hedeflenmiştir.\n" +
                                  "\n" +
                                  "Danışma hattı çalışanları; aile bireylerinin madde kullanımıyla hiç tanışmamaları için neler yapabileceklerini" +
                                  " öğrenmek isteyen kişilerden, acil yardım almak için bu hattı arayan kişilere kadar oldukça geniş bir yelpazede" +
                                  " her türlü duruma yönelik bilgi sahibi olabilmeleri ve doğru müdahale edebilmeleri amacıyla profesyonel bir " +
                                  "eğitimden geçirilmiştir." , R.drawable.alouyusturucu,"191");
                      break;
                  case R.drawable.alovalilik:
                      popupCreate("ALO VALİLİK\n\nValilik ve Valiliğe bağlı kurumların vermiş olduğu hizmetler hakkında " +
                                  "bilgi alınabilmektedir. Bu proje ile vatandaşların zamandan tasarruf etmeleri ve kamu kurumlarında " +
                                  "gereksiz yığılma ve yoğunluğun önüne geçilmesi amaçlanmaktadır." , R.drawable.alovalilik,"179");
                      break;
                  case R.drawable.alovergi:
                      popupCreate("VERGİ DANIŞMA\n\nvergi ile ilgili konularda bilgi danışma, ihbar yönetimi, geri arama, " +
                                  "İngilizce elektronik posta yanıtlama ve Motorlu Taşıtlar Vergisi işlemlerine ilişkin hizmetleri" +
                                  " vermektedir. Vergi İletişim Merkezinde hizmet saatleri hafta içi 09:00-19:00 arasında olup, resmi " +
                                  "tatil günlerinde hizmet verilmemektedir. Vergi İletişim Merkezi ile telefonla yapılan görüşmeler " +
                                  "şehir içi görüşme tarifesi üzerinden ücretlendirilmektedir." , R.drawable.alovergi,"189");
                      break;
                  case R.drawable.alozehir:
                      popupCreate("ZEHİR DANIŞMA\n\nTürkiye'de tedavi maksatlı kullanılan ilaçlar, böcek ilaçları, tarım " +
                                  "ilaçları, mantarlar ve çeşitli bitkilerle olan zehirlenmelerden, zehirli hayvan ısırmalarına " +
                                  "ve sokmalarına kadar geniş bir yelpazedeki zehirlenmelerde hem halka hem de sağlık çalışanlarına" +
                                  " yönelik olarak 24 saat hizmet veren merkezdir." , R.drawable.alozehir,"114");
                      break;
          }
        }
        public void popupCreate(String message , Integer id, final String number)
        {
            final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
            alertDialogBuilder.setTitle("ALO "+ number);
            n = number;
            alertDialogBuilder.setIcon(id);
            alertDialogBuilder.setMessage(message);
            alertDialogBuilder.setCancelable(false);

            alertDialogBuilder.setPositiveButton("Ara", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface arg0, int arg1) {
                    String num= "tel:" + number;
                    Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(num));
                   startActivity(callIntent);
                }
            });
            alertDialogBuilder.setNegativeButton("Kapat", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);

        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 5 total pages.
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Sağlık";
                case 1:
                    return "Güvenlik";
                case 2:
                    return "Danışma";
                case 3:
                    return "Arıza";
                case 4:
                    return "Diğer";
            }
            return null;
        }

    }
}
