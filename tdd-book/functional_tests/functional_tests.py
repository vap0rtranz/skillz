from selenium import webdriver
import unittest

class NewVisitorTest(unittest.TestCase): 

	def setUp(self): 
		self.browser = webdriver.Firefox()
		self.browser.implicitly_wait(3)

	def tearDown(self):
		# user closes browser
		self.browser.quit()
	
	def test_start_list_and_retrieve(self):
		# browser user goes directly to todo list site 
		# (no redirect)
		self.browser.get('http://localhost:8000')

		# user sees todo Title in browser
		self.assertIn('To-Do', self.browser.title)
		# catch-all failure
		self.fail('Test fail: finish testing!')

# user solicited to enter to-do list item 

# user types item into text box
# "buy groceries"

# user hits enter, and sees page list update
# "1. 'buy groceries'"

# user simultaneously sees solicitation for next to-do list item
# user enters next item
# "bake Grandpop's cake"

# user hits enter, and sees page list updated again, as:
# "1. ...
# "2. bake Grandpop's cake"

# user returns to site or wants to share link to site
# at the bottom of page, user sees URL explaining howto save/share to-do list

# user clicks on save/share URL and sees same to-do list as entered

# is this script running from CLI or imported from another requestor?
#if __name__ == '__main__':
# suppress warnings
unittest.main()
