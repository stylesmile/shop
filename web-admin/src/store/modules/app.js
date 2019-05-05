import cookie from 'js-cookie'
const app = {
  state: {
    sidebar: {
      opened: !+cookie.get('sidebarStatus'),
      withoutAnimation: false
    },
    device: 'desktop'
  }
}
export default app
