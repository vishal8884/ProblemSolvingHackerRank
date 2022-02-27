package com.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class T8 {

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		//List<String> list2= Arrays.asList("the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog");
		List<String> list2= Arrays.asList("adtln", "fbrry", "jnvab", "nrajb", "krpyw", "ncrks", "xtgbt", "iqtzj", "gzstq", "bqxhl", "tmghj", "emxxb", "xnniz", "mgcyb", "njhxn", "mybtu", "vdarw", "qtszx", "ghjnp", "vkvhk", "nmhed", "ouanm", "ytoxq", "vefsd", "chaka", "sygei", "xqdrk", "kmdpv", "pyodz", "kdogm", "mydfi", "qdqqu", "gmkfa", "xldyk", "dxceb", "jgdul", "jlvyq", "frxgw", "mnpvt", "myqlv", "rszyw", "hnnck", "owlsw", "susta", "xnmbs", "mrrfx", "wxodl", "zflin", "wlmuj", "fzdqq", "aausi", "krrfv", "svcct", "qffck", "yykgr", "huukh", "faezg", "vdkpe", "vezgg", "cfqsu", "strqb", "pfisd", "tnopi", "sdemw", "votid", "nipnl", "gjklm", "khcjg", "rrnss", "ylyil", "nrkpz", "drion", "vahqo", "xgzgv", "slvae", "sslpt", "zshte", "amcex", "utlap", "nbokf", "kqrso", "hvjri", "acnuf", "bbesh", "bmlnl", "dhvsp", "ribzo", "awajm", "otrna", "dzejp", "pdoyj", "vzggl", "vxgts", "lgrdf", "coaep", "lcrjv", "dzacm", "uygjt", "mtrrt", "affoq", "qjfgq", "etebr", "dymqx", "apsmb", "lnubl", "zmilt", "fejyz", "gbdne", "ncvjl", "isowt", "vskyp", "jolkg", "ckmhc", "funrw", "gsgjc", "lguma", "grlez", "duyep", "bjhnv", "vsiuq", "bbdtb", "nyffc", "ssmgs", "jfglm", "wzlan", "atpvi", "gnlkz", "zwwid", "zqmyr", "vooey", "vebic", "cnaow", "nrtsa", "eribd", "xfjpe", "artsc", "pyyln", "vxpsn", "mezoh", "nsrco", "prmop", "ldnta", "bniag", "cjopp", "yunmq", "skmms", "nhphs", "nygkp", "uxrvn", "fdxgq", "ayhwh", "yndks", "lctcl", "ihtii", "bomfc", "zwmju", "eebdm", "jwlkq", "ibvxx", "xueoa", "unwhw", "pkvny", "kptwi", "etswb", "swjce", "kcrov", "wuqxw", "mcjjr", "dbdms", "gkzqr", "xjwul", "bmmlm", "tyhdc", "czkgz", "vfdfi", "olplj", "jpldr", "zskwv", "ujamq", "qqujj", "kisdh", "rwidp", "axjni", "ghvdq", "bljet", "rauoh", "kinsv", "gmjbb", "fovkv", "hejyp", "jmqyk", "blptw", "dcrvp", "rzaxf", "znhsp", "vvrsq", "jnriw", "lxhyd", "kvzin", "nvyrg", "ypdgx", "fevpq", "vrkwr", "darql", "oajwj", "robth", "lecxz", "parmo", "xlrfm", "hygym", "dywfa", "ubyqo", "ddvnr", "nndxr", "hkkvg", "dsqfw", "aceju", "srpje", "hefrk", "xpils", "vuwhg", "enbzt", "deluf", "laycg", "mugfh", "jfytq", "ojxfc", "usatc", "xrijf", "iaxuk", "svwdi", "yjjco", "uvmvq", "ljjhx", "qteug", "pwipd", "jdgdf", "tblzg", "frcwd", "dvybb", "vdufk", "prbzv", "kaczw", "rvgsp", "ffalk", "yanjw", "upiqr", "qgazf", "qojdl", "dpomx", "cjchv", "xvzvu", "vlqsv", "mfkym", "jnfxz", "dlrhk", "tahfv", "hskus", "pquaq", "jmmni", "wdkkw", "blthz", "zztju", "fpogf", "ontpz", "uodcn", "goirb", "vwidt", "rkpom", "pypgb", "qiaep", "losjj", "jcpkc", "irown", "zbmcz", "osdmb", "lxlwz", "odwer", "rzled", "hzpwb", "yymhl", "lwfkt", "vrsri", "erxea", "eefrr", "nimic", "wldqy", "wrfea", "ecjoz", "gaaxx", "xoemv", "ypomt", "ienjv", "zahlx", "vgtvk", "sknnc", "kugie", "tqqie", "elney", "kaeoz", "diije", "ijqpa", "icomh", "glria", "zciyj", "ezdby", "ufcgl", "ghoww", "rotxw", "tgzgj", "htztl", "qmcew", "nyxhq", "zovbe", "ztwan", "jzffp", "xocuu", "sbwbz", "hmrty", "rxevh", "mxske", "xfojg", "ugrin", "lprav", "joztu", "tlkgs", "frkhi", "hryux", "azbke", "uapxc", "obojm", "kkoys", "pahkt", "oogde", "jvgek", "qnbmj", "cmdfl", "jzxjl", "uzhoo", "dnmsc", "fekjg", "ewgxu", "zghos", "nmjwk", "axyoz", "kpukb", "odozr", "fovhh", "zzpin", "cvrpf", "fehfu", "wuceg", "tnkwi", "puzyv", "urvqt", "kpkum", "rvohp", "mxlgm", "arcor", "rtqzh", "uacby", "fught", "hmxxx", "gtrmm", "fnxvy", "zxdgk", "uuulk", "qqtvh", "ueduz", "clvqy", "lyujg", "vbfcw", "byvwn", "tzkfk", "cjcfk", "vxzvk", "vslkp", "przta", "qdxri", "glrgd", "sprbw", "fftuy", "stffa", "vtfkh", "rvbqq", "lcsak", "ncqla", "giqjo", "tctbe", "mvijw", "uhvsx", "wkeon", "jszgd", "guvkw", "pbtmz", "jsewi", "rdhxa", "pyvof", "apqeb", "hojfa", "tbhuj", "hjzqs", "jenos", "rulte", "ialuy", "ooozs", "cnlmo", "pdsni", "paxtn", "kmesa", "segyt", "vhirv", "lllbj", "qnftr", "njndk", "vaodt", "qonsn", "szsyj", "qemhr", "swmue", "lganw", "ilrep", "jvlbv", "dywva", "zhtcv", "uaupa", "oqaip", "iqvtt", "rdtia", "cowfq", "gwcjp", "ukqub", "zpziw", "gmews", "bbueb", "grfqi", "hiazf", "rfybu", "hqjet", "gnahm", "yzpxi", "waeif", "nvfoe", "eqxmh", "djesc", "bjgho", "jjwhx", "itruy", "nuvhp", "icbrf", "lnioz", "paznq", "qehel", "ydkwf", "tuwvi", "opcuc", "ktirn", "nxelg", "klyym", "ernxp", "ktzij", "zvcdc", "uuujj", "dgcad", "sscpy", "ppzob", "hjggv", "zhdbq", "prnjx", "wcewm", "ycpdl", "dkdrk", "rgmou", "egeqp", "mcaiu", "xkygg", "kudpp", "vrnvr", "ojtfd", "oospg", "udjbd", "beuih", "vfdng", "hhcnd", "zvxri", "frefs", "ccade", "gwwhj", "mfrrb", "tfawg", "sebwq", "boyyx", "jioez", "eszeq", "rybue", "lmdmi", "jjqsy", "uawnk", "krnqj", "myutg", "ucrox", "hbdms", "atqbp", "rmztp", "uahmz", "kefjv", "pepvb", "mukli", "hxhnq", "dgyzn", "xmahz", "xabbx", "enyhh", "jcylr", "lpynn", "jrokb", "ucypr", "qcvbq", "nejtq", "rctpy", "fbpjz", "evgxo", "bmzsd", "vmafb", "kaczl", "pxiau", "pfkgm", "fjqzp", "glrfh", "yajmd", "rfhdo", "rssug", "kzefd", "evbhq", "pjyjm", "dhnpw", "hyawf", "xgygx", "djnak", "ihpvy", "ywcxn", "wddqd", "sqwwg", "panyj", "yozhs", "pleeu", "ooiam", "tzmvu", "dajwj", "sqiig", "dvjcx", "fngnf", "ebnzn", "njjih", "plzmw", "yvlbh", "sdywp", "yvxya", "jehhh", "ogada", "cpfde", "pojpl", "rshdx", "cqzpd", "qdyxa", "prbpg", "uehbe", "mvrmd", "nxlfm", "gvfhq", "fficj", "awwfr", "mgnyc", "hofcx", "wpavf", "awxqq", "awgcg", "wlnpm", "tagew", "ovznr", "qrahe", "kzgdk", "ecilr", "liqkt", "mkqob", "lmpqm", "zgdnl", "zzlvr", "nfhuy", "fadht", "imztl", "arrec", "gunln", "eqpdv", "xpsfb", "mjsvk", "gxget", "yvoom", "bnupx", "easnk", "babbc", "zjgaj", "kvyio", "ixqnj", "fdxbf", "pfoek", "equsb", "govmq", "zsxio", "zzpqa", "mothk", "mlhya", "itzlc", "awlml", "iraoi", "kumoh", "owjid", "wzcha", "pwqcu", "xztfw", "ezrju", "gooic", "ofkyd", "mcjot", "jrcly", "oysrs", "augwd", "udltn", "anpah", "leyyu", "lmbcq", "yasln", "kcgjg", "jwemc", "bygkf", "pzfol", "ejati", "cmrzf", "qexvw", "gaolg", "nlxbj", "xnqaz", "bjowl", "ylwaw", "wacja", "qrtqg", "pmbdt", "mxhwz", "codsl", "uwtsk", "vvvnk", "pltth", "ytrlk", "vacxr", "khwgs", "rkapm", "idnkl", "muiwb", "akopv", "ljluc", "mmmoa", "cijgq", "yflbp", "pwxuv", "bucdk", "fciup", "gzoxo", "tqffk", "mctly", "uduvb", "yveod", "bogdp", "zqcxd", "twnky", "duuyd", "ogxuk", "clltq", "urqho", "zrgta", "pjvef", "rxphs", "iumdd", "fvwhu", "wrutg", "uouxz", "zxvsw", "kxaqm", "vgonu", "anhqv", "bvkor", "njyni", "qyyml", "nbdsh", "dtuwl", "rfilo", "uxeoz", "ckqil", "fkvql", "bhfjh", "neigv", "unlkz", "ceceg", "xotxh", "xegtv", "vvdly", "ttfip", "pwfrp", "lzeso", "ulhml", "luiex", "rdudi", "yojdx", "jseoz", "wzfew", "kfvxc", "oghxu", "hhbfk", "yuafn", "iprmm", "ofupl", "xoght", "bunev", "uougw", "whvlp", "xwwnx", "huute", "zjgst", "zvpod", "nkkfi", "zzdlv", "owyxh", "izace", "xawrs", "sazlh", "cwccx", "mhzcm", "irske", "yqbzd", "nufny", "gvbcn", "obnll", "ecppn", "jrjnb", "snwxx", "nicxb", "ohzft", "zhpwg", "ftycy", "xelqg", "lvsng", "gmrvz", "ykpmp", "rcqrh", "tswit", "hhrjq", "admqi", "hjdou", "vqktg", "mrnbw", "miwoj", "fkzpq", "wcbsd", "kuuei", "pwcob", "nxtsn", "cvtly", "njdkx", "lybgl", "dcmue", "uvngq", "foiat", "pnxsw", "qmdsa", "aecnf", "icybm", "emjpi", "mehza", "mwfni", "wtjtr", "ookiz", "lgnos", "ghqem", "yexvx", "spphd", "okgyw", "hqjtz", "vpzuf", "rvtmg", "uypdb", "nnycp", "ybfvf", "skmzj", "ngkwd", "evsnz", "xsize", "hxgxx", "ecejk", "vatoz", "xsjpg", "ythtc", "kojhb", "dakje", "cluhr", "ewnfc", "ifebm", "sdetu", "ktfjq", "jachc", "njjfz", "hlgtn", "abpol", "yhxlw", "ehuvf", "pkjbf", "itive", "svasc", "xxppl", "aulhm", "qyoun", "bjhlx", "yraia", "oyeuu", "ijrem", "qehrz", "myinm", "vowrj", "sbdll", "nppmi", "zkphb", "ktstv", "pqtog", "kdypk", "guvfk", "gcmaz", "voctd", "njgxv", "jjefz", "yszsm", "noorb", "dcwvz", "rnjus", "cufwg", "yeayo", "yesva", "csdla", "cmyqu", "czzji", "xuzbo", "wfekh", "zlbqf", "hwdug", "dkmdy", "fkkjh", "ktmup", "hesum", "udkcj", "dddyw", "qkyuc", "otnqs", "dvoei", "pffge", "uqrqt", "ufsbf", "grmbu", "bluxn", "xhzcm", "dufap", "hmtdt", "rsomg", "nmloi", "ccjpd", "vbfir", "xjtci", "chsyj", "dcpyh", "cihmb", "bzyrz", "stfnl", "upvpg", "inkff", "isace", "tmlcw", "manxu", "kfoho", "qnysd", "oplyg", "jsbgp", "swvjr", "wczzk", "qjbmy", "ldqla", "lriij", "qwror", "kjoxb", "yjvwk", "ivbvb", "wkfuw", "ldkdi", "ihkvo", "arcsh", "lzmcx", "plvdw", "hofrw", "xavvc", "vmzeq", "wnclw", "itgwa", "bhtrv", "eosdl", "pygst", "sdrzp", "tcudb", "irrge", "lxtpf", "nsajq", "aauvt", "pfqnc", "ogcuw", "bimfb", "rbhiv", "euoki", "qhcmm", "mvuzz", "mobwa", "fonsc", "cilgj", "lysak", "vzaze", "kdkrf", "stijz", "rbzra", "oifdz", "owimw", "xflyb", "vntut", "gpewz", "cfoii", "nsnjt", "fegqx", "vewys", "espnc", "yscim", "twnsn", "ncjay", "rvwww", "pyrno", "vrzmg", "ameme", "tkjgy", "mqyjp", "nvzoy", "crgfb", "qvlyx", "mitvo", "xpkff", "kkwou", "oqmnb", "tukbo", "vwwpj", "evqqs", "lfcsv", "ungqi", "wpxci", "risew", "xzhyp", "cmbfl", "vyohy", "fdfqx", "uqikw", "bctdo", "ybbib", "opycy", "uyksb", "bmamj", "yziqu", "qnzrf", "pewfn", "doukg", "qgcqm", "gwkyn", "brnuh", "wgphk", "difmx", "eeyym", "sdysw", "hncxo", "gxphf", "qtqpl", "ofcxz", "uojdf", "lrdsw", "sfqtq", "zidlq", "kgkiw", "qzqwi", "aauai", "vyale", "ywioi", "hvylk", "kmmlm", "ewrgy", "jkehf", "xsvua", "njhxz", "iensq", "qdvot", "aedft", "mooqy", "vngce", "fkwbw", "vtacm", "bsixd", "xfdvm", "awizv", "ufpto", "vcqhh", "kczuj", "pjmmu", "eqfqj", "bopmt", "ggmcx", "htbnk", "kmpvx", "pthuf", "jzjbi", "vrptw", "nmsxt", "jcpiz", "bbbho", "figpx", "redkr", "tyhnq", "olkco", "axeoz", "gtzcl", "biahy", "isada", "knxny", "jkiah", "eokzy", "ucqkg", "egtpy", "dfeqc", "bnwpu", "prwss", "yfrrb", "lsrzh", "ecwmj", "nwycb", "rsdzc", "jqyrp", "tgkbx", "dxwqt", "leysl", "cdyxp", "cbrgx", "evtsz", "dornb", "exzvk", "svofc", "hknnp", "dbbfw", "abmvj", "hjved", "dfqtr", "ilpcd", "irllo", "kkuwb", "goicq", "mlzcc", "fwvjm", "qkicn", "mrwkm", "voxzi", "ppgim", "epgvq", "igecp", "pwzel", "aoncy", "butng", "fumng", "mxpas", "hbsfw", "zggun", "hafyj", "xyzqq", "ybogc", "flayj", "dmbwy", "spwtm", "amdut", "grhux", "axvun", "zxgkx", "neyae", "gljki", "aejcj", "dozry", "xrset", "eycke", "zmypd", "pmixr", "zbbwg", "lrvtt", "kwkfc", "oaony", "etrtm", "fvbir", "bwbny", "trbnt", "pshsk", "hmzvw", "vznhz", "mslqt", "dblbm", "sgkkz", "qofsq", "qkdlr", "jaoqs", "ilpno", "xlijf", "vnwnq", "hmlep", "cgror", "ahveo", "mibpd", "hsvrv", "hskgy", "vqhny", "bzhfq", "lrkvb", "wpemk", "srvix", "ihacw", "xrpyf", "yvilh", "rtiqe", "tuykh", "rvnvw", "ppmip", "qcwry", "zwzje", "raiyd", "vrvpq", "vzzwp", "qqgkj", "teykc", "ojfyg", "zyfoc", "dgmev", "hsxtu", "aknqk", "arrvo", "kmbcm", "wgxpq", "iggzn", "rkblh", "vwtzk", "xliyq", "kcoqn", "ylwaf", "ulpez", "kageq", "nkeer", "ejxtf", "bfnkp", "yfecc", "ebtgy", "rxkyo", "rkbqg", "bjkwo", "xfafo", "gjpgv", "lnjwe", "rdfne", "evbpl", "ckulm", "oeagr", "plnxp", "takux", "tmhnc", "yawro", "ydtfh", "zxthm", "jqqiu", "iunhj", "vjzey", "svgsw", "odpov", "kusrw", "iieiw", "rbkpm", "rymbm", "slagn", "wgfqm", "iiqqc", "uuhxt", "gsvlg", "wbajb", "gpugx", "nytbf", "yzzvm", "cspxb", "aonxy", "xcawv", "yoaay", "bllpc", "ncftu", "iwtit", "yfcyq", "oihhl", "tqwlm", "bxgxc", "prsin", "jtnmm", "ybgjw", "xdiph", "bdpyr", "zlrwc", "kpchy", "jzqzq", "nsxce", "uuttb", "vzmki", "byndq", "znfqm", "ccmps", "ubcrh", "khcde", "lwnnd", "upizz", "oglmf", "gocea", "uybsk", "twqfa", "zzooh", "inyxr", "ddjzt", "rxuet", "qsmdq", "fxwwb", "ptcgy", "pfkzm", "zuopy", "rjnxz", "mpbrh", "femuh", "raazj", "ejywa", "umnsl", "mfhmw", "mkvoc", "ifyid", "dncok", "wozid", "wcztd", "ozvmi", "oxhrg", "mqwqp", "epmmq", "tqejn", "xuitt", "ffcww", "iiygj", "jwpme", "keitb", "utgqn", "gvenh", "wvjmw", "zqxkx", "exxuy", "lbvol", "wfbzz", "ztoty", "hjwwm", "levlm", "fqgvc", "jtjzp", "hxufn", "opdsu", "kajjk", "ffzcr", "dayry", "kdfcg", "hinba", "hetkf", "qfbow", "nnvwb", "euyrc", "zfdlv", "cgzqw", "rnfes", "jukop", "yqaaq", "rgovu", "qmemv", "sqogi", "keszm", "gwzbp", "nqcik", "jjspq", "vdtny", "kfwug", "numti", "igbab", "rgwen", "jxonx", "gzvem", "gneiu", "fkwkg", "yuicf", "ndxop", "kzwqy", "sbjri", "zmdln", "vgosv", "mbxss", "kblaa", "cpcgl", "gunwl", "gwuqp", "yainm", "udlxw", "xouhw", "mjrgf", "osxqe", "ochtu", "ybbcv", "imkju", "wdahk", "kelyq", "fgshh", "itklw", "eeybr", "woofz", "wnohe", "fleer", "yqwws", "iourt", "krssq", "jqevb", "qjftl", "amupp", "lcqgz", "igxls", "pgwfi", "gncuq", "gvmaf", "lxubp", "zanqv", "dqwds", "axwgv", "uaukq", "fidde", "prjwz", "jagru", "jdssw", "bpfqs", "senny", "hdvlb", "mdmia", "wbmxt", "xqguc", "gwvga", "ivqop", "xpbdw", "aismq", "mlcpe", "dlmhp", "yacmv", "yfcuw", "prcle", "icoqo", "xiyfw", "akqvf", "docwt", "lfesn", "iscgi", "agjba", "otdoj", "silpa", "wdqzr", "jycjv", "koehk", "kodgx", "zvfpr", "yspdj", "dffak", "doiyf", "lkbxb", "btnmf", "gvbwx", "mcatb", "rvniz", "qicfp", "sqqcu", "eiofu", "fjgzw", "yxfty", "hzelr", "qpfxl", "olpgf", "zbamd", "zokaw", "wghyb", "znafz", "vgjmk", "uxfhl", "slwdf", "gfwxs", "bmfwj", "rvsji", "qfhzy", "tyrmd", "rcajf", "jmdtj", "rwkpn", "cycyz", "insxj", "bhfbe", "dlybw", "cjdvq", "rrucw", "atmzg", "uqwbc", "fghmi", "bpwan", "gmmcv", "ayuui", "ekbuf", "whhwn", "swftp", "zjeyw", "dwgto", "rvsag", "vinhh", "wvxfg", "otfdk", "xlsos", "dnopu", "ssxfj", "mrlok", "ynxpn", "euwry", "awubv", "oqpqn", "qoajs", "lyxam", "lzbyf", "yswax", "kgase", "dfcjc", "jjiqx", "myyhj", "nrrqj", "yhagf", "rrivc", "evedp", "hdstd", "zdkqy", "acwpt", "txecq", "cnwus", "egbcx", "huugu", "sztzr", "ldsye", "zcpez", "qsaww", "ergxa", "jyjuw", "oyotc", "wlnzo", "zhbci", "mvymo", "aulgg", "ahnqu", "axohi", "gtpea", "nlqvx", "tsvqz", "xhhgl", "xemcx", "iozfo", "eilje", "mjrwg", "ddjrv", "iycof", "lmtaf", "uwriw", "rmduq", "rvrwz", "ewncd", "irgyp", "zdqcr", "vcise", "ercjj", "rhfxz", "joszl", "xdbvg", "fvjmc", "wohkk", "ihouk", "iyyzx", "fgazz", "iojko", "cezqq", "lkzjd", "ilvmt", "nsess", "fqwzn", "yoplv", "rchuw", "lmbgx", "szfhj", "snotm", "ldqvg", "tvbhx", "gnila", "txccv", "kvupc", "yvzwc", "dgwlp", "qgydq", "uskbu", "etwru", "pmkro", "vrtiq", "hnyha", "wvgxu", "swdqj", "dmaod", "szfcm", "tpttf", "cdphl", "xonyj", "giden", "yhobt", "lzeza", "vrsdw", "djppk", "kfnfq", "ubwhu", "ntbyl", "xepeo", "neaqb", "pkroa", "xuybr", "nzcno", "ieabk", "hrfha", "enakx", "fyjop", "fvtwm", "tqaja", "qchss", "nasoa", "qrenz", "ggrpn", "ahojk", "lazzw", "awyzf", "zngzm", "yqiud", "oeukz", "wamrp", "alzuz", "kzfuf", "ymyel", "vzack", "sobxt", "yzqnq", "stxpq", "nhjej", "wogml", "mpurc", "fsafi", "agmxr", "twxpo", "avglp", "gquni", "kkxiu", "wtyfn", "hfuue", "jrbem", "ubyhp", "vdmiq", "obqdk", "wfpaz", "lhdyb", "cpmaw", "lucqt", "okatr", "lwzwz", "avuho", "wsxhp", "vmsfu", "secnr", "boqri", "tjare", "lzuid", "psupu", "cywyl", "yqqsd", "ljxwu", "iiiip", "bqexe", "rpbfo", "veiyc", "pycxp", "jddsa", "noaqe", "zeijn", "lxlxo", "friyt", "soaac", "bzsoq", "jgvcu", "tmmpx", "tecbh", "secfk", "hqlbn", "jxngs", "pudzv", "kkyyp", "rukzp", "zyzap", "zrjan", "kimka", "wzcde", "kuifl", "qhaqe", "wvmao", "bprbe", "bqrnw", "hhwve", "xabzx", "kklze", "uoewd", "bquim", "etous", "ykueg", "bxokb", "ncytv", "jdpkq", "qhleo", "bkcgw", "alcnr", "fspob", "fpvgp", "jrdwj", "qszqa", "wqdsl", "pfljs", "hixkz", "hvjen", "wsivd", "pkjze", "mtjnx", "jbnle", "fhubt", "pjgsf", "hixzi", "oxvkr", "oqary", "...");
		list.addAll(list2);
		int solve = solve(list);
		
		System.out.println("solve :: "+solve);
		
	}
	
	
	public static int solve(ArrayList<String> arr) 
	{
        boolean vis[] = new boolean[26];
        for(String x: arr)
        {
            for(int i = 0; i < x.length(); ++i)
            {
                vis[x.charAt(i)-'a'] = true;
            }
        }
        for(int i = 0; i < 26; ++i)
        {
            if(!vis[i])
            {
                return 0;
            }
        }
        return 1;
    }

//	public static int solve2(ArrayList<String> arr) {
//
//		System.out.println("arr :: "+arr);
//		String all="abcdefghijklmnopqrstuvwxyz";
//		String arrContent="";
//		
//		
//		
//		for(String s : arr)
//		{
//			arrContent=arrContent+s;
//		}
//		if(arrContent.length()<26)
//			return 0;
//		
//		char[] carr = arrContent.toCharArray();
//		
//		String arrLowerCase=arrContent.toLowerCase();
//		String removedDub=removeDub(arrLowerCase);
//		
//		
//		int ret = (removedDub.equals(all))?1:0;
//		
//		return ret;
//	}
//	
//	
//	
//	
//	public static String removeDub(String s)
//	{
//		
//		int j=0;
//		char[] charArray = s.toLowerCase().toCharArray();
//		String all="";
//		
//		Arrays.sort(charArray);
//		
//		for(int i=0;i<charArray.length-1;i++)
//		{
//				if(charArray[i]!=charArray[i+1])
//				{
//					//System.out.println("i :: "+i+"    charArray :: "+charArray[i]);
//					charArray[j]=charArray[i];
//					all=all+charArray[i];
//					j++;
//				}
//		}
//		
//		charArray[j++]=charArray[charArray.length-1];
//		all=all+charArray[charArray.length-1];
//		
//		System.out.println("dub removed :: "+Arrays.toString(charArray)+"   j :: "+j+"    all :: "+all+"    all size :: "+all.length());
//		
//		return all;
//	}
	
	
	
	
	public static Map<Character, Boolean> check()
	{
		Map<Character, Boolean> check = new HashMap<>();
		boolean fal=false;
		
		check.put('a',fal);
		check.put('b',fal);
		check.put('c',fal);
		check.put('d',fal);
		check.put('e',fal);
		check.put('f',fal);
		check.put('g',fal);
		check.put('h',fal);
		check.put('i',fal);
		check.put('j',fal);
		check.put('k',fal);
		check.put('l',fal);
		check.put('m',fal);
		check.put('n',fal);
		check.put('o',fal);
		check.put('p',fal);
		check.put('q',fal);
		check.put('r',fal);
		check.put('s',fal);
		check.put('t',fal);
		check.put('u',fal);
		check.put('v',fal);
		check.put('w',fal);
		check.put('x',fal);
		check.put('y',fal);
		check.put('z',fal);

		
		return check;
	}

}
