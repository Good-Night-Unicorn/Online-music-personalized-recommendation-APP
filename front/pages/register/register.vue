<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"48rpx 24rpx 24rpx","background":"url(http://codegen.caihongy.cn/20241029/932c0c9393644035bb5a4c03192cb848.jpg) no-repeat center top / cover,#fff","height":"auto"}'>
		<view :style='{"border":"2rpx solid #fff","padding":"24rpx 48rpx","margin":"240rpx 0 0","borderRadius":"20rpx","textAlign":"center","background":"rgba(255,255,255,.3)","display":"block","width":"100%","position":"relative","height":"auto"}'>
			<image :style='{"margin":"0 auto 24rpx auto","borderRadius":"8rpx","top":"-220rpx","left":"40%","display":"block","width":"160rpx","position":"absolute","height":"160rpx"}' src="http://codegen.caihongy.cn/20241029/0bf4804c0dfc44c380a901f86e773df3.png" mode="aspectFill"></image>
			<view :style='{"border":"0","margin":"0 0 24rpx 0","borderRadius":"20rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 0px)","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"180rpx","color":"#23baf7","textAlign":"left"}' class="label">账号：</view>
				<input :style='{"border":"2rpx solid #23baf7","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"20rpx","textAlign":"left","flex":"1","background":"rgba(255, 255, 255,.8)","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'  v-model="ruleForm.zhanghao"  type="text"  class="uni-input" name="" placeholder="账号" />
			</view>
			<view :style='{"border":"0","margin":"0 0 24rpx 0","borderRadius":"20rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 0px)","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"180rpx","color":"#23baf7","textAlign":"left"}' class="label">密码：</view>
				<input :style='{"border":"2rpx solid #23baf7","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"20rpx","textAlign":"left","flex":"1","background":"rgba(255, 255, 255,.8)","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"border":"0","margin":"0 0 24rpx 0","borderRadius":"20rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 0px)","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"180rpx","color":"#23baf7","textAlign":"left"}' class="label">确认密码：</view>
				<input :style='{"border":"2rpx solid #23baf7","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"20rpx","textAlign":"left","flex":"1","background":"rgba(255, 255, 255,.8)","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"border":"0","margin":"0 0 24rpx 0","borderRadius":"20rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 0px)","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"180rpx","color":"#23baf7","textAlign":"left"}' class="label">昵称：</view>
				<input :style='{"border":"2rpx solid #23baf7","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"20rpx","textAlign":"left","flex":"1","background":"rgba(255, 255, 255,.8)","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'  v-model="ruleForm.nicheng"  type="text"  class="uni-input" name="" placeholder="昵称" />
			</view>
            <view :style='{"border":"0","margin":"0 0 24rpx 0","borderRadius":"20rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 0px)","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"180rpx","color":"#23baf7","textAlign":"left"}' class="label">性别：</view>
				<picker :style='{"border":"0","margin":"0 0 24rpx 0","borderRadius":"20rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 0px)","height":"auto"}' v-if="tableName=='yonghu'"  @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
					<view>
						<view :style='{"border":"2rpx solid #23baf7","padding":"0 20rpx","color":"#666","borderRadius":"20rpx","textAlign":"left","flex":"1","background":"rgba(255, 255, 255,.8)","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"border":"0","margin":"0 0 24rpx 0","borderRadius":"20rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 0px)","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"180rpx","color":"#23baf7","textAlign":"left"}' class="label">手机号码：</view>
				<input :style='{"border":"2rpx solid #23baf7","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"20rpx","textAlign":"left","flex":"1","background":"rgba(255, 255, 255,.8)","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'  v-model="ruleForm.shoujihaoma"  type="text"  class="uni-input" name="" placeholder="手机号码" />
			</view>
            <view :style='{"border":"0","margin":"0 0 24rpx 0","borderRadius":"20rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 0px)","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"180rpx","color":"#23baf7","textAlign":"left"}' class="label">生日：</view>
				<picker  :style='{"border":"0","margin":"0 0 24rpx 0","borderRadius":"20rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 0px)","height":"auto"}' v-if="tableName=='yonghu'" mode="date" :value="ruleForm.shengri" @change="yonghushengriDateChange">
					<view>
						<view :style='{"border":"2rpx solid #23baf7","padding":"0 20rpx","color":"#666","borderRadius":"20rpx","textAlign":"left","flex":"1","background":"rgba(255, 255, 255,.8)","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' class="uni-input">{{ruleForm.shengri?ruleForm.shengri:"请选择生日"}}</view>
					</view>
				</picker>
			</view>
            <view :style='{"border":"0","margin":"0 0 24rpx 0","borderRadius":"20rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 0px)","height":"auto"}' v-if="tableName=='yonghu'" @tap="yonghutouxiangTap" class="">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"180rpx","color":"#23baf7","textAlign":"left"}' class="label">头像：</view>
				<image :style='{"width":"180rpx","margin":"0px 0 0","borderRadius":"16rpx","objectFit":"cover","display":"block","height":"120rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"width":"180rpx","margin":"0px 0 0","borderRadius":"16rpx","objectFit":"cover","display":"block","height":"120rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<button :style='{"border":"0","padding":"0 40rpx","margin":"24rpx auto","color":"rgb(255, 255, 255)","borderRadius":"20rpx","background":"#23baf7","display":"inline-block","width":"calc(100% - 0px)","lineHeight":"88rpx","fontSize":"36rpx","minWidth":"200rpx","height":"88rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
			
			<view class="idea1" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea1</view>
			<view class="idea2" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea2</view>
			<view class="idea3" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea3</view>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
                yonghuxingbieOptions: [],
                yonghuxingbieIndex: 0,
				ruleForm: {
                zhanghao: '',
                mima: '',
                nicheng: '',
                xingbie: '',
                shoujihaoma: '',
                shengri: '',
                touxiang: '',
                status: '',
				},
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {

            // 下拉变化
            yonghuxingbieChange(e) {
                    this.yonghuxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
            },
            yonghushengriDateChange(e) {
                this.ruleForm.shengri = e.target.value;
                this.$forceUpdate();
            },
            yonghutouxiangTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
                });
            },

            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				
				if((!this.ruleForm.zhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`yonghu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.nicheng) && `yonghu` == this.tableName){
					this.$utils.msg(`昵称不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.shoujihaoma&&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
					this.$utils.msg(`手机号码应输入手机格式`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.status&&(!this.$validate.isIntNumer(this.ruleForm.status))){
					this.$utils.msg(`状态应输入整数`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
