import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class336 {
	@ObfuscatedName("wb")
	@ObfuscatedGetter(
		intValue = 1890787249
	)
	public static int field799;
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	static final class240 field520;
	@ObfuscatedName("xb")
	static int[] field641;
	@ObfuscatedName("xs")
	static int[] field671;
	@ObfuscatedName("xh")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	static final ApproximateRouteStrategy field645;
	@ObfuscatedName("wc")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wk")
	@ObfuscatedGetter(
		intValue = 1393048613
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("ww")
	@ObfuscatedGetter(
		intValue = 266342933
	)
	static int field574;
	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	static class507 field656;
	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "[Lps;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("wr")
	static List field800;
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	static class461 field795;
	@ObfuscatedName("wd")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("wt")
	@ObfuscatedGetter(
		intValue = 571114373
	)
	static int field798;
	@ObfuscatedName("bf")
	static boolean field602;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1545207573
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -420267913
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -939925291
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cn")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("ce")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1602400867
	)
	static int field637;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 483342745
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1264463859
	)
	static int field506;
	@ObfuscatedName("cp")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1081073917
	)
	static int field508;
	@ObfuscatedName("dg")
	static boolean field509;
	@ObfuscatedName("dr")
	static boolean field510;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 383910097
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("ds")
	static boolean field675;
	@ObfuscatedName("do")
	static boolean field739;
	@ObfuscatedName("di")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 271071563
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -2144931763
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		longValue = 7092568847167099497L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1099081089
	)
	static int field519;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1934712737
	)
	static int field807;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		longValue = 4483791798509325765L
	)
	static long field521;
	@ObfuscatedName("dh")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -792048985
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1949011067
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 72526637
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -2002022847
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1793171387
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = 1114391019
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 857147930
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1346244672
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = 1293020736
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("eb")
	@Export("z")
	static boolean z;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static class94 field535;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 1967717801
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 289554243
	)
	static int field537;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = -1296877745
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -548733073
	)
	static int field539;
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		intValue = -1552879491
	)
	static int field560;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = -915603301
	)
	static int field708;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static class551 field676;
	@ObfuscatedName("gy")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("gg")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("hn")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hi")
	static int[] field559;
	@ObfuscatedName("hd")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -1148233249
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("he")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = 1498709847
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ik")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("in")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -1563699817
	)
	static int field778;
	@ObfuscatedName("it")
	static String field642;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = 1599197695
	)
	static int field755;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 517985415
	)
	static int field573;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 1263456409
	)
	static int field534;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 1576916745
	)
	static int field575;
	@ObfuscatedName("jm")
	static int[][][] field683;
	@ObfuscatedName("jq")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jw")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("ja")
	static final int[] field579;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 2061659125
	)
	static int field580;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 805610763
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -877751007
	)
	static int field693;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 1732969453
	)
	static int field583;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = 1145616963
	)
	static int field584;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = -464481199
	)
	static int field747;
	@ObfuscatedName("kk")
	static boolean field586;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -1310205335
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 575410377
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -781326059
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = 2040069139
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = -811041119
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 2122058543
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -329091845
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -1880847825
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -1684016557
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = 1816031723
	)
	static int field596;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -1496220751
	)
	static int field597;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1891084203
	)
	static int field598;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = -834414311
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 1539316607
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -1292359005
	)
	@Export("revision")
	static int revision;
	@ObfuscatedName("lb")
	static boolean field712;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = 1700159481
	)
	static int field650;
	@ObfuscatedName("lh")
	static boolean field604;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -676006897
	)
	static int field605;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -804657147
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -460372189
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("ls")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("le")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ly")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("lg")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("lx")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("lc")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("mo")
	static int[][] field540;
	@ObfuscatedName("mr")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("mz")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 2005252973
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -1922466759
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -2146996983
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -1694544311
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = 2147270251
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -193062284
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -889216765
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mp")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = 1760374075
	)
	static int field625;
	@ObfuscatedName("mh")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 1043322835
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = 1106664327
	)
	static int field628;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		longValue = -1069174027776292633L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		longValue = 5654752889437794873L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 686350733
	)
	static int field503;
	@ObfuscatedName("mu")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = -44084715
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 605542881
	)
	static int field639;
	@ObfuscatedName("ni")
	static int[] field644;
	@ObfuscatedName("nw")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("no")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nl")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nj")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = 1913368221
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nu")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nh")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nq")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nf")
	static int[] field775;
	@ObfuscatedName("nd")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("ne")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = -1361024685
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nb")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("nk")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("on")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("oq")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("ov")
	@Export("menuItemIds")
	static int[] menuItemIds;
	@ObfuscatedName("od")
	@Export("menuWorldViewIds")
	static int[] menuWorldViewIds;
	@ObfuscatedName("op")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ob")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("or")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("ot")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("oi")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("of")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 1682068127
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -17675013
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 1814579321
	)
	static int field662;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = -690678063
	)
	static int field500;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = -583841881
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("oz")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 531417221
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 307705673
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("oj")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("pj")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = 17753643
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 292950689
	)
	static int field673;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = 2114293145
	)
	static int field504;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = -1109325709
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = 964069107
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 1047853455
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = -1441000797
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = 958782045
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pz")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -1867510069
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = 85940377
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pq")
	static boolean field688;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = -979253241
	)
	static int field689;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 857685933
	)
	static int field505;
	@ObfuscatedName("pw")
	static boolean field691;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = 1196179167
	)
	static int field692;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 1246106715
	)
	static int field663;
	@ObfuscatedName("qe")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 206872803
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qu")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = -239936169
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("qn")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = -1480906373
	)
	static int field620;
	@ObfuscatedName("qq")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1410318385
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("ql")
	static int[] field571;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -579475639
	)
	static int field719;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 831135969
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = -1457616349
	)
	static int field705;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -971069201
	)
	static int field803;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -1432015157
	)
	static int field707;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -1526215277
	)
	static int field659;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -1248782159
	)
	static int field709;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 401730143
	)
	static int field727;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 1233496723
	)
	static int field711;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = -101179887
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	static class564 field713;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	static NodeDeque field717;
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = -1895328209
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -800310153
	)
	static int field720;
	@ObfuscatedName("rw")
	@Export("validRootWidgets")
	static boolean[] validRootWidgets;
	@ObfuscatedName("ra")
	static boolean[] field722;
	@ObfuscatedName("rd")
	static boolean[] field723;
	@ObfuscatedName("rf")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rb")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("re")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rl")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 552032687
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		longValue = 7837883151600069321L
	)
	static long field729;
	@ObfuscatedName("rm")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = -1592891773
	)
	static int field731;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -747562771
	)
	static int field732;
	@ObfuscatedName("sv")
	static int[] field733;
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = 1055182343
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = -814861539
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sf")
	static String field736;
	@ObfuscatedName("sa")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 668387317
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	@Export("indexCheck")
	public static IndexCheck indexCheck;
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	static class229 field740;
	@ObfuscatedName("se")
	@ObfuscatedGetter(
		intValue = 1939911287
	)
	static int field741;
	@ObfuscatedName("ss")
	static int[] field742;
	@ObfuscatedName("si")
	static int[] field592;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		longValue = -6366518147636730365L
	)
	static long field744;
	@ObfuscatedName("sr")
	@ObfuscatedSignature(
		descriptor = "[Lgk;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "[Lgj;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -1888012179
	)
	static int field632;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = -1261127601
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tf")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tv")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = 2100059549
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = -1879112413
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 419900219
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tm")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = 395295339
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tu")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("to")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("th")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("up")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("uz")
	static int[] field668;
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uu")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("uc")
	static boolean field764;
	@ObfuscatedName("uv")
	static boolean field553;
	@ObfuscatedName("ub")
	static boolean field804;
	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	static class511 field767;
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static class510 field768;
	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static class510 field769;
	@ObfuscatedName("ua")
	static boolean field567;
	@ObfuscatedName("vb")
	static boolean[] field771;
	@ObfuscatedName("vk")
	static int[] field772;
	@ObfuscatedName("vj")
	static int[] field664;
	@ObfuscatedName("vy")
	static int[] field774;
	@ObfuscatedName("vr")
	static int[] field498;
	@ObfuscatedName("vu")
	static short field776;
	@ObfuscatedName("vt")
	static short field777;
	@ObfuscatedName("vw")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vx")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vq")
	static short field751;
	@ObfuscatedName("vv")
	static short field781;
	@ObfuscatedName("vg")
	static short field782;
	@ObfuscatedName("vh")
	static short field783;
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = -1428310161
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vs")
	@ObfuscatedGetter(
		intValue = 1351329335
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = -769669001
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		intValue = 1941814151
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = -736483307
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = 1197048315
	)
	static int field790;
	@ObfuscatedName("vd")
	@ObfuscatedGetter(
		intValue = 1026081245
	)
	static int field665;
	@ObfuscatedName("gl")
	@Export("token")
	String token;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("go")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("gx")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("gd")
	@Export("https")
	boolean https;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -1672003813
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("gw")
	@Export("refreshAccessTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("gt")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	Buffer field533;
	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	class7 field561;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		longValue = -7067965715940361021L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field602 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field637 = -1;
		clientType = -1;
		field506 = -1;
		onMobile = false;
		field508 = 223;
		field509 = false;
		field510 = false;
		gameState = 0;
		field675 = false;
		field739 = false;
		isLoading = true;
		cycle = 0;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field519 = -1;
		field807 = -1;
		field521 = -1L;
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
		z = false;
		field535 = class94.field1157;
		js5ConnectState = 0;
		field537 = 0;
		js5Errors = 0;
		field539 = 0;
		field560 = 0;
		field708 = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field676 = class551.field5419;
		byte[] var1 = class165.method3465("com_jagex_auth_desktop_osrs:public");
		int var3 = var1.length;
		StringBuilder var4 = new StringBuilder();

		int var6;
		int var7;
		int var8;
		for (int var5 = 0; var5 < var3 + 0; var5 += 3) {
			var6 = var1[var5] & 255;
			var4.append(class414.field4669[var6 >>> 2]);
			if (var5 < var3 - 1) {
				var7 = var1[var5 + 1] & 255;
				var4.append(class414.field4669[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var3 - 2) {
					var8 = var1[var5 + 2] & 255;
					var4.append(class414.field4669[(var7 & 15) << 2 | var8 >>> 6]).append(class414.field4669[var8 & 63]);
				} else {
					var4.append(class414.field4669[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(class414.field4669[(var6 & 3) << 4]).append("==");
			}
		}

		String var2 = var4.toString();
		BASIC_AUTH_DESKTOP_OSRS = var2;
		int var10 = "com_jagex_auth_desktop_runelite:public".length();
		byte[] var11 = new byte[var10];

		int var12;
		for (var12 = 0; var12 < var10; ++var12) {
			char var15 = "com_jagex_auth_desktop_runelite:public".charAt(var12);
			if (var15 > 127) {
				var11[var12] = 63;
			} else {
				var11[var12] = (byte)var15;
			}
		}

		byte[] var14 = var11;
		var12 = var11.length;
		StringBuilder var13 = new StringBuilder();

		for (var6 = 0; var6 < var12 + 0; var6 += 3) {
			var7 = var14[var6] & 255;
			var13.append(class414.field4669[var7 >>> 2]);
			if (var6 < var12 - 1) {
				var8 = var14[var6 + 1] & 255;
				var13.append(class414.field4669[(var7 & 3) << 4 | var8 >>> 4]);
				if (var6 < var12 - 2) {
					int var9 = var14[var6 + 2] & 255;
					var13.append(class414.field4669[(var8 & 15) << 2 | var9 >>> 6]).append(class414.field4669[var9 & 63]);
				} else {
					var13.append(class414.field4669[(var8 & 15) << 2]).append("=");
				}
			} else {
				var13.append(class414.field4669[(var7 & 3) << 4]).append("==");
			}
		}

		String var16 = var13.toString();
		BASIC_AUTH_DESKTOP_RUNELITE = var16;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		field559 = new int[4];
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field778 = 0;
		field755 = 1;
		field573 = 0;
		field534 = 1;
		field575 = 0;
		field683 = new int[4][13][13];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field579 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field580 = -1;
		graphicsCycle = 0;
		field693 = 2301979;
		field583 = 5063219;
		field584 = 3353893;
		field747 = 7759444;
		field586 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field596 = 0;
		field597 = 0;
		field598 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		revision = 0;
		field712 = false;
		field650 = 0;
		field604 = false;
		field605 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field540 = new int[overheadTextLimit][];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field625 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field628 = 0;
		userId = -1L;
		userHash = -1L;
		field503 = -1;
		renderSelf = true;
		drawPlayerNames = 0;
		field639 = 0;
		field644 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field775 = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuItemIds = new int[500];
		menuWorldViewIds = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field662 = 0;
		field500 = 50;
		isItemSelected = 0;
		field642 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field673 = 0;
		field504 = -1;
		chatEffects = 0;
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
		field688 = false;
		field689 = -1;
		field505 = -1;
		field691 = false;
		field692 = -1;
		field663 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field620 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field571 = new int[32];
		field719 = 0;
		chatCycle = 0;
		field705 = 0;
		field803 = 0;
		field707 = 0;
		field659 = 0;
		field709 = 0;
		field727 = 0;
		field711 = 0;
		mouseWheelRotation = 0;
		field713 = new class564();
		scriptEvents = new NodeDeque();
		scriptEvents2 = new NodeDeque();
		scriptEvents3 = new NodeDeque();
		field717 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field720 = -2;
		validRootWidgets = new boolean[100];
		field722 = new boolean[100];
		field723 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field729 = 0L;
		isResizable = true;
		field731 = 600;
		field732 = field731 / GameEngine.cycleDurationMillis;
		field733 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field736 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		indexCheck = new IndexCheck();
		field740 = new class229();
		field741 = 0;
		field742 = new int[128];
		field592 = new int[128];
		field744 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field632 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		field668 = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field764 = false;
		field553 = false;
		field804 = false;
		field767 = null;
		field768 = null;
		field769 = null;
		field567 = false;
		field771 = new boolean[5];
		field772 = new int[5];
		field664 = new int[5];
		field774 = new int[5];
		field498 = new int[5];
		field776 = 256;
		field777 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field751 = 1;
		field781 = 32767;
		field782 = 1;
		field783 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field790 = -1;
		field665 = -1;
		field656 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field795 = new class461(8, class459.field4897);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field798 = -1;
		field799 = -1;
		field800 = new ArrayList();
		field520 = new class240();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field574 = 0;
		field645 = new ApproximateRouteStrategy();
		field641 = new int[50];
		field671 = new int[50];
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "643678777"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field729 = WorldMapData_1.method4861() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1419(true);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1663834683"
	)
	@Export("setUp")
	protected final void setUp() {
		Tiles.method2345(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		class4.field9 = NpcOverrides.method3699(worldProperties, class542.field5331);
		NPCComposition.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class33.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		class169.currentPort = NPCComposition.worldPort;
		class452.field4862 = class357.field3816;
		class105.field1371 = class357.field3817;
		FriendSystem.field829 = class357.field3818;
		MouseRecorder.field1098 = class357.field3814;
		ByteArrayPool.urlRequester = new SecureUrlRequester(this.https, 223);
		this.setUpKeyboard();
		this.setUpMouse();
		ChatChannel.mouseWheel = this.mouseWheel();
		this.method493(field740, 0);
		this.method493(indexCheck, 1);
		this.setUpClipboard();
		MouseHandler.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = UserComparator10.getPreferencesFile("", class109.field1400.name, false);
			byte[] var4 = new byte[(int)var2.length()];

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) {
				var6 = var2.read(var4, var5, var4.length - var5);
				if (var6 == -1) {
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4));
		} catch (Exception var8) {
		}

		try {
			if (var2 != null) {
				var2.close();
			}
		} catch (Exception var7) {
		}

		class105.clientPreferences = var3;
		String var9 = WorldMapSprite.field2697;
		class31.field154 = this;
		if (var9 != null) {
			class31.field150 = var9;
		}

		class225.setWindowedMode(class105.clientPreferences.getWindowMode());
		class135.friendSystem = new FriendSystem(Projectile.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		class91.method2390(this);
		field520.method4538();
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		class138.method3192();
		boolean var2 = false;
		boolean var3 = false;
		if (!class330.field3581.isEmpty()) {
			SongTask var4 = (SongTask)class330.field3581.get(0);
			if (var4 == null) {
				class330.field3581.remove(0);
			} else if (var4.vmethod8276()) {
				if (var4.method8249()) {
					System.out.println("Error in midimanager.service: " + var4.method8251());
					var2 = true;
				} else {
					if (var4.method8254() != null) {
						class330.field3581.add(1, var4.method8254());
					}

					var3 = var4.method8250();
				}

				class330.field3581.remove(0);
			} else {
				var3 = var4.method8250();
			}
		}

		if (var2) {
			class330.field3581.clear();
			Iterator var10 = class330.musicSongs.iterator();

			label127:
			while (true) {
				MusicSong var5;
				do {
					if (!var10.hasNext()) {
						class330.musicSongs.clear();
						break label127;
					}

					var5 = (MusicSong)var10.next();
				} while(var5 == null);

				var5.midiPcmStream.clear();
				var5.midiPcmStream.method6190();
				var5.midiPcmStream.setPcmStreamVolume(0);
				var5.midiPcmStream.field3627 = 0;
				int var6 = var5.musicTrackGroupId;
				int var7 = var5.musicTrackFileId;
				Iterator var8 = class330.field3588.iterator();

				while (var8.hasNext()) {
					class336 var9 = (class336)var8.next();
					var9.vmethod6382(var6, var7);
				}
			}
		}

		if (var3 && playingJingle && Projectile.pcmPlayer1 != null) {
			Projectile.pcmPlayer1.tryDiscard();
		}

		class157.method3347();
		indexCheck.method4406();
		this.method492();
		ClanChannelMember.method3280();
		if (ChatChannel.mouseWheel != null) {
			int var11 = ChatChannel.mouseWheel.useRotation();
			mouseWheelRotation = var11;
		}

		if (gameState == 0) {
			Varps.method6456();
			FriendLoginUpdate.method8525();
		} else if (gameState == 5) {
			FaceNormal.loginScreen(this, GrandExchangeOfferOwnWorldComparator.fontPlain11, FloorUnderlayDefinition.fontPlain12);
			Varps.method6456();
			FriendLoginUpdate.method8525();
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				FaceNormal.loginScreen(this, GrandExchangeOfferOwnWorldComparator.fontPlain11, FloorUnderlayDefinition.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 50) {
				FaceNormal.loginScreen(this, GrandExchangeOfferOwnWorldComparator.fontPlain11, FloorUnderlayDefinition.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				if (field509) {
					MusicPatchPcmStream.loadRegion();
				}

				if (field510) {
					class201.method3827(class170.field1839);
				}

				if (!field510 && !field509) {
					ClanChannelMember.updateGameState(30);
				}
			}
		} else {
			FaceNormal.loginScreen(this, GrandExchangeOfferOwnWorldComparator.fontPlain11, FloorUnderlayDefinition.fontPlain12);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1954908195"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && field729 != 0L && WorldMapData_1.method4861() > field729) {
			class225.setWindowedMode(GrandExchangeOfferOwnWorldComparator.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, FloorUnderlayDefinition.field2095);
		} else if (gameState == 5) {
			class140.drawTitle(ParamComposition.fontBold12, GrandExchangeOfferOwnWorldComparator.fontPlain11, FloorUnderlayDefinition.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class140.drawTitle(ParamComposition.fontBold12, GrandExchangeOfferOwnWorldComparator.fontPlain11, FloorUnderlayDefinition.fontPlain12);
			} else if (gameState == 50) {
				class140.drawTitle(ParamComposition.fontBold12, GrandExchangeOfferOwnWorldComparator.fontPlain11, FloorUnderlayDefinition.fontPlain12);
			} else if (gameState == 25) {
				if (field575 == 1) {
					if (field778 > field755) {
						field755 = field778;
					}

					var2 = (field755 * 50 - field778 * 50) / field755;
					class59.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field575 == 2) {
					if (field573 > field534) {
						field534 = field573;
					}

					var2 = (field534 * 50 - field573 * 50) / field534 + 50;
					class59.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					class59.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class59.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class59.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class140.drawTitle(ParamComposition.fontBold12, GrandExchangeOfferOwnWorldComparator.fontPlain11, FloorUnderlayDefinition.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field722[var2]) {
					class434.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field722[var2] = false;
				}
			}
		} else if (gameState > 0) {
			class434.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field722[var2] = false;
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2038512898"
	)
	@Export("kill0")
	protected final void kill0() {
		if (Archive.varcs != null && Archive.varcs.hasUnwrittenChanges()) {
			Archive.varcs.write();
		}

		if (mouseRecorder != null) {
			mouseRecorder.isRunning = false;
		}

		mouseRecorder = null;
		packetWriter.close();
		class153.method3305();
		ChatChannel.mouseWheel = null;
		if (Projectile.pcmPlayer1 != null) {
			Projectile.pcmPlayer1.shutdown();
		}

		class233.field2486.method7282();
		class380.method7094();
		if (ByteArrayPool.urlRequester != null) {
			ByteArrayPool.urlRequester.close();
			ByteArrayPool.urlRequester = null;
		}

		MouseRecorder.method2386();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1067293593"
	)
	protected final void vmethod1251() {
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1040171340"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return class422.accessToken != null && !class422.accessToken.trim().isEmpty() && class36.refreshToken != null && !class36.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "17982"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return Canvas.sessionId != null && !Canvas.sessionId.trim().isEmpty() && class142.characterId != null && !class142.characterId.trim().isEmpty();
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-190071007"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "308555287"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class176.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(class176.authServiceBaseUrl)).getHost());
		var4.accept(HttpContentType.APPLICATION_JSON);
		HttpMethod var5 = HttpMethod.POST;
		RefreshAccessTokenRequester var6 = this.refreshAccessTokenRequester;
		if (var6 != null) {
			this.refreshAccessTokenRequestFuture = var6.request(var5.getName(), var3, var4.getHeaders(), "");
		} else {
			HttpRequest var7 = new HttpRequest(var3, var5, var4, this.https);
			this.asyncAccessTokenResponse = this.asyncRestClient.submitRequest(var7);
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1811960319"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(class176.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		HttpHeaders var3 = new HttpHeaders();
		var3.bearerToken(var1);
		HttpMethod var4 = HttpMethod.GET;
		OtlTokenRequester var5 = this.otlTokenRequester;
		if (var5 != null) {
			this.otlTokenRequestFuture = var5.request(var4.getName(), var2, var3.getHeaders(), "");
		} else {
			HttpRequest var6 = new HttpRequest(var2, var4, var3, this.https);
			this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var6);
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "30"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class316.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1150371023"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = class233.field2486.method7270();
			if (!var1) {
				this.method1269();
			}

		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1378644789"
	)
	void method1269() {
		if (class233.field2486.field4569 >= 4) {
			this.error("js5crc");
			ClanChannelMember.updateGameState(1000);
		} else {
			if (class233.field2486.field4570 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					ClanChannelMember.updateGameState(1000);
					return;
				}

				field537 = 3000;
				class233.field2486.field4570 = 3;
			}

			if (--field537 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class27.js5SocketTask = GameEngine.taskHandler.newSocketTask(HttpResponse.worldHost, class169.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class27.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class27.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						Socket var2 = (Socket)class27.js5SocketTask.result;
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
						AsyncRestClient.js5Socket = var1;
						Buffer var3;
						if (field508 >= 223) {
							var3 = new Buffer(class323.field3539.field3545 + 1);
							var3.writeByte(class323.field3539.field3536);
							var3.writeInt(223);
							var3.writeInt(field559[0]);
							var3.writeInt(field559[1]);
							var3.writeInt(field559[2]);
							var3.writeInt(field559[3]);
							AsyncRestClient.js5Socket.write(var3.array, 0, class323.field3539.field3545 + 1);
						} else {
							var3 = new Buffer(5);
							var3.writeByte(class323.field3539.field3536);
							var3.writeInt(223);
							AsyncRestClient.js5Socket.write(var3.array, 0, 5);
						}

						++js5ConnectState;
						TilesProjection.field3005 = WorldMapData_1.method4861();
					}

					if (js5ConnectState == 3) {
						if (AsyncRestClient.js5Socket.available() > 0) {
							int var4 = AsyncRestClient.js5Socket.readUnsignedByte();
							if (var4 != 0) {
								this.js5Error(var4);
								return;
							}

							++js5ConnectState;
						} else if (WorldMapData_1.method4861() - TilesProjection.field3005 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						class233.field2486.method7272(AsyncRestClient.js5Socket, gameState > 20);
						class27.js5SocketTask = null;
						AsyncRestClient.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var5) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2145273361"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class27.js5SocketTask = null;
		AsyncRestClient.js5Socket = null;
		js5ConnectState = 0;
		if (class169.currentPort == NPCComposition.worldPort) {
			class169.currentPort = class33.js5Port;
		} else {
			class169.currentPort = NPCComposition.worldPort;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				ClanChannelMember.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					ClanChannelMember.updateGameState(1000);
				} else {
					field537 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			ClanChannelMember.updateGameState(1000);
		} else {
			field537 = 3000;
		}

	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (LoginState.SHUTDOWN_PREVIOUS_CONNECTION == class134.loginState) {
				if (class150.field1711 == null && (secureRandomFuture.isDone() || field539 > 250)) {
					class150.field1711 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (class150.field1711 != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					class243.field2538 = null;
					hadNetworkError = false;
					field539 = 0;
					if (field676.method9855()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(class36.refreshToken);
								class28.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var22) {
								FriendsChat.RunException_sendStackTrace((String)null, var22);
								TaskHandler.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								TaskHandler.getLoginError(65);
								return;
							}

							try {
								this.authenticate(Canvas.sessionId, class142.characterId);
								class28.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var21) {
								FriendsChat.RunException_sendStackTrace((String)null, var21);
								TaskHandler.getLoginError(65);
								return;
							}
						}
					} else {
						class28.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var24;
			if (class134.loginState == LoginState.TOKEN_RESPONSE) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						TaskHandler.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							TaskHandler.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						class422.accessToken = var3.getAccessToken();
						class36.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var20) {
						FriendsChat.RunException_sendStackTrace((String)null, var20);
						TaskHandler.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						TaskHandler.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						FriendsChat.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						TaskHandler.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var24 = this.asyncAccessTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						TaskHandler.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field539 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var24.getResponseBody());

					try {
						class422.accessToken = var4.getBody().getString("access_token");
						class36.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var19) {
						FriendsChat.RunException_sendStackTrace("Error parsing tokens", var19);
						TaskHandler.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(class422.accessToken);
				class28.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (class134.loginState == LoginState.REFRESHING_TOKEN) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						TaskHandler.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var25.isSuccess()) {
							TaskHandler.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var25.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var18) {
						FriendsChat.RunException_sendStackTrace((String)null, var18);
						TaskHandler.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						TaskHandler.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						FriendsChat.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						TaskHandler.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var24 = this.asyncGameSessionTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						FriendsChat.RunException_sendStackTrace("Response code: " + var24.getResponseCode() + "Response body: " + var24.getResponseBody(), (Throwable)null);
						TaskHandler.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var27 = (List)var24.getHeaderFields().get("Content-Type");
					if (var27 != null && var27.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var24.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var17) {
							FriendsChat.RunException_sendStackTrace((String)null, var17);
							TaskHandler.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var24.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field539 = 0;
				class28.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (class134.loginState == LoginState.INIT_MOUSEHANDLER_SOCKET) {
				if (class243.field2538 == null) {
					class243.field2538 = GameEngine.taskHandler.newSocketTask(HttpResponse.worldHost, class169.currentPort);
				}

				if (class243.field2538.status == 2) {
					throw new IOException();
				}

				if (class243.field2538.status == 1) {
					Socket var29 = (Socket)class243.field2538.result;
					BufferedNetSocket var26 = new BufferedNetSocket(var29, 40000, 5000);
					var1 = var26;
					packetWriter.setSocket(var26);
					class243.field2538 = null;
					class28.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var28;
			if (class134.loginState == LoginState.UNMAPPED_20) {
				packetWriter.clearBuffer();
				var28 = WorldMapRectangle.method4996();
				var28.packetBuffer.writeByte(class323.field3544.field3536);
				packetWriter.addNode(var28);
				packetWriter.flush();
				var2.offset = 0;
				class28.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var12;
			if (LoginState.READ_LOGIN_STATUS == class134.loginState) {
				if (Projectile.pcmPlayer1 != null) {
					Projectile.pcmPlayer1.method841();
				}

				if (((AbstractSocket)var1).isAvailable(1)) {
					var12 = ((AbstractSocket)var1).readUnsignedByte();
					if (Projectile.pcmPlayer1 != null) {
						Projectile.pcmPlayer1.method841();
					}

					if (var12 != 0) {
						TaskHandler.getLoginError(var12);
						return;
					}

					var2.offset = 0;
					class28.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (LoginState.READ_RANDOM_VERIFICATION_NUMBER == class134.loginState) {
				if (var2.offset < 8) {
					var12 = ((AbstractSocket)var1).available();
					if (var12 > 8 - var2.offset) {
						var12 = 8 - var2.offset;
					}

					if (var12 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var12);
						var2.offset += var12;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					class27.field127 = var2.readLong();
					class28.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (LoginState.WRITE_INITIAL_LOGIN_PACKET == class134.loginState) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var30 = new PacketBuffer(500);
				int[] var31 = new int[]{class150.field1711.nextInt(), class150.field1711.nextInt(), class150.field1711.nextInt(), class150.field1711.nextInt()};
				var30.offset = 0;
				var30.writeByte(1);
				var30.writeInt(var31[0]);
				var30.writeInt(var31[1]);
				var30.writeInt(var31[2]);
				var30.writeInt(var31[3]);
				var30.writeLong(class27.field127);
				if (gameState == 40) {
					var30.writeInt(field559[0]);
					var30.writeInt(field559[1]);
					var30.writeInt(field559[2]);
					var30.writeInt(field559[3]);
				} else {
					if (gameState == 50) {
						var30.writeByte(AuthenticationScheme.field1521.rsOrdinal());
						var30.writeInt(class164.field1812);
					} else {
						var30.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
							var30.writeInt(class105.clientPreferences.getParameterValue(Login.Login_username));
						case 1:
						default:
							break;
						case 2:
							var30.offset += 4;
							break;
						case 3:
						case 4:
							var30.writeMedium(class6.otpMedium);
							++var30.offset;
						}
					}

					if (field676.method9855()) {
						var30.writeByte(class551.field5417.rsOrdinal());
						var30.writeStringCp1252NullTerminated(this.token);
					} else {
						var30.writeByte(class551.field5419.rsOrdinal());
						var30.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var30.encryptRsa(class76.field913, class76.field912);
				field559 = var31;
				PacketBufferNode var32 = WorldMapRectangle.method4996();
				var32.packetBuffer.offset = 0;
				if (gameState == 40) {
					var32.packetBuffer.writeByte(class323.field3537.field3536);
				} else {
					var32.packetBuffer.writeByte(class323.field3538.field3536);
				}

				var32.packetBuffer.writeShort(0);
				int var6 = var32.packetBuffer.offset;
				var32.packetBuffer.writeInt(223);
				var32.packetBuffer.writeInt(1);
				var32.packetBuffer.writeByte(clientType);
				var32.packetBuffer.writeByte(field506);
				byte var7 = 0;
				var32.packetBuffer.writeByte(var7);
				var32.packetBuffer.writeBytes(var30.array, 0, var30.offset);
				int var8 = var32.packetBuffer.offset;
				var32.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var32.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var32.packetBuffer.writeShort(class74.canvasWidth);
				var32.packetBuffer.writeShort(class1.canvasHeight);
				SoundSystem.randomDatData2(var32.packetBuffer);
				var32.packetBuffer.writeStringCp1252NullTerminated(AsyncHttpResponse.field81);
				var32.packetBuffer.writeInt(SpotAnimationDefinition.field2083);
				var32.packetBuffer.writeByte(0);
				Buffer var9 = new Buffer(class28.platformInfo.size());
				class28.platformInfo.write(var9);
				var32.packetBuffer.writeBytes(var9.array, 0, var9.array.length);
				var32.packetBuffer.writeByte(clientType);
				var32.packetBuffer.writeInt(0);
				if (class4.field9) {
					var32.packetBuffer.writeInt(class199.archive6.hash);
					var32.packetBuffer.writeIntME(class239.field2524.hash);
					var32.packetBuffer.writeIntIME(ChatChannel.archive13.hash);
					var32.packetBuffer.writeIntIME(class7.archive8.hash);
					var32.packetBuffer.writeIntIME(WorldMapSection1.archive10.hash);
					var32.packetBuffer.writeIntLE(class424.field4703.hash);
					var32.packetBuffer.writeIntLE(Tile.field2872.hash);
				} else {
					var32.packetBuffer.writeInt(class239.field2524.hash);
					var32.packetBuffer.writeIntLE(ChatChannel.archive13.hash);
					var32.packetBuffer.writeIntLE(class157.archive9.hash);
					var32.packetBuffer.writeIntME(class498.field5069.hash);
					var32.packetBuffer.writeInt(class424.field4703.hash);
					var32.packetBuffer.writeIntME(PlayerComposition.field3785.hash);
					var32.packetBuffer.writeIntME(LoginPacket.field1684.hash);
					var32.packetBuffer.writeIntLE(0);
					var32.packetBuffer.writeInt(ApproximateRouteStrategy.archive2.hash);
					var32.packetBuffer.writeIntIME(WorldEntity.archive12.hash);
					var32.packetBuffer.writeInt(class151.field1715.hash);
					var32.packetBuffer.writeInt(VarpDefinition.field1881.hash);
					var32.packetBuffer.writeInt(WorldMapSectionType.field2665.hash);
					var32.packetBuffer.writeInt(class199.archive6.hash);
					var32.packetBuffer.writeIntIME(Tile.field2872.hash);
					var32.packetBuffer.writeIntLE(JagNetThread.field4545.hash);
					var32.packetBuffer.writeIntLE(LoginScreenAnimation.archive4.hash);
					var32.packetBuffer.writeIntIME(LoginState.field497.hash);
					var32.packetBuffer.writeIntME(class195.field2052.hash);
					var32.packetBuffer.writeIntME(WorldMapSection1.archive10.hash);
					var32.packetBuffer.writeIntLE(class7.archive8.hash);
				}

				var32.packetBuffer.xteaEncrypt(var31, var8, var32.packetBuffer.offset);
				var32.packetBuffer.writeLengthShort(var32.packetBuffer.offset - var6);
				packetWriter.addNode(var32);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var31);
				int[] var10 = new int[4];

				for (int var11 = 0; var11 < 4; ++var11) {
					var10[var11] = var31[var11] + 50;
				}

				var2.newIsaacCipher(var10);
				class28.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var13;
			if (class134.loginState == LoginState.READ_CLIENT_INFO_STATUS && ((AbstractSocket)var1).available() > 0) {
				var12 = ((AbstractSocket)var1).readUnsignedByte();
				if (var12 == 61) {
					var13 = ((AbstractSocket)var1).available();
					UserComparator3.field1501 = var13 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1;
					class28.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var12 == 21 && gameState == 20) {
					class28.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var12 == 2) {
					if (class4.field9) {
						class28.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						class28.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var12 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					class28.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var12 == 64) {
					class28.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var12 == 23 && field560 < 1) {
					++field560;
					class28.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var12 == 29) {
					class28.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var12 != 69) {
						TaskHandler.getLoginError(var12);
						return;
					}

					class28.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (LoginState.UNMAPPED_21 == class134.loginState) {
				FloorUnderlayDefinition.field2095 = true;
				UserComparator7.method3008(class94.field1148);
				ClanChannelMember.updateGameState(0);
			}

			if (LoginState.READ_DIGEST_PARSER_PACKET_SIZE == class134.loginState && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				SpotAnimationDefinition.field2084 = var2.readUnsignedShort();
				class28.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (class134.loginState == LoginState.SUBMIT_DIGEST_PARSER_TASK && ((AbstractSocket)var1).available() >= SpotAnimationDefinition.field2084) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, SpotAnimationDefinition.field2084);
				class6[] var33 = new class6[]{class6.field19};
				class6 var34 = var33[var2.readUnsignedByte()];

				try {
					switch(var34.field17) {
					case 0:
						class0 var35 = new class0();
						this.field561 = new class7(var2, var35);
						class28.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var16) {
					TaskHandler.getLoginError(22);
					return;
				}
			}

			if (class134.loginState == LoginState.WRITE_DIGEST_PARSER_RESULT && this.field561.method42()) {
				this.field533 = this.field561.method44();
				this.field561.method43();
				this.field561 = null;
				if (this.field533 == null) {
					TaskHandler.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var28 = WorldMapRectangle.method4996();
				var28.packetBuffer.writeByte(class323.field3540.field3536);
				var28.packetBuffer.writeShort(this.field533.offset);
				var28.packetBuffer.writeBuffer(this.field533);
				packetWriter.addNode(var28);
				packetWriter.flush();
				this.field533 = null;
				class28.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (class134.loginState == LoginState.READ_STATE_11_PACKET_SIZE && ((AbstractSocket)var1).available() > 0) {
				LoginState.field477 = ((AbstractSocket)var1).readUnsignedByte();
				class28.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (class134.loginState == LoginState.UNMAPPED_11 && ((AbstractSocket)var1).available() >= LoginState.field477) {
				((AbstractSocket)var1).read(var2.array, 0, LoginState.field477);
				var2.offset = 0;
				class28.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (class134.loginState == LoginState.READ_PROFILE_TRANSFER_TIME && ((AbstractSocket)var1).available() > 0) {
				field708 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				class28.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (class134.loginState == LoginState.PROFILE_TRANSFER) {
				field539 = 0;
				VerticalAlignment.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field708 / 60 + " seconds.");
				if (--field708 <= 0) {
					class28.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (class134.loginState == LoginState.READ_ACCOUNT_INFO_PACKET_SIZE) {
				var28 = WorldMapRectangle.method4996();
				var28.packetBuffer.writeByte(class323.field3541.field3536);
				var28.packetBuffer.writeShort(class323.field3541.field3545);
				VertexNormal.method5914(var28);
				packetWriter.addNode(var28);
				packetWriter.flush();
				class28.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (LoginState.UNMAPPED == class134.loginState && ((AbstractSocket)var1).available() >= 1) {
					ModeWhere.field4640 = ((AbstractSocket)var1).readUnsignedByte();
					if (ModeWhere.field4640 != class323.field3542.field3545) {
						TaskHandler.getLoginError(ModeWhere.field4640);
						return;
					}

					class28.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (LoginState.READ_ACCOUNT_INFO == class134.loginState && ((AbstractSocket)var1).available() >= ModeWhere.field4640) {
					boolean var42 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var41 = false;
					if (var42) {
						var13 = var2.readByteIsaac() << 24;
						var13 |= var2.readByteIsaac() << 16;
						var13 |= var2.readByteIsaac() << 8;
						var13 |= var2.readByteIsaac();
						class105.clientPreferences.put(Login.Login_username, var13);
					}

					if (Login_isUsernameRemembered) {
						class105.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						class105.clientPreferences.updateRememberedUsername((String)null);
					}

					class133.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field628 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					class433.method8077().method4268(this.https);
					class28.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (LoginState.SET_SERVER_PROTOCOL == class134.loginState && ((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method9504()) {
						((AbstractSocket)var1).read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var37 = class150.ServerPacket_values();
					var13 = var2.readSmartByteShortIsaac();
					if (var13 < 0 || var13 >= var37.length) {
						throw new IOException("Invalid ServerProt: " + var13 + " at " + var2.offset);
					}

					packetWriter.serverPacket = var37[var13];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var38 = class415.client;
						JSObject.getWindow(var38).call("zap", (Object[])null);
					} catch (Throwable var15) {
					}

					class28.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (class134.loginState == LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method8331();
						WorldMapElement.method3595();
						class511.topLevelWorldView.playerUpdateManager.updatePlayer(var2, true);
						StudioGame.field4084 = SoundCache.localPlayer;
						Skeleton.field2915 = -1;
						class325.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field675 = false;
					}

				} else {
					if (class134.loginState == LoginState.UNMAPPED_17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						class159.field1789 = var2.readUnsignedShort();
						class28.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (LoginState.UNMAPPED_18 == class134.loginState && ((AbstractSocket)var1).available() >= class159.field1789) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, class159.field1789);
						var2.offset = 0;
						String var39 = var2.readStringCp1252NullTerminated();
						String var36 = var2.readStringCp1252NullTerminated();
						String var40 = var2.readStringCp1252NullTerminated();
						VerticalAlignment.setLoginResponseString(var39, var36, var40);
						ClanChannelMember.updateGameState(10);
						if (field676.method9855()) {
							class163.updateLoginIndex(9);
						}
					}

					if (class134.loginState != LoginState.UNMAPPED_19) {
						++field539;
						if (field539 > 2000) {
							if (field560 < 1) {
								if (NPCComposition.worldPort == class169.currentPort) {
									class169.currentPort = class33.js5Port;
								} else {
									class169.currentPort = NPCComposition.worldPort;
								}

								++field560;
								class28.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								TaskHandler.getLoginError(-3);
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) {
							if (((AbstractSocket)var1).available() < 2) {
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var12 = packetWriter.serverPacketLength;
							timer.method8333();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1462 = null;
							packetWriter.field1459 = null;
							packetWriter.field1464 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1457 = 0;
							rebootTimer = 0;
							menuOptionsCount = 0;
							isMenuOpen = false;
							minimapState = 0;
							destinationX = 0;
							class511.topLevelWorldView.method2680();
							ItemContainer.itemContainers = new NodeHashTable(32);
							ClanChannelMember.updateGameState(30);

							for (var13 = 0; var13 < 100; ++var13) {
								validRootWidgets[var13] = true;
							}

							class333.method6367();
							class511.topLevelWorldView.playerUpdateManager.updatePlayer(var2, true);
							if (var12 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var23) {
			if (field560 < 1) {
				if (class169.currentPort == NPCComposition.worldPort) {
					class169.currentPort = class33.js5Port;
				} else {
					class169.currentPort = NPCComposition.worldPort;
				}

				++field560;
				class28.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				TaskHandler.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "657801425"
	)
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
			class131.method3068();
		} else {
			if (!isMenuOpen) {
				SoundSystem.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last();
					boolean var40;
					if (var2 == null) {
						var40 = false;
					} else {
						var40 = true;
					}

					int var3;
					PacketBufferNode var41;
					if (!var40) {
						PacketBufferNode var18;
						int var19;
						if (timer.field4859) {
							var18 = class170.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
							var18.packetBuffer.writeByte(0);
							var19 = var18.packetBuffer.offset;
							timer.write(var18.packetBuffer);
							var18.packetBuffer.writeLengthByte(var18.packetBuffer.offset - var19);
							packetWriter.addNode(var18);
							timer.method8332();
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						synchronized(mouseRecorder.lock) {
							if (!field602) {
								mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || mouseRecorder.index >= 40) {
								var41 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < mouseRecorder.index && (var41 == null || var41.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field519 || var8 != field807) {
										if (var41 == null) {
											var41 = class170.getPacketBufferNode(ClientPacket.field3314, packetWriter.isaacCipher);
											var41.packetBuffer.writeByte(0);
											var3 = var41.packetBuffer.offset;
											PacketBuffer var10000 = var41.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if (-1L != field521) {
											var10 = var9 - field519;
											var11 = var8 - field807;
											var12 = (int)((mouseRecorder.millis[var7] - field521) / 20L);
											var5 = (int)((long)var5 + (mouseRecorder.millis[var7] - field521) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field519 = var9;
										field807 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var41.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var41.packetBuffer.writeByte(var12 + 128);
											var41.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var41.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var41.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var41.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var41.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var41.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var41.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field521 = mouseRecorder.millis[var7];
									}
								}

								if (var41 != null) {
									var41.packetBuffer.writeLengthByte(var41.packetBuffer.offset - var3);
									var7 = var41.packetBuffer.offset;
									var41.packetBuffer.offset = var3;
									var41.packetBuffer.writeByte(var5 / var6);
									var41.packetBuffer.writeByte(var5 % var6);
									var41.packetBuffer.offset = var7;
									packetWriter.addNode(var41);
								}

								if (var4 >= mouseRecorder.index) {
									mouseRecorder.index = 0;
								} else {
									MouseRecorder var64 = mouseRecorder;
									var64.index -= var4;
									System.arraycopy(mouseRecorder.xs, var4, mouseRecorder.xs, 0, mouseRecorder.index);
									System.arraycopy(mouseRecorder.ys, var4, mouseRecorder.ys, 0, mouseRecorder.index);
									System.arraycopy(mouseRecorder.millis, var4, mouseRecorder.millis, 0, mouseRecorder.index);
								}
							}
						}

						if (MouseHandler.MouseHandler_lastButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var20 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
							if (var20 > 32767L) {
								var20 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > class1.canvasHeight) {
								var3 = class1.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class74.canvasWidth) {
								var4 = class74.canvasWidth;
							}

							var5 = (int)var20;
							PacketBufferNode var22 = class170.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
							var22.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
							var22.packetBuffer.writeShort(var4);
							var22.packetBuffer.writeShort(var3);
							packetWriter.addNode(var22);
						}

						if (mouseWheelRotation != 0) {
							var18 = class170.getPacketBufferNode(ClientPacket.field3357, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort(mouseWheelRotation);
							packetWriter.addNode(var18);
						}

						if (indexCheck.field2450 > 0) {
							var18 = class170.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort(0);
							var19 = var18.packetBuffer.offset;
							long var23 = WorldMapData_1.method4861();

							for (var5 = 0; var5 < indexCheck.field2450; ++var5) {
								long var25 = var23 - field744;
								if (var25 > 16777215L) {
									var25 = 16777215L;
								}

								field744 = var23;
								var18.packetBuffer.writeByteSub(indexCheck.field2457[var5]);
								var18.packetBuffer.writeMedium((int)var25);
							}

							var18.packetBuffer.writeLengthShort(var18.packetBuffer.offset - var19);
							packetWriter.addNode(var18);
						}

						if (field650 > 0) {
							--field650;
						}

						if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
							field604 = true;
						}

						if (field604 && field650 <= 0) {
							field650 = 20;
							field604 = false;
							var18 = class170.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
							var18.packetBuffer.writeShortAddLE(camAngleY);
							var18.packetBuffer.writeShortAdd(camAngleX);
							packetWriter.addNode(var18);
						}

						if (class498.hasFocus && !hadFocus) {
							hadFocus = true;
							var18 = class170.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var18.packetBuffer.writeByte(1);
							packetWriter.addNode(var18);
						}

						if (!class498.hasFocus && hadFocus) {
							hadFocus = false;
							var18 = class170.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var18.packetBuffer.writeByte(0);
							packetWriter.addNode(var18);
						}

						if (VertexNormal.worldMap != null) {
							VertexNormal.worldMap.method9001();
						}

						Language.method7420();
						WorldMapSectionType.method4962();
						if (field632 != class511.topLevelWorldView.plane) {
							field632 = class511.topLevelWorldView.plane;
							var1 = class511.topLevelWorldView.plane;
							int[] var42 = class196.sceneMinimapSprite.pixels;
							var3 = var42.length;

							for (var4 = 0; var4 < var3; ++var4) {
								var42[var4] = 0;
							}

							for (var4 = 1; var4 < 103; ++var4) {
								var5 = (103 - var4) * 2048 + 24628;

								for (var6 = 1; var6 < 103; ++var6) {
									if ((class511.topLevelWorldView.tileSettings[var1][var6][var4] & 24) == 0) {
										class511.topLevelWorldView.scene.drawTileMinimap(var42, var5, 512, var1, var6, var4);
									}

									if (var1 < 3 && (class511.topLevelWorldView.tileSettings[var1 + 1][var6][var4] & 8) != 0) {
										class511.topLevelWorldView.scene.drawTileMinimap(var42, var5, 512, var1 + 1, var6, var4);
									}

									var5 += 4;
								}
							}

							var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
							var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
							class196.sceneMinimapSprite.setRaster();

							for (var6 = 1; var6 < 103; ++var6) {
								for (var7 = 1; var7 < 103; ++var7) {
									if ((class511.topLevelWorldView.tileSettings[var1][var7][var6] & 24) == 0) {
										MusicPatchNode.drawObject(var1, var7, var6, var4, var5);
									}

									if (var1 < 3 && (class511.topLevelWorldView.tileSettings[var1 + 1][var7][var6] & 8) != 0) {
										MusicPatchNode.drawObject(var1 + 1, var7, var6, var4, var5);
									}
								}
							}

							mapIconCount = 0;

							for (var6 = 0; var6 < 104; ++var6) {
								for (var7 = 0; var7 < 104; ++var7) {
									long var27 = class511.topLevelWorldView.scene.getFloorDecorationTag(class511.topLevelWorldView.plane, var6, var7);
									if (0L != var27) {
										var10 = class229.Entity_unpackID(var27);
										var11 = HttpRequest.getObjectDefinition(var10).mapIconId;
										if (var11 >= 0 && class165.WorldMapElement_get(var11).field1900) {
											mapIcons[mapIconCount] = class165.WorldMapElement_get(var11).getSpriteBool(false);
											mapIconXs[mapIconCount] = var6;
											mapIconYs[mapIconCount] = var7;
											++mapIconCount;
										}
									}
								}
							}

							class434.rasterProvider.apply();
						}

						if (gameState != 30) {
							return;
						}

						NPCComposition.method3756(class511.topLevelWorldView);
						class327.method6128();
						++packetWriter.field1457;
						if (packetWriter.field1457 > 750) {
							class131.method3068();
							return;
						}

						SoundCache.method895(class511.topLevelWorldView);
						WorldView var49 = class511.topLevelWorldView;

						for (var19 = 0; var19 < var49.npcCount; ++var19) {
							var3 = var49.npcIndices[var19];
							NPC var29 = var49.npcs[var3];
							if (var29 != null) {
								class230.updateActorSequence(var49, var29, var29.definition.size);
							}
						}

						WorldView var43 = class511.topLevelWorldView;

						for (var3 = 0; var3 < var43.worldEntityCount; ++var3) {
							var4 = var43.worldEntityIndices[var3];
							WorldEntity var30 = var43.worldEntities[var4];
							if (var30 != null) {
								var30.method8673();
							}
						}

						class136.method3174(class511.topLevelWorldView);

						for (var3 = 0; var3 < class511.topLevelWorldView.worldEntityCount; ++var3) {
							WorldEntity var52 = class511.topLevelWorldView.worldEntities[class511.topLevelWorldView.worldEntityIndices[var3]];
							if (var52 != null) {
								NPCComposition.method3756(var52.worldView);
								SoundCache.method895(var52.worldView);
								WorldView var54 = var52.worldView;

								for (var6 = 0; var6 < var54.npcCount; ++var6) {
									var7 = var54.npcIndices[var6];
									NPC var31 = var54.npcs[var7];
									if (var31 != null) {
										class230.updateActorSequence(var54, var31, var31.definition.size);
									}
								}

								class136.method3174(var52.worldView);
							}
						}

						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 400;
							if (mouseCrossState * 20 >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var32 = class180.mousedOverWidgetIf1;
						Widget var53 = GrandExchangeOfferOwnWorldComparator.field466;
						class180.mousedOverWidgetIf1 = null;
						GrandExchangeOfferOwnWorldComparator.field466 = null;
						draggedOnWidget = null;
						field691 = false;
						field688 = false;
						field741 = 0;

						while (indexCheck.method4382() && field741 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field2460 == 66) {
								String var55 = Messages.method2917();
								class415.client.method556(var55);
							} else if (oculusOrbState != 1 || indexCheck.field2459 <= 0) {
								field592[field741] = indexCheck.field2460;
								field742[field741] = indexCheck.field2459;
								++field741;
							}
						}

						if (BuddyRankComparator.method3038() && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var5 = SoundCache.localPlayer.plane - mouseWheelRotation;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > 3) {
								var5 = 3;
							}

							if (var5 != SoundCache.localPlayer.plane) {
								NPC.method2713(SoundCache.localPlayer.pathX[0] + class511.topLevelWorldView.baseX, SoundCache.localPlayer.pathY[0] + class511.topLevelWorldView.baseY, var5, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class60.updateRootInterface(rootInterface, 0, 0, class74.canvasWidth, class1.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var33;
							Widget var50;
							ScriptEvent var56;
							do {
								var56 = (ScriptEvent)scriptEvents2.removeLast();
								if (var56 == null) {
									while (true) {
										do {
											var56 = (ScriptEvent)scriptEvents3.removeLast();
											if (var56 == null) {
												while (true) {
													do {
														var56 = (ScriptEvent)scriptEvents.removeLast();
														if (var56 == null) {
															boolean var44 = false;

															while (true) {
																class230 var51 = (class230)field717.removeLast();
																if (var51 == null) {
																	if (!var44 && MouseHandler.MouseHandler_lastButton == 1) {
																		field740.method4349();
																	}

																	this.menu();
																	GrandExchangeOfferOwnWorldComparator.method1227();
																	if (clickedWidget != null) {
																		this.method1285();
																	}

																	boolean var46 = false;

																	for (var7 = 0; var7 < class511.topLevelWorldView.worldEntityCount; ++var7) {
																		WorldEntity var57 = class511.topLevelWorldView.worldEntities[class511.topLevelWorldView.worldEntityIndices[var7]];
																		WorldView var58 = var57.worldView;
																		Scene var62 = var58.scene;
																		if (var57 != null && var62.shouldSendWalk()) {
																			if (!var46) {
																				var11 = var62.baseX;
																				var12 = var62.baseY;
																				PacketBufferNode var13 = class170.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																				var13.packetBuffer.writeByte(5);
																				var13.packetBuffer.writeShortLE(var12 + var58.baseY);
																				var13.packetBuffer.writeByte(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																				var13.packetBuffer.writeShortAddLE(var11 + var58.baseX);
																				packetWriter.addNode(var13);
																				var46 = true;
																				mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																				mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																				mouseCrossColor = 1;
																				mouseCrossState = 0;
																				destinationX = var11;
																				destinationY = var12;
																			}

																			var62.method5531();
																		}
																	}

																	PacketBufferNode var60;
																	if (!var46 && class511.topLevelWorldView.scene.shouldSendWalk()) {
																		var7 = class511.topLevelWorldView.scene.baseX;
																		var8 = class511.topLevelWorldView.scene.baseY;
																		var60 = class170.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																		var60.packetBuffer.writeByte(5);
																		var60.packetBuffer.writeShortLE(var8 + class511.topLevelWorldView.baseY);
																		var60.packetBuffer.writeByte(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																		var60.packetBuffer.writeShortAddLE(var7 + class511.topLevelWorldView.baseX);
																		packetWriter.addNode(var60);
																		class511.topLevelWorldView.scene.method5531();
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																		mouseCrossColor = 1;
																		mouseCrossState = 0;
																		destinationX = var7;
																		destinationY = var8;
																	}

																	if (var46) {
																		class511.topLevelWorldView.scene.method5531();
																	}

																	if (var32 != class180.mousedOverWidgetIf1) {
																		if (var32 != null) {
																			TriBool.invalidateWidget(var32);
																		}

																		if (class180.mousedOverWidgetIf1 != null) {
																			TriBool.invalidateWidget(class180.mousedOverWidgetIf1);
																		}
																	}

																	if (var53 != GrandExchangeOfferOwnWorldComparator.field466 && field662 == field500) {
																		if (var53 != null) {
																			TriBool.invalidateWidget(var53);
																		}

																		if (GrandExchangeOfferOwnWorldComparator.field466 != null) {
																			TriBool.invalidateWidget(GrandExchangeOfferOwnWorldComparator.field466);
																		}
																	}

																	if (GrandExchangeOfferOwnWorldComparator.field466 != null) {
																		if (field662 < field500) {
																			++field662;
																			if (field500 == field662) {
																				TriBool.invalidateWidget(GrandExchangeOfferOwnWorldComparator.field466);
																			}
																		}
																	} else if (field662 > 0) {
																		--field662;
																	}

																	int var14;
																	int var15;
																	int var36;
																	if (oculusOrbState == 0) {
																		var7 = StudioGame.field4084.vmethod8670();
																		var8 = StudioGame.field4084.vmethod8671();
																		if (field503 != -1) {
																			Player var61 = SoundCache.localPlayer.worldView.players[field503];
																			if (var61 != null) {
																				Coord var63 = var61.method2488(SoundCache.localPlayer.worldView);
																				var7 = var63.x;
																				var8 = var63.y;
																			}
																		}

																		var9 = StudioGame.field4084.vmethod8672();
																		if (class371.oculusOrbFocalPointX - var7 < -500 || class371.oculusOrbFocalPointX - var7 > 500 || PacketBufferNode.oculusOrbFocalPointY - var8 < -500 || PacketBufferNode.oculusOrbFocalPointY - var8 > 500) {
																			class371.oculusOrbFocalPointX = var7;
																			PacketBufferNode.oculusOrbFocalPointY = var8;
																		}

																		if (var7 != class371.oculusOrbFocalPointX) {
																			class371.oculusOrbFocalPointX += (var7 - class371.oculusOrbFocalPointX) / 16;
																		}

																		if (var8 != PacketBufferNode.oculusOrbFocalPointY) {
																			PacketBufferNode.oculusOrbFocalPointY += (var8 - PacketBufferNode.oculusOrbFocalPointY) / 16;
																		}

																		var10 = class371.oculusOrbFocalPointX >> 7;
																		var11 = PacketBufferNode.oculusOrbFocalPointY >> 7;
																		var12 = class169.getTileHeight(class511.topLevelWorldView, class371.oculusOrbFocalPointX, PacketBufferNode.oculusOrbFocalPointY, var9);
																		var36 = 0;
																		if (var10 > 3 && var11 > 3 && var10 < 100 && var11 < 100) {
																			for (var14 = var10 - 4; var14 <= var10 + 4; ++var14) {
																				for (var15 = var11 - 4; var15 <= var11 + 4; ++var15) {
																					int var16 = var9;
																					if (var9 < 3 && (class511.topLevelWorldView.tileSettings[1][var14][var15] & 2) == 2) {
																						var16 = var9 + 1;
																					}

																					int var17 = var12 - class511.topLevelWorldView.tileHeights[var16][var14][var15];
																					if (var17 > var36) {
																						var36 = var17;
																					}
																				}
																			}
																		}

																		var14 = var36 * 192;
																		if (var14 > 98048) {
																			var14 = 98048;
																		}

																		if (var14 < 32768) {
																			var14 = 32768;
																		}

																		if (var14 > field605) {
																			field605 += (var14 - field605) / 24;
																		} else if (var14 < field605) {
																			field605 += (var14 - field605) / 80;
																		}

																		BoundaryObject.oculusOrbFocalPointZ = class169.getTileHeight(class511.topLevelWorldView, var7, var8, var9) - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		if (field712 && SoundCache.localPlayer != null) {
																			var7 = SoundCache.localPlayer.pathX[0];
																			var8 = SoundCache.localPlayer.pathY[0];
																			if (var7 >= 0 && 104 > var7 && var8 >= 0 && 104 > var8) {
																				class371.oculusOrbFocalPointX = SoundCache.localPlayer.x;
																				var9 = class169.getTileHeight(class511.topLevelWorldView, SoundCache.localPlayer.x, SoundCache.localPlayer.y, class511.topLevelWorldView.plane) - camFollowHeight;
																				if (var9 < BoundaryObject.oculusOrbFocalPointZ) {
																					BoundaryObject.oculusOrbFocalPointZ = var9;
																				}

																				PacketBufferNode.oculusOrbFocalPointY = SoundCache.localPlayer.y;
																				field712 = false;
																			}
																		}

																		short var48 = -1;
																		if (indexCheck.isValidIndexInRange(33)) {
																			var48 = 0;
																		} else if (indexCheck.isValidIndexInRange(49)) {
																			var48 = 1024;
																		}

																		if (indexCheck.isValidIndexInRange(48)) {
																			if (var48 == 0) {
																				var48 = 1792;
																			} else if (var48 == 1024) {
																				var48 = 1280;
																			} else {
																				var48 = 1536;
																			}
																		} else if (indexCheck.isValidIndexInRange(50)) {
																			if (var48 == 0) {
																				var48 = 256;
																			} else if (var48 == 1024) {
																				var48 = 768;
																			} else {
																				var48 = 512;
																			}
																		}

																		byte var47 = 0;
																		if (indexCheck.isValidIndexInRange(35)) {
																			var47 = -1;
																		} else if (indexCheck.isValidIndexInRange(51)) {
																			var47 = 1;
																		}

																		var9 = 0;
																		if (var48 >= 0 || var47 != 0) {
																			var9 = indexCheck.isValidIndexInRange(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var9 *= 16;
																			field597 = var48;
																			field598 = var47;
																		}

																		if (field596 < var9) {
																			field596 += var9 / 8;
																			if (field596 > var9) {
																				field596 = var9;
																			}
																		} else if (field596 > var9) {
																			field596 = field596 * 9 / 10;
																		}

																		if (field596 > 0) {
																			var10 = field596 / 16;
																			if (field597 >= 0) {
																				var7 = field597 - class337.cameraYaw & 2047;
																				var11 = Rasterizer3D.Rasterizer3D_sine[var7];
																				var12 = Rasterizer3D.Rasterizer3D_cosine[var7];
																				class371.oculusOrbFocalPointX += var10 * var11 / 65536;
																				PacketBufferNode.oculusOrbFocalPointY += var12 * var10 / 65536;
																			}

																			if (field598 != 0) {
																				BoundaryObject.oculusOrbFocalPointZ += var10 * field598;
																				if (BoundaryObject.oculusOrbFocalPointZ > 0) {
																					BoundaryObject.oculusOrbFocalPointZ = 0;
																				}
																			}
																		} else {
																			field597 = -1;
																			field598 = -1;
																		}

																		if (indexCheck.isValidIndexInRange(13)) {
																			class150.method3288();
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && World.mouseCam) {
																		var7 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																		camAngleDX = var7 * 2;
																		mouseCamClickedY = var7 != -1 && var7 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
																		var8 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																		camAngleDY = var8 * 2;
																		mouseCamClickedX = var8 != -1 && var8 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
																	} else {
																		if (indexCheck.isValidIndexInRange(96)) {
																			camAngleDY += (-24 - camAngleDY) / 2;
																		} else if (indexCheck.isValidIndexInRange(97)) {
																			camAngleDY += (24 - camAngleDY) / 2;
																		} else {
																			camAngleDY /= 2;
																		}

																		if (indexCheck.isValidIndexInRange(98)) {
																			camAngleDX += (12 - camAngleDX) / 2;
																		} else if (indexCheck.isValidIndexInRange(99)) {
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

																	if (field567) {
																		WorldMapDecorationType.method7065(WorldMapSectionType.field2666, ObjectSound.field853, class137.field1630);
																		class252.method4911(class328.field3565, WorldMapLabelSize.field2551);
																		if (WorldMapSectionType.field2666 == class47.cameraX && class328.cameraY == ObjectSound.field853 && class137.field1630 == class60.cameraZ && Language.cameraPitch == class328.field3565 && class337.cameraYaw == WorldMapLabelSize.field2551) {
																			field567 = false;
																			isCameraLocked = false;
																			field764 = false;
																			field553 = false;
																			class327.field3558 = 0;
																			PendingSpawn.field1188 = 0;
																			class6.field16 = 0;
																			class133.field1560 = 0;
																			class104.field1354 = 0;
																			NpcOverrides.field1983 = 0;
																			VarpDefinition.field1879 = 0;
																			WorldMapLabelSize.field2541 = 0;
																			VarbitComposition.field2102 = 0;
																			GrandExchangeOfferAgeComparator.field4583 = 0;
																			field767 = null;
																			field769 = null;
																			field768 = null;
																		}
																	} else if (isCameraLocked) {
																		if (!field764) {
																			var7 = class376.method7084(WorldMapLabelSize.field2541);
																			var8 = class376.method7084(VarbitComposition.field2102);
																			var9 = class169.getTileHeight(class511.topLevelWorldView, var7, var8, class511.topLevelWorldView.plane) - GrandExchangeOfferAgeComparator.field4583;
																			WorldMapDecorationType.method7065(var7, var9, var8);
																		} else if (field767 != null) {
																			class47.cameraX = field767.vmethod8962();
																			class60.cameraZ = field767.vmethod8963();
																			if (field804) {
																				class328.cameraY = field767.vmethod8964();
																			} else {
																				class328.cameraY = class169.getTileHeight(class511.topLevelWorldView, class47.cameraX, class60.cameraZ, class511.topLevelWorldView.plane) - field767.vmethod8964();
																			}

																			field767.method8974();
																		}

																		if (!field553) {
																			var7 = class376.method7084(class327.field3558);
																			var8 = class376.method7084(PendingSpawn.field1188);
																			var9 = class169.getTileHeight(class511.topLevelWorldView, var7, var8, class511.topLevelWorldView.plane) - class6.field16;
																			var10 = var7 - class47.cameraX;
																			var11 = var9 - class328.cameraY;
																			var12 = var8 - class60.cameraZ;
																			var36 = (int)Math.sqrt((double)(var12 * var12 + var10 * var10));
																			var14 = (int)(Math.atan2((double)var11, (double)var36) * 325.9490051269531D) & 2047;
																			var15 = (int)(Math.atan2((double)var10, (double)var12) * -325.9490051269531D) & 2047;
																			class252.method4911(var14, var15);
																		} else {
																			if (field769 != null) {
																				Language.cameraPitch = field769.method8959();
																				Language.cameraPitch = Math.min(Math.max(Language.cameraPitch, 128), 383);
																				field769.method8974();
																			}

																			if (field768 != null) {
																				class337.cameraYaw = field768.method8959() & 2047;
																				field768.method8974();
																			}
																		}
																	}

																	for (var7 = 0; var7 < 5; ++var7) {
																		int var10002 = field498[var7]++;
																	}

																	Archive.varcs.tryWrite();
																	var7 = AsyncHttpResponse.method272();
																	var8 = class74.method2155();
																	if (var7 > 15000 && var8 > 15000) {
																		logoutTimer = 250;
																		MouseHandler.MouseHandler_idleCycles = 14500;
																		var60 = class170.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var60);
																	}

																	class135.friendSystem.processFriendUpdates();

																	for (var9 = 0; var9 < field800.size(); ++var9) {
																		var11 = (Integer)field800.get(var9);
																		class142 var37 = class138.method3190(var11);
																		if (var37 == null) {
																			var10 = 2;
																		} else {
																			var10 = var37.method3231() ? 0 : 1;
																		}

																		if (var10 != 2) {
																			field800.remove(var9);
																			--var9;
																		}
																	}

																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var60 = class170.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var60);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var38) {
																		class131.method3068();
																	}

																	class433.method8077().method4261();
																	return;
																}

																if (var51.field2444.type == 12) {
																	var44 = true;
																}

																if (var51 != null && var51.field2444 != null) {
																	if (var51.field2444.childIndex >= 0) {
																		var33 = ModeWhere.widgetDefinition.method6519(var51.field2444.parentId);
																		if (var33 == null || var33.children == null || var33.children.length == 0 || var51.field2444.childIndex >= var33.children.length || var51.field2444 != var33.children[var51.field2444.childIndex]) {
																			continue;
																		}
																	}

																	if (var51.field2444.type == 11 && var51.field2440 == 0) {
																		if (var51.field2444.method6878(var51.field2445, var51.field2443, 0, 0)) {
																			var51.field2444.method6920().method4120().method4244(1, var51.field2444.method6920().method4132());
																			switch(var51.field2444.method6881()) {
																			case 0:
																				class421.openURL(var51.field2444.method6867(), true, false);
																				break;
																			case 1:
																				var8 = ClanChannel.getWidgetFlags(var51.field2444);
																				boolean var45 = (var8 >> 22 & 1) != 0;
																				if (var45) {
																					int[] var34 = var51.field2444.method6863();
																					if (var34 != null) {
																						PacketBufferNode var35 = class170.getPacketBufferNode(ClientPacket.field3366, packetWriter.isaacCipher);
																						var35.packetBuffer.writeIntLE(var51.field2444.id);
																						var35.packetBuffer.writeShortLE(var51.field2444.childIndex);
																						var35.packetBuffer.writeIntIME(var34[1]);
																						var35.packetBuffer.writeIntIME(var51.field2444.method6882());
																						var35.packetBuffer.writeIntLE(var34[0]);
																						var35.packetBuffer.writeIntLE(var34[2]);
																						packetWriter.addNode(var35);
																					}
																				}
																			}
																		}
																	} else if (var51.field2444.type == 12) {
																		class356 var59 = var51.field2444.method6991();
																		if (var59 != null && var59.method6636()) {
																			switch(var51.field2440) {
																			case 0:
																				field740.method4347(var51.field2444);
																				var59.method6763(true);
																				var59.method6623(var51.field2445, var51.field2443, indexCheck.isValidIndexInRange(82), indexCheck.isValidIndexInRange(81));
																				break;
																			case 1:
																				var59.method6624(var51.field2445, var51.field2443);
																			}
																		}
																	}
																}
															}
														}

														var50 = var56.widget;
														if (var50.childIndex < 0) {
															break;
														}

														var33 = ModeWhere.widgetDefinition.method6519(var50.parentId);
													} while(var33 == null || var33.children == null || var50.childIndex >= var33.children.length || var50 != var33.children[var50.childIndex]);

													Projectile.runScriptEvent(var56);
												}
											}

											var50 = var56.widget;
											if (var50.childIndex < 0) {
												break;
											}

											var33 = ModeWhere.widgetDefinition.method6519(var50.parentId);
										} while(var33 == null || var33.children == null || var50.childIndex >= var33.children.length || var50 != var33.children[var50.childIndex]);

										Projectile.runScriptEvent(var56);
									}
								}

								var50 = var56.widget;
								if (var50.childIndex < 0) {
									break;
								}

								var33 = ModeWhere.widgetDefinition.method6519(var50.parentId);
							} while(var33 == null || var33.children == null || var50.childIndex >= var33.children.length || var50 != var33.children[var50.childIndex]);

							Projectile.runScriptEvent(var56);
						}
					}

					var41 = class170.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var41.packetBuffer.writeByte(0);
					var3 = var41.packetBuffer.offset;
					HttpRequest.performReflectionCheck(var41.packetBuffer);
					var41.packetBuffer.writeLengthByte(var41.packetBuffer.offset - var3);
					packetWriter.addNode(var41);
				}
			}
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-78"
	)
	public void vmethod6382(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && class105.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = class170.getPacketBufferNode(ClientPacket.field3282, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "957518491"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class74.canvasWidth;
		int var2 = class1.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class105.clientPreferences != null) {
			try {
				class26.method389(class415.client, "resize", new Object[]{GrandExchangeOfferOwnWorldComparator.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-57"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			class212.method4108(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field722[var1] = true;
			}

			field723[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field720 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			PendingSpawn.drawWidgets(rootInterface, 0, 0, class74.canvasWidth, class1.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				PlayerUpdateManager.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				PlayerUpdateManager.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				AbstractWorldMapData.method4994(viewportX, viewportY);
			}
		} else {
			UserComparator4.method2994();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field723[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field722[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		class227.method4321(class511.topLevelWorldView.plane, SoundCache.localPlayer.x, SoundCache.localPlayer.y, graphicsCycle);
		graphicsCycle = 0;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Lev;II)Z",
		garbageValue = "496029700"
	)
	boolean method1277(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			Decimator.friendsChat = null;
		} else {
			if (Decimator.friendsChat == null) {
				Decimator.friendsChat = new FriendsChat(Projectile.loginType, class415.client);
			}

			Decimator.friendsChat.method8483(var1.packetBuffer, var2);
		}

		HttpHeaders.method8401();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)Z",
		garbageValue = "-1896066454"
	)
	boolean method1278(PacketWriter var1) {
		if (Decimator.friendsChat != null) {
			Decimator.friendsChat.method8484(var1.packetBuffer);
		}

		HttpHeaders.method8401();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)Z",
		garbageValue = "-659118293"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var23;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1461) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1457 = 0;
						var1.field1461 = false;
					}

					var3.offset = 0;
					if (var3.method9504()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1457 = 0;
					}

					var1.field1461 = true;
					ServerPacket[] var4 = class150.ServerPacket_values();
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
				var1.field1457 = 0;
				timer.method8328();
				var1.field1464 = var1.field1459;
				var1.field1459 = var1.field1462;
				var1.field1462 = var1.serverPacket;
				if (ServerPacket.field3415 == var1.serverPacket) {
					PendingSpawn.field1171 = null;
					var1.serverPacket = null;
					return true;
				}

				int var20;
				Widget var56;
				if (ServerPacket.field3405 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedByteNeg();
					var6 = var3.readUnsignedByteNeg();
					var56 = ModeWhere.widgetDefinition.method6519(var20);
					class95.method2467(var56, var5, var6);
					TriBool.invalidateWidget(var56);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3463 == var1.serverPacket) {
					class153.method3312(class320.field3387);
					var1.serverPacket = null;
					return true;
				}

				int var8;
				int var9;
				int var10;
				int var21;
				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field567 = false;
					field553 = false;
					class327.field3558 = var3.readUnsignedByte();
					PendingSpawn.field1188 = var3.readUnsignedByte();
					class6.field16 = var3.readUnsignedShort();
					class133.field1560 = var3.readUnsignedByte();
					class104.field1354 = var3.readUnsignedByte();
					if (class104.field1354 >= 100) {
						var20 = class376.method7084(class327.field3558);
						var5 = class376.method7084(PendingSpawn.field1188);
						var6 = class169.getTileHeight(class511.topLevelWorldView, var20, var5, class511.topLevelWorldView.plane) - class6.field16;
						var21 = var20 - class47.cameraX;
						var8 = var6 - class328.cameraY;
						var9 = var5 - class60.cameraZ;
						var10 = (int)Math.sqrt((double)(var9 * var9 + var21 * var21));
						Language.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
						class337.cameraYaw = (int)(Math.atan2((double)var21, (double)var9) * -325.9490051269531D) & 2047;
						if (Language.cameraPitch < 128) {
							Language.cameraPitch = 128;
						}

						if (Language.cameraPitch > 383) {
							Language.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3530 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedByte();
					if (var20 == 0) {
						class511.topLevelWorldView.plane = var6;
						HttpResponse.worldView = class511.topLevelWorldView;
					} else {
						if (var20 != 1) {
							throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
						}

						WorldEntity var59 = class511.topLevelWorldView.worldEntities[var5];
						var59.worldView.plane = var6;
						HttpResponse.worldView = var59.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					LoginPacket.field1682 = var3.readUnsignedByteNeg();
					field580 = var3.readUnsignedByteSub();
					NPC.field1350 = var3.readUnsignedByteAdd();

					for (var20 = LoginPacket.field1682; var20 < LoginPacket.field1682 + 8; ++var20) {
						for (var5 = NPC.field1350; var5 < NPC.field1350 + 8; ++var5) {
							if (HttpResponse.worldView.groundItems[field580][var20][var5] != null) {
								HttpResponse.worldView.groundItems[field580][var20][var5] = null;
								WorldMapRenderer.updateItemPile(field580, var20, var5);
							}
						}
					}

					for (PendingSpawn var55 = (PendingSpawn)HttpResponse.worldView.pendingSpawns.last(); var55 != null; var55 = (PendingSpawn)HttpResponse.worldView.pendingSpawns.previous()) {
						if (var55.x >= LoginPacket.field1682 && var55.x < LoginPacket.field1682 + 8 && var55.y >= NPC.field1350 && var55.y < NPC.field1350 + 8 && var55.plane == field580) {
							var55.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3450 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedIntLE();
					var56 = ModeWhere.widgetDefinition.method6519(var6);
					var56.field3943 = var20 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				Widget var22;
				if (ServerPacket.field3500 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedByteSub();
					var22 = ModeWhere.widgetDefinition.method6519(var20);
					class225.method4302(var22, SoundCache.localPlayer.appearance.gender, var5);
					TriBool.invalidateWidget(var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3442 == var1.serverPacket) {
					class153.method3312(class320.field3382);
					var1.serverPacket = null;
					return true;
				}

				boolean var83;
				if (ServerPacket.field3481 == var1.serverPacket) {
					var83 = var3.readUnsignedByte() == 1;
					if (var83) {
						BufferedNetSocket.field4988 = WorldMapData_1.method4861() - var3.readLong();
						class252.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class252.grandExchangeEvents = null;
					}

					field727 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var5 = var3.readUnsignedShortAddLE();
					var20 = var3.readUnsignedShort();
					var6 = var3.readUnsignedByteSub();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var58 = HttpResponse.worldView.npcs[var20];
					if (var58 != null) {
						if (var5 == var58.sequence && var5 != -1) {
							var8 = class353.SequenceDefinition_get(var5).restartMode;
							if (var8 == 1) {
								var58.sequenceFrame = 0;
								var58.sequenceFrameCycle = 0;
								var58.sequenceDelay = var6;
								var58.field1214 = 0;
							} else if (var8 == 2) {
								var58.field1214 = 0;
							}
						} else if (var5 == -1 || var58.sequence == -1 || class353.SequenceDefinition_get(var5).field2298 >= class353.SequenceDefinition_get(var58.sequence).field2298) {
							var58.sequence = var5;
							var58.sequenceFrame = 0;
							var58.sequenceFrameCycle = 0;
							var58.sequenceDelay = var6;
							var58.field1214 = 0;
							var58.field1265 = var58.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var20 = var3.readShortLE();
					var5 = var3.readUnsignedIntLE();
					var6 = var3.readSignedShort();
					var56 = ModeWhere.widgetDefinition.method6519(var5);
					if (var6 != var56.rawX || var20 != var56.rawY || var56.xAlignment != 0 || var56.yAlignment != 0) {
						var56.rawX = var6;
						var56.rawY = var20;
						var56.xAlignment = 0;
						var56.yAlignment = 0;
						TriBool.invalidateWidget(var56);
						this.alignWidget(var56);
						if (var56.type == 0) {
							class238.revalidateWidgetScroll(ModeWhere.widgetDefinition.Widget_interfaceComponents[var5 >> 16], var56, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var20 = var3.readInt();
					InterfaceParent var88 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var88 != null) {
						ArchiveDiskActionHandler.closeInterface(var88, true);
					}

					if (meslayerContinueWidget != null) {
						TriBool.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					class31.method462();
					var20 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedIntIME();
					var21 = var3.readUnsignedByteSub();
					experience[var20] = var6;
					currentLevels[var20] = var21;
					levels[var20] = 1;
					field775[var20] = var5;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var6 >= Skills.Skills_experienceTable[var8]) {
							levels[var20] = var8 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3525 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					var6 = field508 >= 223 ? var3.readShort() : -1;
					this.method501(false);
					if (var20 == 0) {
						StudioGame.field4084 = class511.topLevelWorldView.players[var5];
						field503 = -1;
						SoundCache.localPlayer.worldView = class511.topLevelWorldView;
					} else if (var20 == 1) {
						field503 = -1;
						StudioGame.field4084 = class511.topLevelWorldView.npcs[var5];
					} else if (var20 == 2) {
						field503 = var6;
						StudioGame.field4084 = class511.topLevelWorldView.worldEntities[var5];
						this.method501(true);
						SoundCache.localPlayer.worldView = class511.topLevelWorldView.worldEntities[var5].worldView;
					}

					if (StudioGame.field4084 == null) {
						field503 = -1;
						StudioGame.field4084 = SoundCache.localPlayer;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3411 == var1.serverPacket) {
					NPC.field1350 = var3.readUnsignedByte();
					field580 = var3.readUnsignedByteAdd();
					LoginPacket.field1682 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					Interpreter.forceDisconnect(var20);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3523 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					rootInterface = var20;
					this.method1419(false);
					class137.method3176(var20);
					class7.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				byte var70;
				if (ServerPacket.field3412 == var1.serverPacket) {
					field659 = cycleCntr;
					var70 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var70 >= 0) {
							currentClanChannels[var70] = null;
						} else {
							Tile.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var70 >= 0) {
						currentClanChannels[var70] = new ClanChannel(var3);
					} else {
						Tile.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3497 == var1.serverPacket) {
					for (var20 = 0; var20 < HttpResponse.worldView.players.length; ++var20) {
						if (HttpResponse.worldView.players[var20] != null) {
							HttpResponse.worldView.players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < HttpResponse.worldView.npcs.length; ++var20) {
						if (HttpResponse.worldView.npcs[var20] != null) {
							HttpResponse.worldView.npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAddLE() * 30;
					field711 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3400 == var1.serverPacket) {
					isCameraLocked = true;
					field567 = false;
					field764 = false;
					WorldMapLabelSize.field2541 = var3.readUnsignedByte();
					VarbitComposition.field2102 = var3.readUnsignedByte();
					GrandExchangeOfferAgeComparator.field4583 = var3.readUnsignedShort();
					VarpDefinition.field1879 = var3.readUnsignedByte();
					NpcOverrides.field1983 = var3.readUnsignedByte();
					if (NpcOverrides.field1983 >= 100) {
						class47.cameraX = class376.method7084(WorldMapLabelSize.field2541);
						class60.cameraZ = class376.method7084(VarbitComposition.field2102);
						class328.cameraY = class169.getTileHeight(class511.topLevelWorldView, class47.cameraX, class60.cameraZ, class511.topLevelWorldView.plane) - GrandExchangeOfferAgeComparator.field4583;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3494 == var1.serverPacket && isCameraLocked) {
					field567 = true;
					field553 = false;
					field764 = false;

					for (var20 = 0; var20 < 5; ++var20) {
						field771[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3532 == var1.serverPacket) {
					class414.field4670 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				String var51;
				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var23 = AbstractFont.escapeBrackets(Interpreter.method2025(SpotAnimationDefinition.method3789(var3)));
					VarbitComposition.addGameMessage(6, var51, var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3439 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var21 = var3.readUnsignedByte();
					field771[var20] = true;
					field772[var20] = var5;
					field664[var20] = var6;
					field774[var20] = var21;
					field498[var20] = 0;
					var1.serverPacket = null;
					return true;
				}

				String var81;
				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var20 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByteSub();
					var81 = var3.readStringCp1252NullTerminated();
					if (var20 >= 1 && var20 <= 8) {
						if (var81.equalsIgnoreCase("null")) {
							var81 = null;
						}

						playerMenuActions[var20 - 1] = var81;
						playerOptionsPriorities[var20 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				byte var61;
				int var62;
				byte var63;
				int var64;
				int var66;
				int var67;
				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					var62 = var3.method9593();
					var61 = var3.readByteAdd();
					var16 = var3.readUnsignedShortLE();
					var67 = var3.readUnsignedByteNeg() * 4;
					var63 = var3.readByteSub();
					var66 = var3.readUnsignedByteSub() * 4;
					var64 = var3.readUnsignedShortLE();
					var18 = var3.readUnsignedShortAddLE();
					var15 = var3.readUnsignedShortAdd();
					var6 = var3.readMedium();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var21 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var9 = var63 + var21;
					var10 = var61 + var8;
					if (0 <= var21 && var21 < 104 && 0 <= var8 && var8 < 104 && 0 <= var9 && var9 < 104 && 0 <= var10 && var10 < 104 && var64 != 65535) {
						var21 = class376.method7084(var21);
						var8 = class376.method7084(var8);
						var9 = class376.method7084(var9);
						var10 = class376.method7084(var10);
						var19 = new Projectile(var64, HttpResponse.worldView.plane, var21, var8, class169.getTileHeight(HttpResponse.worldView, var21, var8, HttpResponse.worldView.plane) - var66, var15 + cycle, var16 + cycle, var17, var18, var62, var67);
						var19.setDestination(var9, var10, class169.getTileHeight(HttpResponse.worldView, var9, var10, HttpResponse.worldView.plane) - var67, var15 + cycle);
						HttpResponse.worldView.projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3404 == var1.serverPacket) {
					class135.friendSystem.method1912();
					field705 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					NPC.field1350 = var3.readUnsignedByteAdd();
					LoginPacket.field1682 = var3.readUnsignedByte();
					field580 = var3.readUnsignedByteNeg();

					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						class320 var84 = HttpResponse.method289()[var20];
						class153.method3312(var84);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var73;
				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var73 = ModeWhere.widgetDefinition.method6519(var20);

					for (var6 = 0; var6 < var73.itemIds.length; ++var6) {
						var73.itemIds[var6] = -1;
						var73.itemIds[var6] = 0;
					}

					TriBool.invalidateWidget(var73);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3434 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != revision) {
						revision = var20;
						class230.method4374();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3452 == var1.serverPacket) {
					field567 = false;
					isCameraLocked = false;
					field764 = false;
					field553 = false;
					class327.field3558 = 0;
					PendingSpawn.field1188 = 0;
					class6.field16 = 0;
					field804 = false;
					class133.field1560 = 0;
					class104.field1354 = 0;
					NpcOverrides.field1983 = 0;
					VarpDefinition.field1879 = 0;
					WorldMapLabelSize.field2541 = 0;
					VarbitComposition.field2102 = 0;
					GrandExchangeOfferAgeComparator.field4583 = 0;
					field767 = null;
					field769 = null;
					field768 = null;

					for (var20 = 0; var20 < 5; ++var20) {
						field771[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					class160.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntIME();
					Varps.Varps_temp[var20] = var5;
					if (Varps.Varps_main[var20] != var5) {
						Varps.Varps_main[var20] = var5;
					}

					SecureRandomFuture.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var21 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShortAddLE();
					Player var85;
					if (var20 == localPlayerIndex) {
						var85 = SoundCache.localPlayer;
					} else {
						var85 = HttpResponse.worldView.players[var20];
					}

					var6 = var3.readUnsignedIntLE();
					if (var85 != null) {
						var85.updateSpotAnimation(var21, var5, var6 >> 16, var6 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				long var25;
				if (ServerPacket.field3409 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedIntLE();
					var21 = var3.readUnsignedIntLE();

					for (var8 = var5; var8 <= var20; ++var8) {
						var25 = ((long)var21 << 32) + (long)var8;
						Node var89 = widgetFlags.get(var25);
						if (var89 != null) {
							var89.remove();
						}

						widgetFlags.put(new IntegerNode(var6), var25);
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

					field709 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3531 == var1.serverPacket) {
					class152.field1724 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					tradeChatMode = var3.readUnsignedByteSub();
					publicChatMode = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				Widget var24;
				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShort();
					var24 = ModeWhere.widgetDefinition.method6519(var20);
					if (var5 != var24.modelAngleX || var6 != var24.modelAngleY || var21 != var24.modelZoom) {
						var24.modelAngleX = var5;
						var24.modelAngleY = var6;
						var24.modelZoom = var21;
						TriBool.invalidateWidget(var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3489 == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedIntME();
					var22 = ModeWhere.widgetDefinition.method6519(var20);
					class233.method4446(var22, var5);
					TriBool.invalidateWidget(var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3507 == var1.serverPacket) {
					class31.method462();
					runEnergy = var3.readUnsignedShort();
					field711 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3438 == var1.serverPacket) {
					class153.method3312(class320.field3380);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					class135.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3427 == var1.serverPacket) {
					ModeWhere.method7431();
					var70 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var70 >= 0) {
							currentClanSettings[var70] = null;
						} else {
							class142.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var70 >= 0) {
						currentClanSettings[var70] = new ClanSettings(var3);
					} else {
						class142.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					isCameraLocked = true;
					field567 = false;
					field764 = true;
					WorldMapLabelSize.field2541 = var3.readUnsignedByte();
					VarbitComposition.field2102 = var3.readUnsignedByte();
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field804 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var21 = class376.method7084(WorldMapLabelSize.field2541);
					var8 = class376.method7084(VarbitComposition.field2102);
					boolean var68 = false;
					boolean var65 = false;
					if (field804) {
						var9 = class328.cameraY;
						var10 = class169.getTileHeight(class511.topLevelWorldView, var21, var8, class511.topLevelWorldView.plane) - var20;
					} else {
						var9 = class169.getTileHeight(class511.topLevelWorldView, class47.cameraX, class60.cameraZ, class511.topLevelWorldView.plane) - class328.cameraY;
						var10 = var20;
					}

					field767 = new class509(class47.cameraX, class60.cameraZ, var9, var21, var8, var10, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				long var28;
				long var30;
				String var34;
				long var91;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var28 = var3.readLong();
					var30 = (long)var3.readUnsignedShort();
					var25 = (long)var3.readMedium();
					PlayerType var27 = (PlayerType)class210.findEnumerated(class136.PlayerType_values(), var3.readUnsignedByte());
					var91 = (var30 << 32) + var25;
					boolean var69 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var91) {
							var69 = true;
							break;
						}
					}

					if (var27.isUser && class135.friendSystem.isIgnored(new Username(var51, Projectile.loginType))) {
						var69 = true;
					}

					if (!var69 && field625 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var91;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var34 = AbstractFont.escapeBrackets(Interpreter.method2025(SpotAnimationDefinition.method3789(var3)));
						if (var27.modIcon != -1) {
							ArchiveDiskAction.addChatMessage(9, class385.method7175(var27.modIcon) + var51, var34, class237.base37DecodeLong(var28));
						} else {
							ArchiveDiskAction.addChatMessage(9, var51, var34, class237.base37DecodeLong(var28));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				NPC var78;
				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var6 = var3.readUnsignedShortAdd();
					var20 = var3.readUnsignedShortLE();
					var78 = HttpResponse.worldView.npcs[var20];
					var21 = var3.readUnsignedByteSub();
					var5 = var3.readInt();
					if (var78 != null) {
						var78.updateSpotAnimation(var21, var6, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var7;
				if (ServerPacket.field3485 == var1.serverPacket) {
					var20 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readInt();
					var7 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var7 != null) {
						ArchiveDiskActionHandler.closeInterface(var7, var5 != var7.group);
					}

					class393.openInterface(var6, var5, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3443 == var1.serverPacket) {
					class153.method3312(class320.field3386);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3492 == var1.serverPacket) {
					var20 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					Canvas.performPlayerAnimation(SoundCache.localPlayer, var5, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3423 == var1.serverPacket) {
					class4.method18(HttpResponse.worldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3514 == var1.serverPacket) {
					return this.method1277(var1, 1);
				}

				if (ServerPacket.field3448 == var1.serverPacket) {
					var20 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1419(false);
						class137.method3176(rootInterface);
						class7.runWidgetOnLoadListener(rootInterface);

						for (var21 = 0; var21 < 100; ++var21) {
							validRootWidgets[var21] = true;
						}
					}

					InterfaceParent var94;
					for (; var6-- > 0; var94.field1076 = true) {
						var21 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var94 = (InterfaceParent)interfaceParents.get((long)var21);
						if (var94 != null && var8 != var94.group) {
							ArchiveDiskActionHandler.closeInterface(var94, true);
							var94 = null;
						}

						if (var94 == null) {
							var94 = class393.openInterface(var21, var8, var9);
						}
					}

					for (var7 = (InterfaceParent)interfaceParents.first(); var7 != null; var7 = (InterfaceParent)interfaceParents.next()) {
						if (var7.field1076) {
							var7.field1076 = false;
						} else {
							ArchiveDiskActionHandler.closeInterface(var7, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var20) {
						var21 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();

						for (var62 = var8; var62 <= var9; ++var62) {
							var91 = ((long)var21 << 32) + (long)var62;
							widgetFlags.put(new IntegerNode(var10), var91);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_main[var20] != Varps.Varps_temp[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							SecureRandomFuture.changeGameOptions(var20);
							changedVarps[++changedVarpCount - 1 & 31] = var20;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3512 == var1.serverPacket) {
					return this.method1277(var1, 2);
				}

				if (ServerPacket.field3436 == var1.serverPacket) {
					isCameraLocked = true;
					field567 = false;
					field553 = true;
					class327.field3558 = var3.readUnsignedByte();
					PendingSpawn.field1188 = var3.readUnsignedByte();
					class6.field16 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = class376.method7084(class327.field3558);
					var21 = class376.method7084(PendingSpawn.field1188);
					var8 = class169.getTileHeight(class511.topLevelWorldView, var6, var21, class511.topLevelWorldView.plane) - class6.field16;
					var9 = var6 - class47.cameraX;
					var10 = var8 - class328.cameraY;
					var62 = var21 - class60.cameraZ;
					double var32 = Math.sqrt((double)(var9 * var9 + var62 * var62));
					var67 = class151.method3293((int)(Math.atan2((double)var10, var32) * 325.9490051269531D) & 2047);
					var15 = WorldMapLabelSize.method4572((int)(Math.atan2((double)var9, (double)var62) * -325.9490051269531D) & 2047);
					field769 = new class510(Language.cameraPitch, var67, var20, var5);
					field768 = new class510(class337.cameraYaw, var15, var20, var5);
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
							hintArrowSubX = 4096;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 8192;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 4096;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 4096;
							hintArrowSubY = 8192;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte() * 2;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

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

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						FloorUnderlayDefinition.method3799(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < VarpDefinition.field1874; ++var20) {
						VarpDefinition var82 = MilliClock.VarpDefinition_get(var20);
						if (var82 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}

					class31.method462();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3502 == var1.serverPacket) {
					var20 = var3.readShortLE();
					var5 = var3.readUnsignedIntLE();
					var22 = ModeWhere.widgetDefinition.method6519(var5);
					if (var20 != var22.sequenceId || var20 == -1) {
						var22.sequenceId = var20;
						var22.modelFrame = 0;
						var22.modelFrameCycle = 0;
						TriBool.invalidateWidget(var22);
					}

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
						var22 = ModeWhere.widgetDefinition.method6519(var20);
					} else {
						var22 = null;
					}

					for (; var3.offset < var1.serverPacketLength; TaskHandler.itemContainerSetItem(var5, var21, var8 - 1, var9)) {
						var21 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var9 = 0;
						if (var8 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var22 != null && var21 >= 0 && var21 < var22.itemIds.length) {
							var22.itemIds[var21] = var8;
							var22.itemQuantities[var21] = var9;
						}
					}

					if (var22 != null) {
						TriBool.invalidateWidget(var22);
					}

					class31.method462();
					changedItemContainers[++field620 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				boolean var54;
				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var20 = var3.readUShortSmart();
					var54 = var3.readUnsignedByte() == 1;
					var81 = "";
					boolean var87 = false;
					if (var54) {
						var81 = var3.readStringCp1252NullTerminated();
						if (class135.friendSystem.isIgnored(new Username(var81, Projectile.loginType))) {
							var87 = true;
						}
					}

					String var79 = var3.readStringCp1252NullTerminated();
					if (!var87) {
						VarbitComposition.addGameMessage(var20, var81, var79);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntLE();
					var22 = ModeWhere.widgetDefinition.method6519(var5);
					if (var22.modelType != 2 || var20 != var22.modelId) {
						var22.modelType = 2;
						var22.modelId = var20;
						TriBool.invalidateWidget(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					Object[] var80 = new Object[var51.length() + 1];

					for (var6 = var51.length() - 1; var6 >= 0; --var6) {
						if (var51.charAt(var6) == 's') {
							var80[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var80[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var80[0] = new Integer(var3.readInt());
					ScriptEvent var90 = new ScriptEvent();
					var90.args = var80;
					Projectile.runScriptEvent(var90);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3408 == var1.serverPacket) {
					class153.method3312(class320.field3383);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3472 == var1.serverPacket) {
					isCameraLocked = true;
					field567 = false;
					field553 = true;
					var20 = var3.readShort();
					var5 = var3.readShort();
					var6 = class151.method3293(var5 + Language.cameraPitch & 2027);
					var21 = var20 + class337.cameraYaw;
					var8 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field769 = new class510(Language.cameraPitch, var6, var8, var9);
					field768 = new class510(class337.cameraYaw, var21, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3460 == var1.serverPacket) {
					ModeWhere.method7431();
					var70 = var3.readByte();
					class150 var77 = new class150(var3);
					ClanSettings var86;
					if (var70 >= 0) {
						var86 = currentClanSettings[var70];
					} else {
						var86 = class142.guestClanSettings;
					}

					if (var86 == null) {
						this.method1404(var70);
						var1.serverPacket = null;
						return true;
					}

					if (var77.field1707 > var86.field1762) {
						this.method1404(var70);
						var1.serverPacket = null;
						return true;
					}

					if (var77.field1707 < var86.field1762) {
						var1.serverPacket = null;
						return true;
					}

					var77.method3286(var86);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					class325.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntLE();
					var6 = var20 >> 10 & 31;
					var21 = var20 >> 5 & 31;
					var8 = var20 & 31;
					var9 = (var21 << 11) + (var6 << 19) + (var8 << 3);
					Widget var93 = ModeWhere.widgetDefinition.method6519(var5);
					if (var9 != var93.color) {
						var93.color = var9;
						TriBool.invalidateWidget(var93);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntIME();
					var22 = ModeWhere.widgetDefinition.method6519(var5);
					if (var22 != null && var22.type == 0) {
						if (var20 > var22.scrollHeight - var22.height) {
							var20 = var22.scrollHeight - var22.height;
						}

						if (var20 < 0) {
							var20 = 0;
						}

						if (var20 != var22.scrollY) {
							var22.scrollY = var20;
							TriBool.invalidateWidget(var22);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3477 == var1.serverPacket) {
					var5 = var3.readUnsignedShortAddLE();
					var20 = var3.readUnsignedShortLE();
					class137.method3187(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3456 == var1.serverPacket) {
					var64 = var3.readUnsignedShortAddLE();
					var67 = var3.readUnsignedByteNeg() * 4;
					var16 = var3.readUnsignedShortLE();
					var62 = var3.method9607();
					var17 = var3.readUnsignedByteSub();
					var63 = var3.readByte();
					var18 = var3.readUnsignedByteAdd();
					var6 = var3.method9760();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var21 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var61 = var3.readByteSub();
					var66 = var3.readUnsignedByteSub() * 4;
					var15 = var3.readUnsignedShort();
					var9 = var63 + var21;
					var10 = var61 + var8;
					if (var21 >= 0 && var8 >= 0 && var21 < HttpResponse.worldView.sizeX && var8 < HttpResponse.worldView.sizeY && var9 >= 0 && var10 >= 0 && var9 < HttpResponse.worldView.sizeX && var10 < HttpResponse.worldView.sizeY && var64 != 65535) {
						var21 = class376.method7084(var21);
						var8 = class376.method7084(var8);
						var9 = class376.method7084(var9);
						var10 = class376.method7084(var10);
						var19 = new Projectile(var64, HttpResponse.worldView.plane, var21, var8, class169.getTileHeight(HttpResponse.worldView, var21, var8, HttpResponse.worldView.plane) - var66, var15 + cycle, var16 + cycle, var17, var18, var62, var67);
						var19.setDestination(var9, var10, class169.getTileHeight(HttpResponse.worldView, var9, var10, HttpResponse.worldView.plane) - var67, var15 + cycle);
						HttpResponse.worldView.projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3402 == var1.serverPacket) {
					GameObject.method6030(HttpResponse.worldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					HttpResponse.worldView.playerUpdateManager.method2826(var3, var1.serverPacketLength);
					class237.method4482();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					class522.privateChatMode = class6.method40(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3449 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntME();
					var22 = ModeWhere.widgetDefinition.method6519(var5);
					if (var22.modelType != 6 || var20 != var22.modelId) {
						var22.modelType = 6;
						var22.modelId = var20;
						TriBool.invalidateWidget(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3437 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntLE();
					short var60 = (short)var3.readSignedShort();
					var21 = var3.readUnsignedByteAdd();
					var78 = HttpResponse.worldView.npcs[var20];
					if (var78 != null) {
						var78.method2709(var21, var5, var60);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var53 = new byte[var1.serverPacketLength];
					var3.method9505(var53, 0, var53.length);
					Buffer var76 = new Buffer(var53);
					var81 = var76.readStringCp1252NullTerminated();
					class421.openURL(var81, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3487 == var1.serverPacket) {
					class153.method3312(class320.field3378);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3524 == var1.serverPacket) {
					PendingSpawn.field1171 = new class486(PlayerType.field4444);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3480 == var1.serverPacket) {
					var6 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					var21 = var3.readUnsignedShortAddLE();
					var9 = var3.readUnsignedShort();
					var8 = var3.readUnsignedShortAddLE();
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					ArrayList var92 = new ArrayList();
					var92.add(var20);
					var92.add(var5);
					class498.method8899(var92, var6, var21, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3413 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var23 = var3.readStringCp1252NullTerminated();
					var22 = ModeWhere.widgetDefinition.method6519(var20);
					if (!var23.equals(var22.text)) {
						var22.text = var23;
						TriBool.invalidateWidget(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAdd();
					var22 = ModeWhere.widgetDefinition.method6519(var20);
					if (var22.modelType != 1 || var5 != var22.modelId) {
						var22.modelType = 1;
						var22.modelId = var5;
						TriBool.invalidateWidget(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var6 = var3.method9785();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var21 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var9 = var3.readUnsignedByteNeg();
					var10 = var9 >> 2;
					var62 = var9 & 3;
					var64 = field579[var10];
					var66 = var3.readUnsignedShortAddLE();
					if (0 <= var21 && var21 < 103 && 0 <= var8 && var8 < 103) {
						class36.method702(var21, var8, var10, var62, var64, var66);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					WorldMapID.updateNpcs(HttpResponse.worldView, true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3503 == var1.serverPacket) {
					class153.method3312(class320.field3388);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3493 == var1.serverPacket) {
					field659 = cycleCntr;
					var70 = var3.readByte();
					class164 var74 = new class164(var3);
					ClanChannel var72;
					if (var70 >= 0) {
						var72 = currentClanChannels[var70];
					} else {
						var72 = Tile.guestClanChannel;
					}

					if (var72 == null) {
						this.method1287(var70);
						var1.serverPacket = null;
						return true;
					}

					if (var74.field1808 > var72.field1821) {
						this.method1287(var70);
						var1.serverPacket = null;
						return true;
					}

					if (var74.field1808 < var72.field1821) {
						var1.serverPacket = null;
						return true;
					}

					var74.method3453(var72);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					class135.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class153.FriendSystem_invalidateIgnoreds();
					field705 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					WorldMapID.updateNpcs(HttpResponse.worldView, false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3459 == var1.serverPacket) {
					class31.method462();
					var20 = var3.readInt();
					var5 = var3.readUnsignedByteSub();
					var6 = var3.readUnsignedByteSub();
					experience[var6] = var20;
					currentLevels[var6] = var5;
					levels[var6] = 1;
					field775[var6] = var5;

					for (var21 = 0; var21 < 98; ++var21) {
						if (var20 >= Skills.Skills_experienceTable[var21]) {
							levels[var6] = var21 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var70 = var3.readByteSub();
					var5 = var3.readUnsignedShortAddLE();
					Varps.Varps_temp[var5] = var70;
					if (Varps.Varps_main[var5] != var70) {
						Varps.Varps_main[var5] = var70;
					}

					SecureRandomFuture.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3535 == var1.serverPacket) {
					ChatChannel.field1030 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3506 == var1.serverPacket) {
					++serverCycle;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var9 = var3.readUnsignedShortAddLE();
					var62 = var3.readUnsignedShortLE();
					var6 = var3.method9785();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var21 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var10 = var3.readUnsignedByteSub();
					if (var21 >= 0 && var8 >= 0 && var21 < HttpResponse.worldView.sizeX && var8 < HttpResponse.worldView.sizeY) {
						var21 = class376.method7084(var21);
						var8 = class376.method7084(var8);
						GraphicsObject var95 = new GraphicsObject(var9, HttpResponse.worldView.plane, var21, var8, class169.getTileHeight(HttpResponse.worldView, var21, var8, HttpResponse.worldView.plane) - var10, var62, cycle);
						HttpResponse.worldView.graphicsObjects.addFirst(var95);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					class135.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field705 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3484 == var1.serverPacket) {
					var83 = var3.readUnsignedByteAdd() == 1;
					var5 = var3.readInt();
					var22 = ModeWhere.widgetDefinition.method6519(var5);
					MusicPatchPcmStream.method6417(var22, SoundCache.localPlayer.appearance, var83);
					TriBool.invalidateWidget(var22);
					var1.serverPacket = null;
					return true;
				}

				boolean var11;
				String var37;
				if (ServerPacket.field3488 == var1.serverPacket) {
					var70 = var3.readByte();
					var28 = (long)var3.readUnsignedShort();
					var30 = (long)var3.readMedium();
					var25 = var30 + (var28 << 32);
					var11 = false;
					ClanChannel var36 = var70 >= 0 ? currentClanChannels[var70] : Tile.guestClanChannel;
					if (var36 == null) {
						var11 = true;
					} else {
						for (var66 = 0; var66 < 100; ++var66) {
							if (crossWorldMessageIds[var66] == var25) {
								var11 = true;
								break;
							}
						}
					}

					if (!var11) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var25;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var37 = SpotAnimationDefinition.method3789(var3);
						var67 = var70 >= 0 ? 43 : 46;
						ArchiveDiskAction.addChatMessage(var67, "", var37, var36.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field567 = false;
					field553 = true;
					var20 = WorldMapLabelSize.method4572(var3.readShort() & 2027);
					var5 = class151.method3293(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var21 = var3.readUnsignedByte();
					field769 = new class510(Language.cameraPitch, var5, var6, var21);
					field768 = new class510(class337.cameraYaw, var20, var6, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					class325.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3422 == var1.serverPacket) {
					class153.method3312(class320.field3384);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3470 == var1.serverPacket) {
					if (PendingSpawn.field1171 == null) {
						PendingSpawn.field1171 = new class486(PlayerType.field4444);
					}

					class555 var52 = PlayerType.field4444.method8802(var3);
					PendingSpawn.field1171.field5032.vmethod9294(var52.field5428, var52.field5429);
					field571[++field719 - 1 & 31] = var52.field5428;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3471 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					class199.method3809(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					VarbitComposition.playSong(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3407 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.method9708();
					LoginScreenAnimation.method2551(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3478 == var1.serverPacket) {
					UserComparator7.method3002(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					StructComposition.method3870(var20);
					changedItemContainers[++field620 - 1 & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3433 == var1.serverPacket) {
					var83 = var3.readBoolean();
					if (var83) {
						if (class485.field5030 == null) {
							class485.field5030 = new class398();
						}
					} else {
						class485.field5030 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var6 = EnumComposition.getGcDuration();
					PacketBufferNode var57 = class170.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var57.packetBuffer.writeByteSub(var6);
					var57.packetBuffer.writeIntLE(var20);
					var57.packetBuffer.writeInt(var5);
					var57.packetBuffer.writeByteAdd(GameEngine.fps);
					packetWriter.addNode(var57);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3406 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					SoundCache.queueSoundEffect(var20, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3414 == var1.serverPacket) {
					var6 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShort();
					class108.method2812(var20, var5, var6, var21);
					var1.serverPacket = null;
					return true;
				}

				boolean var12;
				if (ServerPacket.field3420 == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var28 = (long)var3.readUnsignedShort();
					var30 = (long)var3.readMedium();
					PlayerType var96 = (PlayerType)class210.findEnumerated(class136.PlayerType_values(), var3.readUnsignedByte());
					long var39 = var30 + (var28 << 32);
					var12 = false;

					for (var66 = 0; var66 < 100; ++var66) {
						if (crossWorldMessageIds[var66] == var39) {
							var12 = true;
							break;
						}
					}

					if (class135.friendSystem.isIgnored(new Username(var51, Projectile.loginType))) {
						var12 = true;
					}

					if (!var12 && field625 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var39;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var37 = AbstractFont.escapeBrackets(Interpreter.method2025(SpotAnimationDefinition.method3789(var3)));
						byte var14;
						if (var96.isPrivileged) {
							var14 = 7;
						} else {
							var14 = 3;
						}

						if (var96.modIcon != -1) {
							VarbitComposition.addGameMessage(var14, class385.method7175(var96.modIcon) + var51, var37);
						} else {
							VarbitComposition.addGameMessage(var14, var51, var37);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readInt();
					var56 = ModeWhere.widgetDefinition.method6519(var6);
					ItemComposition var75;
					if (!var56.isIf3) {
						if (var5 == -1) {
							var56.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var75 = class164.ItemDefinition_get(var5).getCountObj(var20);
						var56.modelType = 4;
						var56.modelId = var5;
						var56.modelAngleX = var75.xan2d;
						var56.modelAngleY = var75.yan2d;
						var56.modelZoom = var75.zoom2d * 100 / var20;
						TriBool.invalidateWidget(var56);
					} else {
						var56.itemId = var5;
						var56.itemQuantity = var20;
						var75 = class164.ItemDefinition_get(var5).getCountObj(var20);
						var56.modelAngleX = var75.xan2d;
						var56.modelAngleY = var75.yan2d;
						var56.modelAngleZ = var75.zan2d;
						var56.modelOffsetX = var75.offsetX2d;
						var56.modelOffsetY = var75.offsetY2d;
						var56.modelZoom = var75.zoom2d;
						if (var75.isStackable == 1) {
							var56.itemQuantityMode = 1;
						} else {
							var56.itemQuantityMode = 2;
						}

						if (var56.field3887 > 0) {
							var56.modelZoom = var56.modelZoom * 32 / var56.field3887;
						} else if (var56.rawWidth > 0) {
							var56.modelZoom = var56.modelZoom * 32 / var56.rawWidth;
						}

						TriBool.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3495 == var1.serverPacket) {
					return this.method1278(var1);
				}

				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var20 = var3.readInt();
					var73 = ModeWhere.widgetDefinition.method6519(var20);
					var73.modelType = 3;
					var73.modelId = SoundCache.localPlayer.appearance.getChatHeadId();
					TriBool.invalidateWidget(var73);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3527 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					this.method501(false);
					if (var20 == 0) {
						StudioGame.field4084 = class511.topLevelWorldView.players[var5];
					} else if (var20 == 1) {
						StudioGame.field4084 = class511.topLevelWorldView.npcs[var5];
					} else if (var20 == 2) {
						StudioGame.field4084 = class511.topLevelWorldView.worldEntities[var5];
						this.method501(true);
					}

					if (StudioGame.field4084 == null) {
						StudioGame.field4084 = SoundCache.localPlayer;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var50 = new World();
					var50.host = var3.readStringCp1252NullTerminated();
					var50.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var50.properties = var5;
					if (var50.isDeadman()) {
						var50.field819 = "beta";
						class4.field9 = true;
					} else {
						class4.field9 = false;
					}

					ClanChannelMember.updateGameState(45);
					var2.close();
					var2 = null;
					ScriptEvent.changeWorld(var50);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedIntLE();
					InterfaceParent var71 = (InterfaceParent)interfaceParents.get((long)var5);
					var7 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var7 != null) {
						ArchiveDiskActionHandler.closeInterface(var7, var71 == null || var7.group != var71.group);
					}

					if (var71 != null) {
						var71.remove();
						interfaceParents.put(var71, (long)var20);
					}

					var24 = ModeWhere.widgetDefinition.method6519(var5);
					if (var24 != null) {
						TriBool.invalidateWidget(var24);
					}

					var24 = ModeWhere.widgetDefinition.method6519(var20);
					if (var24 != null) {
						TriBool.invalidateWidget(var24);
						class238.revalidateWidgetScroll(ModeWhere.widgetDefinition.Widget_interfaceComponents[var24.id >>> 16], var24, true);
					}

					if (rootInterface != -1) {
						BuddyRankComparator.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3444 == var1.serverPacket) {
					isCameraLocked = true;
					field567 = false;
					field764 = true;
					WorldMapLabelSize.field2541 = var3.readUnsignedByte();
					VarbitComposition.field2102 = var3.readUnsignedByte();
					var20 = var3.readUnsignedShort();
					var5 = class376.method7084(var3.readUnsignedByte());
					var6 = class376.method7084(var3.readUnsignedByte());
					var21 = var3.readUnsignedShort();
					field804 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var9 = class376.method7084(WorldMapLabelSize.field2541);
					var10 = class376.method7084(VarbitComposition.field2102);
					var11 = false;
					var12 = false;
					if (field804) {
						var62 = class328.cameraY;
						var64 = class169.getTileHeight(class511.topLevelWorldView, var9, var10, class511.topLevelWorldView.plane) - var20;
					} else {
						var62 = class169.getTileHeight(class511.topLevelWorldView, class47.cameraX, class60.cameraZ, class511.topLevelWorldView.plane) - class328.cameraY;
						var64 = var20;
					}

					field767 = new class508(class47.cameraX, class60.cameraZ, var62, var9, var10, var64, var5, var6, var21, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3428 == var1.serverPacket) {
					class47.field314 = var3.readUnsignedByte();
					HttpRequestTask.field86 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						BuddyRankComparator.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3529 == var1.serverPacket) {
					class153.method3312(class320.field3381);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3528 == var1.serverPacket) {
					HttpResponse.worldView.npcCount = 0;
					HttpResponse.worldView.worldEntityCount = 0;

					for (var20 = 0; var20 < 65536; ++var20) {
						HttpResponse.worldView.npcs[var20] = null;
					}

					for (var20 = 0; var20 < 2048; ++var20) {
						HttpResponse.worldView.worldEntities[var20] = null;
					}

					SoundCache.localPlayer.worldView = class511.topLevelWorldView;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var70 = var3.readByte();
					var23 = var3.readStringCp1252NullTerminated();
					long var41 = (long)var3.readUnsignedShort();
					long var43 = (long)var3.readMedium();
					PlayerType var35 = (PlayerType)class210.findEnumerated(class136.PlayerType_values(), var3.readUnsignedByte());
					long var45 = var43 + (var41 << 32);
					boolean var13 = false;
					ClanChannel var47 = null;
					var47 = var70 >= 0 ? currentClanChannels[var70] : Tile.guestClanChannel;
					if (var47 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var35.isUser && class135.friendSystem.isIgnored(new Username(var23, Projectile.loginType))) {
									var13 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var45) {
								var13 = true;
								break;
							}

							++var15;
						}
					}

					if (!var13) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var45;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var34 = AbstractFont.escapeBrackets(SpotAnimationDefinition.method3789(var3));
						var16 = var70 >= 0 ? 41 : 44;
						if (var35.modIcon != -1) {
							ArchiveDiskAction.addChatMessage(var16, class385.method7175(var35.modIcon) + var23, var34, var47.name);
						} else {
							ArchiveDiskAction.addChatMessage(var16, var23, var34, var47.name);
						}
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
						var22 = ModeWhere.widgetDefinition.method6519(var20);
					} else {
						var22 = null;
					}

					if (var22 != null) {
						for (var21 = 0; var21 < var22.itemIds.length; ++var21) {
							var22.itemIds[var21] = 0;
							var22.itemQuantities[var21] = 0;
						}
					}

					class534.clearItemContainer(var5);
					var21 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var21; ++var8) {
						var9 = var3.readUnsignedByteNeg();
						if (var9 == 255) {
							var9 = var3.readUnsignedIntME();
						}

						var10 = var3.readUnsignedShort();
						if (var22 != null && var8 < var22.itemIds.length) {
							var22.itemIds[var8] = var10;
							var22.itemQuantities[var8] = var9;
						}

						TaskHandler.itemContainerSetItem(var5, var8, var10 - 1, var9);
					}

					if (var22 != null) {
						TriBool.invalidateWidget(var22);
					}

					class31.method462();
					changedItemContainers[++field620 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var54 = var3.readUnsignedByte() == 1;
					var22 = ModeWhere.widgetDefinition.method6519(var20);
					if (var54 != var22.isHidden) {
						var22.isHidden = var54;
						TriBool.invalidateWidget(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3429 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShortAddLE();
					var8 = var3.readUnsignedShortAddLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					ArrayList var38 = new ArrayList();
					var38.add(var20);
					class498.method8899(var38, var5, var6, var21, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3468 == var1.serverPacket) {
					class31.method462();
					weight = var3.readShort();
					field711 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3519 == var1.serverPacket) {
					class153.method3312(class320.field3385);
					var1.serverPacket = null;
					return true;
				}

				FriendsChat.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1459 != null ? var1.field1459.id : -1) + "," + (var1.field1464 != null ? var1.field1464.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class135.logOut();
			} catch (IOException var48) {
				class131.method3068();
			} catch (Exception var49) {
				var23 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1459 != null ? var1.field1459.id : -1) + "," + (var1.field1464 != null ? var1.field1464.id : -1) + "," + var1.serverPacketLength + "," + (SoundCache.localPlayer.pathX[0] + class511.topLevelWorldView.baseX) + "," + (SoundCache.localPlayer.pathY[0] + class511.topLevelWorldView.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var23 = var23 + var3.array[var6] + ",";
				}

				FriendsChat.RunException_sendStackTrace(var23, var49);
				class135.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1081495480"
	)
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
					var5 = menuItemIds[var2];
					menuItemIds[var2] = menuItemIds[var2 + 1];
					menuItemIds[var2 + 1] = var5;
					var5 = menuWorldViewIds[var2];
					menuWorldViewIds[var2] = menuWorldViewIds[var2 + 1];
					menuWorldViewIds[var2 + 1] = var5;
					boolean var6 = menuShiftClick[var2];
					menuShiftClick[var2] = menuShiftClick[var2 + 1];
					menuShiftClick[var2 + 1] = var6;
					var1 = false;
				}
			}
		}

		if (clickedWidget == null) {
			int var20 = MouseHandler.MouseHandler_lastButton;
			int var4;
			int var7;
			int var8;
			int var9;
			int var21;
			if (isMenuOpen) {
				int var3;
				if (var20 != 1 && (World.mouseCam || var20 != 4)) {
					var2 = MouseHandler.MouseHandler_x;
					var3 = MouseHandler.MouseHandler_y;
					if (var2 < class105.menuX - 10 || var2 > class330.menuWidth + class105.menuX + 10 || var3 < UserComparator9.menuY - 10 || var3 > IntProjection.menuHeight + UserComparator9.menuY + 10) {
						isMenuOpen = false;
						class137.invalidateWidgetsUnder(class105.menuX, UserComparator9.menuY, class330.menuWidth, IntProjection.menuHeight);
					}
				}

				if (var20 == 1 || !World.mouseCam && var20 == 4) {
					var2 = class105.menuX;
					var3 = UserComparator9.menuY;
					var4 = class330.menuWidth;
					var5 = MouseHandler.MouseHandler_lastPressedX;
					var21 = MouseHandler.MouseHandler_lastPressedY;
					var7 = -1;

					for (var8 = 0; var8 < menuOptionsCount; ++var8) {
						var9 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31;
						if (var5 > var2 && var5 < var2 + var4 && var21 > var9 - 13 && var21 < var9 + 3) {
							var7 = var8;
						}
					}

					if (var7 != -1 && var7 >= 0) {
						var8 = menuArguments1[var7];
						var9 = menuArguments2[var7];
						int var16 = menuOpcodes[var7];
						int var17 = menuIdentifiers[var7];
						int var12 = menuWorldViewIds[var7];
						int var13 = menuItemIds[var7];
						String var14 = menuActions[var7];
						String var15 = menuTargets[var7];
						MenuAction.menuAction(var8, var9, var16, var17, var13, var12, var14, var15, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}

					isMenuOpen = false;
					class137.invalidateWidgetsUnder(class105.menuX, UserComparator9.menuY, class330.menuWidth, IntProjection.menuHeight);
				}
			} else {
				var2 = menuOptionsCount - 1;
				if ((var20 == 1 || !World.mouseCam && var20 == 4) && this.shouldLeftClickOpenMenu()) {
					var20 = 2;
				}

				if ((var20 == 1 || !World.mouseCam && var20 == 4) && menuOptionsCount > 0 && var2 >= 0) {
					var4 = menuArguments1[var2];
					var5 = menuArguments2[var2];
					var21 = menuOpcodes[var2];
					var7 = menuIdentifiers[var2];
					var8 = menuWorldViewIds[var2];
					var9 = menuItemIds[var2];
					String var10 = menuActions[var2];
					String var11 = menuTargets[var2];
					MenuAction.menuAction(var4, var5, var21, var7, var9, var8, var10, var11, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}

				if (var20 == 2 && menuOptionsCount > 0) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "892915202"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1;
		return (leftClickOpensMenu && menuOptionsCount > 2 || class330.method6183(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		ClientPacket.method6092(var1, var2);
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		class511.topLevelWorldView.scene.menuOpen(class511.topLevelWorldView.plane, var1, var2, false);

		for (int var3 = 0; var3 < class511.topLevelWorldView.worldEntityCount; ++var3) {
			WorldEntity var4 = class511.topLevelWorldView.worldEntities[class511.topLevelWorldView.worldEntityIndices[var3]];
			if (var4 != null) {
				var4.worldView.scene.menuOpen(var4.worldView.plane, var1, var2, false);
			}
		}

		isMenuOpen = true;
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "53"
	)
	final void method1419(boolean var1) {
		ClanChannel.method3488(rootInterface, class74.canvasWidth, class1.canvasHeight, var1);
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)V",
		garbageValue = "676512780"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : ModeWhere.widgetDefinition.method6519(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class74.canvasWidth;
			var4 = class1.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		AbstractWorldMapData.alignWidgetSize(var1, var3, var4, false);
		SecureRandomCallable.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1133103527"
	)
	final void method1285() {
		TriBool.invalidateWidget(clickedWidget);
		++HttpJsonRequestBody.widgetDragDuration;
		int var1;
		int var2;
		if (field691 && field688) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field689) {
				var1 = field689;
			}

			if (var1 + clickedWidget.width > field689 + clickedWidgetParent.width) {
				var1 = field689 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field505) {
				var2 = field505;
			}

			if (var2 + clickedWidget.height > field505 + clickedWidgetParent.height) {
				var2 = field505 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field692;
			int var4 = var2 - field663;
			int var5 = clickedWidget.dragZoneSize;
			if (HttpJsonRequestBody.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field689 + clickedWidgetParent.scrollX;
			int var7 = var2 - field505 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				Projectile.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						Projectile.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && ObjectSound.method1976(clickedWidget) != null) {
						PacketBufferNode var11 = class170.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
						var11.packetBuffer.writeShortLE(draggedOnWidget.childIndex);
						var11.packetBuffer.writeIntME(clickedWidget.id);
						var11.packetBuffer.writeShortAdd(clickedWidget.childIndex);
						var11.packetBuffer.writeShortAddLE(draggedOnWidget.itemId);
						var11.packetBuffer.writeInt(draggedOnWidget.id);
						var11.packetBuffer.writeShortLE(clickedWidget.itemId);
						packetWriter.addNode(var11);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field692 + widgetClickX, field663 + widgetClickY);
				} else if (menuOptionsCount > 0) {
					int var10 = field692 + widgetClickX;
					int var9 = field663 + widgetClickY;
					class243.method4564(class188.tempMenuAction, var10, var9);
					class188.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		} else {
			if (HttpJsonRequestBody.widgetDragDuration > 1) {
				if (!isDraggingWidget && menuOptionsCount > 0) {
					var1 = widgetClickX + field692;
					var2 = widgetClickY + field663;
					class243.method4564(class188.tempMenuAction, var1, var2);
					class188.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(I)Lvo;",
		garbageValue = "-1036392094"
	)
	@Export("username")
	public Username username() {
		return SoundCache.localPlayer != null ? SoundCache.localPlayer.username : null;
	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1648154800"
	)
	void method1287(int var1) {
		PacketBufferNode var2 = class170.getPacketBufferNode(ClientPacket.field3280, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-15315"
	)
	void method1404(int var1) {
		PacketBufferNode var2 = class170.getPacketBufferNode(ClientPacket.field3330, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	public void setClient(int var1) {
		this.clientId = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.refreshAccessTokenRequester = var1;
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							BuddyRankComparator.clientLanguage = Language.method7414(Integer.parseInt(var2));
							break;
						case 7:
							TilesProjection.field3003 = ClientPacket.method6091(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							AsyncHttpResponse.field81 = var2;
							break;
						case 10:
							class109.field1400 = (StudioGame)class210.findEnumerated(class279.method5358(), Integer.parseInt(var2));
							if (class109.field1400 == StudioGame.oldscape) {
								Projectile.loginType = LoginType.oldscape;
							} else {
								Projectile.loginType = LoginType.field5255;
							}
							break;
						case 11:
							class176.authServiceBaseUrl = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 23:
						case 24:
						default:
							break;
						case 14:
							SpotAnimationDefinition.field2083 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							Archive.field4493 = var2;
							break;
						case 21:
							field637 = Integer.parseInt(var2);
							break;
						case 22:
							class316.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var3 = var2.indexOf(".");
							if (var3 == -1) {
								field508 = Integer.parseInt(var2);
							} else {
								field508 = Integer.parseInt(var2.substring(0, var3));
								Integer.parseInt(var2.substring(var3 + 1));
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				HttpResponse.worldHost = this.getCodeBase().getHost();
				class233.field2486 = new JagNetThread();
				String var4 = TilesProjection.field3003.name;
				byte var5 = 0;
				if ((worldProperties & class542.field5331.rsOrdinal()) != 0) {
					class401.field4618 = "beta";
				}

				try {
					class216.method4191("oldschool", class401.field4618, var4, var5, 23);
				} catch (Exception var7) {
					FriendsChat.RunException_sendStackTrace((String)null, var7);
				}

				class415.client = this;
				class453.field4867 = clientType;
				class422.accessToken = System.getenv("JX_ACCESS_TOKEN");
				class36.refreshToken = System.getenv("JX_REFRESH_TOKEN");
				Canvas.sessionId = System.getenv("JX_SESSION_ID");
				class142.characterId = System.getenv("JX_CHARACTER_ID");
				IntProjection.method5336(System.getenv("JX_DISPLAY_NAME"));
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field506 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field506 = 0;
					} else {
						field506 = 5;
					}
				}

				this.startThread(765, 503, 223, 1);
			}
		} catch (RuntimeException var8) {
			throw ReflectionCheck.newRunException(var8, "client.init(" + ')');
		}
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	protected void finalize() throws Throwable {
		class330.field3588.remove(this);
		super.finalize();
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			class163.updateLoginIndex(10);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lhk;",
		garbageValue = "2109920798"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
