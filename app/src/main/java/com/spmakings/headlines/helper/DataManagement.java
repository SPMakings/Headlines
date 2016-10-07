package com.spmakings.headlines.helper;


import com.spmakings.headlines.application.NewsConstants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Saikat Pakira on 9/27/2016.
 */
public class DataManagement {

    private JSONArray allChannelArray = new JSONArray();

    public void initAllData() {
        JSONObject innerObj_ = null;
        try {
            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=national-geographic&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "National Geographic");
            innerObj_.put("source_gener", "Science and Nature");
            innerObj_.put("source_img_url", "http://www.tvweek.com/blogs/tvbizwire/nat%20geo-logo.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=abc-news-au&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "ABC News Australia");
            innerObj_.put("source_gener", "General");
            innerObj_.put("source_img_url", "https://yt3.ggpht.com/-Eh3AwGhwPeI/AAAAAAAAAAI/AAAAAAAAAAA/QomvTf2lg_s/s900-c-k-no-mo-rj-c0xffffff/photo.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=ars-technica&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "ARS Technica");
            innerObj_.put("source_gener", "Technology");
            innerObj_.put("source_img_url", "http://www.techlozenge.com/images/ars-technica.png");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=associated-press&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Associated Press");
            innerObj_.put("source_gener", "General");
            innerObj_.put("source_img_url", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Associated_Press_logo.svg/2000px-Associated_Press_logo.svg.png");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=bbc-news&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "BBC News");
            innerObj_.put("source_gener", "General");
            innerObj_.put("source_img_url", "http://www.bbc.co.uk/news/special/2015/newsspec_10857/bbc_news_logo.png?cb=1");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=bbc-sport&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "BBC Sport");
            innerObj_.put("source_gener", "Sports");
            innerObj_.put("source_img_url", "http://newsimg.bbc.co.uk/media/images/67165000/jpg/_67165916_67165915.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=bloomberg&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Bloomberg");
            innerObj_.put("source_gener", "Business");
            innerObj_.put("source_img_url", "http://www.noreena.com/wp-content/uploads/2013/09/bloomberg-logo.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=business-insider&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Business Insider");
            innerObj_.put("source_gener", "Business");
            innerObj_.put("source_img_url", "http://static5.businessinsider.com/assets/images/us/logos/og-image-logo-social.png");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=business-insider-uk&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Business Insider UK");
            innerObj_.put("source_gener", "Business");
            innerObj_.put("source_img_url", "http://static6.uk.businessinsider.com/assets/images/uk/logos/og-image-logo.png");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=buzzfeed&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Buzzfeed");
            innerObj_.put("source_gener", "Entertainment");
            innerObj_.put("source_img_url", "http://barnraisersllc.com/wp-content/uploads/2015/12/buzzfeed-logo.png");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=cnbc&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "CNBC");
            innerObj_.put("source_gener", "Business");
            innerObj_.put("source_img_url", "http://cdn.embed.ly/providers/logos/cnbc.png");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=cnn&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "CNN");
            innerObj_.put("source_gener", "General");
            innerObj_.put("source_img_url", "http://www.adweek.com/fishbowldc/wp-content/uploads/sites/10/2015/03/CNN-logo.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=daily-mail&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Daily Mail");
            innerObj_.put("source_gener", "Entertainment");
            innerObj_.put("source_img_url", "https://jumpforjournalism.files.wordpress.com/2013/11/daily-mail-logo-vector1.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=engadget&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Engadget");
            innerObj_.put("source_gener", "Technology");
            innerObj_.put("source_img_url", "http://vignette1.wikia.nocookie.net/logopedia/images/3/3c/Engadget.png/revision/latest?cb=20120721111043");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=entertainment-weekly&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Entertainment Weekly");
            innerObj_.put("source_gener", "Entertainment");
            innerObj_.put("source_img_url", "http://cdn.subscriptioninsider.com/media/newspics/340/EW-Logo.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=espn&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "ESPN");
            innerObj_.put("source_gener", "Sports");
            innerObj_.put("source_img_url", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/ESPN_wordmark.svg/2000px-ESPN_wordmark.svg.png");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=espn-cric-info&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "ESPN Cric Info");
            innerObj_.put("source_gener", "Sports");
            innerObj_.put("source_img_url", "http://i.imgci.com/espncricinfo/espnci_logo_500x243.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=financial-times&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Financial Times");
            innerObj_.put("source_gener", "Business");
            innerObj_.put("source_img_url", "http://www.anitakeij.net/wp-content/uploads/2014/08/financial_times_logo.gif");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=football-italia&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Football Italia");
            innerObj_.put("source_gener", "Sports");
            innerObj_.put("source_img_url", "http://assets.lfcimages.com/uploads/footballitalia500.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=fortune&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Fortune");
            innerObj_.put("source_gener", "Business");
            innerObj_.put("source_img_url", "http://static1.squarespace.com/static/53ac8d2de4b0d8ab685c39be/t/53bda6b5e4b04658a11abf15/1404937909521/?format=300w");
            allChannelArray.put(innerObj_);

            //=======================20

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=four-four-two&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Four Four Two");
            innerObj_.put("source_gener", "Sports");
            innerObj_.put("source_img_url", "http://d39klmotcr4bpc.cloudfront.net/assets/instance/d5821c3aedcb47f58a17cce84f9fa9eb.png");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=fox-sports&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Fox Sports");
            innerObj_.put("source_gener", "Sports");
            innerObj_.put("source_img_url", "https://upload.wikimedia.org/wikipedia/en/d/dd/Fox_Sports_Logo.png");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=google-news&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Google News");
            innerObj_.put("source_gener", "General");
            innerObj_.put("source_img_url", "http://2thetopdesign.com/wp-content/uploads/Google-News-logo-square.png");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=hacker-news&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Hacker News");
            innerObj_.put("source_gener", "Technology");
            innerObj_.put("source_img_url", "https://nomadlist.com/assets/featured/hackernews.png");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=ign&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "IGN");
            innerObj_.put("source_gener", "Gaming");
            innerObj_.put("source_img_url", "http://vignette4.wikia.nocookie.net/nintendo/images/3/36/Ign-logo.png/revision/latest?cb=20120630193251&path-prefix=en");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=independent&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Independent");
            innerObj_.put("source_gener", "General");
            innerObj_.put("source_img_url", "http://logodatabases.com/wp-content/uploads/2012/05/The-Independent-Logo.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=mashable&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Mashable");
            innerObj_.put("source_gener", "Entertainment");
            innerObj_.put("source_img_url", "https://pmcdeadline2.files.wordpress.com/2016/03/mashable-logo.png");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=metro&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "Metro");
            innerObj_.put("source_gener", "General");
            innerObj_.put("source_img_url", "http://humanitariancoalition.ca/sites/default/files/images/partner/logo/metro_news.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=mirror&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "mirror");
            innerObj_.put("source_gener", "General");
            innerObj_.put("source_img_url", "http://logonoid.com/images/daily-mirror-logo.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=mtv-news&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "mtv-news");
            innerObj_.put("source_gener", "Music");
            innerObj_.put("source_img_url", "http://starcasm.net/wp-content/uploads/2013/08/MTV_News_logo_.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=mtv-news-uk&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "mtv-news-uk");
            innerObj_.put("source_gener", "Music");
            innerObj_.put("source_img_url", "http://www.mtv.co.uk/sites/default/files/styles/image-w-520-h-292-scale-crop/public/migrated/2012/07/19/mtvnews_logo.jpg?itok=1KmUbJs4");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=new-scientist&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "new-scientist");
            innerObj_.put("source_gener", "Science and Nature");
            innerObj_.put("source_img_url", "https://subscribe.newscientist.com/Images/RBP_NS/XUS/Logo.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=newsweek&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "newsweek");
            innerObj_.put("source_gener", "General");
            innerObj_.put("source_img_url", "http://logodatabases.com/wp-content/uploads/2012/05/newsweek-logo.jpg");
            allChannelArray.put(innerObj_);



            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=new-york-magazine&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "new-york-magazine");
            innerObj_.put("source_gener", "General");
            innerObj_.put("source_img_url", "https://healthsciences.ucsd.edu/research/aging/events/PublishingImages/new-york-mag.jpg");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=nfl-news&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "nfl-news");
            innerObj_.put("source_gener", "Sports");
            innerObj_.put("source_img_url", "https://cdn2.hubspot.net/hubfs/484866/Sports_Blog_Img/NFL.jpg?t=1469289913818");
            allChannelArray.put(innerObj_);

            innerObj_ = new JSONObject();
            innerObj_.put("source_url", NewsConstants.URL_DOMAIN + "source=polygon&sortBy=top" + NewsConstants.URL_API_KEY);
            innerObj_.put("source_name", "polygon");
            innerObj_.put("source_gener", "Gaming");
            innerObj_.put("source_img_url", "http://p4rgaming.com/wp-content/uploads/2012/10/main-logo.png");
            allChannelArray.put(innerObj_);


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    public JSONArray getAllData() {
        return allChannelArray;
    }


}
