import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import java.net.MalformedURLException;
import java.util.ArrayList;
import net.runelite.mapping.Implements;
import java.io.IOException;
import netscape.javascript.JSObject;
import com.jagex.oldscape.pub.OtlTokenRequester;
import net.runelite.rs.ScriptOpcodes;
import java.net.URL;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.net.Socket;
import java.util.Iterator;
import com.jagex.oldscape.pub.OtlTokenResponse;
import java.util.Arrays;
import java.util.concurrent.Future;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import java.util.Collections;
import net.runelite.mapping.Export;
@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed , OAuthApi {
	@ObfuscatedName("rh")
	@ObfuscatedSignature(descriptor = "[Len;")
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;

	@ObfuscatedName("uv")
	@ObfuscatedGetter(intValue = 935610695)
	@Export("viewportOffsetX")
	static int viewportOffsetX;

	@ObfuscatedName("um")
	@ObfuscatedGetter(intValue = -1999216999)
	@Export("viewportOffsetY")
	static int viewportOffsetY;

	@ObfuscatedName("ve")
	@ObfuscatedGetter(intValue = -1204982751)
	public static int field770;

	@ObfuscatedName("sh")
	@Export("playingJingle")
	static boolean playingJingle;

	@ObfuscatedName("rr")
	@ObfuscatedGetter(intValue = 1324995943)
	@Export("destinationX")
	static int destinationX;

	@ObfuscatedName("vz")
	@ObfuscatedSignature(descriptor = "Lbn;")
	static final ApproximateRouteStrategy field774;

	@ObfuscatedName("sc")
	@ObfuscatedGetter(intValue = -810716679)
	@Export("destinationY")
	static int destinationY;

	@ObfuscatedName("sy")
	@Export("isCameraLocked")
	static boolean isCameraLocked;

	@ObfuscatedName("ti")
	static boolean[] field743;

	@ObfuscatedName("vj")
	static int[] field674;

	@ObfuscatedName("vf")
	static int[] field776;

	@ObfuscatedName("sq")
	@ObfuscatedGetter(intValue = 1799589947)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;

	@ObfuscatedName("ub")
	@ObfuscatedGetter(intValue = 1084011589)
	static int field535;

	@ObfuscatedName("st")
	@ObfuscatedGetter(intValue = -1215099569)
	@Export("soundEffectCount")
	static int soundEffectCount;

	@ObfuscatedName("uf")
	@ObfuscatedSignature(descriptor = "Lkt;")
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;

	@ObfuscatedName("sn")
	@Export("soundEffectIds")
	static int[] soundEffectIds;

	@ObfuscatedName("ue")
	@ObfuscatedGetter(intValue = 1282769637)
	static int field763;

	@ObfuscatedName("so")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;

	@ObfuscatedName("sd")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;

	@ObfuscatedName("sj")
	@ObfuscatedSignature(descriptor = "[Lan;")
	@Export("soundEffects")
	static SoundEffect[] soundEffects;

	@ObfuscatedName("ul")
	@ObfuscatedSignature(descriptor = "[Llu;")
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;

	@ObfuscatedName("sv")
	@Export("soundLocations")
	static int[] soundLocations;

	@ObfuscatedName("su")
	@ObfuscatedGetter(intValue = 2096040037)
	@Export("minimapState")
	static int minimapState;

	@ObfuscatedName("ut")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;

	@ObfuscatedName("ua")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;

	@ObfuscatedName("rj")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;

	@ObfuscatedName("vq")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;

	@ObfuscatedName("vl")
	@ObfuscatedGetter(intValue = 2097510307)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;

	@ObfuscatedName("rc")
	@ObfuscatedGetter(longValue = -8920117415948099427L)
	static long field728;

	@ObfuscatedName("rq")
	@ObfuscatedSignature(descriptor = "[Lex;")
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;

	@ObfuscatedName("uk")
	@ObfuscatedGetter(intValue = -190157901)
	@Export("viewportWidth")
	static int viewportWidth;

	@ObfuscatedName("rv")
	@ObfuscatedGetter(intValue = 1912439921)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;

	@ObfuscatedName("ra")
	@ObfuscatedGetter(intValue = -1001314581)
	static int field725;

	@ObfuscatedName("un")
	@ObfuscatedGetter(intValue = -1741790015)
	@Export("viewportHeight")
	static int viewportHeight;

	@ObfuscatedName("uc")
	@ObfuscatedSignature(descriptor = "Lod;")
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;

	@ObfuscatedName("rg")
	@ObfuscatedGetter(intValue = 1279667255)
	@Export("mapIconCount")
	static int mapIconCount;

	@ObfuscatedName("ry")
	@Export("mapIconXs")
	static int[] mapIconXs;

	@ObfuscatedName("rs")
	@Export("mapIconYs")
	static int[] mapIconYs;

	@ObfuscatedName("tc")
	static short field748;

	@ObfuscatedName("tw")
	static short field749;

	@ObfuscatedName("uh")
	static short field754;

	@ObfuscatedName("tt")
	static boolean field667;

	@ObfuscatedName("re")
	@ObfuscatedSignature(descriptor = "[Lqe;")
	@Export("mapIcons")
	static SpritePixels[] mapIcons;

	@ObfuscatedName("ud")
	static short field755;

	@ObfuscatedName("tu")
	static short field753;

	@ObfuscatedName("ux")
	@ObfuscatedGetter(intValue = -1670932953)
	@Export("viewportZoom")
	static int viewportZoom;

	@ObfuscatedName("tb")
	static short field752;

	@ObfuscatedName("tg")
	static int[] field762;

	@ObfuscatedName("tz")
	static int[] field745;

	@ObfuscatedName("tp")
	static int[] field537;

	@ObfuscatedName("ts")
	static int[] field747;

	@ObfuscatedName("td")
	@Export("zoomHeight")
	static short zoomHeight;

	@ObfuscatedName("tl")
	@Export("zoomWidth")
	static short zoomWidth;

	@ObfuscatedName("vv")
	@ObfuscatedGetter(intValue = 1859330951)
	static int field626;

	@ObfuscatedName("rk")
	@ObfuscatedGetter(intValue = -1407928571)
	static int field719;

	@ObfuscatedName("ru")
	static String field716;

	@ObfuscatedName("rw")
	static int[] field721;

	@ObfuscatedName("rm")
	static int[] field720;

	@ObfuscatedName("rt")
	@ObfuscatedGetter(intValue = 497802505)
	@Export("tradeChatMode")
	static int tradeChatMode;

	@ObfuscatedName("rn")
	@ObfuscatedGetter(intValue = 1719780425)
	@Export("publicChatMode")
	static int publicChatMode;

	@ObfuscatedName("rd")
	static int[] field773;

	@ObfuscatedName("uy")
	@ObfuscatedSignature(descriptor = "Lbq;")
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;

	@ObfuscatedName("uo")
	@ObfuscatedGetter(intValue = -1313039179)
	static int field588;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "[Lgv;")
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;

	@ObfuscatedName("as")
	static boolean field521;

	@ObfuscatedName("be")
	@ObfuscatedGetter(intValue = -1074570965)
	@Export("worldId")
	public static int worldId;

	@ObfuscatedName("bz")
	@ObfuscatedGetter(intValue = 946805513)
	@Export("worldProperties")
	static int worldProperties;

	@ObfuscatedName("bf")
	@ObfuscatedGetter(intValue = -1890225389)
	@Export("gameBuild")
	static int gameBuild;

	@ObfuscatedName("bn")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;

	@ObfuscatedName("bq")
	@Export("isLowDetail")
	static boolean isLowDetail;

	@ObfuscatedName("bl")
	static String field481;

	@ObfuscatedName("bh")
	@ObfuscatedGetter(intValue = 1910731347)
	static int field482;

	@ObfuscatedName("bs")
	@ObfuscatedGetter(intValue = -1905357045)
	@Export("clientType")
	static int clientType;

	@ObfuscatedName("bk")
	@ObfuscatedGetter(intValue = -1350068019)
	static int field484;

	@ObfuscatedName("bb")
	@Export("onMobile")
	static boolean onMobile;

	@ObfuscatedName("cq")
	@ObfuscatedGetter(intValue = 1269137329)
	@Export("gameState")
	static int gameState;

	@ObfuscatedName("ch")
	@Export("isLoading")
	static boolean isLoading;

	@ObfuscatedName("dm")
	@ObfuscatedGetter(intValue = 1368590037)
	@Export("cycle")
	static int cycle;

	@ObfuscatedName("dd")
	@ObfuscatedGetter(longValue = 7202440968788630607L)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;

	@ObfuscatedName("dr")
	@ObfuscatedGetter(intValue = 390292647)
	static int field605;

	@ObfuscatedName("dv")
	@ObfuscatedGetter(intValue = 1325851119)
	static int field647;

	@ObfuscatedName("dy")
	@ObfuscatedGetter(longValue = -1804668360873736025L)
	static long field662;

	@ObfuscatedName("ds")
	@Export("hadFocus")
	static boolean hadFocus;

	@ObfuscatedName("dg")
	@ObfuscatedGetter(intValue = -171892083)
	@Export("rebootTimer")
	static int rebootTimer;

	@ObfuscatedName("dp")
	@ObfuscatedGetter(intValue = 60579783)
	@Export("hintArrowType")
	static int hintArrowType;

	@ObfuscatedName("dx")
	@ObfuscatedGetter(intValue = 833909779)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;

	@ObfuscatedName("dl")
	@ObfuscatedGetter(intValue = 1006702923)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;

	@ObfuscatedName("dc")
	@ObfuscatedGetter(intValue = 515437285)
	@Export("hintArrowX")
	static int hintArrowX;

	@ObfuscatedName("dn")
	@ObfuscatedGetter(intValue = -1291351367)
	@Export("hintArrowY")
	static int hintArrowY;

	@ObfuscatedName("do")
	@ObfuscatedGetter(intValue = -1444359881)
	@Export("hintArrowHeight")
	static int hintArrowHeight;

	@ObfuscatedName("dq")
	@ObfuscatedGetter(intValue = -1056241987)
	@Export("hintArrowSubX")
	static int hintArrowSubX;

	@ObfuscatedName("dt")
	@ObfuscatedGetter(intValue = -85823269)
	@Export("hintArrowSubY")
	static int hintArrowSubY;

	@ObfuscatedName("di")
	@ObfuscatedSignature(descriptor = "Lce;")
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;

	@ObfuscatedName("da")
	@ObfuscatedSignature(descriptor = "Lce;")
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;

	@ObfuscatedName("db")
	@ObfuscatedGetter(intValue = 1131242953)
	@Export("titleLoadingStage")
	static int titleLoadingStage;

	@ObfuscatedName("de")
	@ObfuscatedSignature(descriptor = "Lnl;")
	@Export("js5Socket")
	static AbstractSocket js5Socket;

	@ObfuscatedName("ew")
	@ObfuscatedGetter(intValue = 607109525)
	@Export("js5ConnectState")
	static int js5ConnectState;

	@ObfuscatedName("ej")
	@ObfuscatedGetter(intValue = 986040805)
	static int field621;

	@ObfuscatedName("eb")
	@ObfuscatedGetter(longValue = -2878806795400476923L)
	static long field778;

	@ObfuscatedName("eo")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive4")
	static Archive archive4;

	@ObfuscatedName("et")
	@ObfuscatedGetter(intValue = -1225597433)
	@Export("js5Errors")
	static int js5Errors;

	@ObfuscatedName("fr")
	@ObfuscatedGetter(intValue = 1982553661)
	@Export("loginState")
	static int loginState;

	@ObfuscatedName("fz")
	@ObfuscatedGetter(intValue = -2060549467)
	static int field512;

	@ObfuscatedName("fh")
	@ObfuscatedGetter(intValue = 1277489)
	static int field609;

	@ObfuscatedName("fw")
	@ObfuscatedGetter(intValue = -1316290873)
	static int field514;

	@ObfuscatedName("fb")
	@ObfuscatedSignature(descriptor = "Ldj;")
	static class124 field515;

	@ObfuscatedName("fn")
	@ObfuscatedSignature(descriptor = "Lqm;")
	static class446 field516;

	@ObfuscatedName("fo")
	@ObfuscatedGetter(intValue = 1290584285)
	@Export("currentPort")
	static int currentPort;

	@ObfuscatedName("fq")
	static final String field527;

	@ObfuscatedName("gp")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;

	@ObfuscatedName("gc")
	@ObfuscatedSignature(descriptor = "Lbw;")
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;

	@ObfuscatedName("gu")
	static int[] field530;

	@ObfuscatedName("gw")
	@Export("randomDatData")
	static byte[] randomDatData;

	@ObfuscatedName("gy")
	@ObfuscatedSignature(descriptor = "[Lco;")
	@Export("npcs")
	static NPC[] npcs;

	@ObfuscatedName("ga")
	@ObfuscatedGetter(intValue = 1254072227)
	@Export("npcCount")
	static int npcCount;

	@ObfuscatedName("gq")
	@Export("npcIndices")
	static int[] npcIndices;

	@ObfuscatedName("gm")
	@ObfuscatedGetter(intValue = 1772801065)
	static int field538;

	@ObfuscatedName("gg")
	static int[] field539;

	@ObfuscatedName("gh")
	@ObfuscatedSignature(descriptor = "Lcs;")
	@Export("packetWriter")
	public static final PacketWriter packetWriter;

	@ObfuscatedName("hk")
	@ObfuscatedGetter(intValue = 1646872955)
	@Export("logoutTimer")
	static int logoutTimer;

	@ObfuscatedName("hs")
	@Export("hadNetworkError")
	static boolean hadNetworkError;

	@ObfuscatedName("hy")
	@ObfuscatedSignature(descriptor = "Lms;")
	@Export("timer")
	static Timer timer;

	@ObfuscatedName("hl")
	@Export("fontsMap")
	static HashMap fontsMap;

	@ObfuscatedName("ht")
	@ObfuscatedGetter(intValue = -202810841)
	static int field694;

	@ObfuscatedName("hg")
	@ObfuscatedGetter(intValue = -225611453)
	static int field546;

	@ObfuscatedName("hn")
	@ObfuscatedGetter(intValue = 1086571893)
	static int field547;

	@ObfuscatedName("hm")
	@ObfuscatedGetter(intValue = 1979760859)
	static int field548;

	@ObfuscatedName("ho")
	@ObfuscatedGetter(intValue = -1202603819)
	static int field549;

	@ObfuscatedName("hf")
	@Export("regions")
	static int[] regions;

	@ObfuscatedName("is")
	@Export("isInInstance")
	static boolean isInInstance;

	@ObfuscatedName("ie")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;

	@ObfuscatedName("il")
	static final int[] field582;

	@ObfuscatedName("im")
	@ObfuscatedGetter(intValue = 1380070425)
	static int field555;

	@ObfuscatedName("ia")
	@ObfuscatedGetter(intValue = 11377727)
	static int field556;

	@ObfuscatedName("ii")
	@ObfuscatedGetter(intValue = -994848647)
	static int field653;

	@ObfuscatedName("ib")
	@ObfuscatedGetter(intValue = 1437024821)
	static int field558;

	@ObfuscatedName("ip")
	@ObfuscatedGetter(intValue = -1267863299)
	static int field553;

	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;

	@ObfuscatedName("id")
	static boolean field560;

	@ObfuscatedName("ja")
	@ObfuscatedGetter(intValue = 227812733)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;

	@ObfuscatedName("jh")
	@ObfuscatedGetter(intValue = -1074847463)
	@Export("camAngleX")
	static int camAngleX;

	@ObfuscatedName("jz")
	@ObfuscatedGetter(intValue = -816340287)
	@Export("camAngleY")
	static int camAngleY;

	@ObfuscatedName("jq")
	@ObfuscatedGetter(intValue = 374512009)
	@Export("camAngleDY")
	static int camAngleDY;

	@ObfuscatedName("jv")
	@ObfuscatedGetter(intValue = 1656721383)
	@Export("camAngleDX")
	static int camAngleDX;

	@ObfuscatedName("jd")
	@ObfuscatedGetter(intValue = 566842587)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;

	@ObfuscatedName("jp")
	@ObfuscatedGetter(intValue = 1432786235)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;

	@ObfuscatedName("je")
	@ObfuscatedGetter(intValue = -1325635219)
	@Export("oculusOrbState")
	static int oculusOrbState;

	@ObfuscatedName("jg")
	@ObfuscatedGetter(intValue = -1995181845)
	@Export("camFollowHeight")
	static int camFollowHeight;

	@ObfuscatedName("jk")
	@ObfuscatedGetter(intValue = 1032499049)
	static int field570;

	@ObfuscatedName("ji")
	@ObfuscatedGetter(intValue = 1407304007)
	static int field571;

	@ObfuscatedName("jo")
	@ObfuscatedGetter(intValue = 148519397)
	static int field572;

	@ObfuscatedName("jf")
	@ObfuscatedGetter(intValue = -149009651)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;

	@ObfuscatedName("jr")
	@ObfuscatedGetter(intValue = 7759089)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;

	@ObfuscatedName("js")
	@ObfuscatedGetter(intValue = 1789144907)
	public static int field635;

	@ObfuscatedName("kp")
	static boolean field533;

	@ObfuscatedName("kr")
	@ObfuscatedGetter(intValue = -68869867)
	static int field493;

	@ObfuscatedName("kd")
	static boolean field578;

	@ObfuscatedName("kf")
	@ObfuscatedGetter(intValue = -1491072859)
	static int field681;

	@ObfuscatedName("ki")
	@ObfuscatedGetter(intValue = -1075023379)
	@Export("overheadTextCount")
	static int overheadTextCount;

	@ObfuscatedName("kt")
	@ObfuscatedGetter(intValue = 114946289)
	@Export("overheadTextLimit")
	static int overheadTextLimit;

	@ObfuscatedName("kk")
	@Export("overheadTextXs")
	static int[] overheadTextXs;

	@ObfuscatedName("kb")
	@Export("overheadTextYs")
	static int[] overheadTextYs;

	@ObfuscatedName("ke")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;

	@ObfuscatedName("kh")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;

	@ObfuscatedName("ku")
	@Export("overheadTextColors")
	static int[] overheadTextColors;

	@ObfuscatedName("kn")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;

	@ObfuscatedName("kw")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;

	@ObfuscatedName("kq")
	@Export("overheadText")
	static String[] overheadText;

	@ObfuscatedName("kc")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;

	@ObfuscatedName("kg")
	@ObfuscatedGetter(intValue = -1223447233)
	@Export("viewportDrawCount")
	static int viewportDrawCount;

	@ObfuscatedName("ka")
	@ObfuscatedGetter(intValue = 1110096171)
	@Export("viewportTempX")
	static int viewportTempX;

	@ObfuscatedName("kx")
	@ObfuscatedGetter(intValue = -1835185617)
	@Export("viewportTempY")
	static int viewportTempY;

	@ObfuscatedName("ko")
	@ObfuscatedGetter(intValue = -1319931075)
	@Export("mouseCrossX")
	static int mouseCrossX;

	@ObfuscatedName("kz")
	@ObfuscatedGetter(intValue = -1901549727)
	@Export("mouseCrossY")
	static int mouseCrossY;

	@ObfuscatedName("kj")
	@ObfuscatedGetter(intValue = 74657781)
	@Export("mouseCrossState")
	static int mouseCrossState;

	@ObfuscatedName("kl")
	@ObfuscatedGetter(intValue = -1712964005)
	@Export("mouseCrossColor")
	static int mouseCrossColor;

	@ObfuscatedName("km")
	@Export("showMouseCross")
	static boolean showMouseCross;

	@ObfuscatedName("kv")
	@ObfuscatedGetter(intValue = -1882771743)
	static int field599;

	@ObfuscatedName("ks")
	@ObfuscatedGetter(intValue = -607516803)
	static int field600;

	@ObfuscatedName("lh")
	@ObfuscatedGetter(intValue = 543552379)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;

	@ObfuscatedName("lt")
	@ObfuscatedGetter(intValue = 1208682555)
	@Export("draggedWidgetX")
	static int draggedWidgetX;

	@ObfuscatedName("ls")
	@ObfuscatedGetter(intValue = -1970131045)
	@Export("draggedWidgetY")
	static int draggedWidgetY;

	@ObfuscatedName("lv")
	@ObfuscatedGetter(intValue = -233015653)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;

	@ObfuscatedName("lw")
	static boolean field705;

	@ObfuscatedName("lq")
	@ObfuscatedGetter(intValue = 882283935)
	@Export("itemDragDuration")
	static int itemDragDuration;

	@ObfuscatedName("ln")
	@ObfuscatedGetter(intValue = 1779631475)
	static int field607;

	@ObfuscatedName("lj")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;

	@ObfuscatedName("ly")
	@ObfuscatedSignature(descriptor = "[Lci;")
	@Export("players")
	static Player[] players;

	@ObfuscatedName("lg")
	@ObfuscatedGetter(intValue = 1199512807)
	@Export("localPlayerIndex")
	static int localPlayerIndex;

	@ObfuscatedName("la")
	@ObfuscatedGetter(intValue = -1381361397)
	static int field601;

	@ObfuscatedName("lp")
	@ObfuscatedGetter(longValue = 1857087709666512391L)
	static long field612;

	@ObfuscatedName("lz")
	@Export("renderSelf")
	static boolean renderSelf;

	@ObfuscatedName("lk")
	@ObfuscatedGetter(intValue = 2032870849)
	@Export("drawPlayerNames")
	static int drawPlayerNames;

	@ObfuscatedName("li")
	@ObfuscatedGetter(intValue = 499701621)
	static int field615;

	@ObfuscatedName("ld")
	static int[] field616;

	@ObfuscatedName("mx")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;

	@ObfuscatedName("mb")
	@Export("playerMenuActions")
	static String[] playerMenuActions;

	@ObfuscatedName("ml")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;

	@ObfuscatedName("mr")
	@Export("defaultRotations")
	static int[] defaultRotations;

	@ObfuscatedName("mj")
	@ObfuscatedGetter(intValue = -573630111)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;

	@ObfuscatedName("mk")
	@ObfuscatedSignature(descriptor = "[[[Llo;")
	@Export("groundItems")
	static NodeDeque[][][] groundItems;

	@ObfuscatedName("mn")
	@ObfuscatedSignature(descriptor = "Llo;")
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;

	@ObfuscatedName("me")
	@ObfuscatedSignature(descriptor = "Llo;")
	@Export("projectiles")
	static NodeDeque projectiles;

	@ObfuscatedName("mo")
	@ObfuscatedSignature(descriptor = "Llo;")
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;

	@ObfuscatedName("mt")
	@Export("currentLevels")
	static int[] currentLevels;

	@ObfuscatedName("mw")
	@Export("levels")
	static int[] levels;

	@ObfuscatedName("mq")
	@Export("experience")
	static int[] experience;

	@ObfuscatedName("ma")
	@ObfuscatedGetter(intValue = 106403657)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;

	@ObfuscatedName("mm")
	@Export("isMenuOpen")
	static boolean isMenuOpen;

	@ObfuscatedName("md")
	@ObfuscatedGetter(intValue = 522171969)
	@Export("menuOptionsCount")
	static int menuOptionsCount;

	@ObfuscatedName("mf")
	@Export("menuArguments1")
	static int[] menuArguments1;

	@ObfuscatedName("mg")
	@Export("menuArguments2")
	static int[] menuArguments2;

	@ObfuscatedName("my")
	@Export("menuOpcodes")
	static int[] menuOpcodes;

	@ObfuscatedName("mv")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;

	@ObfuscatedName("mi")
	@Export("menuActions")
	static String[] menuActions;

	@ObfuscatedName("nv")
	@Export("menuTargets")
	static String[] menuTargets;

	@ObfuscatedName("ng")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;

	@ObfuscatedName("no")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;

	@ObfuscatedName("nh")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;

	@ObfuscatedName("nj")
	@Export("tapToDrop")
	static boolean tapToDrop;

	@ObfuscatedName("ne")
	@Export("showMouseOverText")
	static boolean showMouseOverText;

	@ObfuscatedName("nn")
	@ObfuscatedGetter(intValue = -1891205191)
	@Export("viewportX")
	static int viewportX;

	@ObfuscatedName("nq")
	@ObfuscatedGetter(intValue = 794951399)
	@Export("viewportY")
	static int viewportY;

	@ObfuscatedName("nl")
	@ObfuscatedGetter(intValue = -787071349)
	static int field638;

	@ObfuscatedName("np")
	@ObfuscatedGetter(intValue = 1198468895)
	static int field646;

	@ObfuscatedName("nw")
	@ObfuscatedGetter(intValue = 583575935)
	@Export("isItemSelected")
	static int isItemSelected;

	@ObfuscatedName("nd")
	@Export("isSpellSelected")
	static boolean isSpellSelected;

	@ObfuscatedName("nz")
	@ObfuscatedGetter(intValue = -627541487)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;

	@ObfuscatedName("ns")
	@ObfuscatedGetter(intValue = 834564635)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;

	@ObfuscatedName("nx")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;

	@ObfuscatedName("ni")
	@Export("selectedSpellName")
	static String selectedSpellName;

	@ObfuscatedName("ny")
	@ObfuscatedGetter(intValue = -1662823287)
	@Export("rootInterface")
	static int rootInterface;

	@ObfuscatedName("nu")
	@ObfuscatedSignature(descriptor = "Lpm;")
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;

	@ObfuscatedName("or")
	@ObfuscatedGetter(intValue = 656001227)
	static int field656;

	@ObfuscatedName("oj")
	@ObfuscatedGetter(intValue = 209876339)
	static int field657;

	@ObfuscatedName("ol")
	@ObfuscatedGetter(intValue = -659435717)
	@Export("chatEffects")
	static int chatEffects;

	@ObfuscatedName("on")
	@ObfuscatedGetter(intValue = -1601368233)
	static int field676;

	@ObfuscatedName("ot")
	@ObfuscatedSignature(descriptor = "Lkb;")
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;

	@ObfuscatedName("oi")
	@ObfuscatedGetter(intValue = 416479)
	@Export("runEnergy")
	static int runEnergy;

	@ObfuscatedName("om")
	@ObfuscatedGetter(intValue = 1324693451)
	@Export("weight")
	static int weight;

	@ObfuscatedName("op")
	@ObfuscatedGetter(intValue = 461459507)
	@Export("staffModLevel")
	public static int staffModLevel;

	@ObfuscatedName("ov")
	@ObfuscatedGetter(intValue = 2076010155)
	@Export("followerIndex")
	static int followerIndex;

	@ObfuscatedName("oc")
	@Export("playerMod")
	static boolean playerMod;

	@ObfuscatedName("ou")
	@ObfuscatedSignature(descriptor = "Lkb;")
	@Export("viewportWidget")
	static Widget viewportWidget;

	@ObfuscatedName("oo")
	@ObfuscatedSignature(descriptor = "Lkb;")
	@Export("clickedWidget")
	public static Widget clickedWidget;

	@ObfuscatedName("oa")
	@ObfuscatedSignature(descriptor = "Lkb;")
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;

	@ObfuscatedName("ob")
	@ObfuscatedGetter(intValue = -1712422655)
	@Export("widgetClickX")
	static int widgetClickX;

	@ObfuscatedName("ow")
	@ObfuscatedGetter(intValue = -296722423)
	@Export("widgetClickY")
	static int widgetClickY;

	@ObfuscatedName("oq")
	@ObfuscatedSignature(descriptor = "Lkb;")
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;

	@ObfuscatedName("oh")
	static boolean field767;

	@ObfuscatedName("og")
	@ObfuscatedGetter(intValue = -1791235815)
	static int field664;

	@ObfuscatedName("os")
	@ObfuscatedGetter(intValue = -839646525)
	static int field550;

	@ObfuscatedName("od")
	static boolean field675;

	@ObfuscatedName("ox")
	@ObfuscatedGetter(intValue = 1288881969)
	static int field775;

	@ObfuscatedName("oe")
	@ObfuscatedGetter(intValue = -380497981)
	static int field677;

	@ObfuscatedName("oy")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;

	@ObfuscatedName("pt")
	@ObfuscatedGetter(intValue = 285293563)
	@Export("cycleCntr")
	static int cycleCntr;

	@ObfuscatedName("pg")
	@Export("changedVarps")
	static int[] changedVarps;

	@ObfuscatedName("pn")
	@ObfuscatedGetter(intValue = 1293312285)
	@Export("changedVarpCount")
	static int changedVarpCount;

	@ObfuscatedName("pa")
	@Export("changedItemContainers")
	static int[] changedItemContainers;

	@ObfuscatedName("ph")
	@ObfuscatedGetter(intValue = -691611171)
	static int field683;

	@ObfuscatedName("pr")
	@Export("changedSkills")
	static int[] changedSkills;

	@ObfuscatedName("pf")
	@ObfuscatedGetter(intValue = -967328363)
	@Export("changedSkillsCount")
	static int changedSkillsCount;

	@ObfuscatedName("pz")
	static int[] field686;

	@ObfuscatedName("pu")
	@ObfuscatedGetter(intValue = -435906803)
	static int field687;

	@ObfuscatedName("pj")
	@ObfuscatedGetter(intValue = -74544135)
	@Export("chatCycle")
	static int chatCycle;

	@ObfuscatedName("pv")
	@ObfuscatedGetter(intValue = -1145277929)
	static int field689;

	@ObfuscatedName("pc")
	@ObfuscatedGetter(intValue = 928375515)
	static int field690;

	@ObfuscatedName("py")
	@ObfuscatedGetter(intValue = 985499809)
	static int field525;

	@ObfuscatedName("po")
	@ObfuscatedGetter(intValue = -1122398405)
	static int field692;

	@ObfuscatedName("ps")
	@ObfuscatedGetter(intValue = -954040221)
	static int field480;

	@ObfuscatedName("px")
	@ObfuscatedGetter(intValue = 814513413)
	static int field661;

	@ObfuscatedName("pp")
	@ObfuscatedGetter(intValue = -218300167)
	static int field695;

	@ObfuscatedName("qo")
	@ObfuscatedGetter(intValue = 1033995651)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;

	@ObfuscatedName("qf")
	@ObfuscatedSignature(descriptor = "Llo;")
	@Export("scriptEvents")
	static NodeDeque scriptEvents;

	@ObfuscatedName("qm")
	@ObfuscatedSignature(descriptor = "Llo;")
	static NodeDeque field698;

	@ObfuscatedName("qi")
	@ObfuscatedSignature(descriptor = "Llo;")
	static NodeDeque field699;

	@ObfuscatedName("qq")
	@ObfuscatedSignature(descriptor = "Lpm;")
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;

	@ObfuscatedName("qr")
	@ObfuscatedGetter(intValue = 1651725245)
	@Export("rootWidgetCount")
	static int rootWidgetCount;

	@ObfuscatedName("qh")
	@ObfuscatedGetter(intValue = -1575231401)
	static int field702;

	@ObfuscatedName("qn")
	static boolean[] field703;

	@ObfuscatedName("qy")
	static boolean[] field704;

	@ObfuscatedName("qu")
	static boolean[] field751;

	@ObfuscatedName("qe")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;

	@ObfuscatedName("qb")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;

	@ObfuscatedName("qs")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;

	@ObfuscatedName("qv")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;

	@ObfuscatedName("qg")
	@ObfuscatedGetter(intValue = 56462401)
	@Export("gameDrawingMode")
	static int gameDrawingMode;

	@ObfuscatedName("qj")
	@ObfuscatedGetter(longValue = 7845411661208525347L)
	static long field711;

	@ObfuscatedName("qz")
	@Export("isResizable")
	static boolean isResizable;

	@ObfuscatedName("fi")
	String field518;

	@ObfuscatedName("fe")
	@ObfuscatedSignature(descriptor = "Lu;")
	class14 field519;

	@ObfuscatedName("fu")
	@ObfuscatedSignature(descriptor = "La;")
	class19 field520;

	@ObfuscatedName("fs")
	OtlTokenRequester field733;

	@ObfuscatedName("fk")
	Future field611;

	@ObfuscatedName("fj")
	boolean field523;

	@ObfuscatedName("ft")
	@ObfuscatedSignature(descriptor = "La;")
	class19 field524;

	@ObfuscatedName("fx")
	@ObfuscatedSignature(descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;")
	RefreshAccessTokenRequester field673;

	@ObfuscatedName("fd")
	Future field526;

	@ObfuscatedName("gn")
	@ObfuscatedSignature(descriptor = "Lqt;")
	Buffer field531;

	@ObfuscatedName("go")
	@ObfuscatedSignature(descriptor = "Lw;")
	class7 field532;

	@ObfuscatedName("gz")
	@ObfuscatedGetter(longValue = 6747147557520930471L)
	long field707;

	static {
		field521 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field482 = -1;
		clientType = -1;
		field484 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field605 = -1;
		field647 = -1;
		field662 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		titleLoadingStage = 0;
		js5ConnectState = 0;
		field621 = 0;
		js5Errors = 0;
		loginState = 0;
		field512 = 0;
		field609 = 0;
		field514 = 0;
		field515 = class124.field1543;
		field516 = class446.field4751;
		int var1 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var2 = new byte[var1];
		int var3;
		for (var3 = 0; var3 < var1; ++var3) {
			char var10 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
			if (var10 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = ((byte) (var10));
			}
		}
		byte[] var0 = var2;
		var3 = var2.length;
		StringBuilder var4 = new StringBuilder();
		for (int var5 = 0; var5 < var3 + 0; var5 += 3) {
			int var6 = var0[var5] & 255;
			var4.append(class341.field4146[var6 >>> 2]);
			if (var5 < var3 - 1) {
				int var7 = var0[var5 + 1] & 255;
				var4.append(class341.field4146[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var3 - 2) {
					int var8 = var0[var5 + 2] & 255;
					var4.append(class341.field4146[(var7 & 15) << 2 | var8 >>> 6]).append(class341.field4146[var8 & 63]);
				} else {
					var4.append(class341.field4146[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(class341.field4146[(var6 & 3) << 4]).append("==");
			}
		}
		String var11 = var4.toString();
		field527 = var11;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field538 = 0;
		field539 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field694 = 0;
		field546 = 1;
		field547 = 0;
		field548 = 1;
		field549 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field582 = new int[]{ 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		field555 = 0;
		field556 = 2301979;
		field653 = 5063219;
		field558 = 3353893;
		field553 = 7759444;
		field560 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field570 = 0;
		field571 = 0;
		field572 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field635 = 0;
		field533 = false;
		field493 = 0;
		field578 = false;
		field681 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field599 = 0;
		field600 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field705 = false;
		itemDragDuration = 0;
		field607 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field601 = 0;
		field612 = -1L;
		renderSelf = true;
		drawPlayerNames = 0;
		field615 = 0;
		field616 = new int[1000];
		playerMenuOpcodes = new int[]{ 44, 45, 46, 47, 48, 49, 50, 51 };
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{ 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		leftClickOpensMenu = 0;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		shiftClickDrop = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field638 = 0;
		field646 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field656 = 0;
		field657 = -1;
		chatEffects = 0;
		field676 = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field767 = false;
		field664 = -1;
		field550 = -1;
		field675 = false;
		field775 = -1;
		field677 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field683 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field686 = new int[32];
		field687 = 0;
		chatCycle = 0;
		field689 = 0;
		field690 = 0;
		field525 = 0;
		field692 = 0;
		field480 = 0;
		field661 = 0;
		field695 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field698 = new NodeDeque();
		field699 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field702 = -2;
		field703 = new boolean[100];
		field704 = new boolean[100];
		field751 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field711 = 0L;
		isResizable = true;
		field773 = new int[]{ 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		publicChatMode = 0;
		tradeChatMode = 0;
		field716 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field719 = 0;
		field720 = new int[128];
		field721 = new int[128];
		field728 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field725 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field667 = false;
		field743 = new boolean[5];
		field762 = new int[5];
		field745 = new int[5];
		field537 = new int[5];
		field747 = new int[5];
		field748 = 256;
		field749 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field752 = 1;
		field753 = 32767;
		field754 = 1;
		field755 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field535 = -1;
		field763 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		Widget_cachedModels = new EvictingDualNodeHashTable(64);
		Widget_cachedFonts = new EvictingDualNodeHashTable(64);
		field588 = -1;
		field770 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field626 = 0;
		field774 = new ApproximateRouteStrategy();
		field674 = new int[50];
		field776 = new int[50];
	}

	public Client() {
		this.field523 = false;
		this.field707 = -1L;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1807518530")
	@Export("resizeGame")
	protected final void resizeGame() {
		field711 = class115.method2692() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1208160772")
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{ 20, 260, 10000 };
		int[] var2 = new int[]{ 1000, 100, 500 };
		if (var1 != null && var2 != null) {
			Canvas.ByteArrayPool_alternativeSizes = var1;
			class17.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			class464.ByteArrayPool_arrays = new byte[var1.length][][];
			for (int var3 = 0; var3 < Canvas.ByteArrayPool_alternativeSizes.length; ++var3) {
				class464.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field4202.add(var1[var3]);
			}
			Collections.sort(ByteArrayPool.field4202);
		} else {
			Canvas.ByteArrayPool_alternativeSizes = null;
			class17.ByteArrayPool_altSizeArrayCounts = null;
			class464.ByteArrayPool_arrays = null;
			class228.method4899();
		}
		FloorDecoration.worldPort = (gameBuild == 0) ? 43594 : worldId + 40000;
		class18.js5Port = (gameBuild == 0) ? 443 : worldId + 50000;
		currentPort = FloorDecoration.worldPort;
		PlayerComposition.field3343 = class292.field3351;
		PlayerComposition.field3342 = class292.field3349;
		WorldMapSectionType.field2793 = class292.field3350;
		PlayerComposition.field3334 = class292.field3352;
		class138.urlRequester = new class101(this.field523, 206);
		this.setUpKeyboard();
		this.method387();
		JagexCache.mouseWheel = this.mouseWheel();
		CollisionMap.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		class19.clientPreferences = class299.method5754();
		this.setUpClipboard();
		String var4 = TileItem.field1301;
		class29.field172 = this;
		if (var4 != null) {
			class29.field169 = var4;
		}
		WorldMapLabelSize.setWindowedMode(class19.clientPreferences.method2268());
		Player.friendSystem = new FriendSystem(HealthBarDefinition.loginType);
		this.field519 = new class14("tokenRequest", 1, 1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1160439504")
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = ((ArchiveDiskAction) (ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast()));
			}
			if (var1 == null) {
				int var6;
				try {
					if (class272.musicPlayerStatus == 1) {
						var6 = class272.midiPcmStream.method5254();
						if (var6 > 0 && class272.midiPcmStream.isReady()) {
							var6 -= class272.pcmSampleLength;
							if (var6 < 0) {
								var6 = 0;
							}
							class272.midiPcmStream.setPcmStreamVolume(var6);
						} else {
							class272.midiPcmStream.clear();
							class272.midiPcmStream.removeAll();
							if (class272.musicTrackArchive != null) {
								class272.musicPlayerStatus = 2;
							} else {
								class272.musicPlayerStatus = 0;
							}
							Tiles.musicTrack = null;
							class181.soundCache = null;
						}
					}
				} catch (Exception var11) {
					var11.printStackTrace();
					class272.midiPcmStream.clear();
					class272.musicPlayerStatus = 0;
					Tiles.musicTrack = null;
					class181.soundCache = null;
					class272.musicTrackArchive = null;
				}
				Renderable.playPcmPlayers();
				synchronized(KeyHandler.KeyHandler_instance) {
					++KeyHandler.KeyHandler_idleCycles;
					KeyHandler.field147 = KeyHandler.field127;
					KeyHandler.field144 = 0;
					KeyHandler.field146 = 0;
					Arrays.fill(KeyHandler.field136, false);
					Arrays.fill(KeyHandler.field141, false);
					if (KeyHandler.field140 < 0) {
						Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
						KeyHandler.field140 = KeyHandler.field139;
					} else {
						while (KeyHandler.field140 != KeyHandler.field139) {
							int var7 = KeyHandler.field138[KeyHandler.field139];
							KeyHandler.field139 = KeyHandler.field139 + 1 & 127;
							if (var7 < 0) {
								var7 = ~var7;
								if (KeyHandler.KeyHandler_pressedKeys[var7]) {
									KeyHandler.KeyHandler_pressedKeys[var7] = false;
									KeyHandler.field141[var7] = true;
									KeyHandler.field142[KeyHandler.field146] = var7;
									++KeyHandler.field146;
								}
							} else {
								if (!KeyHandler.KeyHandler_pressedKeys[var7] && KeyHandler.field144 < KeyHandler.field134.length - 1) {
									KeyHandler.field136[var7] = true;
									KeyHandler.field134[++KeyHandler.field144 - 1] = var7;
								}
								KeyHandler.KeyHandler_pressedKeys[var7] = true;
							}
						} 
					}
					if (KeyHandler.field144 > 0) {
						KeyHandler.KeyHandler_idleCycles = 0;
					}
					KeyHandler.field127 = KeyHandler.field143;
				}
				synchronized(MouseHandler.MouseHandler_instance) {
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
					MouseHandler.MouseHandler_lastButtonVolatile = 0;
				}
				if (JagexCache.mouseWheel != null) {
					var6 = JagexCache.mouseWheel.useRotation();
					mouseWheelRotation = var6;
				}
				if (gameState == 0) {
					ViewportMouse.load();
					Calendar.method5504();
				} else if (gameState == 5) {
					class16.loginScreen(this, DevicePcmPlayerProvider.fontPlain12);
					ViewportMouse.load();
					Calendar.method5504();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						class16.loginScreen(this, DevicePcmPlayerProvider.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						class16.loginScreen(this, DevicePcmPlayerProvider.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						ArchiveDiskActionHandler.method5793();
					}
				} else {
					class16.loginScreen(this, DevicePcmPlayerProvider.fontPlain12);
				}
				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}
				return;
			}
			var1.archive.load(var1.archiveDisk, ((int) (var1.key)), var1.data, false);
		} 
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-2097579655")
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label174 : {
			try {
				if (class272.musicPlayerStatus == 2) {
					if (Tiles.musicTrack == null) {
						Tiles.musicTrack = MusicTrack.readTrack(class272.musicTrackArchive, class272.musicTrackGroupId, class151.musicTrackFileId);
						if (Tiles.musicTrack == null) {
							var2 = false;
							break label174;
						}
					}
					if (class181.soundCache == null) {
						class181.soundCache = new SoundCache(class28.soundEffectsArchive, class272.musicSamplesArchive);
					}
					if (class272.midiPcmStream.loadMusicTrack(Tiles.musicTrack, class272.musicPatchesArchive, class181.soundCache, 22050)) {
						class272.midiPcmStream.clearAll();
						class272.midiPcmStream.setPcmStreamVolume(class272.musicTrackVolume);
						class272.midiPcmStream.setMusicTrack(Tiles.musicTrack, class11.musicTrackBoolean);
						class272.musicPlayerStatus = 0;
						Tiles.musicTrack = null;
						class181.soundCache = null;
						class272.musicTrackArchive = null;
						var2 = true;
						break label174;
					}
				}
			} catch (Exception var6) {
				var6.printStackTrace();
				class272.midiPcmStream.clear();
				class272.musicPlayerStatus = 0;
				Tiles.musicTrack = null;
				class181.soundCache = null;
				class272.musicTrackArchive = null;
			}
			var2 = false;
		}
		if (var2 && playingJingle && AttackOption.pcmPlayer0 != null) {
			AttackOption.pcmPlayer0.tryDiscard();
		}
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field711 && class115.method2692() > field711) {
			WorldMapLabelSize.setWindowedMode(class9.getWindowedMode());
		}
		int var4;
		if (var1) {
			for (var4 = 0; var4 < 100; ++var4) {
				field703[var4] = true;
			}
		}
		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			HitSplatDefinition.drawTitle(TileItem.fontBold12, MouseHandler.fontPlain11, DevicePcmPlayerProvider.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				HitSplatDefinition.drawTitle(TileItem.fontBold12, MouseHandler.fontPlain11, DevicePcmPlayerProvider.fontPlain12);
			} else if (gameState == 50) {
				HitSplatDefinition.drawTitle(TileItem.fontBold12, MouseHandler.fontPlain11, DevicePcmPlayerProvider.fontPlain12);
			} else if (gameState == 25) {
				if (field549 == 1) {
					if (field694 > field546) {
						field546 = field694;
					}
					var4 = (field546 * 50 - field694 * 50) / field546;
					SequenceDefinition.drawLoadingMessage("Loading - please wait." + ("<br>" + " (") + var4 + "%" + ")", false);
				} else if (field549 == 2) {
					if (field547 > field548) {
						field548 = field547;
					}
					var4 = (field548 * 50 - field547 * 50) / field548 + 50;
					SequenceDefinition.drawLoadingMessage("Loading - please wait." + ("<br>" + " (") + var4 + "%" + ")", false);
				} else {
					SequenceDefinition.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				SequenceDefinition.drawLoadingMessage("Connection lost" + ("<br>" + "Please wait - attempting to reestablish"), false);
			} else if (gameState == 45) {
				SequenceDefinition.drawLoadingMessage("Please wait...", false);
			}
		} else {
			HitSplatDefinition.drawTitle(TileItem.fontBold12, MouseHandler.fontPlain11, DevicePcmPlayerProvider.fontPlain12);
		}
		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				if (field704[var4]) {
					Message.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
					field704[var4] = false;
				}
			}
		} else if (gameState > 0) {
			Message.rasterProvider.drawFull(0, 0);
			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				field704[var4] = false;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "853101705")
	@Export("kill0")
	protected final void kill0() {
		if (class308.varcs.hasUnwrittenChanges()) {
			class308.varcs.write();
		}
		if (ItemLayer.mouseRecorder != null) {
			ItemLayer.mouseRecorder.isRunning = false;
		}
		ItemLayer.mouseRecorder = null;
		packetWriter.close();
		class83.method2118();
		NPC.method2365();
		JagexCache.mouseWheel = null;
		if (AttackOption.pcmPlayer0 != null) {
			AttackOption.pcmPlayer0.shutdown();
		}
		if (class238.pcmPlayer1 != null) {
			class238.pcmPlayer1.shutdown();
		}
		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3971 != 0) {
				ArchiveDiskActionHandler.field3971 = 1;
				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var4) {
				}
			}
		}
		if (class138.urlRequester != null) {
			class138.urlRequester.close();
			class138.urlRequester = null;
		}
		WorldMapLabel.method4999();
		this.field519.method151();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "2")
	protected final void vmethod1099() {
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-920255859")
	boolean method1102() {
		return class21.field122 != null && !class21.field122.trim().isEmpty();
	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-74")
	boolean method1103() {
		return this.field733 != null;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "45169414")
	void method1104(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(UserComparator5.field1387 + "shield/oauth/token" + new class400(var2).method7122());
		HashMap var4 = new HashMap();
		var4.put("Authorization", "Basic " + field527);
		var4.put("Host", new URL(UserComparator5.field1387).getHost());
		var4.put("Accept", class397.field4431.method7086());
		class9 var5 = class9.field36;
		RefreshAccessTokenRequester var6 = this.field673;
		if (var6 != null) {
			this.field526 = var6.request(var5.method64(), var3, var4, "");
		} else {
			class10 var7 = new class10(var3, var5, this.field523);
			Iterator var8 = var4.entrySet().iterator();
			while (var8.hasNext()) {
				Entry var9 = ((Entry) (var8.next()));
				var7.method79(((String) (var9.getKey())), ((String) (var9.getValue())));
			} 
			this.field524 = this.field519.method150(var7);
		}
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "1435757566")
	void method1481(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(UserComparator5.field1387 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		HashMap var3 = new HashMap();
		var3.put("Authorization", "Bearer " + var1);
		class9 var4 = class9.field30;
		OtlTokenRequester var5 = this.field733;
		if (var5 != null) {
			this.field611 = var5.request(var4.method64(), var2, var3, "");
		} else {
			class10 var6 = new class10(var2, var4, this.field523);
			Iterator var7 = var3.entrySet().iterator();
			while (var7.hasNext()) {
				Entry var8 = ((Entry) (var7.next()));
				var6.method79(((String) (var8.getKey())), ((String) (var8.getValue())));
			} 
			this.field520 = this.field519.method150(var6);
		}
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "116")
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			long var2 = class115.method2692();
			int var4 = ((int) (var2 - NetCache.field4029));
			NetCache.field4029 = var2;
			if (var4 > 200) {
				var4 = 200;
			}
			NetCache.NetCache_loadTime += var4;
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
				var1 = true;
			} else if (NetCache.NetCache_socket == null) {
				var1 = false;
			} else {
				try {
					label241 : {
						if (NetCache.NetCache_loadTime > 30000) {
							throw new IOException();
						}
						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
							var5 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityWrites.first()));
							var6 = new Buffer(4);
							var6.writeByte(1);
							var6.writeMedium(((int) (var5.key)));
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingPriorityWritesCount;
							++NetCache.NetCache_pendingPriorityResponsesCount;
						} 
						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
							var5 = ((NetFileRequest) (NetCache.NetCache_pendingWritesQueue.removeLast()));
							var6 = new Buffer(4);
							var6.writeByte(0);
							var6.writeMedium(((int) (var5.key)));
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							var5.removeDual();
							NetCache.NetCache_pendingResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingWritesCount;
							++NetCache.NetCache_pendingResponsesCount;
						} 
						for (int var17 = 0; var17 < 100; ++var17) {
							int var18 = NetCache.NetCache_socket.available();
							if (var18 < 0) {
								throw new IOException();
							}
							if (var18 == 0) {
								break;
							}
							NetCache.NetCache_loadTime = 0;
							byte var7 = 0;
							if (Buddy.NetCache_currentResponse == null) {
								var7 = 8;
							} else if (NetCache.field4027 == 0) {
								var7 = 1;
							}
							int var8;
							int var9;
							int var10;
							byte[] var10000;
							int var10001;
							Buffer var24;
							if (var7 > 0) {
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset;
								if (var8 > var18) {
									var8 = var18;
								}
								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8);
								if (NetCache.field4033 != 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
										var10000[var10001] ^= NetCache.field4033;
									}
								}
								var24 = NetCache.NetCache_responseHeaderBuffer;
								var24.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
									break;
								}
								if (Buddy.NetCache_currentResponse == null) {
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									int var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
									long var13 = ((long) (var10 + (var9 << 16)));
									NetFileRequest var15 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityResponses.get(var13)));
									class351.field4198 = true;
									if (var15 == null) {
										var15 = ((NetFileRequest) (NetCache.NetCache_pendingResponses.get(var13)));
										class351.field4198 = false;
									}
									if (var15 == null) {
										throw new IOException();
									}
									int var16 = (var11 == 0) ? 5 : 9;
									Buddy.NetCache_currentResponse = var15;
									ObjectSound.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + Buddy.NetCache_currentResponse.padding);
									ObjectSound.NetCache_responseArchiveBuffer.writeByte(var11);
									ObjectSound.NetCache_responseArchiveBuffer.writeInt(var12);
									NetCache.field4027 = 8;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else if (NetCache.field4027 == 0) {
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
										NetCache.field4027 = 1;
										NetCache.NetCache_responseHeaderBuffer.offset = 0;
									} else {
										Buddy.NetCache_currentResponse = null;
									}
								}
							} else {
								var8 = ObjectSound.NetCache_responseArchiveBuffer.array.length - Buddy.NetCache_currentResponse.padding;
								var9 = 512 - NetCache.field4027;
								if (var9 > var8 - ObjectSound.NetCache_responseArchiveBuffer.offset) {
									var9 = var8 - ObjectSound.NetCache_responseArchiveBuffer.offset;
								}
								if (var9 > var18) {
									var9 = var18;
								}
								NetCache.NetCache_socket.read(ObjectSound.NetCache_responseArchiveBuffer.array, ObjectSound.NetCache_responseArchiveBuffer.offset, var9);
								if (NetCache.field4033 != 0) {
									for (var10 = 0; var10 < var9; ++var10) {
										var10000 = ObjectSound.NetCache_responseArchiveBuffer.array;
										var10001 = ObjectSound.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field4033;
									}
								}
								var24 = ObjectSound.NetCache_responseArchiveBuffer;
								var24.offset += var9;
								NetCache.field4027 += var9;
								if (var8 == ObjectSound.NetCache_responseArchiveBuffer.offset) {
									if (Buddy.NetCache_currentResponse.key == 16711935L) {
										KitDefinition.field1862 = ObjectSound.NetCache_responseArchiveBuffer;
										for (var10 = 0; var10 < 256; ++var10) {
											Archive var19 = NetCache.NetCache_archives[var10];
											if (var19 != null) {
												DirectByteArrayCopier.method5512(var19, var10);
											}
										}
									} else {
										NetCache.NetCache_crc.reset();
										NetCache.NetCache_crc.update(ObjectSound.NetCache_responseArchiveBuffer.array, 0, var8);
										var10 = ((int) (NetCache.NetCache_crc.getValue()));
										if (var10 != Buddy.NetCache_currentResponse.crc) {
											try {
												NetCache.NetCache_socket.close();
											} catch (Exception var22) {
											}
											++NetCache.NetCache_crcMismatches;
											NetCache.NetCache_socket = null;
											NetCache.field4033 = ((byte) ((int) (Math.random() * 255.0 + 1.0)));
											var1 = false;
											break label241;
										}
										NetCache.NetCache_crcMismatches = 0;
										NetCache.NetCache_ioExceptions = 0;
										Buddy.NetCache_currentResponse.archive.write(((int) (Buddy.NetCache_currentResponse.key & 65535L)), ObjectSound.NetCache_responseArchiveBuffer.array, 16711680L == (Buddy.NetCache_currentResponse.key & 16711680L), class351.field4198);
									}
									Buddy.NetCache_currentResponse.remove();
									if (class351.field4198) {
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount;
									}
									NetCache.field4027 = 0;
									Buddy.NetCache_currentResponse = null;
									ObjectSound.NetCache_responseArchiveBuffer = null;
								} else {
									if (NetCache.field4027 != 512) {
										break;
									}
									NetCache.field4027 = 0;
								}
							}
						}
						var1 = true;
					}
				} catch (IOException var23) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var21) {
					}
					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
					var1 = false;
				}
			}
			if (!var1) {
				this.doCycleJs5Connect();
			}
		}
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2087398985")
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			HealthBarUpdate.updateGameState(1000);
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					HealthBarUpdate.updateGameState(1000);
					return;
				}
				field621 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}
			if (--field621 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						FloorOverlayDefinition.js5SocketTask = GameEngine.taskHandler.newSocketTask(StructComposition.worldHost, currentPort);
						++js5ConnectState;
					}
					if (js5ConnectState == 1) {
						if (FloorOverlayDefinition.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}
						if (FloorOverlayDefinition.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}
					if (js5ConnectState == 2) {
						js5Socket = class131.method2878(((Socket) (FloorOverlayDefinition.js5SocketTask.result)), 40000, 5000);
						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(206);
						js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						field778 = class115.method2692();
					}
					if (js5ConnectState == 3) {
						if (js5Socket.available() > 0) {
							int var5 = js5Socket.readUnsignedByte();
							if (var5 != 0) {
								this.js5Error(var5);
								return;
							}
							++js5ConnectState;
						} else if (class115.method2692() - field778 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}
					if (js5ConnectState == 4) {
						AbstractSocket var10 = js5Socket;
						boolean var2 = gameState > 20;
						if (NetCache.NetCache_socket != null) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var8) {
							}
							NetCache.NetCache_socket = null;
						}
						NetCache.NetCache_socket = var10;
						class115.method2693(var2);
						NetCache.NetCache_responseHeaderBuffer.offset = 0;
						Buddy.NetCache_currentResponse = null;
						ObjectSound.NetCache_responseArchiveBuffer = null;
						NetCache.field4027 = 0;
						while (true) {
							NetFileRequest var3 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityResponses.first()));
							if (var3 == null) {
								while (true) {
									var3 = ((NetFileRequest) (NetCache.NetCache_pendingResponses.first()));
									if (var3 == null) {
										if (NetCache.field4033 != 0) {
											try {
												Buffer var11 = new Buffer(4);
												var11.writeByte(4);
												var11.writeByte(NetCache.field4033);
												var11.writeShort(0);
												NetCache.NetCache_socket.write(var11.array, 0, 4);
											} catch (IOException var7) {
												try {
													NetCache.NetCache_socket.close();
												} catch (Exception var6) {
												}
												++NetCache.NetCache_ioExceptions;
												NetCache.NetCache_socket = null;
											}
										}
										NetCache.NetCache_loadTime = 0;
										NetCache.field4029 = class115.method2692();
										FloorOverlayDefinition.js5SocketTask = null;
										js5Socket = null;
										js5ConnectState = 0;
										js5Errors = 0;
										return;
									}
									NetCache.NetCache_pendingWritesQueue.addLast(var3);
									NetCache.NetCache_pendingWrites.put(var3, var3.key);
									++NetCache.NetCache_pendingWritesCount;
									--NetCache.NetCache_pendingResponsesCount;
								} 
							}
							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key);
							++NetCache.NetCache_pendingPriorityWritesCount;
							--NetCache.NetCache_pendingPriorityResponsesCount;
						} 
					}
				} catch (IOException var9) {
					this.js5Error(-3);
				}
			}
		}
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2141455936")
	@Export("js5Error")
	void js5Error(int var1) {
		FloorOverlayDefinition.js5SocketTask = null;
		js5Socket = null;
		js5ConnectState = 0;
		if (FloorDecoration.worldPort == currentPort) {
			currentPort = class18.js5Port;
		} else {
			currentPort = FloorDecoration.worldPort;
		}
		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				HealthBarUpdate.updateGameState(1000);
			} else {
				field621 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			HealthBarUpdate.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				HealthBarUpdate.updateGameState(1000);
			} else {
				field621 = 3000;
			}
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "234739213")
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		try {
			if (loginState == 0) {
				if (class306.secureRandom == null && (secureRandomFuture.isDone() || field512 > 250)) {
					class306.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}
				if (class306.secureRandom != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}
					class120.socketTask = null;
					hadNetworkError = false;
					field512 = 0;
					if (field516.method8008()) {
						try {
							this.method1104(VarcInt.field1851);
							HitSplatDefinition.method3624(21);
						} catch (Throwable var23) {
							class249.RunException_sendStackTrace(((String) (null)), var23);
							Canvas.getLoginError(65);
							return;
						}
					} else {
						HitSplatDefinition.method3624(1);
					}
				}
			}
			OtlTokenResponse var3;
			class21 var25;
			if (loginState == 21) {
				if (this.field526 != null) {
					if (!this.field526.isDone()) {
						return;
					}
					if (this.field526.isCancelled()) {
						Canvas.getLoginError(65);
						this.field526 = null;
						return;
					}
					try {
						var3 = ((OtlTokenResponse) (this.field526.get()));
						if (!var3.isSuccess()) {
							Canvas.getLoginError(65);
							this.field526 = null;
							return;
						}
						class21.field122 = var3.getAccessToken();
						VarcInt.field1851 = var3.getRefreshToken();
						this.field526 = null;
					} catch (Exception var22) {
						class249.RunException_sendStackTrace(((String) (null)), var22);
						Canvas.getLoginError(65);
						this.field526 = null;
						return;
					}
				} else {
					if (this.field524 == null) {
						Canvas.getLoginError(65);
						return;
					}
					if (!this.field524.method246()) {
						return;
					}
					if (this.field524.method251()) {
						class249.RunException_sendStackTrace(this.field524.method244(), ((Throwable) (null)));
						Canvas.getLoginError(65);
						this.field524 = null;
						return;
					}
					var25 = this.field524.method249();
					if (var25.method258() != 200) {
						Canvas.getLoginError(65);
						this.field524 = null;
						return;
					}
					field512 = 0;
					class399 var4 = new class399(var25.method262());
					try {
						class21.field122 = var4.method7100().getString("access_token");
						VarcInt.field1851 = var4.method7100().getString("refresh_token");
					} catch (Exception var21) {
						class249.RunException_sendStackTrace("Error parsing tokens", var21);
						Canvas.getLoginError(65);
						this.field524 = null;
						return;
					}
				}
				this.method1481(class21.field122);
				HitSplatDefinition.method3624(20);
			}
			if (loginState == 20) {
				if (this.field611 != null) {
					if (!this.field611.isDone()) {
						return;
					}
					if (this.field611.isCancelled()) {
						Canvas.getLoginError(65);
						this.field611 = null;
						return;
					}
					try {
						var3 = ((OtlTokenResponse) (this.field611.get()));
						if (!var3.isSuccess()) {
							Canvas.getLoginError(65);
							this.field611 = null;
							return;
						}
						this.field518 = var3.getToken();
						this.field611 = null;
					} catch (Exception var20) {
						class249.RunException_sendStackTrace(((String) (null)), var20);
						Canvas.getLoginError(65);
						this.field611 = null;
						return;
					}
				} else {
					if (this.field520 == null) {
						Canvas.getLoginError(65);
						return;
					}
					if (!this.field520.method246()) {
						return;
					}
					if (this.field520.method251()) {
						class249.RunException_sendStackTrace(this.field520.method244(), ((Throwable) (null)));
						Canvas.getLoginError(65);
						this.field520 = null;
						return;
					}
					var25 = this.field520.method249();
					if (var25.method258() != 200) {
						class249.RunException_sendStackTrace("Response code: " + var25.method258() + "Response body: " + var25.method262(), ((Throwable) (null)));
						Canvas.getLoginError(65);
						this.field520 = null;
						return;
					}
					this.field518 = var25.method262();
					this.field520 = null;
				}
				field512 = 0;
				HitSplatDefinition.method3624(1);
			}
			if (loginState == 1) {
				if (class120.socketTask == null) {
					class120.socketTask = GameEngine.taskHandler.newSocketTask(StructComposition.worldHost, currentPort);
				}
				if (class120.socketTask.status == 2) {
					throw new IOException();
				}
				if (class120.socketTask.status == 1) {
					var1 = class131.method2878(((Socket) (class120.socketTask.result)), 40000, 5000);
					packetWriter.setSocket(var1);
					class120.socketTask = null;
					HitSplatDefinition.method3624(2);
				}
			}
			PacketBufferNode var26;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var26 = MusicPatchNode.method5473();
				var26.packetBuffer.writeByte(LoginPacket.field3152.id);
				packetWriter.addNode(var26);
				packetWriter.flush();
				var2.offset = 0;
				HitSplatDefinition.method3624(3);
			}
			int var13;
			if (loginState == 3) {
				if (AttackOption.pcmPlayer0 != null) {
					AttackOption.pcmPlayer0.method715();
				}
				if (class238.pcmPlayer1 != null) {
					class238.pcmPlayer1.method715();
				}
				if (var1.isAvailable(1)) {
					var13 = var1.readUnsignedByte();
					if (AttackOption.pcmPlayer0 != null) {
						AttackOption.pcmPlayer0.method715();
					}
					if (class238.pcmPlayer1 != null) {
						class238.pcmPlayer1.method715();
					}
					if (var13 != 0) {
						Canvas.getLoginError(var13);
						return;
					}
					var2.offset = 0;
					HitSplatDefinition.method3624(4);
				}
			}
			if (loginState == 4) {
				if (var2.offset < 8) {
					var13 = var1.available();
					if (var13 > 8 - var2.offset) {
						var13 = 8 - var2.offset;
					}
					if (var13 > 0) {
						var1.read(var2.array, var2.offset, var13);
						var2.offset += var13;
					}
				}
				if (var2.offset == 8) {
					var2.offset = 0;
					UserList.field4320 = var2.readLong();
					HitSplatDefinition.method3624(5);
				}
			}
			if (loginState == 5) {
				Client.packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var28 = new PacketBuffer(500);
				int[] var27 = new int[]{ class306.secureRandom.nextInt(), class306.secureRandom.nextInt(), class306.secureRandom.nextInt(), class306.secureRandom.nextInt() };
				var28.offset = 0;
				var28.writeByte(1);
				var28.writeInt(var27[0]);
				var28.writeInt(var27[1]);
				var28.writeInt(var27[2]);
				var28.writeInt(var27[3]);
				var28.writeLong(UserList.field4320);
				if (gameState == 40) {
					var28.writeInt(field530[0]);
					var28.writeInt(field530[1]);
					var28.writeInt(field530[2]);
					var28.writeInt(field530[3]);
				} else {
					if (gameState == 50) {
						var28.writeByte(class124.field1547.rsOrdinal());
						var28.writeInt(class174.field1891);
					} else {
						var28.writeByte(field515.rsOrdinal());
						switch (Client.field515.field1548) {
							case 0 :
								var28.writeInt(((Integer) (class19.clientPreferences.parameters.get(Projectile.method1950(Login.Login_username)))));
								break;
							case 1 :
								var28.offset += 4;
								break;
							case 2 :
							case 4 :
								var28.writeMedium(class240.field2846);
								++var28.offset;
							case 3 :
						}
					}
					if (field516.method8008()) {
						var28.writeByte(class446.field4750.rsOrdinal());
						var28.writeStringCp1252NullTerminated(this.field518);
					} else {
						var28.writeByte(class446.field4751.rsOrdinal());
						var28.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}
				var28.encryptRsa(class67.field886, class67.field885);
				field530 = var27;
				PacketBufferNode var6;
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var6 = new PacketBufferNode();
				} else {
					var6 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}
				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(LoginPacket.field3146.id);
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field3145.id);
				}
				var6.packetBuffer.writeShort(0);
				int var14 = var6.packetBuffer.offset;
				var6.packetBuffer.writeInt(206);
				var6.packetBuffer.writeInt(1);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field484);
				var6.packetBuffer.writeBytes(var28.array, 0, var28.offset);
				int var8 = var6.packetBuffer.offset;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(Script.canvasWidth);
				var6.packetBuffer.writeShort(class78.canvasHeight);
				PacketBuffer var9 = var6.packetBuffer;
				if (randomDatData != null) {
					var9.writeBytes(randomDatData, 0, Client.randomDatData.length);
				} else {
					byte[] var10 = ModeWhere.method6082();
					var9.writeBytes(var10, 0, var10.length);
				}
				var6.packetBuffer.writeStringCp1252NullTerminated(GrandExchangeOfferTotalQuantityComparator.field4045);
				var6.packetBuffer.writeInt(class17.field99);
				Buffer var38 = new Buffer(Occluder.platformInfo.size());
				Occluder.platformInfo.write(var38);
				var6.packetBuffer.writeBytes(var38.array, 0, var38.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				var6.packetBuffer.writeIntLE(Language.field4098.hash);
				var6.packetBuffer.writeShortLE(WorldMapSectionType.archive9.hash);
				var6.packetBuffer.writeIntLE(class121.archive6.hash);
				var6.packetBuffer.writeIntLE(ApproximateRouteStrategy.archive10.hash);
				var6.packetBuffer.writeInt(Varcs.archive5.hash);
				var6.packetBuffer.writeIntLE(AbstractUserComparator.archive18.hash);
				var6.packetBuffer.writeIntLE(WorldMapEvent.field2882.hash);
				var6.packetBuffer.writeShortLE(class341.archive7.hash);
				var6.packetBuffer.writeIntIME(class140.archive2.hash);
				var6.packetBuffer.writeShortLE(MouseHandler.archive19.hash);
				var6.packetBuffer.writeShortLE(class304.archive8.hash);
				var6.packetBuffer.writeIntLE(class10.archive11.hash);
				var6.packetBuffer.writeInt(0);
				var6.packetBuffer.writeIntLE(WorldMapSprite.archive14.hash);
				var6.packetBuffer.writeIntIME(UserComparator7.field1383.hash);
				var6.packetBuffer.writeIntIME(Client.archive4.hash);
				var6.packetBuffer.writeShortLE(class67.archive15.hash);
				var6.packetBuffer.writeInt(AbstractByteArrayCopier.archive13.hash);
				var6.packetBuffer.writeIntLE(class4.archive20.hash);
				var6.packetBuffer.writeIntLE(class6.archive17.hash);
				var6.packetBuffer.writeIntIME(class267.archive12.hash);
				var6.packetBuffer.xteaEncrypt(var27, var8, var6.packetBuffer.offset);
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var14);
				packetWriter.addNode(var6);
				packetWriter.flush();
				Client.packetWriter.isaacCipher = new IsaacCipher(var27);
				int[] var11 = new int[4];
				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var27[var12] + 50;
				}
				var2.newIsaacCipher(var11);
				HitSplatDefinition.method3624(6);
			}
			int var15;
			if (loginState == 6 && var1.available() > 0) {
				var13 = var1.readUnsignedByte();
				if (var13 == 61) {
					var15 = var1.available();
					VarpDefinition.field1821 = var15 == 1 && var1.readUnsignedByte() == 1;
					HitSplatDefinition.method3624(5);
				}
				if (var13 == 21 && gameState == 20) {
					HitSplatDefinition.method3624(12);
				} else if (var13 == 2) {
					HitSplatDefinition.method3624(14);
				} else if (var13 == 15 && gameState == 40) {
					Client.packetWriter.serverPacketLength = -1;
					HitSplatDefinition.method3624(19);
				} else if (var13 == 64) {
					HitSplatDefinition.method3624(10);
				} else if (var13 == 23 && field609 < 1) {
					++field609;
					HitSplatDefinition.method3624(0);
				} else if (var13 == 29) {
					HitSplatDefinition.method3624(17);
				} else {
					if (var13 != 69) {
						Canvas.getLoginError(var13);
						return;
					}
					HitSplatDefinition.method3624(7);
				}
			}
			if (loginState == 7 && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				HealthBarDefinition.field1888 = var2.readUnsignedShort();
				HitSplatDefinition.method3624(8);
			}
			if (loginState == 8 && var1.available() >= HealthBarDefinition.field1888) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, HealthBarDefinition.field1888);
				class6[] var30 = new class6[]{ class6.field17 };
				class6 var29 = var30[var2.readUnsignedByte()];
				try {
					switch (var29.field16) {
						case 0 :
							class0 var5 = new class0();
							this.field532 = new class7(var2, var5);
							HitSplatDefinition.method3624(9);
							break;
						default :
							throw new IllegalArgumentException();
					}
				} catch (Exception var19) {
					Canvas.getLoginError(22);
					return;
				}
			}
			if (loginState == 9 && this.field532.method46()) {
				this.field531 = this.field532.method42();
				this.field532.method41();
				this.field532 = null;
				if (this.field531 == null) {
					Canvas.getLoginError(22);
					return;
				}
				packetWriter.clearBuffer();
				var26 = MusicPatchNode.method5473();
				var26.packetBuffer.writeByte(LoginPacket.field3147.id);
				var26.packetBuffer.writeShort(this.field531.offset);
				var26.packetBuffer.writeBuffer(this.field531);
				packetWriter.addNode(var26);
				packetWriter.flush();
				this.field531 = null;
				HitSplatDefinition.method3624(6);
			}
			if (loginState == 10 && var1.available() > 0) {
				DirectByteArrayCopier.field3306 = var1.readUnsignedByte();
				HitSplatDefinition.method3624(11);
			}
			if (loginState == 11 && var1.available() >= DirectByteArrayCopier.field3306) {
				var1.read(var2.array, 0, DirectByteArrayCopier.field3306);
				var2.offset = 0;
				HitSplatDefinition.method3624(6);
			}
			if (loginState == 12 && var1.available() > 0) {
				field514 = (var1.readUnsignedByte() + 3) * 60;
				HitSplatDefinition.method3624(13);
			}
			if (loginState == 13) {
				field512 = 0;
				class101.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field514 / 60 + " seconds.");
				if (--field514 <= 0) {
					HitSplatDefinition.method3624(0);
				}
			} else {
				if (loginState == 14 && var1.available() >= 1) {
					HealthBarUpdate.field1206 = var1.readUnsignedByte();
					HitSplatDefinition.method3624(15);
				}
				int var16;
				boolean var40;
				if (loginState == 15 && var1.available() >= HealthBarUpdate.field1206) {
					boolean var39 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					var40 = false;
					if (var39) {
						var15 = var2.readByteIsaac() << 24;
						var15 |= var2.readByteIsaac() << 16;
						var15 |= var2.readByteIsaac() << 8;
						var15 |= var2.readByteIsaac();
						var16 = Projectile.method1950(Login.Login_username);
						if (class19.clientPreferences.parameters.size() >= 10 && !class19.clientPreferences.parameters.containsKey(var16)) {
							Iterator var37 = class19.clientPreferences.parameters.entrySet().iterator();
							var37.next();
							var37.remove();
						}
						class19.clientPreferences.parameters.put(var16, var15);
					}
					if (Login_isUsernameRemembered) {
						class19.clientPreferences.method2260(Login.Login_username);
					} else {
						class19.clientPreferences.method2260(((String) (null)));
					}
					class220.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field601 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.field707 = var2.readLong();
					if (HealthBarUpdate.field1206 >= 29) {
						var1.read(var2.array, 0, 8);
						var2.offset = 0;
						field612 = var2.readLong();
					}
					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var33 = FloorUnderlayDefinition.ServerPacket_values();
					int var17 = var2.readSmartByteShortIsaac();
					if (var17 < 0 || var17 >= var33.length) {
						throw new IOException(var17 + " " + var2.offset);
					}
					Client.packetWriter.serverPacket = var33[var17];
					Client.packetWriter.serverPacketLength = Client.packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					Client.packetWriter.serverPacketLength = var2.readUnsignedShort();
					try {
						class27.method346(class353.client, "zap");
					} catch (Throwable var18) {
					}
					HitSplatDefinition.method3624(16);
				}
				if (loginState != 16) {
					if (loginState == 17 && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						class432.field4663 = var2.readUnsignedShort();
						HitSplatDefinition.method3624(18);
					}
					if (loginState == 18 && var1.available() >= class432.field4663) {
						var2.offset = 0;
						var1.read(var2.array, 0, class432.field4663);
						var2.offset = 0;
						String var36 = var2.readStringCp1252NullTerminated();
						String var32 = var2.readStringCp1252NullTerminated();
						String var34 = var2.readStringCp1252NullTerminated();
						class101.setLoginResponseString(var36, var32, var34);
						HealthBarUpdate.updateGameState(10);
						if (field516.method8008()) {
							WorldMapData_1.method4872(9);
						}
					}
					if (loginState == 19) {
						if (Client.packetWriter.serverPacketLength == -1) {
							if (var1.available() < 2) {
								return;
							}
							var1.read(var2.array, 0, 2);
							var2.offset = 0;
							Client.packetWriter.serverPacketLength = var2.readUnsignedShort();
						}
						if (var1.available() >= Client.packetWriter.serverPacketLength) {
							var1.read(var2.array, 0, Client.packetWriter.serverPacketLength);
							var2.offset = 0;
							var13 = Client.packetWriter.serverPacketLength;
							timer.method6514();
							SoundSystem.method736();
							AbstractUserComparator.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field512;
						if (field512 > 2000) {
							if (field609 < 1) {
								if (FloorDecoration.worldPort == currentPort) {
									currentPort = class18.js5Port;
								} else {
									currentPort = FloorDecoration.worldPort;
								}
								++field609;
								HitSplatDefinition.method3624(0);
							} else {
								Canvas.getLoginError(-3);
							}
						}
					}
				} else if (var1.available() >= Client.packetWriter.serverPacketLength) {
					var2.offset = 0;
					var1.read(var2.array, 0, Client.packetWriter.serverPacketLength);
					timer.method6511();
					mouseLastLastPressedTimeMillis = -1L;
					ItemLayer.mouseRecorder.index = 0;
					ModelData0.hasFocus = true;
					hadFocus = true;
					field728 = -1L;
					PacketBufferNode.method5202();
					packetWriter.clearBuffer();
					Client.packetWriter.packetBuffer.offset = 0;
					Client.packetWriter.serverPacket = null;
					Client.packetWriter.field1350 = null;
					Client.packetWriter.field1347 = null;
					Client.packetWriter.field1352 = null;
					Client.packetWriter.serverPacketLength = 0;
					Client.packetWriter.field1342 = 0;
					rebootTimer = 0;
					logoutTimer = 0;
					hintArrowType = 0;
					class125.method2824();
					class328.method6056(0);
					Messages.Messages_channels.clear();
					Messages.Messages_hashTable.clear();
					Messages.Messages_queue.clear();
					Messages.Messages_count = 0;
					isItemSelected = 0;
					isSpellSelected = false;
					soundEffectCount = 0;
					camAngleY = 0;
					oculusOrbState = 0;
					UrlRequester.field1362 = null;
					minimapState = 0;
					field725 = -1;
					destinationX = 0;
					destinationY = 0;
					playerAttackOption = AttackOption.AttackOption_hidden;
					npcAttackOption = AttackOption.AttackOption_hidden;
					npcCount = 0;
					AbstractWorldMapData.method4958();
					for (var13 = 0; var13 < 2048; ++var13) {
						players[var13] = null;
					}
					for (var13 = 0; var13 < 32768; ++var13) {
						npcs[var13] = null;
					}
					combatTargetPlayerIndex = -1;
					projectiles.clear();
					graphicsObjects.clear();
					for (var13 = 0; var13 < 4; ++var13) {
						for (var15 = 0; var15 < 104; ++var15) {
							for (var16 = 0; var16 < 104; ++var16) {
								groundItems[var13][var15][var16] = null;
							}
						}
					}
					pendingSpawns = new NodeDeque();
					Player.friendSystem.clear();
					for (var13 = 0; var13 < VarpDefinition.field1822; ++var13) {
						VarpDefinition var31 = FloorUnderlayDefinition.VarpDefinition_get(var13);
						if (var31 != null) {
							Varps.Varps_temp[var13] = 0;
							Varps.Varps_main[var13] = 0;
						}
					}
					class308.varcs.clearTransient();
					followerIndex = -1;
					if (rootInterface != -1) {
						var13 = rootInterface;
						if (var13 != -1 && class228.Widget_loadedInterfaces[var13]) {
							MusicPatchPcmStream.Widget_archive.clearFilesGroup(var13);
							if (SoundCache.Widget_interfaceComponents[var13] != null) {
								var40 = true;
								for (var16 = 0; var16 < SoundCache.Widget_interfaceComponents[var13].length; ++var16) {
									if (SoundCache.Widget_interfaceComponents[var13][var16] != null) {
										if (SoundCache.Widget_interfaceComponents[var13][var16].type != 2) {
											SoundCache.Widget_interfaceComponents[var13][var16] = null;
										} else {
											var40 = false;
										}
									}
								}
								if (var40) {
									SoundCache.Widget_interfaceComponents[var13] = null;
								}
								class228.Widget_loadedInterfaces[var13] = false;
							}
						}
					}
					for (InterfaceParent var35 = ((InterfaceParent) (interfaceParents.first())); var35 != null; var35 = ((InterfaceParent) (interfaceParents.next()))) {
						MusicPatchPcmStream.closeInterface(var35, true);
					}
					rootInterface = -1;
					interfaceParents = new NodeHashTable(8);
					meslayerContinueWidget = null;
					class125.method2824();
					playerAppearance.update(((int[]) (null)), new int[]{ 0, 0, 0, 0, 0 }, false, -1);
					for (var13 = 0; var13 < 8; ++var13) {
						playerMenuActions[var13] = null;
						playerOptionsPriorities[var13] = false;
					}
					class125.method2830();
					isLoading = true;
					for (var13 = 0; var13 < 100; ++var13) {
						field703[var13] = true;
					}
					SpriteMask.method5522();
					Huffman.friendsChat = null;
					HealthBar.guestClanSettings = null;
					Arrays.fill(currentClanSettings, ((Object) (null)));
					class150.guestClanChannel = null;
					Arrays.fill(currentClanChannels, ((Object) (null)));
					for (var13 = 0; var13 < 8; ++var13) {
						grandExchangeOffers[var13] = new GrandExchangeOffer();
					}
					class143.grandExchangeEvents = null;
					AbstractUserComparator.updatePlayer(var2);
					GrandExchangeOffer.field4070 = -1;
					class294.loadRegions(false, var2);
					Client.packetWriter.serverPacket = null;
				}
			}
		} catch (IOException var24) {
			if (field609 < 1) {
				if (FloorDecoration.worldPort == currentPort) {
					currentPort = class18.js5Port;
				} else {
					currentPort = FloorDecoration.worldPort;
				}
				++field609;
				HitSplatDefinition.method3624(0);
			} else {
				Canvas.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2106360630")
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}
		if (logoutTimer > 0) {
			--logoutTimer;
		}
		if (hadNetworkError) {
			hadNetworkError = false;
			class131.method2877();
		} else {
			if (!isMenuOpen) {
				InterfaceParent.addCancelMenuEntry();
			}
			int var1;
			for (var1 = 0; var1 < 100 && this.method1120(packetWriter); ++var1) {
			}
			if (gameState == 30) {
				int var2;
				PacketBufferNode var14;
				while (class6.method37()) {
					var14 = EnumComposition.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					ArchiveDiskAction.performReflectionCheck(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				} 
				if (Client.timer.field4223) {
					var14 = EnumComposition.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					timer.write(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
					timer.method6513();
				}
				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				synchronized(ItemLayer.mouseRecorder.lock) {
					if (!field521) {
						ItemLayer.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || ItemLayer.mouseRecorder.index >= 40) {
						PacketBufferNode var15 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;
						for (var7 = 0; var7 < ItemLayer.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = ItemLayer.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}
							var9 = ItemLayer.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}
							if (var9 != field605 || var8 != field647) {
								if (var15 == null) {
									var15 = EnumComposition.getPacketBufferNode(ClientPacket.field2931, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeByte(0);
									var3 = var15.packetBuffer.offset;
									PacketBuffer var10000 = var15.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}
								if (field662 != -1L) {
									var10 = var9 - field605;
									var11 = var8 - field647;
									var12 = ((int) ((ItemLayer.mouseRecorder.millis[var7] - field662) / 20L));
									var5 = ((int) (((long) (var5)) + (ItemLayer.mouseRecorder.millis[var7] - field662) % 20L));
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}
								field605 = var9;
								field647 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var15.packetBuffer.writeByte(var12 + 128);
									var15.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var15.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}
								++var6;
								field662 = ItemLayer.mouseRecorder.millis[var7];
							}
						}
						if (var15 != null) {
							var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var3);
							var7 = var15.packetBuffer.offset;
							var15.packetBuffer.offset = var3;
							var15.packetBuffer.writeByte(var5 / var6);
							var15.packetBuffer.writeByte(var5 % var6);
							var15.packetBuffer.offset = var7;
							packetWriter.addNode(var15);
						}
						if (var4 >= ItemLayer.mouseRecorder.index) {
							ItemLayer.mouseRecorder.index = 0;
						} else {
							MouseRecorder var42 = ItemLayer.mouseRecorder;
							var42.index -= var4;
							System.arraycopy(ItemLayer.mouseRecorder.xs, var4, ItemLayer.mouseRecorder.xs, 0, ItemLayer.mouseRecorder.index);
							System.arraycopy(ItemLayer.mouseRecorder.ys, var4, ItemLayer.mouseRecorder.ys, 0, ItemLayer.mouseRecorder.index);
							System.arraycopy(ItemLayer.mouseRecorder.millis, var4, ItemLayer.mouseRecorder.millis, 0, ItemLayer.mouseRecorder.index);
						}
					}
				}
				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !class122.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
					if (var16 > 32767L) {
						var16 = 32767L;
					}
					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > class78.canvasHeight) {
						var3 = class78.canvasHeight;
					}
					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > Script.canvasWidth) {
						var4 = Script.canvasWidth;
					}
					var5 = ((int) (var16));
					var18 = EnumComposition.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, Client.packetWriter.isaacCipher);
					var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
					var18.packetBuffer.writeShort(var4);
					var18.packetBuffer.writeShort(var3);
					packetWriter.addNode(var18);
				}
				if (KeyHandler.field144 > 0) {
					var14 = EnumComposition.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(0);
					var2 = var14.packetBuffer.offset;
					long var19 = class115.method2692();
					for (var5 = 0; var5 < KeyHandler.field144; ++var5) {
						long var21 = var19 - field728;
						if (var21 > 16777215L) {
							var21 = 16777215L;
						}
						field728 = var19;
						var14.packetBuffer.writeByteAdd(KeyHandler.field134[var5]);
						var14.packetBuffer.writeMedium(((int) (var21)));
					}
					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}
				if (field493 > 0) {
					--field493;
				}
				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
					field578 = true;
				}
				if (field578 && field493 <= 0) {
					field493 = 20;
					field578 = false;
					var14 = EnumComposition.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeShortLE(camAngleY);
					var14.packetBuffer.writeShortAddLE(camAngleX);
					packetWriter.addNode(var14);
				}
				if (ModelData0.hasFocus && !hadFocus) {
					hadFocus = true;
					var14 = EnumComposition.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(1);
					packetWriter.addNode(var14);
				}
				if (!ModelData0.hasFocus && hadFocus) {
					hadFocus = false;
					var14 = EnumComposition.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					packetWriter.addNode(var14);
				}
				if (class121.worldMap != null) {
					class121.worldMap.method7182();
				}
				SoundSystem.method743();
				AbstractWorldMapData.method4985();
				Messages.method2494();
				if (gameState == 30) {
					for (PendingSpawn var36 = ((PendingSpawn) (pendingSpawns.last())); var36 != null; var36 = ((PendingSpawn) (pendingSpawns.previous()))) {
						if (var36.hitpoints > 0) {
							--var36.hitpoints;
						}
						if (var36.hitpoints == 0) {
							if (var36.objectId < 0 || class298.method5753(var36.objectId, var36.field1122)) {
								class285.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y, var36.objectId, var36.field1121, var36.field1122);
								var36.remove();
							}
						} else {
							if (var36.delay > 0) {
								--var36.delay;
							}
							if (var36.delay == 0 && var36.x >= 1 && var36.y >= 1 && var36.x <= 102 && var36.y <= 102 && (var36.id < 0 || class298.method5753(var36.id, var36.field1125))) {
								class285.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y, var36.id, var36.orientation, var36.field1125);
								var36.delay = -1;
								if (var36.objectId == var36.id && var36.objectId == -1) {
									var36.remove();
								} else if (var36.id == var36.objectId && var36.field1121 == var36.orientation && var36.field1125 == var36.field1122) {
									var36.remove();
								}
							}
						}
					}
					ModelData0.method4532();
					++Client.packetWriter.field1342;
					if (Client.packetWriter.field1342 > 750) {
						class131.method2877();
					} else {
						PacketBuffer.method7714();
						for (var1 = 0; var1 < npcCount; ++var1) {
							var2 = npcIndices[var1];
							NPC var23 = npcs[var2];
							if (var23 != null) {
								class285.updateActorSequence(var23, var23.definition.size);
							}
						}
						UrlRequester.method2536();
						++field555;
						if (mouseCrossColor != 0) {
							mouseCrossState += 20;
							if (mouseCrossState >= 400) {
								mouseCrossColor = 0;
							}
						}
						if (class1.field4 != null) {
							++field599;
							if (field599 >= 15) {
								ChatChannel.invalidateWidget(class1.field4);
								class1.field4 = null;
							}
						}
						Widget var37 = Language.mousedOverWidgetIf1;
						Widget var38 = SoundSystem.field313;
						Language.mousedOverWidgetIf1 = null;
						SoundSystem.field313 = null;
						draggedOnWidget = null;
						field675 = false;
						field767 = false;
						field719 = 0;
						while (class18.isKeyDown() && field719 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class272.field3196 == 66) {
								String var40 = FloorOverlayDefinition.method3815();
								class353.client.method385(var40);
							} else if (oculusOrbState != 1 || HealthBar.field1258 <= 0) {
								field721[field719] = class272.field3196;
								field720[field719] = HealthBar.field1258;
								++field719;
							}
						} 
						boolean var31 = staffModLevel >= 2;
						if (var31 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var4 = class101.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}
							if (var4 != class101.localPlayer.plane) {
								var5 = class101.localPlayer.pathX[0] + class28.baseX;
								var6 = class101.localPlayer.pathY[0] + WorldMapLabelSize.baseY;
								PacketBufferNode var24 = EnumComposition.getPacketBufferNode(ClientPacket.CLICKWORLDMAP_TELEPORT, Client.packetWriter.isaacCipher);
								var24.packetBuffer.writeByteNeg(var4);
								var24.packetBuffer.writeShortLE(var6);
								var24.packetBuffer.writeIntLE(0);
								var24.packetBuffer.writeShortLE(var5);
								packetWriter.addNode(var24);
							}
							mouseWheelRotation = 0;
						}
						if (rootInterface != -1) {
							class16.updateRootInterface(rootInterface, 0, 0, Script.canvasWidth, class78.canvasHeight, 0, 0);
						}
						++cycleCntr;
						while (true) {
							ScriptEvent var25;
							Widget var26;
							Widget var39;
							do {
								var25 = ((ScriptEvent) (field698.removeLast()));
								if (var25 == null) {
									while (true) {
										do {
											var25 = ((ScriptEvent) (field699.removeLast()));
											if (var25 == null) {
												while (true) {
													do {
														var25 = ((ScriptEvent) (scriptEvents.removeLast()));
														if (var25 == null) {
															this.menu();
															class132.method2887();
															if (clickedWidget != null) {
																this.method1511();
															}
															PacketBufferNode var27;
															if (Interpreter.dragInventoryWidget != null) {
																ChatChannel.invalidateWidget(Interpreter.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field705) {
																		if (class161.hoveredItemContainer == Interpreter.dragInventoryWidget && dragItemSlotDestination != dragItemSlotSource) {
																			Widget var41 = Interpreter.dragInventoryWidget;
																			byte var32 = 0;
																			if (field676 == 1 && var41.contentType == 206) {
																				var32 = 1;
																			}
																			if (var41.itemIds[dragItemSlotDestination] <= 0) {
																				var32 = 0;
																			}
																			var7 = class124.getWidgetFlags(var41);
																			boolean var33 = (var7 >> 29 & 1) != 0;
																			if (var33) {
																				var8 = dragItemSlotSource;
																				var9 = dragItemSlotDestination;
																				var41.itemIds[var9] = var41.itemIds[var8];
																				var41.itemQuantities[var9] = var41.itemQuantities[var8];
																				var41.itemIds[var8] = -1;
																				var41.itemQuantities[var8] = 0;
																			} else if (var32 == 1) {
																				var8 = dragItemSlotSource;
																				var9 = dragItemSlotDestination;
																				while (var8 != var9) {
																					if (var8 > var9) {
																						var41.swapItems(var8 - 1, var8);
																						--var8;
																					} else if (var8 < var9) {
																						var41.swapItems(var8 + 1, var8);
																						++var8;
																					}
																				} 
																			} else {
																				var41.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}
																			var27 = EnumComposition.getPacketBufferNode(ClientPacket.IF_BUTTOND, Client.packetWriter.isaacCipher);
																			var27.packetBuffer.writeShortAddLE(dragItemSlotSource);
																			var27.packetBuffer.writeIntIME(Interpreter.dragInventoryWidget.id);
																			var27.packetBuffer.writeByteAdd(var32);
																			var27.packetBuffer.writeShortAddLE(dragItemSlotDestination);
																			packetWriter.addNode(var27);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		CollisionMap.method3906(draggedWidgetX, draggedWidgetY);
																	}
																	field599 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	Interpreter.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field705 = true;
																}
															}
															if (Scene.shouldSendWalk()) {
																var4 = Scene.Scene_selectedX;
																var5 = Scene.Scene_selectedY;
																var18 = EnumComposition.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, Client.packetWriter.isaacCipher);
																var18.packetBuffer.writeByte(5);
																var18.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1 : 0);
																var18.packetBuffer.writeShort(var4 + class28.baseX);
																var18.packetBuffer.writeShortLE(var5 + WorldMapLabelSize.baseY);
																packetWriter.addNode(var18);
																Scene.method4195();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var4;
																destinationY = var5;
															}
															if (var37 != Language.mousedOverWidgetIf1) {
																if (var37 != null) {
																	ChatChannel.invalidateWidget(var37);
																}
																if (Language.mousedOverWidgetIf1 != null) {
																	ChatChannel.invalidateWidget(Language.mousedOverWidgetIf1);
																}
															}
															if (var38 != SoundSystem.field313 && field638 == field646) {
																if (var38 != null) {
																	ChatChannel.invalidateWidget(var38);
																}
																if (SoundSystem.field313 != null) {
																	ChatChannel.invalidateWidget(SoundSystem.field313);
																}
															}
															if (SoundSystem.field313 != null) {
																if (field638 < field646) {
																	++field638;
																	if (field638 == field646) {
																		ChatChannel.invalidateWidget(SoundSystem.field313);
																	}
																}
															} else if (field638 > 0) {
																--field638;
															}
															if (oculusOrbState == 0) {
																var4 = class101.localPlayer.x;
																var5 = class101.localPlayer.y;
																if (InterfaceParent.oculusOrbFocalPointX - var4 < -500 || InterfaceParent.oculusOrbFocalPointX - var4 > 500 || class141.oculusOrbFocalPointY - var5 < -500 || class141.oculusOrbFocalPointY - var5 > 500) {
																	InterfaceParent.oculusOrbFocalPointX = var4;
																	class141.oculusOrbFocalPointY = var5;
																}
																if (var4 != InterfaceParent.oculusOrbFocalPointX) {
																	InterfaceParent.oculusOrbFocalPointX += (var4 - InterfaceParent.oculusOrbFocalPointX) / 16;
																}
																if (var5 != class141.oculusOrbFocalPointY) {
																	class141.oculusOrbFocalPointY += (var5 - class141.oculusOrbFocalPointY) / 16;
																}
																var6 = InterfaceParent.oculusOrbFocalPointX >> 7;
																var7 = class141.oculusOrbFocalPointY >> 7;
																var8 = SceneTilePaint.getTileHeight(InterfaceParent.oculusOrbFocalPointX, class141.oculusOrbFocalPointY, PacketWriter.Client_plane);
																var9 = 0;
																if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
																	for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
																		for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																			var12 = PacketWriter.Client_plane;
																			if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) {
																				++var12;
																			}
																			int var28 = var8 - Tiles.Tiles_heights[var12][var10][var11];
																			if (var28 > var9) {
																				var9 = var28;
																			}
																		}
																	}
																}
																var10 = var9 * 192;
																if (var10 > 98048) {
																	var10 = 98048;
																}
																if (var10 < 32768) {
																	var10 = 32768;
																}
																if (var10 > field681) {
																	field681 += (var10 - field681) / 24;
																} else if (var10 < field681) {
																	field681 += (var10 - field681) / 80;
																}
																class181.field1992 = SceneTilePaint.getTileHeight(class101.localPlayer.x, class101.localPlayer.y, PacketWriter.Client_plane) - camFollowHeight;
															} else if (oculusOrbState == 1) {
																ScriptEvent.method2101();
																short var34 = -1;
																if (KeyHandler.KeyHandler_pressedKeys[33]) {
																	var34 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
																	var34 = 1024;
																}
																if (KeyHandler.KeyHandler_pressedKeys[48]) {
																	if (var34 == 0) {
																		var34 = 1792;
																	} else if (var34 == 1024) {
																		var34 = 1280;
																	} else {
																		var34 = 1536;
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
																	if (var34 == 0) {
																		var34 = 256;
																	} else if (var34 == 1024) {
																		var34 = 768;
																	} else {
																		var34 = 512;
																	}
																}
																byte var35 = 0;
																if (KeyHandler.KeyHandler_pressedKeys[35]) {
																	var35 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
																	var35 = 1;
																}
																var6 = 0;
																if (var34 >= 0 || var35 != 0) {
																	var6 = (KeyHandler.KeyHandler_pressedKeys[81]) ? oculusOrbSlowedSpeed * 31984657 * 7759089 : oculusOrbNormalSpeed * -149009651 * 2045082565;
																	var6 *= 16;
																	field571 = var34;
																	field572 = var35;
																}
																if (field570 < var6) {
																	field570 += var6 / 8;
																	if (field570 > var6) {
																		field570 = var6;
																	}
																} else if (field570 > var6) {
																	field570 = field570 * 9 / 10;
																}
																if (field570 > 0) {
																	var7 = field570 / 16;
																	if (field571 >= 0) {
																		var4 = field571 - SoundCache.cameraYaw & 2047;
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																		InterfaceParent.oculusOrbFocalPointX += var7 * var8 / 65536;
																		class141.oculusOrbFocalPointY += var9 * var7 / 65536;
																	}
																	if (field572 != 0) {
																		class181.field1992 += var7 * field572;
																		if (class181.field1992 > 0) {
																			class181.field1992 = 0;
																		}
																	}
																} else {
																	field571 = -1;
																	field572 = -1;
																}
																if (KeyHandler.KeyHandler_pressedKeys[13]) {
																	HealthBarUpdate.method2205();
																}
															}
															if (MouseHandler.MouseHandler_currentButton == 4 && class122.mouseCam) {
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																camAngleDX = var4 * 2;
																mouseCamClickedY = (var4 != -1 && var4 != 1) ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y * -1019536109 * 673527067;
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																camAngleDY = var5 * 2;
																mouseCamClickedX = (var5 != -1 && var5 != 1) ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * 1882994615 * -1418373625;
															} else {
																if (KeyHandler.KeyHandler_pressedKeys[96]) {
																	camAngleDY += (-24 - camAngleDY) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
																	camAngleDY += (24 - camAngleDY) / 2;
																} else {
																	camAngleDY /= 2;
																}
																if (KeyHandler.KeyHandler_pressedKeys[98]) {
																	camAngleDX += (12 - camAngleDX) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
																	camAngleDX += (-12 - camAngleDX) / 2;
																} else {
																	camAngleDX /= 2;
																}
																mouseCamClickedY = MouseHandler.MouseHandler_y;
																mouseCamClickedX = MouseHandler.MouseHandler_x;
															}
															camAngleY = camAngleDY / 2 + camAngleY & 2047;
															camAngleX += camAngleDX / 2;
															if (camAngleX < 128) {
																camAngleX = 128;
															}
															if (camAngleX > 383) {
																camAngleX = 383;
															}
															if (field667) {
																InvDefinition.method3358(Interpreter.field846, WorldMapManager.field2743, BoundaryObject.field2622);
																KeyHandler.method300(Decimator.field402, class390.field4423);
																if (class18.cameraX == Interpreter.field846 && class16.cameraY == WorldMapManager.field2743 && BoundaryObject.field2622 == class228.cameraZ && ViewportMouse.cameraPitch == Decimator.field402 && class390.field4423 == SoundCache.cameraYaw) {
																	field667 = false;
																	isCameraLocked = false;
																	class165.field1809 = 0;
																	class434.field4664 = 0;
																	ClanChannel.field1690 = 0;
																	GameBuild.field3588 = 0;
																	MidiPcmStream.field3231 = 0;
																	UserComparator3.field1391 = 0;
																	PlayerComposition.field3346 = 0;
																	class12.field65 = 0;
																	class146.field1682 = 0;
																	InterfaceParent.field1043 = 0;
																}
															} else if (isCameraLocked) {
																var4 = class12.field65 * 128 + 64;
																var5 = class146.field1682 * 128 + 64;
																var6 = SceneTilePaint.getTileHeight(var4, var5, PacketWriter.Client_plane) - InterfaceParent.field1043;
																InvDefinition.method3358(var4, var6, var5);
																var4 = class165.field1809 * 128 + 64;
																var5 = class434.field4664 * 128 + 64;
																var6 = SceneTilePaint.getTileHeight(var4, var5, PacketWriter.Client_plane) - ClanChannel.field1690;
																var7 = var4 - class18.cameraX;
																var8 = var6 - class16.cameraY;
																var9 = var5 - class228.cameraZ;
																var10 = ((int) (Math.sqrt(((double) (var9 * var9 + var7 * var7)))));
																var11 = ((int) (Math.atan2(((double) (var8)), ((double) (var10))) * 325.9490051269531)) & 2047;
																var12 = ((int) (Math.atan2(((double) (var7)), ((double) (var9))) * -325.9490051269531)) & 2047;
																KeyHandler.method300(var11, var12);
															}
															for (var4 = 0; var4 < 5; ++var4) {
																int var10002 = field747[var4]++;
															}
															class308.varcs.tryWrite();
															var4 = ++MouseHandler.MouseHandler_idleCycles - 1;
															var6 = KeyHandler.KeyHandler_idleCycles;
															if (var4 > 15000 && var6 > 15000) {
																logoutTimer = 250;
																class328.method6056(14500);
																var27 = EnumComposition.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, Client.packetWriter.isaacCipher);
																packetWriter.addNode(var27);
															}
															Player.friendSystem.processFriendUpdates();
															++Client.packetWriter.pendingWrites;
															if (Client.packetWriter.pendingWrites > 50) {
																var27 = EnumComposition.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
																packetWriter.addNode(var27);
															}
															try {
																packetWriter.flush();
															} catch (IOException var29) {
																class131.method2877();
															}
															return;
														}
														var26 = var25.widget;
														if (var26.childIndex < 0) {
															break;
														}
														var39 = class140.getWidget(var26.parentId);
													} while (var39 == null || var39.children == null || var26.childIndex >= var39.children.length || var26 != var39.children[var26.childIndex] );
													BoundaryObject.runScriptEvent(var25);
												} 
											}
											var26 = var25.widget;
											if (var26.childIndex < 0) {
												break;
											}
											var39 = class140.getWidget(var26.parentId);
										} while (var39 == null || var39.children == null || var26.childIndex >= var39.children.length || var26 != var39.children[var26.childIndex] );
										BoundaryObject.runScriptEvent(var25);
									} 
								}
								var26 = var25.widget;
								if (var26.childIndex < 0) {
									break;
								}
								var39 = class140.getWidget(var26.parentId);
							} while (var39 == null || var39.children == null || var26.childIndex >= var39.children.length || var26 != var39.children[var26.childIndex] );
							BoundaryObject.runScriptEvent(var25);
						} 
					}
				}
			}
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-933968807")
	@Export("resizeJS")
	void resizeJS() {
		int var1 = Script.canvasWidth;
		int var2 = class78.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}
		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}
		if (class19.clientPreferences != null) {
			try {
				Client var3 = class353.client;
				Object[] var4 = new Object[]{ class9.getWindowedMode() };
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-798444922")
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (WorldMapSection2.loadInterface(var1)) {
				Archive.drawModelComponents(SoundCache.Widget_interfaceComponents[var1], -1);
			}
		}
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field703[var1]) {
				field704[var1] = true;
			}
			field751[var1] = field703[var1];
			field703[var1] = false;
		}
		field702 = cycle;
		viewportX = -1;
		viewportY = -1;
		class161.hoveredItemContainer = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class193.drawWidgets(rootInterface, 0, 0, Script.canvasWidth, class78.canvasHeight, 0, 0, -1);
		}
		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				BuddyRankComparator.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
			if (mouseCrossColor == 2) {
				BuddyRankComparator.crossSprites[mouseCrossState / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}
		if (!isMenuOpen) {
			if (viewportX != -1) {
				class150.method3135(viewportX, viewportY);
			}
		} else {
			ArchiveDiskActionHandler.method5779();
		}
		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field751[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field704[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}
		BoundaryObject.method4534(PacketWriter.Client_plane, class101.localPlayer.x, class101.localPlayer.y, field555);
		field555 = 0;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(descriptor = "(Lcs;II)Z", garbageValue = "812716451")
	boolean method1118(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			Huffman.friendsChat = null;
		} else {
			if (Huffman.friendsChat == null) {
				Huffman.friendsChat = new FriendsChat(HealthBarDefinition.loginType, class353.client);
			}
			Huffman.friendsChat.method6592(var1.packetBuffer, var2);
		}
		class259.method5189();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(descriptor = "(Lcs;I)Z", garbageValue = "1747425058")
	boolean method1379(PacketWriter var1) {
		if (Huffman.friendsChat != null) {
			Huffman.friendsChat.method6612(var1.packetBuffer);
		}
		class259.method5189();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(descriptor = "(Lcs;B)Z", garbageValue = "42")
	final boolean method1120(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var34;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1341) {
						if (!var2.isAvailable(1)) {
							return false;
						}
						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1342 = 0;
						var1.field1341 = false;
					}
					var3.offset = 0;
					if (var3.method7674()) {
						if (!var2.isAvailable(1)) {
							return false;
						}
						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1342 = 0;
					}
					var1.field1341 = true;
					ServerPacket[] var4 = FloorUnderlayDefinition.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}
					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}
				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}
					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}
				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}
					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}
				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}
				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1342 = 0;
				timer.method6509();
				var1.field1352 = var1.field1347;
				var1.field1347 = var1.field1350;
				var1.field1350 = var1.serverPacket;
				if (ServerPacket.field3051 == var1.serverPacket) {
					WorldMapSprite.method4998(class262.field3023);
					var1.serverPacket = null;
					return true;
				}
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var20;
				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var10 = var3.readUnsignedByteNeg();
					var11 = var3.readUnsignedShortAddLE();
					var9 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedMediumLME();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						GraphicsObject var60 = new GraphicsObject(var9, PacketWriter.Client_plane, var7, var8, SceneTilePaint.getTileHeight(var7, var8, PacketWriter.Client_plane) - var10, var11, cycle);
						graphicsObjects.addFirst(var60);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					DefaultsGroup.forceDisconnect(var20);
					var1.serverPacket = null;
					return false;
				}
				if (ServerPacket.field3124 == var1.serverPacket) {
					if (FontName.field4584 == null) {
						FontName.field4584 = new class391(ModeWhere.HitSplatDefinition_cached);
					}
					class450 var56 = ModeWhere.HitSplatDefinition_cached.method7060(var3);
					FontName.field4584.field4424.vmethod7441(var56.field4765, var56.field4766);
					field686[++field687 - 1 & 31] = var56.field4765;
					var1.serverPacket = null;
					return true;
				}
				InterfaceParent var70;
				if (ServerPacket.field3085 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					var70 = ((InterfaceParent) (interfaceParents.get(((long) (var20)))));
					if (var70 != null) {
						MusicPatchPcmStream.closeInterface(var70, var6 != var70.group);
					}
					Language.method6063(var20, var6, var5);
					var1.serverPacket = null;
					return true;
				}
				int var15;
				long var22;
				long var24;
				long var26;
				long var29;
				String var31;
				String var51;
				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var22 = var3.readLong();
					var24 = ((long) (var3.readUnsignedShort()));
					var26 = ((long) (var3.readMedium()));
					PlayerType var71 = ((PlayerType) (Actor.findEnumerated(SoundSystem.PlayerType_values(), var3.readUnsignedByte())));
					var29 = var26 + (var24 << 32);
					boolean var63 = false;
					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var29) {
							var63 = true;
							break;
						}
					}
					if (var71.isUser && Player.friendSystem.isIgnored(new Username(var51, HealthBarDefinition.loginType))) {
						var63 = true;
					}
					if (!var63 && field607 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var29;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var31 = AbstractFont.escapeBrackets(ArchiveDiskAction.method5777(class134.method2904(var3)));
						if (var71.modIcon != -1) {
							SecureRandomFuture.addChatMessage(9, SecureRandomCallable.method2066(var71.modIcon) + var51, var31, class229.base37DecodeLong(var22));
						} else {
							SecureRandomFuture.addChatMessage(9, var51, var31, class229.base37DecodeLong(var22));
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3134 == var1.serverPacket) {
					var20 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						class17.Widget_resetModelFrames(rootInterface);
						WorldMapLabelSize.runWidgetOnLoadListener(rootInterface);
						for (var7 = 0; var7 < 100; ++var7) {
							field703[var7] = true;
						}
					}
					InterfaceParent var73;
					for (; var6-- > 0; var73.field1040 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var73 = ((InterfaceParent) (interfaceParents.get(((long) (var7)))));
						if (var73 != null && var8 != var73.group) {
							MusicPatchPcmStream.closeInterface(var73, true);
							var73 = null;
						}
						if (var73 == null) {
							var73 = Language.method6063(var7, var8, var9);
						}
					}
					for (var70 = ((InterfaceParent) (interfaceParents.first())); var70 != null; var70 = ((InterfaceParent) (interfaceParents.next()))) {
						if (var70.field1040) {
							var70.field1040 = false;
						} else {
							MusicPatchPcmStream.closeInterface(var70, true);
						}
					}
					widgetFlags = new NodeHashTable(512);
					while (var3.offset < var20) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();
						for (var11 = var8; var11 <= var9; ++var11) {
							var29 = (((long) (var7)) << 32) + ((long) (var11));
							widgetFlags.put(new IntegerNode(var10), var29);
						}
					} 
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3044 == var1.serverPacket) {
					for (var20 = 0; var20 < Client.players.length; ++var20) {
						if (players[var20] != null) {
							players[var20].sequence = -1;
						}
					}
					for (var20 = 0; var20 < Client.npcs.length; ++var20) {
						if (npcs[var20] != null) {
							npcs[var20].sequence = -1;
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					isCameraLocked = false;
					for (var20 = 0; var20 < 5; ++var20) {
						field743[var20] = false;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					ClanSettings.updatePlayers(var3, var1.serverPacketLength);
					ScriptEvent.method2106();
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3050 == var1.serverPacket) {
					WorldMapSprite.method4998(class262.field3024);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3054 == var1.serverPacket) {
					WorldMapSprite.method4998(class262.field3017);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.HINT_ARROW == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}
					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 64;
							hintArrowSubY = 64;
						}
						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 64;
						}
						if (hintArrowType == 4) {
							hintArrowSubX = 128;
							hintArrowSubY = 64;
						}
						if (hintArrowType == 5) {
							hintArrowSubX = 64;
							hintArrowSubY = 0;
						}
						if (hintArrowType == 6) {
							hintArrowSubX = 64;
							hintArrowSubY = 128;
						}
						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte();
					}
					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3135 == var1.serverPacket) {
					class298.field3558 = var3.readUnsignedByteAdd();
					class10.field53 = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}
				boolean var68;
				Widget var74;
				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var68 = var3.readUnsignedByte() == 1;
					var5 = var3.readUnsignedIntLE();
					var74 = class140.getWidget(var5);
					if (var68 != var74.isHidden) {
						var74.isHidden = var68;
						ChatChannel.invalidateWidget(var74);
					}
					var1.serverPacket = null;
					return true;
				}
				Widget var83;
				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var20 = var3.readInt();
					var83 = class140.getWidget(var20);
					var83.modelType = 3;
					var83.modelId = class101.localPlayer.appearance.getChatHeadId();
					ChatChannel.invalidateWidget(var83);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntME();
					var74 = class140.getWidget(var5);
					if (var74 != null && var74.type == 0) {
						if (var20 > var74.scrollHeight - var74.height) {
							var20 = var74.scrollHeight - var74.height;
						}
						if (var20 < 0) {
							var20 = 0;
						}
						if (var20 != var74.scrollY) {
							var74.scrollY = var20;
							ChatChannel.invalidateWidget(var74);
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_1 == var1.serverPacket) {
					class101.field1366 = true;
					UserComparator4.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortLE() * 30;
					field695 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3077 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != field635) {
						field635 = var20;
						MilliClock.method3304();
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var20] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false);
					}
					field480 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_2 == var1.serverPacket) {
					UserComparator4.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					Player.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field689 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3071 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					WorldMapDecoration.method4991(var20);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					class101.field1366 = true;
					UserComparator4.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}
				NPC var69;
				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var5 = var3.readUnsignedIntME();
					var6 = var3.readUnsignedShortAdd();
					var20 = var3.readUnsignedShortLE();
					var69 = npcs[var20];
					if (var69 != null) {
						var69.spotAnimation = var6;
						var69.spotAnimationHeight = var5 >> 16;
						var69.field1178 = (var5 & 65535) + cycle;
						var69.spotAnimationFrame = 0;
						var69.spotAnimationFrameCycle = 0;
						if (var69.field1178 > cycle) {
							var69.spotAnimationFrame = -1;
						}
						if (var69.spotAnimation == 65535) {
							var69.spotAnimation = -1;
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3084 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					rootInterface = var20;
					this.resizeRoot(false);
					class17.Widget_resetModelFrames(var20);
					WorldMapLabelSize.runWidgetOnLoadListener(rootInterface);
					for (var5 = 0; var5 < 100; ++var5) {
						field703[var5] = true;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < VarpDefinition.field1822; ++var20) {
						VarpDefinition var87 = FloorUnderlayDefinition.VarpDefinition_get(var20);
						if (var87 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}
					GraphicsObject.method1870();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}
				byte var65;
				if (ServerPacket.field3115 == var1.serverPacket) {
					UserComparator5.method2586();
					var65 = var3.readByte();
					class131 var86 = new class131(var3);
					ClanSettings var89;
					if (var65 >= 0) {
						var89 = currentClanSettings[var65];
					} else {
						var89 = HealthBar.guestClanSettings;
					}
					var86.method2869(var89);
					var1.serverPacket = null;
					return true;
				}
				Widget var21;
				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}
					var5 = var3.readInt();
					var6 = var3.readUnsignedIntME();
					var21 = class140.getWidget(var5);
					ItemComposition var82;
					if (!var21.isIf3) {
						if (var20 == -1) {
							var21.modelType = 0;
							var1.serverPacket = null;
							return true;
						}
						var82 = EnumComposition.ItemDefinition_get(var20);
						var21.modelType = 4;
						var21.modelId = var20;
						var21.modelAngleX = var82.xan2d;
						var21.modelAngleY = var82.yan2d;
						var21.modelZoom = var82.zoom2d * 100 / var6;
						ChatChannel.invalidateWidget(var21);
					} else {
						var21.itemId = var20;
						var21.itemQuantity = var6;
						var82 = EnumComposition.ItemDefinition_get(var20);
						var21.modelAngleX = var82.xan2d;
						var21.modelAngleY = var82.yan2d;
						var21.modelAngleZ = var82.zan2d;
						var21.modelOffsetX = var82.offsetX2d;
						var21.modelOffsetY = var82.offsetY2d;
						var21.modelZoom = var82.zoom2d;
						if (var82.isStackable == 1) {
							var21.itemQuantityMode = 1;
						} else {
							var21.itemQuantityMode = 2;
						}
						if (var21.field3424 > 0) {
							var21.modelZoom = var21.modelZoom * 32 / var21.field3424;
						} else if (var21.rawWidth > 0) {
							var21.modelZoom = var21.modelZoom * 32 / var21.rawWidth;
						}
						ChatChannel.invalidateWidget(var21);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3067 == var1.serverPacket) {
					WorldMapSprite.method4998(class262.field3022);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3064 == var1.serverPacket) {
					field692 = cycleCntr;
					var65 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var65 >= 0) {
							currentClanChannels[var65] = null;
						} else {
							class150.guestClanChannel = null;
						}
						var1.serverPacket = null;
						return true;
					}
					if (var65 >= 0) {
						currentClanChannels[var65] = new ClanChannel(var3);
					} else {
						class150.guestClanChannel = new ClanChannel(var3);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3063 == var1.serverPacket) {
					WorldMapSprite.method4998(class262.field3019);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					byte var64 = var3.readByteSub();
					Varps.Varps_temp[var20] = var64;
					if (Varps.Varps_main[var20] != var64) {
						Varps.Varps_main[var20] = var64;
					}
					class306.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}
					if (var20 >= 0) {
						var74 = class140.getWidget(var20);
					} else {
						var74 = null;
					}
					if (var74 != null) {
						for (var7 = 0; var7 < var74.itemIds.length; ++var7) {
							var74.itemIds[var7] = 0;
							var74.itemQuantities[var7] = 0;
						}
					}
					VerticalAlignment.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();
					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var3.readUnsignedByteNeg();
						if (var9 == 255) {
							var9 = var3.readInt();
						}
						var10 = var3.readUnsignedShort();
						if (var74 != null && var8 < var74.itemIds.length) {
							var74.itemIds[var8] = var10;
							var74.itemQuantities[var8] = var9;
						}
						ReflectionCheck.itemContainerSetItem(var5, var8, var10 - 1, var9);
					}
					if (var74 != null) {
						ChatChannel.invalidateWidget(var74);
					}
					GraphicsObject.method1870();
					changedItemContainers[++field683 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					Player.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class126.FriendSystem_invalidateIgnoreds();
					field689 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					class10.field53 = var3.readUnsignedByte();
					class298.field3558 = var3.readUnsignedByteAdd();
					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						class262 var85 = class128.method2856()[var20];
						WorldMapSprite.method4998(var85);
					} 
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					class294.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3139 == var1.serverPacket) {
					GraphicsObject.method1870();
					weight = var3.readShort();
					field695 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				Widget var77;
				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedIntIME();
					InterfaceParent var88 = ((InterfaceParent) (interfaceParents.get(((long) (var20)))));
					var70 = ((InterfaceParent) (interfaceParents.get(((long) (var5)))));
					if (var70 != null) {
						MusicPatchPcmStream.closeInterface(var70, var88 == null || var70.group != var88.group);
					}
					if (var88 != null) {
						var88.remove();
						interfaceParents.put(var88, ((long) (var5)));
					}
					var77 = class140.getWidget(var20);
					if (var77 != null) {
						ChatChannel.invalidateWidget(var77);
					}
					var77 = class140.getWidget(var5);
					if (var77 != null) {
						ChatChannel.invalidateWidget(var77);
						BufferedNetSocket.revalidateWidgetScroll(SoundCache.Widget_interfaceComponents[var77.id >>> 16], var77, true);
					}
					if (rootInterface != -1) {
						class7.runIntfCloseListeners(rootInterface, 1);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					UserComparator3.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3100 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readShort();
					var74 = class140.getWidget(var20);
					if (var5 != var74.sequenceId || var5 == -1) {
						var74.sequenceId = var5;
						var74.modelFrame = 0;
						var74.modelFrameCycle = 0;
						ChatChannel.invalidateWidget(var74);
					}
					var1.serverPacket = null;
					return true;
				}
				int var13;
				int var14;
				int var16;
				int var36;
				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var6 = var3.readMedium();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var36 = var3.readUnsignedShort();
					int var18 = var3.readUnsignedByteAdd();
					var14 = var3.readUnsignedByteSub() * 4;
					byte var59 = var3.readByteAdd();
					byte var57 = var3.readByte();
					var15 = var3.readUnsignedShort();
					int var17 = var3.readUnsignedByteAdd();
					var16 = var3.readUnsignedShortAddLE();
					var13 = var3.readUnsignedByteAdd() * 4;
					var11 = var3.readShortAddLE();
					var9 = var59 + var7;
					var10 = var57 + var8;
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var36 != 65535) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						var9 = var9 * 128 + 64;
						var10 = var10 * 128 + 64;
						Projectile var19 = new Projectile(var36, PacketWriter.Client_plane, var7, var8, SceneTilePaint.getTileHeight(var7, var8, PacketWriter.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14);
						var19.setDestination(var9, var10, SceneTilePaint.getTileHeight(var9, var10, PacketWriter.Client_plane) - var14, var15 + cycle);
						projectiles.addFirst(var19);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3122 == var1.serverPacket) {
					Player.friendSystem.method1635();
					field689 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field667 = false;
					class12.field65 = var3.readUnsignedByte();
					class146.field1682 = var3.readUnsignedByte();
					InterfaceParent.field1043 = var3.readUnsignedShort();
					PlayerComposition.field3346 = var3.readUnsignedByte();
					UserComparator3.field1391 = var3.readUnsignedByte();
					if (UserComparator3.field1391 >= 100) {
						class18.cameraX = class12.field65 * 128 + 64;
						class228.cameraZ = class146.field1682 * 128 + 64;
						class16.cameraY = SceneTilePaint.getTileHeight(class18.cameraX, class228.cameraZ, PacketWriter.Client_plane) - InterfaceParent.field1043;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3062 == var1.serverPacket) {
					var68 = var3.readUnsignedByte() == 1;
					if (var68) {
						class270.field3177 = class115.method2692() - var3.readLong();
						class143.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class143.grandExchangeEvents = null;
					}
					field661 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3039 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field743[var20] = true;
					field762[var20] = var5;
					field745[var20] = var6;
					field537[var20] = var7;
					field747[var20] = 0;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}
					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedByteSub();
					if (var5 == 65535) {
						var5 = -1;
					}
					var69 = npcs[var20];
					if (var69 != null) {
						if (var5 == var69.sequence && var5 != -1) {
							var8 = ScriptFrame.SequenceDefinition_get(var5).field2174;
							if (var8 == 1) {
								var69.sequenceFrame = 0;
								var69.sequenceFrameCycle = 0;
								var69.sequenceDelay = var6;
								var69.field1190 = 0;
							} else if (var8 == 2) {
								var69.field1190 = 0;
							}
						} else if (var5 == -1 || var69.sequence == -1 || ScriptFrame.SequenceDefinition_get(var5).field2183 >= ScriptFrame.SequenceDefinition_get(var69.sequence).field2183) {
							var69.sequence = var5;
							var69.sequenceFrame = 0;
							var69.sequenceFrameCycle = 0;
							var69.sequenceDelay = var6;
							var69.field1190 = 0;
							var69.field1203 = var69.pathLength;
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var34 = AbstractFont.escapeBrackets(ArchiveDiskAction.method5777(class134.method2904(var3)));
					class290.addGameMessage(6, var51, var34);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					class10.field53 = var3.readUnsignedByteNeg();
					class298.field3558 = var3.readUnsignedByteSub();
					for (var20 = class10.field53; var20 < class10.field53 + 8; ++var20) {
						for (var5 = class298.field3558; var5 < class298.field3558 + 8; ++var5) {
							if (groundItems[PacketWriter.Client_plane][var20][var5] != null) {
								groundItems[PacketWriter.Client_plane][var20][var5] = null;
								class133.updateItemPile(var20, var5);
							}
						}
					}
					for (PendingSpawn var53 = ((PendingSpawn) (pendingSpawns.last())); var53 != null; var53 = ((PendingSpawn) (pendingSpawns.previous()))) {
						if (var53.x >= class10.field53 && var53.x < class10.field53 + 8 && var53.y >= class298.field3558 && var53.y < class298.field3558 + 8 && var53.plane == PacketWriter.Client_plane) {
							var53.hitpoints = 0;
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3125 == var1.serverPacket) {
					WorldMapSprite.method4998(class262.field3018);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntLE();
					Varps.Varps_temp[var20] = var5;
					if (Varps.Varps_main[var20] != var5) {
						Varps.Varps_main[var20] = var5;
					}
					class306.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var83 = class140.getWidget(var20);
					for (var6 = 0; var6 < var83.itemIds.length; ++var6) {
						var83.itemIds[var6] = -1;
						var83.itemIds[var6] = 0;
					}
					ChatChannel.invalidateWidget(var83);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3037 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}
					var6 = var3.readUnsignedIntIME();
					var7 = var3.readUnsignedShortAdd();
					if (var7 == 65535) {
						var7 = -1;
					}
					for (var8 = var7; var8 <= var5; ++var8) {
						var26 = ((long) (var8)) + (((long) (var6)) << 32);
						Node var28 = widgetFlags.get(var26);
						if (var28 != null) {
							var28.remove();
						}
						widgetFlags.put(new IntegerNode(var20), var26);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					MouseRecorder.logOut();
					var1.serverPacket = null;
					return false;
				}
				if (ServerPacket.field3117 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShort();
					var21 = class140.getWidget(var20);
					var21.field3373 = var5 + (var6 << 16);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					if (var20 == 65535) {
						var20 = -1;
					}
					class16.playSong(var20);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3059 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}
					var5 = var3.readUnsignedMediumLME();
					PcmPlayer.method719(var20, var5);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3072 == var1.serverPacket) {
					FontName.field4584 = null;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3131 == var1.serverPacket) {
					UserComparator5.method2586();
					var65 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var65 >= 0) {
							currentClanSettings[var65] = null;
						} else {
							HealthBar.guestClanSettings = null;
						}
						var1.serverPacket = null;
						return true;
					}
					if (var65 >= 0) {
						currentClanSettings[var65] = new ClanSettings(var3);
					} else {
						HealthBar.guestClanSettings = new ClanSettings(var3);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3040 == var1.serverPacket) {
					WorldMapSprite.method4998(class262.field3020);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						class7.runIntfCloseListeners(rootInterface, 0);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3109 == var1.serverPacket) {
					class4.method12(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3076 == var1.serverPacket) {
					FontName.field4584 = new class391(ModeWhere.HitSplatDefinition_cached);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedIntIME();
					var7 = var3.readUnsignedShortAdd();
					var77 = class140.getWidget(var6);
					if (var7 != var77.modelAngleX || var5 != var77.modelAngleY || var20 != var77.modelZoom) {
						var77.modelAngleX = var7;
						var77.modelAngleY = var5;
						var77.modelZoom = var20;
						ChatChannel.invalidateWidget(var77);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedByteNeg();
					var6 = var3.readUnsignedByteNeg();
					if (var6 >= 1 && var6 <= 8) {
						if (var51.equalsIgnoreCase("null")) {
							var51 = null;
						}
						playerMenuActions[var6 - 1] = var51;
						playerOptionsPriorities[var6 - 1] = var5 == 0;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}
					if (var20 >= 0) {
						var74 = class140.getWidget(var20);
					} else {
						var74 = null;
					}
					for (; var3.offset < var1.serverPacketLength; ReflectionCheck.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var9 = 0;
						if (var8 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}
						if (var74 != null && var7 >= 0 && var7 < var74.itemIds.length) {
							var74.itemIds[var7] = var8;
							var74.itemQuantities[var7] = var9;
						}
					}
					if (var74 != null) {
						ChatChannel.invalidateWidget(var74);
					}
					GraphicsObject.method1870();
					changedItemContainers[++field683 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortAdd();
					var74 = class140.getWidget(var20);
					if (var74.modelType != 2 || var5 != var74.modelId) {
						var74.modelType = 2;
						var74.modelId = var5;
						ChatChannel.invalidateWidget(var74);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntLE();
					var74 = class140.getWidget(var5);
					if (var74.modelType != 1 || var20 != var74.modelId) {
						var74.modelType = 1;
						var74.modelId = var20;
						ChatChannel.invalidateWidget(var74);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntIME();
					var6 = var20 >> 10 & 31;
					var7 = var20 >> 5 & 31;
					var8 = var20 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3);
					Widget var72 = class140.getWidget(var5);
					if (var9 != var72.color) {
						var72.color = var9;
						ChatChannel.invalidateWidget(var72);
					}
					var1.serverPacket = null;
					return true;
				}
				String var40;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var22 = ((long) (var3.readUnsignedShort()));
					var24 = ((long) (var3.readMedium()));
					PlayerType var37 = ((PlayerType) (Actor.findEnumerated(SoundSystem.PlayerType_values(), var3.readUnsignedByte())));
					long var38 = var24 + (var22 << 32);
					boolean var84 = false;
					for (var13 = 0; var13 < 100; ++var13) {
						if (crossWorldMessageIds[var13] == var38) {
							var84 = true;
							break;
						}
					}
					if (Player.friendSystem.isIgnored(new Username(var51, HealthBarDefinition.loginType))) {
						var84 = true;
					}
					if (!var84 && field607 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var38;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(ArchiveDiskAction.method5777(class134.method2904(var3)));
						byte var62;
						if (var37.isPrivileged) {
							var62 = 7;
						} else {
							var62 = 3;
						}
						if (var37.modIcon != -1) {
							class290.addGameMessage(var62, SecureRandomCallable.method2066(var37.modIcon) + var51, var40);
						} else {
							class290.addGameMessage(var62, var51, var40);
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3118 == var1.serverPacket) {
					WorldMapSprite.method4998(class262.field3021);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3140 == var1.serverPacket) {
					WorldMapSprite.method4998(class262.field3015);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					class294.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					GraphicsObject.method1870();
					var20 = var3.readUnsignedByteSub();
					var5 = var3.readInt();
					var6 = var3.readUnsignedByteAdd();
					experience[var20] = var5;
					currentLevels[var20] = var6;
					levels[var20] = 1;
					for (var7 = 0; var7 < 98; ++var7) {
						if (var5 >= Skills.Skills_experienceTable[var7]) {
							levels[var20] = var7 + 2;
						}
					}
					changedSkills[++changedSkillsCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var20 = var3.readInt();
					InterfaceParent var81 = ((InterfaceParent) (interfaceParents.get(((long) (var20)))));
					if (var81 != null) {
						MusicPatchPcmStream.closeInterface(var81, true);
					}
					if (meslayerContinueWidget != null) {
						ChatChannel.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var6 = FileSystem.getGcDuration();
					PacketBufferNode var67 = EnumComposition.getPacketBufferNode(ClientPacket.PING_STATISTICS, Client.packetWriter.isaacCipher);
					var67.packetBuffer.writeByteSub(GameEngine.fps);
					var67.packetBuffer.writeByteAdd(var6);
					var67.packetBuffer.writeShortLE(var20);
					var67.packetBuffer.writeIntLE(var5);
					packetWriter.addNode(var67);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3112 == var1.serverPacket) {
					return this.method1118(var1, 1);
				}
				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					GrandExchangeOfferTotalQuantityComparator.method5969(var20);
					changedItemContainers[++field683 - 1 & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}
				String var75;
				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var52 = new byte[var1.serverPacketLength];
					var3.method7711(var52, 0, var52.length);
					Buffer var80 = new Buffer(var52);
					var75 = var80.readStringCp1252NullTerminated();
					class258.openURL(var75, true, false);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					Object[] var78 = new Object[var51.length() + 1];
					for (var6 = var51.length() - 1; var6 >= 0; --var6) {
						if (var51.charAt(var6) == 's') {
							var78[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var78[var6 + 1] = new Integer(var3.readInt());
						}
					}
					var78[0] = new Integer(var3.readInt());
					ScriptEvent var79 = new ScriptEvent();
					var79.args = var78;
					BoundaryObject.runScriptEvent(var79);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var20 = var3.readUShortSmart();
					boolean var54 = var3.readUnsignedByte() == 1;
					var75 = "";
					boolean var55 = false;
					if (var54) {
						var75 = var3.readStringCp1252NullTerminated();
						if (Player.friendSystem.isIgnored(new Username(var75, HealthBarDefinition.loginType))) {
							var55 = true;
						}
					}
					String var35 = var3.readStringCp1252NullTerminated();
					if (!var55) {
						class290.addGameMessage(var20, var75, var35);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field667 = false;
					class165.field1809 = var3.readUnsignedByte();
					class434.field4664 = var3.readUnsignedByte();
					ClanChannel.field1690 = var3.readUnsignedShort();
					GameBuild.field3588 = var3.readUnsignedByte();
					MidiPcmStream.field3231 = var3.readUnsignedByte();
					if (MidiPcmStream.field3231 >= 100) {
						var20 = class165.field1809 * 128 + 64;
						var5 = class434.field4664 * 128 + 64;
						var6 = SceneTilePaint.getTileHeight(var20, var5, PacketWriter.Client_plane) - ClanChannel.field1690;
						var7 = var20 - class18.cameraX;
						var8 = var6 - class16.cameraY;
						var9 = var5 - class228.cameraZ;
						var10 = ((int) (Math.sqrt(((double) (var7 * var7 + var9 * var9)))));
						ViewportMouse.cameraPitch = ((int) (Math.atan2(((double) (var8)), ((double) (var10))) * 325.9490051269531)) & 2047;
						SoundCache.cameraYaw = ((int) (Math.atan2(((double) (var7)), ((double) (var9))) * -325.9490051269531)) & 2047;
						if (ViewportMouse.cameraPitch < 128) {
							ViewportMouse.cameraPitch = 128;
						}
						if (ViewportMouse.cameraPitch > 383) {
							ViewportMouse.cameraPitch = 383;
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					Player var66;
					if (var20 == localPlayerIndex) {
						var66 = class101.localPlayer;
					} else {
						var66 = players[var20];
					}
					var6 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShortLE();
					if (var66 != null) {
						var66.spotAnimation = var5;
						var66.spotAnimationHeight = var6 >> 16;
						var66.field1178 = (var6 & 65535) + cycle;
						var66.spotAnimationFrame = 0;
						var66.spotAnimationFrameCycle = 0;
						if (var66.field1178 > cycle) {
							var66.spotAnimationFrame = -1;
						}
						if (var66.spotAnimation == 65535) {
							var66.spotAnimation = -1;
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					tradeChatMode = var3.readUnsignedByte();
					publicChatMode = var3.readUnsignedByteSub();
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_main[var20] != Varps.Varps_temp[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							class306.changeGameOptions(var20);
							changedVarps[++changedVarpCount - 1 & 31] = var20;
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3038 == var1.serverPacket) {
					WorldMapSprite.method4998(class262.field3016);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					UserComparator4.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3113 == var1.serverPacket) {
					var65 = var3.readByte();
					var22 = ((long) (var3.readUnsignedShort()));
					var24 = ((long) (var3.readMedium()));
					var26 = (var22 << 32) + var24;
					boolean var58 = false;
					ClanChannel var12 = (var65 >= 0) ? currentClanChannels[var65] : class150.guestClanChannel;
					if (var12 == null) {
						var58 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (crossWorldMessageIds[var13] == var26) {
								var58 = true;
								break;
							}
						}
					}
					if (!var58) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var26;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = class134.method2904(var3);
						var14 = (var65 >= 0) ? 43 : 46;
						SecureRandomFuture.addChatMessage(var14, "", var40, var12.name);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3110 == var1.serverPacket) {
					var68 = var3.readBoolean();
					if (var68) {
						if (UrlRequester.field1362 == null) {
							UrlRequester.field1362 = new class325();
						}
					} else {
						UrlRequester.field1362 = null;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3088 == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedIntIME();
					var74 = class140.getWidget(var5);
					if (!var51.equals(var74.text)) {
						var74.text = var51;
						ChatChannel.invalidateWidget(var74);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3098 == var1.serverPacket) {
					return this.method1118(var1, 2);
				}
				if (ServerPacket.field3128 == var1.serverPacket) {
					World var50 = new World();
					var50.host = var3.readStringCp1252NullTerminated();
					var50.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var50.properties = var5;
					HealthBarUpdate.updateGameState(45);
					var2.close();
					var2 = null;
					class295.changeWorld(var50);
					var1.serverPacket = null;
					return false;
				}
				if (ServerPacket.field3086 == var1.serverPacket) {
					return this.method1379(var1);
				}
				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					class339.privateChatMode = Ignored.method6780(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3111 == var1.serverPacket) {
					GraphicsObject.method1870();
					runEnergy = var3.readUnsignedByte();
					field695 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var20 = var3.readShort();
					var5 = var3.readShortLE();
					var6 = var3.readInt();
					var21 = class140.getWidget(var6);
					if (var5 != var21.rawX || var20 != var21.rawY || var21.xAlignment != 0 || var21.yAlignment != 0) {
						var21.rawX = var5;
						var21.rawY = var20;
						var21.xAlignment = 0;
						var21.yAlignment = 0;
						ChatChannel.invalidateWidget(var21);
						this.alignWidget(var21);
						if (var21.type == 0) {
							BufferedNetSocket.revalidateWidgetScroll(SoundCache.Widget_interfaceComponents[var6 >> 16], var21, false);
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3065 == var1.serverPacket) {
					field692 = cycleCntr;
					var65 = var3.readByte();
					class145 var76 = new class145(var3);
					ClanChannel var33;
					if (var65 >= 0) {
						var33 = currentClanChannels[var65];
					} else {
						var33 = class150.guestClanChannel;
					}
					var76.method3075(var33);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3053 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					SoundSystem.queueSoundEffect(var20, var5, var6);
					var1.serverPacket = null;
					return true;
				}
				GameObject var47;
				if (ServerPacket.field3048 == var1.serverPacket) {
					var65 = var3.readByte();
					var34 = var3.readStringCp1252NullTerminated();
					long var41 = ((long) (var3.readUnsignedShort()));
					long var43 = ((long) (var3.readMedium()));
					PlayerType var32 = ((PlayerType) (Actor.findEnumerated(SoundSystem.PlayerType_values(), var3.readUnsignedByte())));
					long var45 = (var41 << 32) + var43;
					boolean var61 = false;
					var47 = null;
					ClanChannel var93 = (var65 >= 0) ? currentClanChannels[var65] : class150.guestClanChannel;
					if (var93 == null) {
						var61 = true;
					} else {
						var15 = 0;
						while (true) {
							if (var15 >= 100) {
								if (var32.isUser && Player.friendSystem.isIgnored(new Username(var34, HealthBarDefinition.loginType))) {
									var61 = true;
								}
								break;
							}
							if (crossWorldMessageIds[var15] == var45) {
								var61 = true;
								break;
							}
							++var15;
						} 
					}
					if (!var61) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var45;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var31 = AbstractFont.escapeBrackets(class134.method2904(var3));
						var16 = (var65 >= 0) ? 41 : 44;
						if (var32.modIcon != -1) {
							SecureRandomFuture.addChatMessage(var16, SecureRandomCallable.method2066(var32.modIcon) + var34, var31, var93.name);
						} else {
							SecureRandomFuture.addChatMessage(var16, var34, var31, var93.name);
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						WorldMapIcon_1.method4590(var3, var3.offset - 28);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3133 == var1.serverPacket && isCameraLocked) {
					field667 = true;
					PlayerComposition.field3346 = var3.readUnsignedByte();
					UserComparator3.field1391 = var3.readUnsignedByte();
					GameBuild.field3588 = var3.readUnsignedByte();
					MidiPcmStream.field3231 = var3.readUnsignedByte();
					for (var20 = 0; var20 < 5; ++var20) {
						field743[var20] = false;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var9 = var3.readUnsignedByteAdd();
					var10 = var9 >> 2;
					var11 = var9 & 3;
					var36 = field582[var10];
					var13 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedMediumRME();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
						if (var36 == 0) {
							BoundaryObject var92 = class356.scene.method4333(PacketWriter.Client_plane, var7, var8);
							if (var92 != null) {
								var15 = Decimator.Entity_unpackID(var92.tag);
								if (var10 == 2) {
									var92.renderable1 = new DynamicObject(var15, 2, var11 + 4, PacketWriter.Client_plane, var7, var8, var13, false, var92.renderable1);
									var92.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, PacketWriter.Client_plane, var7, var8, var13, false, var92.renderable2);
								} else {
									var92.renderable1 = new DynamicObject(var15, var10, var11, PacketWriter.Client_plane, var7, var8, var13, false, var92.renderable1);
								}
							}
						} else if (var36 == 1) {
							WallDecoration var91 = class356.scene.method4178(PacketWriter.Client_plane, var7, var8);
							if (var91 != null) {
								var15 = Decimator.Entity_unpackID(var91.tag);
								if (var10 != 4 && var10 != 5) {
									if (var10 == 6) {
										var91.renderable1 = new DynamicObject(var15, 4, var11 + 4, PacketWriter.Client_plane, var7, var8, var13, false, var91.renderable1);
									} else if (var10 == 7) {
										var91.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, PacketWriter.Client_plane, var7, var8, var13, false, var91.renderable1);
									} else if (var10 == 8) {
										var91.renderable1 = new DynamicObject(var15, 4, var11 + 4, PacketWriter.Client_plane, var7, var8, var13, false, var91.renderable1);
										var91.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, PacketWriter.Client_plane, var7, var8, var13, false, var91.renderable2);
									}
								} else {
									var91.renderable1 = new DynamicObject(var15, 4, var11, PacketWriter.Client_plane, var7, var8, var13, false, var91.renderable1);
								}
							}
						} else if (var36 == 2) {
							var47 = class356.scene.getGameObject(PacketWriter.Client_plane, var7, var8);
							if (var10 == 11) {
								var10 = 10;
							}
							if (var47 != null) {
								var47.renderable = new DynamicObject(Decimator.Entity_unpackID(var47.tag), var10, var11, PacketWriter.Client_plane, var7, var8, var13, false, var47.renderable);
							}
						} else if (var36 == 3) {
							FloorDecoration var90 = class356.scene.getFloorDecoration(PacketWriter.Client_plane, var7, var8);
							if (var90 != null) {
								var90.renderable = new DynamicObject(Decimator.Entity_unpackID(var90.tag), 22, var11, PacketWriter.Client_plane, var7, var8, var13, false, var90.renderable);
							}
						}
					}
					var1.serverPacket = null;
					return true;
				}
				class249.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id * 1936739439 * -1523412337 : -1) + "," + (var1.field1347 != null ? var1.field1347.id * 1936739439 * -1523412337 : -1) + "," + (var1.field1352 != null ? var1.field1352.id * 1936739439 * -1523412337 : -1) + "," + var1.serverPacketLength, ((Throwable) (null)));
				MouseRecorder.logOut();
			} catch (IOException var48) {
				class131.method2877();
			} catch (Exception var49) {
				var34 = "" + (var1.serverPacket != null ? var1.serverPacket.id * 1936739439 * -1523412337 : -1) + "," + (var1.field1347 != null ? var1.field1347.id * 1936739439 * -1523412337 : -1) + "," + (var1.field1352 != null ? var1.field1352.id * 1936739439 * -1523412337 : -1) + "," + var1.serverPacketLength + "," + (class101.localPlayer.pathX[0] + class28.baseX) + "," + (class101.localPlayer.pathY[0] + WorldMapLabelSize.baseY) + ",";
				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var34 = var34 + var3.array[var6] + ",";
				}
				class249.RunException_sendStackTrace(var34, var49);
				MouseRecorder.logOut();
			}
			return true;
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "124880432")
	@Export("menu")
	final void menu() {
		boolean var1 = false;
		int var2;
		int var5;
		while (!var1) {
			var1 = true;
			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
					String var18 = menuTargets[var2];
					menuTargets[var2] = menuTargets[var2 + 1];
					menuTargets[var2 + 1] = var18;
					String var19 = menuActions[var2];
					menuActions[var2] = menuActions[var2 + 1];
					menuActions[var2 + 1] = var19;
					var5 = menuOpcodes[var2];
					menuOpcodes[var2] = menuOpcodes[var2 + 1];
					menuOpcodes[var2 + 1] = var5;
					var5 = menuArguments1[var2];
					menuArguments1[var2] = menuArguments1[var2 + 1];
					menuArguments1[var2 + 1] = var5;
					var5 = menuArguments2[var2];
					menuArguments2[var2] = menuArguments2[var2 + 1];
					menuArguments2[var2 + 1] = var5;
					var5 = menuIdentifiers[var2];
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1];
					menuIdentifiers[var2 + 1] = var5;
					boolean var14 = menuShiftClick[var2];
					menuShiftClick[var2] = menuShiftClick[var2 + 1];
					menuShiftClick[var2 + 1] = var14;
					var1 = false;
				}
			}
		} 
		if (Interpreter.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var20 = MouseHandler.MouseHandler_lastButton;
				int var3;
				int var4;
				int var8;
				int var10;
				int var23;
				if (isMenuOpen) {
					int var21;
					if (var20 != 1 && (class122.mouseCam || var20 != 4)) {
						var2 = MouseHandler.MouseHandler_x;
						var3 = MouseHandler.MouseHandler_y;
						if (var2 < UserComparator3.menuX - 10 || var2 > Language.menuWidth + UserComparator3.menuX + 10 || var3 < ViewportMouse.menuY - 10 || var3 > Player.menuHeight + ViewportMouse.menuY + 10) {
							isMenuOpen = false;
							var4 = UserComparator3.menuX;
							var5 = ViewportMouse.menuY;
							var23 = Language.menuWidth;
							var21 = Player.menuHeight;
							for (var8 = 0; var8 < rootWidgetCount; ++var8) {
								if (rootWidgetXs[var8] + rootWidgetWidths[var8] > var4 && rootWidgetXs[var8] < var4 + var23 && rootWidgetYs[var8] + rootWidgetHeights[var8] > var5 && rootWidgetYs[var8] < var21 + var5) {
									field703[var8] = true;
								}
							}
						}
					}
					if (var20 == 1 || !class122.mouseCam && var20 == 4) {
						var2 = UserComparator3.menuX;
						var3 = ViewportMouse.menuY;
						var4 = Language.menuWidth;
						var5 = MouseHandler.MouseHandler_lastPressedX;
						var23 = MouseHandler.MouseHandler_lastPressedY;
						var21 = -1;
						int var22;
						for (var8 = 0; var8 < menuOptionsCount; ++var8) {
							var22 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31;
							if (var5 > var2 && var5 < var2 + var4 && var23 > var22 - 13 && var23 < var22 + 3) {
								var21 = var8;
							}
						}
						int var11;
						if (var21 != -1 && var21 >= 0) {
							var8 = menuArguments1[var21];
							var22 = menuArguments2[var21];
							var10 = menuOpcodes[var21];
							var11 = menuIdentifiers[var21];
							String var12 = menuActions[var21];
							String var13 = menuTargets[var21];
							FriendsList.menuAction(var8, var22, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
						isMenuOpen = false;
						var8 = UserComparator3.menuX;
						var22 = ViewportMouse.menuY;
						var10 = Language.menuWidth;
						var11 = Player.menuHeight;
						for (int var17 = 0; var17 < rootWidgetCount; ++var17) {
							if (rootWidgetXs[var17] + rootWidgetWidths[var17] > var8 && rootWidgetXs[var17] < var10 + var8 && rootWidgetYs[var17] + rootWidgetHeights[var17] > var22 && rootWidgetYs[var17] < var11 + var22) {
								field703[var17] = true;
							}
						}
					}
				} else {
					var2 = class240.method5005();
					if ((var20 == 1 || !class122.mouseCam && var20 == 4) && var2 >= 0) {
						var3 = menuOpcodes[var2];
						if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) {
							label310 : {
								var4 = menuArguments1[var2];
								var5 = menuArguments2[var2];
								Widget var6 = class140.getWidget(var5);
								var8 = class124.getWidgetFlags(var6);
								boolean var7 = (var8 >> 28 & 1) != 0;
								if (!var7) {
									var10 = class124.getWidgetFlags(var6);
									boolean var9 = (var10 >> 29 & 1) != 0;
									if (!var9) {
										break label310;
									}
								}
								if (Interpreter.dragInventoryWidget != null && !field705 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
									CollisionMap.method3906(draggedWidgetX, draggedWidgetY);
								}
								field705 = false;
								itemDragDuration = 0;
								if (Interpreter.dragInventoryWidget != null) {
									ChatChannel.invalidateWidget(Interpreter.dragInventoryWidget);
								}
								Interpreter.dragInventoryWidget = class140.getWidget(var5);
								dragItemSlotSource = var4;
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
								if (var2 >= 0) {
									WorldMapLabelSize.method4566(var2);
								}
								ChatChannel.invalidateWidget(Interpreter.dragInventoryWidget);
								return;
							}
						}
					}
					if ((var20 == 1 || !class122.mouseCam && var20 == 4) && this.shouldLeftClickOpenMenu()) {
						var20 = 2;
					}
					if ((var20 == 1 || !class122.mouseCam && var20 == 4) && menuOptionsCount > 0 && var2 >= 0) {
						var3 = menuArguments1[var2];
						var4 = menuArguments2[var2];
						var5 = menuOpcodes[var2];
						var23 = menuIdentifiers[var2];
						String var15 = menuActions[var2];
						String var16 = menuTargets[var2];
						FriendsList.menuAction(var3, var4, var5, var23, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
					if (var20 == 2 && menuOptionsCount > 0) {
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}
			}
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1842905867")
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = class240.method5005();
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || VarpDefinition.method3373(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1919809935")
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		UserComparator8.method2571(var1, var2);
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		class356.scene.menuOpen(PacketWriter.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "105")
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface;
		int var3 = Script.canvasWidth;
		int var4 = class78.canvasHeight;
		if (WorldMapSection2.loadInterface(var2)) {
			class118.resizeInterface(SoundCache.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(descriptor = "(Lkb;B)V", garbageValue = "93")
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = (var1.parentId == -1) ? null : class140.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = Script.canvasWidth;
			var4 = class78.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}
		Decimator.alignWidgetSize(var1, var3, var4, false);
		class240.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1883142675")
	final void method1511() {
		ChatChannel.invalidateWidget(clickedWidget);
		++Timer.widgetDragDuration;
		if (field675 && field767) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field664) {
				var1 = field664;
			}
			if (var1 + Client.clickedWidget.width > field664 + Client.clickedWidgetParent.width) {
				var1 = field664 + Client.clickedWidgetParent.width - Client.clickedWidget.width;
			}
			if (var2 < field550) {
				var2 = field550;
			}
			if (var2 + Client.clickedWidget.height > field550 + Client.clickedWidgetParent.height) {
				var2 = field550 + Client.clickedWidgetParent.height - Client.clickedWidget.height;
			}
			int var3 = var1 - field775;
			int var4 = var2 - field677;
			int var5 = Client.clickedWidget.dragZoneSize;
			if (Timer.widgetDragDuration > Client.clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}
			int var6 = var1 - field664 + Client.clickedWidgetParent.scrollX;
			int var7 = var2 - field550 + Client.clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (Client.clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = Client.clickedWidget.onDrag;
				BoundaryObject.runScriptEvent(var8);
			}
			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (Client.clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = Client.clickedWidget.onDragComplete;
						BoundaryObject.runScriptEvent(var8);
					}
					if (draggedOnWidget != null && UserComparator10.method2610(clickedWidget) != null) {
						PacketBufferNode var9 = EnumComposition.getPacketBufferNode(ClientPacket.OPHELDD, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortLE(Client.clickedWidget.id);
						var9.packetBuffer.writeShortAdd(Client.clickedWidget.childIndex);
						var9.packetBuffer.writeIntLE(Client.draggedOnWidget.id);
						var9.packetBuffer.writeShortLE(Client.draggedOnWidget.childIndex);
						var9.packetBuffer.writeShortAddLE(Client.clickedWidget.itemId);
						var9.packetBuffer.writeShortLE(Client.draggedOnWidget.itemId);
						packetWriter.addNode(var9);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field775 + widgetClickX, widgetClickY + field677);
				} else if (menuOptionsCount > 0) {
					CollisionMap.method3906(field775 + widgetClickX, widgetClickY + field677);
				}
				clickedWidget = null;
			}
		} else if (Timer.widgetDragDuration > 1) {
			if (!isDraggingWidget && menuOptionsCount > 0) {
				CollisionMap.method3906(widgetClickX + field775, widgetClickY + field677);
			}
			clickedWidget = null;
		}
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(descriptor = "(I)Lqa;", garbageValue = "1509373240")
	@Export("username")
	public Username username() {
		return class101.localPlayer != null ? class101.localPlayer.username : null;
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						int var4;
						switch (var1) {
							case 3 :
								if (var2.equalsIgnoreCase("true")) {
									isMembersWorld = true;
								} else {
									isMembersWorld = false;
								}
								break;
							case 4 :
								if (clientType == -1) {
									clientType = Integer.parseInt(var2);
								}
								break;
							case 5 :
								worldProperties = Integer.parseInt(var2);
								break;
							case 6 :
								var4 = Integer.parseInt(var2);
								Language var13;
								if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
									var13 = Language.Language_valuesOrdered[var4];
								} else {
									var13 = null;
								}
								class134.clientLanguage = var13;
								break;
							case 7 :
								var4 = Integer.parseInt(var2);
								GameBuild[] var5 = MusicPatch.method5433();
								int var6 = 0;
								GameBuild var12;
								while (true) {
									if (var6 >= var5.length) {
										var12 = null;
										break;
									}
									GameBuild var7 = var5[var6];
									if (var4 == var7.buildId) {
										var12 = var7;
										break;
									}
									++var6;
								} 
								Players.field1305 = var12;
								break;
							case 8 :
								if (var2.equalsIgnoreCase("true")) {
								}
								break;
							case 9 :
								GrandExchangeOfferTotalQuantityComparator.field4045 = var2;
								break;
							case 10 :
								StudioGame[] var3 = new StudioGame[]{ StudioGame.game3, StudioGame.game4, StudioGame.stellardawn, StudioGame.oldscape, StudioGame.game5, StudioGame.runescape };
								class285.field3313 = ((StudioGame) (Actor.findEnumerated(var3, Integer.parseInt(var2))));
								if (class285.field3313 == StudioGame.oldscape) {
									HealthBarDefinition.loginType = LoginType.oldscape;
								} else {
									HealthBarDefinition.loginType = LoginType.field4620;
								}
								break;
							case 11 :
								UserComparator5.field1387 = var2;
								break;
							case 12 :
								worldId = Integer.parseInt(var2);
							case 13 :
							case 16 :
							case 18 :
							case 19 :
							case 20 :
							default :
								break;
							case 14 :
								class17.field99 = Integer.parseInt(var2);
								break;
							case 15 :
								gameBuild = Integer.parseInt(var2);
								break;
							case 17 :
								field481 = var2;
								break;
							case 21 :
								field482 = Integer.parseInt(var2);
						}
					}
				}
				SecureRandomFuture.method1967();
				StructComposition.worldHost = this.getCodeBase().getHost();
				String var8 = Players.field1305.name;
				byte var9 = 0;
				try {
					class117.method2727("oldschool", var8, var9, 22);
				} catch (Exception var10) {
					class249.RunException_sendStackTrace(((String) (null)), var10);
				}
				class353.client = this;
				class20.clientType = clientType;
				if (field484 == -1) {
					field484 = 0;
				}
				class21.field122 = System.getenv("JX_ACCESS_TOKEN");
				VarcInt.field1851 = System.getenv("JX_REFRESH_TOKEN");
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.field523 = true;
				}
				this.startThread(765, 503, 206, 1);
			}
		} catch (RuntimeException var11) {
			throw MilliClock.newRunException(var11, "client.init(" + ')');
		}
	}

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field733 = var1;
			WorldMapData_1.method4872(10);
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public long getAccountHash() {
		return this.field707;
	}

	@ObfuscatedSignature(descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V")
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.field673 = var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "-92")
	static int method1177(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (HealthBar.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
				WorldMapID.field2842 = HealthBar.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			}
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				if (currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
					WorldMapID.field2842 = currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapID.field2842.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (WorldMapID.field2842.allowGuests) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.field1637;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.field1633;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.field1634;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.field1645;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapID.field2842.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapID.field2842.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					class446.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.method2972(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.field1644;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.method2991(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.getSortedMembers()[Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					class446.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
					ServerPacket.method5209(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.field2842.field1649[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						class446.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
						SceneTilePaint.method4530(var5, var3, var4);
					}
					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (WorldMapID.field2842.field1642[var3]) ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class150.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
							UserComparator5.field1386 = class150.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						if (currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
							UserComparator5.field1386 = currentClanChannels[var3];
							Interpreter.field838 = var3;
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = UserComparator5.field1386.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = UserComparator5.field1386.field1696;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = UserComparator5.field1386.field1695;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = UserComparator5.field1386.method3113();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ((ClanChannelMember) (UserComparator5.field1386.members.get(var3))).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((ClanChannelMember) (UserComparator5.field1386.members.get(var3))).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ((ClanChannelMember) (UserComparator5.field1386.members.get(var3))).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						ApproximateRouteStrategy.method1086(Interpreter.field838, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = UserComparator5.field1386.method3102(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1] = UserComparator5.field1386.getSortedMembers()[Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (FontName.field4584 != null) ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}